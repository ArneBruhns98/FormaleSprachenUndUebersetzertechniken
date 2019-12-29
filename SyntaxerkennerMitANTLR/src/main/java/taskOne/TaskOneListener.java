package taskOne;// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxerkennerMitANTLR/src/main/resources\TaskOne.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskOneParser}.
 */
public interface TaskOneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskOneParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TaskOneParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskOneParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TaskOneParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskOneParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TaskOneParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskOneParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TaskOneParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskOneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TaskOneParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskOneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TaskOneParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskOneParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TaskOneParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskOneParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TaskOneParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskOneParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(TaskOneParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskOneParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(TaskOneParser.FactContext ctx);
}