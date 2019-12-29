// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und Übersetzertechniken/Praktikum/SyntaxgesteuerterInterpreter/src/main/resources\ExprVisitorListener.g4 by ANTLR 4.7.2
 package gen.grammarVisitorListener; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprVisitorListenerParser}.
 */
public interface ExprVisitorListenerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprVisitorListenerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprVisitorListenerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprVisitorListenerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprVisitorListenerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getResult}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGetResult(ExprVisitorListenerParser.GetResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getResult}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGetResult(ExprVisitorListenerParser.GetResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprVisitorListenerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprVisitorListenerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clear}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterClear(ExprVisitorListenerParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitClear(ExprVisitorListenerParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ExprVisitorListenerParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ExprVisitorListenerParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code potency}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPotency(ExprVisitorListenerParser.PotencyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code potency}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPotency(ExprVisitorListenerParser.PotencyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ExprVisitorListenerParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ExprVisitorListenerParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExprVisitorListenerParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExprVisitorListenerParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ExprVisitorListenerParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ExprVisitorListenerParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracket(ExprVisitorListenerParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracket(ExprVisitorListenerParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUlDiv}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMUlDiv(ExprVisitorListenerParser.MUlDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUlDiv}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMUlDiv(ExprVisitorListenerParser.MUlDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ExprVisitorListenerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ExprVisitorListenerParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExprVisitorListenerParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExprVisitorListenerParser.IntContext ctx);
}