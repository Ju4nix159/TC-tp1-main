// Generated from d:/xampp/htdocs/TC-tp1-main/src/main/java/tp1/compilador.g4 by ANTLR 4.13.1

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
	 * Visit a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#tipoVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVariable(compiladorParser.TipoVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladorParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(compiladorParser.RetornoContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link compiladorParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(compiladorParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#condicionalElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalElse(compiladorParser.CondicionalElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bucleWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleWhile(compiladorParser.BucleWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bucleFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleFor(compiladorParser.BucleForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#prototipoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototipoFuncion(compiladorParser.PrototipoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(compiladorParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadoFuncion(compiladorParser.LlamadoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatos(compiladorParser.DatosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(compiladorParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(compiladorParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#comparadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparadores(compiladorParser.ComparadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#operadorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogico(compiladorParser.OperadorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#operadorBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBool(compiladorParser.OperadorBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(compiladorParser.IncrementoContext ctx);
}