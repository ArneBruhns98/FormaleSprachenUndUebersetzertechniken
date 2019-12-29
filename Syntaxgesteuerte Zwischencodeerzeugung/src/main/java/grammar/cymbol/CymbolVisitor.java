// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und Übersetzertechniken/Praktikum/Syntaxgesteuerte Zwischencodeerzeugung/src/main/resources\Cymbol.g4 by ANTLR 4.7.2
 package grammar.cymbol; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CymbolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CymbolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CymbolParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(CymbolParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_block}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(CymbolParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_varDecl}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_varDecl(CymbolParser.Stat_varDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_ifStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_ifStat(CymbolParser.Stat_ifStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_forStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_forStat(CymbolParser.Stat_forStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_whileStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_whileStat(CymbolParser.Stat_whileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_returnStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_returnStat(CymbolParser.Stat_returnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_assignStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_assignStat(CymbolParser.Stat_assignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_printStat}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_printStat(CymbolParser.Stat_printStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_expr}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_expr(CymbolParser.Stat_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(CymbolParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(CymbolParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CymbolParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(CymbolParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CymbolParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CymbolParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(CymbolParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(CymbolParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(CymbolParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CymbolParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CymbolParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(CymbolParser.MuldivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CymbolParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CymbolParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true_expr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_expr(CymbolParser.True_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false_expr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_expr(CymbolParser.False_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackt_bexpr}
	 * labeled alternative in {@link CymbolParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackt_bexpr(CymbolParser.Brackt_bexprContext ctx);
}