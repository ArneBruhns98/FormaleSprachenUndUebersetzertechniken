package TaskParseTreeListener;

import gen.grammarVisitorListener.ExprVisitorListenerBaseListener;
import gen.grammarVisitorListener.ExprVisitorListenerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class EvaluatorWithProps extends ExprVisitorListenerBaseListener {

    private ParseTreeProperty<Integer> values = new ParseTreeProperty<>();
    Map<String, Integer> memory = new HashMap<>();

    private void setValue(ParseTree node, int value) { values.put(node, value); }
    int getValue(ParseTree node) { return values.get(node); }

    @Override
    public void exitProg(ExprVisitorListenerParser.ProgContext ctx) {
        setValue(ctx, getValue(ctx.stat(0)));
    }

    /** expr NEWLINE #getResult */
    @Override
    public void exitGetResult(ExprVisitorListenerParser.GetResultContext ctx) {
        setValue(ctx, getValue(ctx.expr()));
    }

    /** ID '=' expr NEWLINE #assignment */
    @Override
    public void exitAssignment(ExprVisitorListenerParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        int value = getValue(ctx.expr());
        memory.put(id, value);
        setValue(ctx, value);
    }

    /** 'clear' NEWLINE #clear */
    @Override
    public void exitClear(ExprVisitorListenerParser.ClearContext ctx) {
        values = new ParseTreeProperty<>();
        setValue(ctx, 0);
        memory.clear();
    }

    /** INT #int */
    @Override
    public void exitInt(ExprVisitorListenerParser.IntContext ctx) {
        String intText = ctx.INT().getText();
        setValue(ctx, Integer.parseInt(intText));
    }

    /** ID #id */
    @Override
    public void exitId(ExprVisitorListenerParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) setValue(ctx, memory.get(id));
    }

    /** <assoc=right> expr '^' expr #potency */
    @Override
    public void exitPotency(ExprVisitorListenerParser.PotencyContext ctx) {
        setValue(ctx, (int) Math.pow(getValue(ctx.expr(0)), getValue(ctx.expr(1))));
    }

    /** expr op=('*'|'/') expr #MUlDiv */
    @Override
    public void exitMUlDiv(ExprVisitorListenerParser.MUlDivContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        if(ctx.op.getType() == ExprVisitorListenerParser.MUL) setValue(ctx, left * right);
        else setValue(ctx, left / right);
    }

    /** expr: expr op=('+'|'-') expr #AddSub */
    @Override
    public void exitAddSub(ExprVisitorListenerParser.AddSubContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        if(ctx.op.getType() == ExprVisitorListenerParser.ADD) setValue(ctx, left + right);
        else setValue(ctx, left - right);
    }

    /** expr op=('=='|'<'|'>') expr #comparison */
    @Override
    public void exitComparison(ExprVisitorListenerParser.ComparisonContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        switch (ctx.op.getType()){
            case ExprVisitorListenerParser.EQUAL: setValue(ctx, (left == right ? 0 : 1));
            case ExprVisitorListenerParser.SMALLER: setValue(ctx, (left < right ? 0 : 1));
            case ExprVisitorListenerParser.TALLER:  setValue(ctx, (left > right ? 0 : 1));
        }
    }

    /** expr '?' expr ':' expr #conditionalExpression */
    @Override
    public void exitConditionalExpression(ExprVisitorListenerParser.ConditionalExpressionContext ctx) {
        if(getValue(ctx.expr(0)) == 1) setValue(ctx, getValue(ctx.expr(1)));
        else setValue(ctx, getValue(ctx.expr(2)));
    }

    /** '(' expr ')' #bracket */
    @Override
    public void exitBracket(ExprVisitorListenerParser.BracketContext ctx) {
        setValue(ctx, getValue(ctx.expr()));
    }
}
