// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und Übersetzertechniken/Praktikum/SyntaxgesteuerterInterpreter/src/main/resources\ExprVisitorListener.g4 by ANTLR 4.7.2
 package gen.grammarVisitorListener; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprVisitorListenerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitorListenerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprVisitorListenerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprVisitorListenerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getResult}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetResult(ExprVisitorListenerParser.GetResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExprVisitorListenerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClear(ExprVisitorListenerParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprVisitorListenerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(ExprVisitorListenerParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potency}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotency(ExprVisitorListenerParser.PotencyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ExprVisitorListenerParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExprVisitorListenerParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(ExprVisitorListenerParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(ExprVisitorListenerParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUlDiv}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUlDiv(ExprVisitorListenerParser.MUlDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprVisitorListenerParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprVisitorListenerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExprVisitorListenerParser.IntContext ctx);
}