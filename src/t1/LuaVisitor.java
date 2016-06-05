// Generated from C:/Users/Yago/Documents/GitHub/t1-cc1/src/t1\Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LuaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#trecho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrecho(LuaParser.TrechoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(LuaParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#ultimocomando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUltimocomando(LuaParser.UltimocomandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listaexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaexp(LuaParser.ListaexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LuaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(LuaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listavar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListavar(LuaParser.ListavarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#expprefixo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpprefixo(LuaParser.ExpprefixoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LuaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(LuaParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#separadordecampos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparadordecampos(LuaParser.SeparadordecamposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(LuaParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listadecampos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListadecampos(LuaParser.ListadecamposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#construtortabela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrutortabela(LuaParser.ConstrutortabelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LuaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#expprefixo2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpprefixo2(LuaParser.Expprefixo2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadadefuncao(LuaParser.ChamadadefuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nomedafuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomedafuncao(LuaParser.NomedafuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LuaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(LuaParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#corpodafuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpodafuncao(LuaParser.CorpodafuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listapar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListapar(LuaParser.ListaparContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opbin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpbin(LuaParser.OpbinContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#opunaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpunaria(LuaParser.OpunariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#listadenomes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListadenomes(LuaParser.ListadenomesContext ctx);
}