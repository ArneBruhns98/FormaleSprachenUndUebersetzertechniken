// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und Übersetzertechniken/Praktikum/SyntaxgesteuerterInterpreter/src/main/resources\ExprGrammarAction.g4 by ANTLR 4.7.2
 package gen.grammarGrammarAction; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprGrammarActionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprGrammarActionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprGrammarActionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprGrammarActionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprGrammarActionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExprGrammarActionParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprGrammarActionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprGrammarActionParser.ExprContext ctx);
}