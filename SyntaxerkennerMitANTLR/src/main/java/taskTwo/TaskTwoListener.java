package taskTwo;// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxerkennerMitANTLR/src/main/resources\TaskTwo.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskTwoParser}.
 */
public interface TaskTwoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskTwoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TaskTwoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskTwoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TaskTwoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskTwoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TaskTwoParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskTwoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TaskTwoParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskTwoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TaskTwoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskTwoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TaskTwoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskTwoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TaskTwoParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskTwoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TaskTwoParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskTwoParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(TaskTwoParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskTwoParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(TaskTwoParser.FactContext ctx);
}