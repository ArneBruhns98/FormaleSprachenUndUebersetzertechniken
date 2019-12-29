package taskThree;// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxerkennerMitANTLR/src/main/resources\TaskThree.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaskThreeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaskThreeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaskThreeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TaskThreeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskThreeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TaskThreeParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskThreeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TaskThreeParser.ExprContext ctx);
}