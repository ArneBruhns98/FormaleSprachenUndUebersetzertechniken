import grammar.cymbol.CymbolBaseListener;
import grammar.cymbol.CymbolParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import symboltable.Scope;
import symboltable.scope.GlobalScope;
import symboltable.scope.LocalScope;
import symboltable.symbol.FunctionSymbol;
import symboltable.symbol.VariableSymbol;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DefPhase extends CymbolBaseListener {

    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    GlobalScope globals;
    private Scope currentScope;

    DefPhase(ByteArrayOutputStream outContent){
        System.setOut(new PrintStream(outContent));
    }

    public void enterFile(CymbolParser.FileContext ctx) {
        globals = new GlobalScope();
        currentScope = globals;
    }

    public void exitFile(CymbolParser.FileContext ctx) {
        System.out.println("globals: " + globals);
    }

    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.type().getText();

        // push new symboltable.scope by making new one that points to enclosing symboltable.scope
        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
        currentScope.define(function); // Define function in current symboltable.scope
        saveScope(ctx, function);      // Push: set function's parent to current
        currentScope = function;       // Current symboltable.scope is now function symboltable.scope
    }

    private void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }

    public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        System.out.println("function " + currentScope + "\n");
        currentScope = currentScope.getEnclosingScope(); // pop symboltable.scope
    }

    public void enterBlock(CymbolParser.BlockContext ctx) {
        // push new local symboltable.symbol.scope
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitBlock(CymbolParser.BlockContext ctx) {
        System.out.println("locals: " + currentScope);
        currentScope = currentScope.getEnclosingScope(); // symboltable.scope
    }

    public void exitFormalParameter(CymbolParser.FormalParameterContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    private void defineVar(CymbolParser.TypeContext typeCtx, Token nameToken) {
        String type = typeCtx.getText();
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var); // Define symboltable.symbol in current symboltable.scope
    }
}
