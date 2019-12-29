// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und Übersetzertechniken/Praktikum/SyntaxgesteuerterInterpreter/src/main/resources\ExprGrammarAction.g4 by ANTLR 4.7.2
 package gen.grammarGrammarAction; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprGrammarActionParser}.
 */
public interface ExprGrammarActionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprGrammarActionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprGrammarActionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarActionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprGrammarActionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarActionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprGrammarActionParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarActionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprGrammarActionParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarActionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprGrammarActionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarActionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprGrammarActionParser.ExprContext ctx);
}