// Generated from c:/Users/juani/Documents/GitHub/TC-tp1-main/src/main/java/tp1/compilador.g4 by ANTLR 4.13.1

package tp1;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorParser}.
 */
public interface compiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void enterTipoVariable(compiladorParser.TipoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void exitTipoVariable(compiladorParser.TipoVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladorParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladorParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(compiladorParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(compiladorParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void enterExpresiones(compiladorParser.ExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void exitExpresiones(compiladorParser.ExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladorParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladorParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladorParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladorParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(compiladorParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(compiladorParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(compiladorParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(compiladorParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#condicionalElse}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalElse(compiladorParser.CondicionalElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#condicionalElse}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalElse(compiladorParser.CondicionalElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void enterBucleWhile(compiladorParser.BucleWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void exitBucleWhile(compiladorParser.BucleWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void enterBucleFor(compiladorParser.BucleForContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void exitBucleFor(compiladorParser.BucleForContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#prototipoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterPrototipoFuncion(compiladorParser.PrototipoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#prototipoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitPrototipoFuncion(compiladorParser.PrototipoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(compiladorParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(compiladorParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadoFuncion(compiladorParser.LlamadoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadoFuncion(compiladorParser.LlamadoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#datos}.
	 * @param ctx the parse tree
	 */
	void enterDatos(compiladorParser.DatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#datos}.
	 * @param ctx the parse tree
	 */
	void exitDatos(compiladorParser.DatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(compiladorParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(compiladorParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(compiladorParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(compiladorParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(compiladorParser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(compiladorParser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogico(compiladorParser.OperadorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogico(compiladorParser.OperadorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#operadorBool}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBool(compiladorParser.OperadorBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#operadorBool}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBool(compiladorParser.OperadorBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(compiladorParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(compiladorParser.IncrementoContext ctx);
}