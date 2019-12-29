package taskTwo;// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxerkennerMitANTLR/src/main/resources\TaskTwo.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskTwoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMBER=7, NEWLINE=8, OTHER=9;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_term = 3, RULE_fact = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "term", "fact"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUMBER", "NEWLINE", "OTHER"
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
	public String getGrammarFileName() { return "TaskTwo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaskTwoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskTwoVisitor ) return ((TaskTwoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << NUMBER) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TaskTwoParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskTwoVisitor ) return ((TaskTwoVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__4:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				expr();
				setState(16);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskTwoVisitor ) return ((TaskTwoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				term();
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(27);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(23);
						match(T__0);
						setState(24);
						term();
						}
						break;
					case T__1:
						{
						setState(25);
						match(T__1);
						setState(26);
						term();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 || _la==T__1 );
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

	public static class TermContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskTwoVisitor ) return ((TaskTwoVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				fact();
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(39);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(35);
						match(T__2);
						setState(36);
						fact();
						}
						break;
					case T__3:
						{
						setState(37);
						match(T__3);
						setState(38);
						fact();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 || _la==T__3 );
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TaskTwoParser.NUMBER, 0); }
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskTwoListener ) ((TaskTwoListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskTwoVisitor ) return ((TaskTwoVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fact);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__0);
				setState(47);
				fact();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__1);
				setState(49);
				fact();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(T__4);
				setState(51);
				expr();
				setState(52);
				match(T__5);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\5\3\26\n\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4\36\n\4\r\4\16\4\37\5\4\"\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\6\5*\n\5\r\5\16\5+\5\5.\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\69\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2@\2\r\3\2\2\2\4\25"+
		"\3\2\2\2\6!\3\2\2\2\b-\3\2\2\2\n8\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16"+
		"\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23"+
		"\7\n\2\2\23\26\3\2\2\2\24\26\7\n\2\2\25\21\3\2\2\2\25\24\3\2\2\2\26\5"+
		"\3\2\2\2\27\"\5\b\5\2\30\35\5\b\5\2\31\32\7\3\2\2\32\36\5\b\5\2\33\34"+
		"\7\4\2\2\34\36\5\b\5\2\35\31\3\2\2\2\35\33\3\2\2\2\36\37\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\27\3\2\2\2!\30\3\2\2\2\"\7\3\2\2\2#."+
		"\5\n\6\2$)\5\n\6\2%&\7\5\2\2&*\5\n\6\2\'(\7\6\2\2(*\5\n\6\2)%\3\2\2\2"+
		")\'\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-#\3\2\2\2-$\3\2\2"+
		"\2.\t\3\2\2\2/9\7\t\2\2\60\61\7\3\2\2\619\5\n\6\2\62\63\7\4\2\2\639\5"+
		"\n\6\2\64\65\7\7\2\2\65\66\5\6\4\2\66\67\7\b\2\2\679\3\2\2\28/\3\2\2\2"+
		"8\60\3\2\2\28\62\3\2\2\28\64\3\2\2\29\13\3\2\2\2\13\17\25\35\37!)+-8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}