// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und Übersetzertechniken/Praktikum/Syntaxgesteuerte Zwischencodeerzeugung/src/main/resources\Cymbol.g4 by ANTLR 4.7.2
 package grammar.cymbol; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CymbolParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CymbolParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(CymbolParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(CymbolParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_block}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(CymbolParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_block}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(CymbolParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_varDecl}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_varDecl(CymbolParser.Stat_varDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_varDecl}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_varDecl(CymbolParser.Stat_varDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_ifStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_ifStat(CymbolParser.Stat_ifStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_ifStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_ifStat(CymbolParser.Stat_ifStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_forStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_forStat(CymbolParser.Stat_forStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_forStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_forStat(CymbolParser.Stat_forStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_whileStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_whileStat(CymbolParser.Stat_whileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_whileStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_whileStat(CymbolParser.Stat_whileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_returnStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_returnStat(CymbolParser.Stat_returnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_returnStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_returnStat(CymbolParser.Stat_returnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_assignStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_assignStat(CymbolParser.Stat_assignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_assignStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_assignStat(CymbolParser.Stat_assignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_printStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_printStat(CymbolParser.Stat_printStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_printStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_printStat(CymbolParser.Stat_printStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_expr}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_expr(CymbolParser.Stat_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_expr}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_expr(CymbolParser.Stat_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(CymbolParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(CymbolParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(CymbolParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(CymbolParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CymbolParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CymbolParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(CymbolParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(CymbolParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(CymbolParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(CymbolParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(CymbolParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(CymbolParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracket(CymbolParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracket(CymbolParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(CymbolParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(CymbolParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CymbolParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CymbolParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CymbolParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CymbolParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(CymbolParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(CymbolParser.MuldivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CymbolParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CymbolParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CymbolParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CymbolParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true_expr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterTrue_expr(CymbolParser.True_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true_expr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitTrue_expr(CymbolParser.True_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false_expr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterFalse_expr(CymbolParser.False_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false_expr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitFalse_expr(CymbolParser.False_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackt_bexpr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBrackt_bexpr(CymbolParser.Brackt_bexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackt_bexpr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBrackt_bexpr(CymbolParser.Brackt_bexprContext ctx);
}