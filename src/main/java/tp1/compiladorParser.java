// Generated from d:/xampp/htdocs/TC-tp1-main/src/main/java/tp1/compilador.g4 by ANTLR 4.13.1

package tp1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PA=2, PC=3, LLA=4, LLC=5, PYC=6, IGUAL=7, COMA=8, EQUAL=9, MAY=10, 
		MAYEQUAL=11, MEN=12, MENEQUAL=13, NOTEQUAL=14, Y=15, O=16, SUMA=17, RESTA=18, 
		MULT=19, DIV=20, MOD=21, INT=22, FLOAT=23, BOOLE=24, TRUE=25, FALSE=26, 
		IWHILE=27, IIF=28, IELSE=29, IFOR=30, IRETURN=31, NUMERO=32, ID=33;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_porcion = 3, 
		RULE_declaracion = 4, RULE_tipoVariable = 5, RULE_asignacion = 6, RULE_expresiones = 7, 
		RULE_exp = 8, RULE_term = 9, RULE_t = 10, RULE_factor = 11, RULE_f = 12, 
		RULE_condicional = 13, RULE_expbool = 14, RULE_comparadores = 15, RULE_operadorLogico = 16, 
		RULE_operadorBool = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "porcion", "declaracion", 
			"tipoVariable", "asignacion", "expresiones", "exp", "term", "t", "factor", 
			"f", "condicional", "expbool", "comparadores", "operadorLogico", "operadorBool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'=='", 
			"'>'", "'>='", "'<'", "'<='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'int'", "'float'", "'bool'", "'true'", "'false'", "'while'", 
			"'if'", "'else'", "'for'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "COMA", "EQUAL", 
			"MAY", "MAYEQUAL", "MEN", "MENEQUAL", "NOTEQUAL", "Y", "O", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "INT", "FLOAT", "BOOLE", "TRUE", "FALSE", "IWHILE", 
			"IIF", "IELSE", "IFOR", "IRETURN", "NUMERO", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladorParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			instrucciones();
			setState(37);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLE:
			case IIF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				instruccion();
				setState(40);
				instrucciones();
				}
				break;
			case EOF:
			case LLC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				declaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				asignacion();
				}
				break;
			case IIF:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				condicional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PorcionContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(compiladorParser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(compiladorParser.LLC, 0); }
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public PorcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterPorcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitPorcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitPorcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PorcionContext porcion() throws RecognitionException {
		PorcionContext _localctx = new PorcionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_porcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LLA);
			setState(51);
			instrucciones();
			setState(52);
			match(LLC);
			setState(53);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public TerminalNode IGUAL() { return getToken(compiladorParser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				tipoVariable();
				setState(56);
				match(ID);
				setState(57);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				tipoVariable();
				setState(60);
				match(ID);
				setState(61);
				match(IGUAL);
				setState(62);
				exp();
				setState(63);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladorParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(compiladorParser.FLOAT, 0); }
		public TerminalNode BOOLE() { return getToken(compiladorParser.BOOLE, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTipoVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitTipoVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(compiladorParser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(IGUAL);
			setState(71);
			exp();
			setState(72);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionesContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladorParser.EOF, 0); }
		public ExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionesContext expresiones() throws RecognitionException {
		ExpresionesContext _localctx = new ExpresionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresiones);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case TRUE:
			case FALSE:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				exp();
				setState(75);
				match(PYC);
				setState(76);
				expresiones();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			term();
			setState(82);
			t();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			factor();
			setState(85);
			f();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladorParser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(compiladorParser.RESTA, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_t);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(SUMA);
				setState(88);
				term();
				setState(89);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(RESTA);
				setState(92);
				term();
				setState(93);
				t();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(compiladorParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public OperadorBoolContext operadorBool() {
			return getRuleContext(OperadorBoolContext.class,0);
		}
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ID);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				operadorBool();
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(PA);
				setState(102);
				exp();
				setState(103);
				match(PC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladorParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode DIV() { return getToken(compiladorParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(compiladorParser.MOD, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_f);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(MULT);
				setState(108);
				factor();
				setState(109);
				f();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(DIV);
				setState(112);
				factor();
				setState(113);
				f();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(MOD);
				setState(116);
				factor();
				setState(117);
				f();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IIF() { return getToken(compiladorParser.IIF, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public PorcionContext porcion() {
			return getRuleContext(PorcionContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IIF);
			setState(123);
			match(PA);
			setState(124);
			expbool(0);
			setState(125);
			match(PC);
			setState(126);
			porcion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpboolContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ComparadoresContext comparadores() {
			return getRuleContext(ComparadoresContext.class,0);
		}
		public List<OperadorBoolContext> operadorBool() {
			return getRuleContexts(OperadorBoolContext.class);
		}
		public OperadorBoolContext operadorBool(int i) {
			return getRuleContext(OperadorBoolContext.class,i);
		}
		public OperadorLogicoContext operadorLogico() {
			return getRuleContext(OperadorLogicoContext.class,0);
		}
		public List<ExpboolContext> expbool() {
			return getRuleContexts(ExpboolContext.class);
		}
		public ExpboolContext expbool(int i) {
			return getRuleContext(ExpboolContext.class,i);
		}
		public ExpboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpbool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpboolContext expbool() throws RecognitionException {
		return expbool(0);
	}

	private ExpboolContext expbool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpboolContext _localctx = new ExpboolContext(_ctx, _parentState);
		ExpboolContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expbool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(129);
				exp();
				setState(130);
				comparadores();
				setState(131);
				exp();
				}
				break;
			case 2:
				{
				setState(133);
				operadorBool();
				setState(134);
				operadorLogico();
				setState(135);
				operadorBool();
				}
				break;
			case 3:
				{
				setState(137);
				operadorBool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpboolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expbool);
					setState(140);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(141);
					operadorLogico();
					setState(142);
					expbool(4);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparadoresContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(compiladorParser.EQUAL, 0); }
		public TerminalNode MAY() { return getToken(compiladorParser.MAY, 0); }
		public TerminalNode MAYEQUAL() { return getToken(compiladorParser.MAYEQUAL, 0); }
		public TerminalNode MEN() { return getToken(compiladorParser.MEN, 0); }
		public TerminalNode MENEQUAL() { return getToken(compiladorParser.MENEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(compiladorParser.NOTEQUAL, 0); }
		public ComparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterComparadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitComparadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitComparadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadoresContext comparadores() throws RecognitionException {
		ComparadoresContext _localctx = new ComparadoresContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorLogicoContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(compiladorParser.O, 0); }
		public TerminalNode Y() { return getToken(compiladorParser.Y, 0); }
		public OperadorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperadorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperadorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperadorLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorLogicoContext operadorLogico() throws RecognitionException {
		OperadorLogicoContext _localctx = new OperadorLogicoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==Y || _la==O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(compiladorParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladorParser.FALSE, 0); }
		public OperadorBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperadorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperadorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperadorBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorBoolContext operadorBool() throws RecognitionException {
		OperadorBoolContext _localctx = new OperadorBoolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operadorBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expbool_sempred((ExpboolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expbool_sempred(ExpboolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u009c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		",\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007P\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\na\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000bj\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\fy\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u008b\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0091\b\u000e\n\u000e\f\u000e"+
		"\u0094\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0000\u0001\u001c\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0004\u0001\u0000\u0016\u0018\u0001\u0000\t\u000e\u0001\u0000\u000f\u0010"+
		"\u0001\u0000\u0019\u001a\u0099\u0000$\u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000"+
		"\u0000\bA\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fE\u0001"+
		"\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000"+
		"\u0000\u0012T\u0001\u0000\u0000\u0000\u0014`\u0001\u0000\u0000\u0000\u0016"+
		"i\u0001\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001az\u0001"+
		"\u0000\u0000\u0000\u001c\u008a\u0001\u0000\u0000\u0000\u001e\u0095\u0001"+
		"\u0000\u0000\u0000 \u0097\u0001\u0000\u0000\u0000\"\u0099\u0001\u0000"+
		"\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001"+
		"\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0003\u0002\u0001"+
		"\u0000),\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+\'\u0001\u0000"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000\u0000"+
		"-1\u0003\b\u0004\u0000.1\u0003\f\u0006\u0000/1\u0003\u001a\r\u00000-\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"1\u0005\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u000034\u0003\u0002"+
		"\u0001\u000045\u0005\u0005\u0000\u000056\u0005\u0006\u0000\u00006\u0007"+
		"\u0001\u0000\u0000\u000078\u0003\n\u0005\u000089\u0005!\u0000\u00009:"+
		"\u0005\u0006\u0000\u0000:B\u0001\u0000\u0000\u0000;<\u0003\n\u0005\u0000"+
		"<=\u0005!\u0000\u0000=>\u0005\u0007\u0000\u0000>?\u0003\u0010\b\u0000"+
		"?@\u0005\u0006\u0000\u0000@B\u0001\u0000\u0000\u0000A7\u0001\u0000\u0000"+
		"\u0000A;\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0007\u0000"+
		"\u0000\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0005!\u0000\u0000FG\u0005"+
		"\u0007\u0000\u0000GH\u0003\u0010\b\u0000HI\u0005\u0006\u0000\u0000I\r"+
		"\u0001\u0000\u0000\u0000JK\u0003\u0010\b\u0000KL\u0005\u0006\u0000\u0000"+
		"LM\u0003\u000e\u0007\u0000MP\u0001\u0000\u0000\u0000NP\u0005\u0000\u0000"+
		"\u0001OJ\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u000f\u0001"+
		"\u0000\u0000\u0000QR\u0003\u0012\t\u0000RS\u0003\u0014\n\u0000S\u0011"+
		"\u0001\u0000\u0000\u0000TU\u0003\u0016\u000b\u0000UV\u0003\u0018\f\u0000"+
		"V\u0013\u0001\u0000\u0000\u0000WX\u0005\u0011\u0000\u0000XY\u0003\u0012"+
		"\t\u0000YZ\u0003\u0014\n\u0000Za\u0001\u0000\u0000\u0000[\\\u0005\u0012"+
		"\u0000\u0000\\]\u0003\u0012\t\u0000]^\u0003\u0014\n\u0000^a\u0001\u0000"+
		"\u0000\u0000_a\u0001\u0000\u0000\u0000`W\u0001\u0000\u0000\u0000`[\u0001"+
		"\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0015\u0001\u0000\u0000"+
		"\u0000bj\u0005 \u0000\u0000cj\u0005!\u0000\u0000dj\u0003\"\u0011\u0000"+
		"ef\u0005\u0002\u0000\u0000fg\u0003\u0010\b\u0000gh\u0005\u0003\u0000\u0000"+
		"hj\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000"+
		"\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000j\u0017\u0001"+
		"\u0000\u0000\u0000kl\u0005\u0013\u0000\u0000lm\u0003\u0016\u000b\u0000"+
		"mn\u0003\u0018\f\u0000ny\u0001\u0000\u0000\u0000op\u0005\u0014\u0000\u0000"+
		"pq\u0003\u0016\u000b\u0000qr\u0003\u0018\f\u0000ry\u0001\u0000\u0000\u0000"+
		"st\u0005\u0015\u0000\u0000tu\u0003\u0016\u000b\u0000uv\u0003\u0018\f\u0000"+
		"vy\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xk\u0001\u0000\u0000"+
		"\u0000xo\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000y\u0019\u0001\u0000\u0000\u0000z{\u0005\u001c\u0000\u0000"+
		"{|\u0005\u0002\u0000\u0000|}\u0003\u001c\u000e\u0000}~\u0005\u0003\u0000"+
		"\u0000~\u007f\u0003\u0006\u0003\u0000\u007f\u001b\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0006\u000e\uffff\uffff\u0000\u0081\u0082\u0003\u0010\b\u0000"+
		"\u0082\u0083\u0003\u001e\u000f\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084"+
		"\u008b\u0001\u0000\u0000\u0000\u0085\u0086\u0003\"\u0011\u0000\u0086\u0087"+
		"\u0003 \u0010\u0000\u0087\u0088\u0003\"\u0011\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0003\"\u0011\u0000\u008a\u0080\u0001\u0000"+
		"\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u0092\u0001\u0000\u0000\u0000\u008c\u008d\n\u0003\u0000"+
		"\u0000\u008d\u008e\u0003 \u0010\u0000\u008e\u008f\u0003\u001c\u000e\u0004"+
		"\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u001d\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0001\u0000\u0000"+
		"\u0096\u001f\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0002\u0000\u0000"+
		"\u0098!\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0003\u0000\u0000\u009a"+
		"#\u0001\u0000\u0000\u0000\t+0AO`ix\u008a\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}