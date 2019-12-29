package taskThree;// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxerkennerMitANTLR/src/main/resources\TaskThree.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskThreeParser}.
 */
public interface TaskThreeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskThreeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TaskThreeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskThreeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TaskThreeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskThreeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TaskThreeParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskThreeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TaskThreeParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskThreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TaskThreeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskThreeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TaskThreeParser.ExprContext ctx);
}