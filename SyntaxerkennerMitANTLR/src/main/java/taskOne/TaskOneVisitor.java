package taskOne;// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxerkennerMitANTLR/src/main/resources\TaskOne.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaskOneParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaskOneVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaskOneParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TaskOneParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskOneParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TaskOneParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskOneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TaskOneParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskOneParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TaskOneParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskOneParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(TaskOneParser.FactContext ctx);
}