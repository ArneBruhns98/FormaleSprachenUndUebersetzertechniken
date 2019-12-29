import grammar.cymbol.CymbolBaseListener;
import grammar.cymbol.CymbolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import symboltable.Scope;
import symboltable.Symbol;
import symboltable.scope.GlobalScope;
import symboltable.symbol.FunctionSymbol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generator extends CymbolBaseListener {

    private STGroup templates = new STGroupFile("./src/main/resources/templates/llvm.stg");
    private ParseTreeProperty<ST> llvm_templates = new ParseTreeProperty<>();
    ST st = null;

    private int registerCounter = 0;
    private int loopCounter = 0;

    private ParseTreeProperty<Scope> scopes;
    private GlobalScope globals;
    private Scope currentScope;

    Generator(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }

    private void setValue(ParseTree node, ST st) { llvm_templates.put(node, st); }
    private ST getValue(ParseTree node) { return llvm_templates.get(node); }

    /** file: include? (functionDecl | varDecl)+ */
    public void enterFile(CymbolParser.FileContext ctx) {
        currentScope = globals;
    }

    /** file: include? (functionDecl | varDecl)+ */
    public void exitFile(CymbolParser.FileContext ctx) {
        List<ST> temp = new LinkedList<>();

        st = templates.getInstanceOf("printDecl");
        setValue(ctx, st);
        temp.add(getValue(ctx));

        for(CymbolParser.VarDeclContext varDeclContext : ctx.varDecl()) {
            temp.add(getValue(varDeclContext));
        }

        for(CymbolParser.FunctionDeclContext functionDeclContext : ctx.functionDecl()) {
            temp.add(getValue(functionDeclContext));
        }
        st = templates.getInstanceOf("mergeTemplates");
        st.add("templates", temp);
    }

    /** functionDecl: type ID '(' formalParameters? ')' block*/
    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentScope = scopes.get(ctx);
    }

    /** functionDecl: type ID '(' formalParameters? ')' block*/
    public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        List<ST> temp = new LinkedList<>();
        List<String> var = new ArrayList<>();
        for(int i = 0; i < ctx.block().stat().size(); i++) {
            for(int j = 0; j < ctx.block().stat(i).children.size(); j++) {
                if(ctx.block().stat(i).children.get(j) instanceof CymbolParser.AssignStatContext && getValue(ctx.block().stat(i).children.get(j)).getName().contains("Global") && !var.contains(ctx.block().stat(i).children.get(j).getText())) {
                    temp.add(getValue(ctx.block().stat(i).children.get(j)));
                    var.add(ctx.block().stat(i).children.get(j).getText());
                }
            }
        }

        currentScope = currentScope.getEnclosingScope();
        st = templates.getInstanceOf("functionDecl");
        st.add("ID", ctx.ID().getText());
        st.add("formalParams", getValue(ctx.formalParameters()));
        st.add("globals", temp);
        st.add("block", getValue(ctx.block()));
        setValue(ctx, st);
    }

    /** formalParameters: formalParameter (',' formalParameter)* */
    public void exitFormalParameters(CymbolParser.FormalParametersContext ctx) {
        List<ST> temp = new LinkedList<>();
        for(CymbolParser.FormalParameterContext ftx : ctx.formalParameter()) {
            temp.add(getValue(ftx));
        }
        st = templates.getInstanceOf("formalParameters");
        st.add("params", temp);
        setValue(ctx, st);
    }

    /** formalParameter: type ID */
    public void exitFormalParameter(CymbolParser.FormalParameterContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        st = templates.getInstanceOf("formalParameter");
        st.add("variable", var.getName());
        setValue(ctx, st);
    }

    /** stat: block #stat_block*/
    public void exitStat_block(CymbolParser.Stat_blockContext ctx){
        setValue(ctx, getValue(ctx.block()));
    }

    /** stat: varDecl #stat_varDecl*/
    public void exitStat_varDecl(CymbolParser.Stat_varDeclContext ctx){
        setValue(ctx, getValue(ctx.varDecl()));
    }

    /** stat: ifStat #stat_ifStat*/
    public void exitStat_ifStat(CymbolParser.Stat_ifStatContext ctx){
        setValue(ctx, getValue(ctx.ifStat()));
    }

    /** stat: forStat #stat_forStat*/
    public void exitStat_forStat(CymbolParser.Stat_forStatContext ctx){
        setValue(ctx, getValue(ctx.forStat()));
    }

    /** stat: whileStat #stat_whileStat*/
    public void exitStat_whileStat(CymbolParser.Stat_whileStatContext ctx){
        setValue(ctx, getValue(ctx.whileStat()));
    }

    /** stat: returnStat ';' #stat_returnStat*/
    public void exitStat_returnStat(CymbolParser.Stat_returnStatContext ctx){
        setValue(ctx, getValue(ctx.returnStat()));
    }

    /** stat: assignStat ';' #stat_assignStat*/
    public void exitStat_assignStat(CymbolParser.Stat_assignStatContext ctx){
        setValue(ctx, getValue(ctx.assignStat()));
    }

    /** stat: printStat ';' #stat_printStat*/
    public void exitStat_printStat(CymbolParser.Stat_printStatContext ctx){
        setValue(ctx, getValue(ctx.printStat()));
    }

    /** stat: exprStat ';' #stat_exprStat*/
    public void exitStat_expr(CymbolParser.Stat_exprContext ctx){
        if (ctx.expr() instanceof CymbolParser.IntContext) {
            st = templates.getInstanceOf("stat_expr_int");
            st.add("expr", ctx.expr().getText());
            st.add("reg", ++registerCounter);
            setValue(ctx, st);
            return;
        }
        if (ctx.expr() instanceof CymbolParser.IdContext) {
            st = templates.getInstanceOf("stat_expr_id");
            st.add("expr", ctx.expr().getText());
            setValue(ctx, st);
            return;
        }
        setValue(ctx, st);
    }

    /** block: '{' stat* '}'*/
    public void enterBlock(CymbolParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }

    /** block: '{' stat* '}'*/
    public void exitBlock(CymbolParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();

        List<ST> temp = new LinkedList<>();
        for(CymbolParser.StatContext statContext : ctx.stat()) {
            temp.add(getValue(statContext));
        }

        st = templates.getInstanceOf("block");
        st.add("params", temp);
        setValue(ctx, st);
    }

    /** assignStat: ID '=' expr */
    public void exitAssignStat(CymbolParser.AssignStatContext ctx) {
        if(globals.resolve(ctx.ID().getText()) != null){
            st = templates.getInstanceOf("assignToGlobal");
            st.add("expr", getValue(ctx.expr()));
            st.add("variable", ctx.ID().getText());
            setValue(ctx, st);
            //System.out.println(st.render() + "\n\n");
        }
        else {
            st = templates.getInstanceOf("assignToLocal");
            st.add("expr", getValue(ctx.expr()));
            st.add("variable", ctx.ID().getText());
            setValue(ctx, st);
        }
    }

    /** ifStat: 'if' '('bexpr ')' stat ('else' stat)? */
    public void exitIfStat(CymbolParser.IfStatContext ctx){
        loopCounter++;
        if(ctx.stat().size() > 1){
            st = templates.getInstanceOf("ifElse");
            st.add("cond", getValue(ctx.bexpr()));
            st.add("stat1", getValue(ctx.stat(0).children.get(0)));
            st.add("stat2", getValue(ctx.stat(1).children.get(0)));
            st.add("tmp", loopCounter);
            setValue(ctx, st);
        }
        else {
            st = templates.getInstanceOf("if");
            st.add("cond", getValue(ctx.bexpr()));
            st.add("stat1", getValue(ctx.stat(0).children.get(0)));
            st.add("tmp", loopCounter);
            setValue(ctx, st);
        }
    }

    /** forStat: 'for' '(' assignStat ';' bexpr ';' assignStat ')' stat */
    public void exitForStat(CymbolParser.ForStatContext ctx){
        //TODO
    }

    /** whileStat: 'while' '('bexpr')' stat */
    public void exitWhileStat(CymbolParser.WhileStatContext ctx){
        loopCounter++;
        st = templates.getInstanceOf("while");
        st.add("cond", getValue(ctx.bexpr()));
        st.add("stat", getValue(ctx.stat()));
        st.add("tmp", loopCounter);
        setValue(ctx, st);;
    }

    /** args : (expr (',' expr)*)? */
    public void exitArgs(CymbolParser.ArgsContext ctx) {
        List<ST> temp = new LinkedList<>();
        for (CymbolParser.ExprContext exprContext : ctx.expr()) {
            temp.add(getValue(exprContext));
        }

        st = templates.getInstanceOf("args");
        st.add("templates", temp);
        setValue(ctx, st);
    }

    /** printStat: 'printf' '(' FORMAT ',' expr ')' */
    public void exitPrintStat(CymbolParser.PrintStatContext ctx) {
        Symbol symbol = currentScope.resolve(ctx.expr().children.get(0).getText());
        String scope = symbol == null ? "local" : symbol.scope.getScopeName();

        st = templates.getInstanceOf("printf");

        if(ctx.expr() instanceof CymbolParser.IdContext) {
            st.add("reg",  "i32* " + (scope.equals("global") ? "@" : "%" ) + ctx.expr().getText());
        } else {
            st.add("args", getValue(ctx.expr()));
            st.add("reg", "i32 %r" + registerCounter);
        }
        setValue(ctx, st);
    }

    /** varDecl: type ID ';'*/
    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);

        if (var == null) CheckSymbols.error(ctx.ID().getSymbol(), "no such variable: " + name);

        if (var instanceof FunctionSymbol) CheckSymbols.error(ctx.ID().getSymbol(), name+" is not a variable");

        if(currentScope.getScopeName().equals("global")){
            st = templates.getInstanceOf("varDeclGlobal");
            st.add("variable", var);
            st.add("scope", currentScope.getScopeName());
            setValue(ctx, st);
        } else {
            st = templates.getInstanceOf("varDeclLocal");
            st.add("variable", var);
            setValue(ctx, st);
        }
    }

    /** block: '{' stat* '}'*/
    public void exitReturnStat(CymbolParser.ReturnStatContext ctx) {
        st = templates.getInstanceOf("mergeTemplates");
        st.add("templates", List.of(getValue(ctx.expr()), templates.getInstanceOf("return").add("reg", registerCounter)));
        setValue(ctx, st);
    }

    /** expr: op = '-' expr #negative */
    public void exitNegative(CymbolParser.NegativeContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("negative");
        st.add("reg", registerCounter);
        st.add("expr", getValue(ctx.expr()));
        setValue(ctx, st);
    }

    /** expr: expr op=('*'|'/') expr #muldiv */
    public void exitMuldiv(CymbolParser.MuldivContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("operation");
        st.add("reg", registerCounter);
        st.add("op", ctx.op.getText());
        st.add("a", getValue(ctx.expr(0)));
        st.add("b", getValue(ctx.expr(1)));
        setValue(ctx, st);
    }

    /** expr: expr op=('+'|'-') expr #addsub */
    public void exitAddsub(CymbolParser.AddsubContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("operation");
        st.add("reg", registerCounter);
        st.add("op", ctx.op.getText());
        st.add("a", getValue(ctx.expr(0)));
        st.add("b", getValue(ctx.expr(1)));
        setValue(ctx, st);
    }

    /** expr: ID #id */
    public void exitId(CymbolParser.IdContext ctx){
        registerCounter++;
        if(globals.resolve(ctx.ID().getText()) != null){
            st = templates.getInstanceOf("idGlobal");
            st.add("id", ctx.ID().getText());
            st.add("reg", registerCounter);
            setValue(ctx, st);
        } else {
            st = templates.getInstanceOf("idLocal");
            st.add("id", ctx.ID().getText());
            st.add("reg", registerCounter);
            setValue(ctx, st);
        }
    }

    /** expr: INT #int */
    public void exitInt(CymbolParser.IntContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("int");
        st.add("reg", registerCounter);
        st.add("variable", ctx.getText());
        setValue(ctx, st);
    }

    /** expr: INT #int */
    public void exitBracket(CymbolParser.BracketContext ctx){
        setValue(ctx, getValue(ctx.expr()));
    }

    /** expr: ID '(' args ')' */
    public void exitCall(CymbolParser.CallContext ctx) {
        registerCounter++;
        st = templates.getInstanceOf("call");
        st.add("reg", registerCounter);
        st.add("ID", ctx.ID().getText());
        List<ST> temp = new LinkedList<>();
        for(int i = 0; i < ctx.args().expr().size(); i++ ){
            temp.add(getValue(ctx.args().expr(i)));
        }
        st.add("args", temp);
        setValue(ctx, st);
    }

    /** bexpr: '!' bexpr #not */
    public void exitNot(CymbolParser.NotContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("not");
        st.add("reg", registerCounter);
        st.add("bexpr", getValue(ctx.bexpr()));
        setValue(ctx, st);
    }

    /** bexpr: expr op=('=='|'!='|'<'|'>') expr #comparison */
    public void exitComparison(CymbolParser.ComparisonContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("operation");
        st.add("reg", registerCounter);
        st.add("op", ctx.op.getText());
        st.add("a", getValue(ctx.expr(0)));
        st.add("b", getValue(ctx.expr(1)));
        setValue(ctx, st);
    }

    /** bexpr: 'true' #true_expr */
    public void exitTrue_expr(CymbolParser.True_exprContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("true_expr");
        st.add("reg", registerCounter);
        setValue(ctx, st);
    }

    /** bexpr: 'false' #false_expr*/
    public void exitFalse_expr(CymbolParser.False_exprContext ctx){
        registerCounter++;
        st = templates.getInstanceOf("false_expr");
        st.add("reg", registerCounter);
        setValue(ctx, st);
    }

    /** bexpr: '(' bexpr ')' #brackt_bexpr*/
    public void exitBrackt_bexpr(CymbolParser.Brackt_bexprContext ctx){
        setValue(ctx, getValue(ctx.bexpr()));
    }

}