// Generated from C:/Users/Yago/Documents/GitHub/t1-cc1/src/t1\Lua.g4 by ANTLR 4.5.1
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, Whitespace=48, Comentario=49, Numero=50, Cadeia=51, 
		Nome=52;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_ultimocomando = 3, 
		RULE_listaexp = 4, RULE_prog = 5, RULE_comando = 6, RULE_listavar = 7, 
		RULE_expprefixo = 8, RULE_exp = 9, RULE_exp2 = 10, RULE_separadordecampos = 11, 
		RULE_campo = 12, RULE_listadecampos = 13, RULE_construtortabela = 14, 
		RULE_args = 15, RULE_expprefixo2 = 16, RULE_chamadadefuncao = 17, RULE_nomedafuncao = 18, 
		RULE_var = 19, RULE_funcao = 20, RULE_corpodafuncao = 21, RULE_listapar = 22, 
		RULE_opbin = 23, RULE_opunaria = 24, RULE_listadenomes = 25;
	public static final String[] ruleNames = {
		"programa", "trecho", "bloco", "ultimocomando", "listaexp", "prog", "comando", 
		"listavar", "expprefixo", "exp", "exp2", "separadordecampos", "campo", 
		"listadecampos", "construtortabela", "args", "expprefixo2", "chamadadefuncao", 
		"nomedafuncao", "var", "funcao", "corpodafuncao", "listapar", "opbin", 
		"opunaria", "listadenomes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'return'", "'break'", "','", "'='", "'do'", "'end'", "'while'", 
		"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
		"'in'", "'function'", "'local'", "'('", "')'", "'nil'", "'false'", "'true'", 
		"'...'", "'['", "']'", "'{'", "'}'", "'.'", "':'", "'+'", "'-'", "'*'", 
		"'/'", "'^'", "'%'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'~='", 
		"'and'", "'or'", "'not'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Whitespace", "Comentario", "Numero", "Cadeia", "Nome"
	};
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<551732, 551961>>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			trecho();
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

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitTrecho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << Nome))) != 0)) {
				{
				{
				setState(54);
				comando();
				setState(56);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(55);
					match(T__0);
					}
				}

				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(63);
				ultimocomando();
				setState(65);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(64);
					match(T__0);
					}
				}

				}
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

	public static class BlocoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			trecho();
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

	public static class UltimocomandoContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUltimocomando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitUltimocomando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ultimocomando);
		int _la;
		try {
			setState(76);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__1);
				setState(73);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Numero) | (1L << Cadeia) | (1L << Nome))) != 0)) {
					{
					setState(72);
					listaexp();
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__2);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListaexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					exp();
					setState(79);
					match(T__3);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(86);
			exp();
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(LuaParser.Numero, 0); }
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==Numero || _la==Cadeia) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ComandoContext extends ParserRuleContext {
		public Token Nome;
		public NomedafuncaoContext nomedafuncao;
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		int _la;
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				listavar();
				setState(91);
				match(T__4);
				setState(92);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__5);
				setState(96);
				bloco();
				setState(97);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__7);
				setState(100);
				exp();
				setState(101);
				match(T__5);
				setState(102);
				bloco();
				setState(103);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(T__8);
				setState(106);
				bloco();
				setState(107);
				match(T__9);
				setState(108);
				exp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(T__10);
				setState(111);
				exp();
				setState(112);
				match(T__11);
				setState(113);
				bloco();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(114);
					match(T__12);
					setState(115);
					exp();
					setState(116);
					match(T__11);
					setState(117);
					bloco();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(124);
					match(T__13);
					setState(125);
					bloco();
					}
				}

				setState(128);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(T__14);
				setState(131);
				((ComandoContext)_localctx).Nome = match(Nome);
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).Nome!=null?((ComandoContext)_localctx).Nome.getText():null),Tipo.VARIAVEL); 
				setState(133);
				match(T__4);
				setState(134);
				exp();
				setState(135);
				match(T__3);
				setState(136);
				exp();
				setState(139);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(137);
					match(T__3);
					setState(138);
					exp();
					}
				}

				setState(141);
				match(T__5);
				setState(142);
				bloco();
				setState(143);
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				match(T__14);
				setState(146);
				listadenomes();
				setState(147);
				match(T__15);
				setState(148);
				listaexp();
				setState(149);
				match(T__5);
				setState(150);
				bloco();
				setState(151);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				match(T__16);
				setState(154);
				((ComandoContext)_localctx).nomedafuncao = nomedafuncao();
				 TabelaDeSimbolos.adicionarSimbolo((((ComandoContext)_localctx).nomedafuncao!=null?_input.getText(((ComandoContext)_localctx).nomedafuncao.start,((ComandoContext)_localctx).nomedafuncao.stop):null),Tipo.FUNCAO); 
				setState(156);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				match(T__17);
				setState(159);
				match(T__16);
				setState(160);
				match(Nome);
				setState(161);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(162);
				match(T__17);
				setState(163);
				listadenomes();
				setState(166);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(164);
					match(T__4);
					setState(165);
					listaexp();
					}
				}

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

	public static class ListavarContext extends ParserRuleContext {
		public VarContext var;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListavar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((ListavarContext)_localctx).var = var();
			 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(172);
				match(T__3);
				setState(173);
				((ListavarContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ListavarContext)_localctx).var!=null?_input.getText(((ListavarContext)_localctx).var.start,((ListavarContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpprefixo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expprefixo);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				((ExpprefixoContext)_localctx).var = var();
				 TabelaDeSimbolos.adicionarSimbolo((((ExpprefixoContext)_localctx).var!=null?_input.getText(((ExpprefixoContext)_localctx).var.start,((ExpprefixoContext)_localctx).var.stop):null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(T__18);
				setState(186);
				exp();
				setState(187);
				match(T__19);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(LuaParser.Numero, 0); }
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public OpbinContext opbin() {
			return getRuleContext(OpbinContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(T__22);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(Numero);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(Cadeia);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(T__23);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				funcao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				expprefixo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				construtortabela();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				exp2();
				setState(201);
				opbin();
				setState(202);
				exp();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(204);
				opunaria();
				setState(205);
				exp();
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

	public static class Exp2Context extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(LuaParser.Numero, 0); }
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp2);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(T__22);
				}
				break;
			case Numero:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(Numero);
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(Cadeia);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(T__23);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				funcao();
				}
				break;
			case T__18:
			case Nome:
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				expprefixo();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 9);
				{
				setState(217);
				construtortabela();
				}
				break;
			case T__31:
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				opunaria();
				setState(219);
				exp();
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

	public static class SeparadordecamposContext extends ParserRuleContext {
		public SeparadordecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparadordecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparadordecampos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitSeparadordecampos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparadordecamposContext separadordecampos() throws RecognitionException {
		SeparadordecamposContext _localctx = new SeparadordecamposContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_campo);
		try {
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__24);
				setState(226);
				exp();
				setState(227);
				match(T__25);
				setState(228);
				match(T__4);
				setState(229);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(Nome);
				setState(232);
				match(T__4);
				setState(233);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				exp();
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

	public static class ListadecamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<SeparadordecamposContext> separadordecampos() {
			return getRuleContexts(SeparadordecamposContext.class);
		}
		public SeparadordecamposContext separadordecampos(int i) {
			return getRuleContext(SeparadordecamposContext.class,i);
		}
		public ListadecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadecampos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListadecampos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListadecamposContext listadecampos() throws RecognitionException {
		ListadecamposContext _localctx = new ListadecamposContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			campo();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					separadordecampos();
					setState(239);
					campo();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(247);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__3) {
				{
				setState(246);
				separadordecampos();
				}
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

	public static class ConstrutortabelaContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public ConstrutortabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtortabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutortabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutortabela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitConstrutortabela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrutortabelaContext construtortabela() throws RecognitionException {
		ConstrutortabelaContext _localctx = new ConstrutortabelaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__26);
			setState(251);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Numero) | (1L << Cadeia) | (1L << Nome))) != 0)) {
				{
				setState(250);
				listadecampos();
				}
			}

			setState(253);
			match(T__27);
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

	public static class ArgsContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(262);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__18);
				setState(257);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Numero) | (1L << Cadeia) | (1L << Nome))) != 0)) {
					{
					setState(256);
					listaexp();
					}
				}

				setState(259);
				match(T__19);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(Cadeia);
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

	public static class Expprefixo2Context extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Expprefixo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExpprefixo2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expprefixo2Context expprefixo2() throws RecognitionException {
		Expprefixo2Context _localctx = new Expprefixo2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expprefixo2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(Nome);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(271);
					switch (_input.LA(1)) {
					case T__24:
						{
						setState(265);
						match(T__24);
						setState(266);
						exp();
						setState(267);
						match(T__25);
						}
						break;
					case T__28:
						{
						setState(269);
						match(T__28);
						setState(270);
						match(Nome);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public Expprefixo2Context expprefixo2;
		public Expprefixo2Context expprefixo2() {
			return getRuleContext(Expprefixo2Context.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitChamadadefuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chamadadefuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((ChamadadefuncaoContext)_localctx).expprefixo2 = expprefixo2();
			 TabelaDeSimbolos.adicionarSimbolo((((ChamadadefuncaoContext)_localctx).expprefixo2!=null?_input.getText(((ChamadadefuncaoContext)_localctx).expprefixo2.start,((ChamadadefuncaoContext)_localctx).expprefixo2.stop):null),Tipo.FUNCAO); 
			setState(280);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(278);
				match(T__29);
				setState(279);
				match(Nome);
				}
			}

			setState(282);
			args();
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNomedafuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Nome);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(285);
				match(T__28);
				setState(286);
				match(Nome);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(292);
				match(T__29);
				setState(293);
				match(Nome);
				}
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public Expprefixo2Context expprefixo2() {
			return getRuleContext(Expprefixo2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				expprefixo2();
				setState(298);
				match(T__24);
				setState(299);
				exp();
				setState(300);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				expprefixo2();
				setState(303);
				match(T__28);
				setState(304);
				match(Nome);
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

	public static class FuncaoContext extends ParserRuleContext {
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__16);
			setState(309);
			corpodafuncao();
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

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitCorpodafuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__18);
			setState(313);
			_la = _input.LA(1);
			if (_la==T__23 || _la==Nome) {
				{
				setState(312);
				listapar();
				}
			}

			setState(315);
			match(T__19);
			setState(316);
			bloco();
			setState(317);
			match(T__6);
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

	public static class ListaparContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListapar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListapar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listapar);
		int _la;
		try {
			setState(325);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				listadenomes();
				setState(322);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(320);
					match(T__3);
					setState(321);
					match(T__23);
					}
				}

				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(T__23);
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

	public static class OpbinContext extends ParserRuleContext {
		public OpbinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpbin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpbin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpbin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpunariaContext extends ParserRuleContext {
		public OpunariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpunaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpunaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOpunaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ListadenomesContext extends ParserRuleContext {
		public Token Nome;
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitListadenomes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((ListadenomesContext)_localctx).Nome = match(Nome);
			 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).Nome!=null?((ListadenomesContext)_localctx).Nome.getText():null),Tipo.VARIAVEL); 
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					match(T__3);
					setState(334);
					((ListadenomesContext)_localctx).Nome = match(Nome);
					 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).Nome!=null?((ListadenomesContext)_localctx).Nome.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0158\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\5\3;\n\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\3\3\5\3D\n\3\5\3F\n\3\3\4\3\4\3\5\3\5\5\5L\n\5\3\5\5\5O\n\5\3\6\3"+
		"\6\3\6\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\5\b\u0081\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\5\b\u00ab\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c0"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00d2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00ee\n\16\3\17\3\17\3\17\3\17\7\17\u00f4\n\17\f\17"+
		"\16\17\u00f7\13\17\3\17\5\17\u00fa\n\17\3\20\3\20\5\20\u00fe\n\20\3\20"+
		"\3\20\3\21\3\21\5\21\u0104\n\21\3\21\3\21\3\21\5\21\u0109\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u0112\n\22\f\22\16\22\u0115\13\22\3"+
		"\23\3\23\3\23\3\23\5\23\u011b\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u0122"+
		"\n\24\f\24\16\24\u0125\13\24\3\24\3\24\5\24\u0129\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0135\n\25\3\26\3\26\3\26\3\27"+
		"\3\27\5\27\u013c\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0145\n"+
		"\30\3\30\5\30\u0148\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0153\n\33\f\33\16\33\u0156\13\33\3\33\2\2\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\6\3\2\64\65\4\2\3\3\6\6\3\2"+
		"!/\4\2\"\"\60\61\u017b\2\66\3\2\2\2\4>\3\2\2\2\6G\3\2\2\2\bN\3\2\2\2\n"+
		"U\3\2\2\2\fZ\3\2\2\2\16\u00aa\3\2\2\2\20\u00ac\3\2\2\2\22\u00bf\3\2\2"+
		"\2\24\u00d1\3\2\2\2\26\u00df\3\2\2\2\30\u00e1\3\2\2\2\32\u00ed\3\2\2\2"+
		"\34\u00ef\3\2\2\2\36\u00fb\3\2\2\2 \u0108\3\2\2\2\"\u010a\3\2\2\2$\u0116"+
		"\3\2\2\2&\u011e\3\2\2\2(\u0134\3\2\2\2*\u0136\3\2\2\2,\u0139\3\2\2\2."+
		"\u0147\3\2\2\2\60\u0149\3\2\2\2\62\u014b\3\2\2\2\64\u014d\3\2\2\2\66\67"+
		"\5\4\3\2\67\3\3\2\2\28:\5\16\b\29;\7\3\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2"+
		"\2<8\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?E\3\2\2\2@>\3\2\2\2AC\5\b\5"+
		"\2BD\7\3\2\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EA\3\2\2\2EF\3\2\2\2F\5\3\2"+
		"\2\2GH\5\4\3\2H\7\3\2\2\2IK\7\4\2\2JL\5\n\6\2KJ\3\2\2\2KL\3\2\2\2LO\3"+
		"\2\2\2MO\7\5\2\2NI\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\5\24\13\2QR\7\6\2\2"+
		"RT\3\2\2\2SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2"+
		"XY\5\24\13\2Y\13\3\2\2\2Z[\t\2\2\2[\r\3\2\2\2\\]\5\20\t\2]^\7\7\2\2^_"+
		"\5\n\6\2_\u00ab\3\2\2\2`\u00ab\5$\23\2ab\7\b\2\2bc\5\6\4\2cd\7\t\2\2d"+
		"\u00ab\3\2\2\2ef\7\n\2\2fg\5\24\13\2gh\7\b\2\2hi\5\6\4\2ij\7\t\2\2j\u00ab"+
		"\3\2\2\2kl\7\13\2\2lm\5\6\4\2mn\7\f\2\2no\5\24\13\2o\u00ab\3\2\2\2pq\7"+
		"\r\2\2qr\5\24\13\2rs\7\16\2\2s{\5\6\4\2tu\7\17\2\2uv\5\24\13\2vw\7\16"+
		"\2\2wx\5\6\4\2xz\3\2\2\2yt\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0080"+
		"\3\2\2\2}{\3\2\2\2~\177\7\20\2\2\177\u0081\5\6\4\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\t\2\2\u0083\u00ab\3\2"+
		"\2\2\u0084\u0085\7\21\2\2\u0085\u0086\7\66\2\2\u0086\u0087\b\b\1\2\u0087"+
		"\u0088\7\7\2\2\u0088\u0089\5\24\13\2\u0089\u008a\7\6\2\2\u008a\u008d\5"+
		"\24\13\2\u008b\u008c\7\6\2\2\u008c\u008e\5\24\13\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\b\2\2\u0090\u0091"+
		"\5\6\4\2\u0091\u0092\7\t\2\2\u0092\u00ab\3\2\2\2\u0093\u0094\7\21\2\2"+
		"\u0094\u0095\5\64\33\2\u0095\u0096\7\22\2\2\u0096\u0097\5\n\6\2\u0097"+
		"\u0098\7\b\2\2\u0098\u0099\5\6\4\2\u0099\u009a\7\t\2\2\u009a\u00ab\3\2"+
		"\2\2\u009b\u009c\7\23\2\2\u009c\u009d\5&\24\2\u009d\u009e\b\b\1\2\u009e"+
		"\u009f\5,\27\2\u009f\u00ab\3\2\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\7"+
		"\23\2\2\u00a2\u00a3\7\66\2\2\u00a3\u00ab\5,\27\2\u00a4\u00a5\7\24\2\2"+
		"\u00a5\u00a8\5\64\33\2\u00a6\u00a7\7\7\2\2\u00a7\u00a9\5\n\6\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\\\3\2\2\2\u00aa"+
		"`\3\2\2\2\u00aaa\3\2\2\2\u00aae\3\2\2\2\u00aak\3\2\2\2\u00aap\3\2\2\2"+
		"\u00aa\u0084\3\2\2\2\u00aa\u0093\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u00a0"+
		"\3\2\2\2\u00aa\u00a4\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00ad\5(\25\2\u00ad"+
		"\u00b4\b\t\1\2\u00ae\u00af\7\6\2\2\u00af\u00b0\5(\25\2\u00b0\u00b1\b\t"+
		"\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\21\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00b8\5(\25\2\u00b8\u00b9\b\n\1\2\u00b9\u00c0\3\2\2\2\u00ba\u00c0"+
		"\5$\23\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\5\24\13\2\u00bd\u00be\7\26\2"+
		"\2\u00be\u00c0\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb"+
		"\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00d2\7\27\2\2\u00c2\u00d2\7\30\2\2\u00c3"+
		"\u00d2\7\31\2\2\u00c4\u00d2\7\64\2\2\u00c5\u00d2\7\65\2\2\u00c6\u00d2"+
		"\7\32\2\2\u00c7\u00d2\5*\26\2\u00c8\u00d2\5\22\n\2\u00c9\u00d2\5\36\20"+
		"\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc\5\60\31\2\u00cc\u00cd\5\24\13\2\u00cd"+
		"\u00d2\3\2\2\2\u00ce\u00cf\5\62\32\2\u00cf\u00d0\5\24\13\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00c2\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1"+
		"\u00c4\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00c7\3\2"+
		"\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d2\25\3\2\2\2\u00d3\u00e0\7\27\2\2\u00d4\u00e0\7\30"+
		"\2\2\u00d5\u00e0\7\31\2\2\u00d6\u00e0\7\64\2\2\u00d7\u00e0\7\65\2\2\u00d8"+
		"\u00e0\7\32\2\2\u00d9\u00e0\5*\26\2\u00da\u00e0\5\22\n\2\u00db\u00e0\5"+
		"\36\20\2\u00dc\u00dd\5\62\32\2\u00dd\u00de\5\24\13\2\u00de\u00e0\3\2\2"+
		"\2\u00df\u00d3\3\2\2\2\u00df\u00d4\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d6"+
		"\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\27\3\2\2"+
		"\2\u00e1\u00e2\t\3\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\7\33\2\2\u00e4\u00e5"+
		"\5\24\13\2\u00e5\u00e6\7\34\2\2\u00e6\u00e7\7\7\2\2\u00e7\u00e8\5\24\13"+
		"\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea\7\66\2\2\u00ea\u00eb\7\7\2\2\u00eb"+
		"\u00ee\5\24\13\2\u00ec\u00ee\5\24\13\2\u00ed\u00e3\3\2\2\2\u00ed\u00e9"+
		"\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f5\5\32\16\2\u00f0"+
		"\u00f1\5\30\r\2\u00f1\u00f2\5\32\16\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\5\30\r\2\u00f9\u00f8\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00fd\7\35\2\2\u00fc"+
		"\u00fe\5\34\17\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0100\7\36\2\2\u0100\37\3\2\2\2\u0101\u0103\7\25\2\2\u0102"+
		"\u0104\5\n\6\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0109\7\26\2\2\u0106\u0109\5\36\20\2\u0107\u0109\7\65\2\2\u0108"+
		"\u0101\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109!\3\2\2\2"+
		"\u010a\u0113\7\66\2\2\u010b\u010c\7\33\2\2\u010c\u010d\5\24\13\2\u010d"+
		"\u010e\7\34\2\2\u010e\u0112\3\2\2\2\u010f\u0110\7\37\2\2\u0110\u0112\7"+
		"\66\2\2\u0111\u010b\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114#\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0116\u0117\5\"\22\2\u0117\u011a\b\23\1\2\u0118\u0119\7 \2\2\u0119\u011b"+
		"\7\66\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\5 \21\2\u011d%\3\2\2\2\u011e\u0123\7\66\2\2\u011f\u0120\7"+
		"\37\2\2\u0120\u0122\7\66\2\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0127\7 \2\2\u0127\u0129\7\66\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\'\3\2\2\2\u012a\u0135\7\66\2\2\u012b\u012c\5\"\22"+
		"\2\u012c\u012d\7\33\2\2\u012d\u012e\5\24\13\2\u012e\u012f\7\34\2\2\u012f"+
		"\u0135\3\2\2\2\u0130\u0131\5\"\22\2\u0131\u0132\7\37\2\2\u0132\u0133\7"+
		"\66\2\2\u0133\u0135\3\2\2\2\u0134\u012a\3\2\2\2\u0134\u012b\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0135)\3\2\2\2\u0136\u0137\7\23\2\2\u0137\u0138\5,\27\2"+
		"\u0138+\3\2\2\2\u0139\u013b\7\25\2\2\u013a\u013c\5.\30\2\u013b\u013a\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\26\2\2\u013e"+
		"\u013f\5\6\4\2\u013f\u0140\7\t\2\2\u0140-\3\2\2\2\u0141\u0144\5\64\33"+
		"\2\u0142\u0143\7\6\2\2\u0143\u0145\7\32\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0148\7\32\2\2\u0147\u0141\3"+
		"\2\2\2\u0147\u0146\3\2\2\2\u0148/\3\2\2\2\u0149\u014a\t\4\2\2\u014a\61"+
		"\3\2\2\2\u014b\u014c\t\5\2\2\u014c\63\3\2\2\2\u014d\u014e\7\66\2\2\u014e"+
		"\u0154\b\33\1\2\u014f\u0150\7\6\2\2\u0150\u0151\7\66\2\2\u0151\u0153\b"+
		"\33\1\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\65\3\2\2\2\u0156\u0154\3\2\2\2\":>CEKNU{\u0080\u008d"+
		"\u00a8\u00aa\u00b4\u00bf\u00d1\u00df\u00ed\u00f5\u00f9\u00fd\u0103\u0108"+
		"\u0111\u0113\u011a\u0123\u0128\u0134\u013b\u0144\u0147\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}