package taskTwo;// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxerkennerMitANTLR/src/main/resources\TaskTwo.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaskTwoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaskTwoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaskTwoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TaskTwoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskTwoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TaskTwoParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskTwoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TaskTwoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskTwoParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TaskTwoParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskTwoParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(TaskTwoParser.FactContext ctx);
}