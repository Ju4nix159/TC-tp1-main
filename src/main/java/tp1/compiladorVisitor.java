// Generated from c:/Users/juani/Desktop/tp1/tp1/src/main/java/tp1/compilador.g4 by ANTLR 4.13.1

package tp1;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladorParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones(compiladorParser.ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladorParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(compiladorParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(compiladorParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(compiladorParser.FContext ctx);
}