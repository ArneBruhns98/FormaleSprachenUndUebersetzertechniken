import gen.grammar.cymbol.CymbolBaseListener;
import gen.grammar.cymbol.CymbolParser;

public class FunctionListener extends CymbolBaseListener {

    Graph graph = new Graph();
    private String currentFunctionName = null;
    private int isTailCallPossible = 0;

    /** functionDecl: type ID '(' formalParameters? ')' block;*/
    @Override
    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
    }

    /** stat: 'return' expr? ';'; */
    @Override
    public void enterReturn(CymbolParser.ReturnContext ctx) {
        if(ctx.expr() instanceof CymbolParser.MuldivContext
                || ctx.expr() instanceof CymbolParser.AddsubContext
                || ctx.expr() instanceof CymbolParser.BracketContext
                || ctx.expr() instanceof CymbolParser.BooleanNotContext
                || ctx.expr() instanceof CymbolParser.UnaryMinusContext)
            isTailCallPossible = 0;
        else
            isTailCallPossible = 1;
    }

    /** expr: ID '(' exprList? ')' #callFunction; */
    @Override
    public void enterCallFunction(CymbolParser.CallFunctionContext ctx) {
        String funcName = ctx.ID().getText();

        if(funcName.equals(currentFunctionName) && isTailCallPossible == 1){
            graph.insert_edge_tail_call(currentFunctionName, funcName);
            isTailCallPossible = 0;
            return;
        }

        if(funcName.equals(currentFunctionName) && isTailCallPossible == 0){
            graph.insert_edge_non_tail_call(currentFunctionName, funcName);
            return;
        }

        if(!funcName.equals(currentFunctionName) && ctx.parent instanceof CymbolParser.ReturnContext) {
            graph.insert_edge_tail_call(currentFunctionName, funcName);
            isTailCallPossible = 0;
            return;
        }

        if(!funcName.equals(currentFunctionName)){
            graph.insert_edge_other(currentFunctionName, funcName);
            isTailCallPossible = 0;
            return;
        }
    }

    /** functionDecl: type ID '(' formalParameters? ')' block;*/
    @Override
    public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        if(graph.containsKey_edges_non_tail_call(currentFunctionName)) {
            graph.nonTailFunc.add(currentFunctionName);
            return;
        }

        if(graph.containsKey_edges_tail_call(currentFunctionName)) {
            graph.tailFunc.add(currentFunctionName);
            return;
        }

        graph.otherFunc.add(currentFunctionName);
    }

}