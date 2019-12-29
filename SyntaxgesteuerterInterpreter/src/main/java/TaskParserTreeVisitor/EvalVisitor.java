package TaskParserTreeVisitor;

import gen.grammarVisitorListener.ExprVisitorListenerBaseVisitor;
import gen.grammarVisitorListener.ExprVisitorListenerParser;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends ExprVisitorListenerBaseVisitor<Integer> {

    Map<String, Integer> memory = new HashMap<>();

    /** expr NEWLINE #getResult */
    @Override
    public Integer visitGetResult(ExprVisitorListenerParser.GetResultContext ctx) {
        return visit(ctx.expr());
    }

    /** | ID '=' expr NEWLINE #assignment */
    @Override
    public Integer visitAssignment(ExprVisitorListenerParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    /** 'clear' NEWLINE #clear */
    @Override
    public Integer visitClear(ExprVisitorListenerParser.ClearContext ctx) {
        memory = new HashMap<>();
        return memory.size();
    }

    /** INT #int */
    @Override
    public Integer visitInt(ExprVisitorListenerParser.IntContext ctx){
        return Integer.valueOf(ctx.INT().getText());
    }

    /** ID #id */
    @Override
    public Integer visitId(ExprVisitorListenerParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        return 0;
    }

    /** <assoc=right> expr '^' expr #potency */
    @Override
    public Integer visitPotency(ExprVisitorListenerParser.PotencyContext ctx) {
        return (int) Math.pow(visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    /** expr: expr op=('+'|'-') expr #AddSub */
    @Override
    public Integer visitAddSub(ExprVisitorListenerParser.AddSubContext ctx){
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType() == ExprVisitorListenerParser.ADD) return left + right;
        else return left - right;
    }

    /** expr op=('*'|'/') expr #MUlDiv */
    @Override
    public Integer visitMUlDiv(ExprVisitorListenerParser.MUlDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if ( ctx.op.getType() == ExprVisitorListenerParser.MUL ) return left * right;
        else return left / right;
    }

    /** expr op=('=='|'<'|'>') expr #comparison */
    @Override
    public Integer visitComparison(ExprVisitorListenerParser.ComparisonContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        switch ( ctx.op.getType() ) {
            case ExprVisitorListenerParser.EQUAL: return left == right ? 1 : 0;
            case ExprVisitorListenerParser.SMALLER: return left < right ? 1 : 0;
            case ExprVisitorListenerParser.TALLER: return left > right ? 1 : 0;
        }
        return 0;
    }

    /** expr '?' expr ':' expr #conditionalExpression */
    @Override
    public Integer visitConditionalExpression(ExprVisitorListenerParser.ConditionalExpressionContext ctx) {
        if(visit(ctx.expr(0)) == 1) return visit(ctx.expr(1));
        else return visit(ctx.expr(2));

    }

    /** '(' expr ')' #bracket */
    @Override
    public Integer visitBracket(ExprVisitorListenerParser.BracketContext ctx){
        return visit(ctx.expr());
    }

}
