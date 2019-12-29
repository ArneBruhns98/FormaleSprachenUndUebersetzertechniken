// Generated from C:/Users/arne-/Documents/JetBrains/IdeaProjects/Formale Sprachen und �bersetzertechniken/Praktikum/SyntaxgesteuerterInterpreter/src/main/resources\ExprGrammarAction.g4 by ANTLR 4.7.2
 package gen.grammarGrammarAction; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprGrammarActionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, POW=11, MUL=12, DIV=13, ADD=14, SUB=15, EQUAL=16, SMALLER=17, 
		TALLER=18, ID=19, INT=20, NEWLINE=21, OTHER=22;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'='", "'clear'", "'if ('", "') '", "'else '", "'?'", "':'", 
			"'('", "')'", "'^'", "'*'", "'/'", "'+'", "'-'", "'=='", "'<'", "'>'", 
			null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "POW", 
			"MUL", "DIV", "ADD", "SUB", "EQUAL", "SMALLER", "TALLER", "ID", "INT", 
			"NEWLINE", "OTHER"
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
	public String getGrammarFileName() { return "ExprGrammarAction.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Integer> memory = new HashMap<String, Integer>();

	    int eval(int left, int op, int right) {
	        switch ( op ) {
	            case POW : return (int) Math.pow(left, right);
	            case MUL : return left * right;
	            case DIV : return left / right;
	            case ADD : return left + right;
	            case SUB : return left - right;
	            case EQUAL : return left == right ? 1 : 0;
	            case SMALLER : return left < right ? 1 : 0;
	            case TALLER : return left > right ? 1 : 0;
	        }
	        return 0;
	    }

	public ExprGrammarActionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public int value;
		public StatContext stat;
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
			if ( listener instanceof ExprGrammarActionListener ) ((ExprGrammarActionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarActionListener ) ((ExprGrammarActionListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarActionVisitor ) return ((ExprGrammarActionVisitor<? extends T>)visitor).visitProg(this);
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
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				((ProgContext)_localctx).stat = stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0) );
			((ProgContext)_localctx).value =  ((ProgContext)_localctx).stat.value;
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
		public int value;
		public ExprContext expr;
		public Token ID;
		public StatContext a;
		public StatContext b;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprGrammarActionParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(ExprGrammarActionParser.ID, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarActionListener ) ((ExprGrammarActionListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarActionListener ) ((ExprGrammarActionListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarActionVisitor ) return ((ExprGrammarActionVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				((StatContext)_localctx).expr = expr(0);
				setState(14);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((StatContext)_localctx).value =  ((StatContext)_localctx).expr.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((StatContext)_localctx).ID = match(ID);
				setState(18);
				match(T__1);
				setState(19);
				((StatContext)_localctx).expr = expr(0);
				setState(20);
				match(NEWLINE);
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).expr.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				match(T__2);
				setState(24);
				match(NEWLINE);
				memory.clear();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(T__3);
				setState(27);
				((StatContext)_localctx).expr = expr(0);
				setState(28);
				match(T__4);
				setState(29);
				((StatContext)_localctx).a = stat();
				setState(30);
				match(T__5);
				setState(31);
				((StatContext)_localctx).b = stat();
				((StatContext)_localctx).value =  ((StatContext)_localctx).expr.value == 1 ? ((StatContext)_localctx).a.value : ((StatContext)_localctx).b.value;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public ExprContext a;
		public Token INT;
		public Token ID;
		public ExprContext expr;
		public Token op;
		public ExprContext b;
		public ExprContext c;
		public TerminalNode INT() { return getToken(ExprGrammarActionParser.INT, 0); }
		public TerminalNode ID() { return getToken(ExprGrammarActionParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(ExprGrammarActionParser.POW, 0); }
		public TerminalNode MUL() { return getToken(ExprGrammarActionParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprGrammarActionParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(ExprGrammarActionParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprGrammarActionParser.SUB, 0); }
		public TerminalNode EQUAL() { return getToken(ExprGrammarActionParser.EQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(ExprGrammarActionParser.SMALLER, 0); }
		public TerminalNode TALLER() { return getToken(ExprGrammarActionParser.TALLER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarActionListener ) ((ExprGrammarActionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarActionListener ) ((ExprGrammarActionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarActionVisitor ) return ((ExprGrammarActionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(38);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).value =  (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0);
				}
				break;
			case ID:
				{
				setState(40);
				((ExprContext)_localctx).ID = match(ID);

				            String id = (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
				            ((ExprContext)_localctx).value =  memory.containsKey(id) ? memory.get(id) : 0;
				        
				}
				break;
			case T__8:
				{
				setState(42);
				match(T__8);
				setState(43);
				((ExprContext)_localctx).expr = expr(0);
				setState(44);
				match(T__9);
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).expr.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(50);
						((ExprContext)_localctx).op = match(POW);
						setState(51);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).value =  eval(((ExprContext)_localctx).a.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.value);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(55);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).value =  eval(((ExprContext)_localctx).a.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.value);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).value =  eval(((ExprContext)_localctx).a.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.value);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(65);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << SMALLER) | (1L << TALLER))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).value =  eval(((ExprContext)_localctx).a.value, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.value);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(70);
						match(T__6);
						setState(71);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(0);
						setState(72);
						match(T__7);
						setState(73);
						((ExprContext)_localctx).c = ((ExprContext)_localctx).expr = expr(3);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value == 1 ? ((ExprContext)_localctx).b.value : ((ExprContext)_localctx).c.value;
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4\3\4\2\3\6\5\2\4\6\2\6\4"+
		"\2\3\3\27\27\3\2\16\17\3\2\20\21\3\2\22\24\2\\\2\t\3\2\2\2\4%\3\2\2\2"+
		"\6\61\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3"+
		"\2\2\2\f\r\3\2\2\2\r\16\b\2\1\2\16\3\3\2\2\2\17\20\5\6\4\2\20\21\t\2\2"+
		"\2\21\22\b\3\1\2\22&\3\2\2\2\23\24\7\25\2\2\24\25\7\4\2\2\25\26\5\6\4"+
		"\2\26\27\7\27\2\2\27\30\b\3\1\2\30&\3\2\2\2\31\32\7\5\2\2\32\33\7\27\2"+
		"\2\33&\b\3\1\2\34\35\7\6\2\2\35\36\5\6\4\2\36\37\7\7\2\2\37 \5\4\3\2 "+
		"!\7\b\2\2!\"\5\4\3\2\"#\b\3\1\2#&\3\2\2\2$&\7\27\2\2%\17\3\2\2\2%\23\3"+
		"\2\2\2%\31\3\2\2\2%\34\3\2\2\2%$\3\2\2\2&\5\3\2\2\2\'(\b\4\1\2()\7\26"+
		"\2\2)\62\b\4\1\2*+\7\25\2\2+\62\b\4\1\2,-\7\13\2\2-.\5\6\4\2./\7\f\2\2"+
		"/\60\b\4\1\2\60\62\3\2\2\2\61\'\3\2\2\2\61*\3\2\2\2\61,\3\2\2\2\62P\3"+
		"\2\2\2\63\64\f\b\2\2\64\65\7\r\2\2\65\66\5\6\4\b\66\67\b\4\1\2\67O\3\2"+
		"\2\289\f\7\2\29:\t\3\2\2:;\5\6\4\b;<\b\4\1\2<O\3\2\2\2=>\f\6\2\2>?\t\4"+
		"\2\2?@\5\6\4\7@A\b\4\1\2AO\3\2\2\2BC\f\5\2\2CD\t\5\2\2DE\5\6\4\6EF\b\4"+
		"\1\2FO\3\2\2\2GH\f\4\2\2HI\7\t\2\2IJ\5\6\4\2JK\7\n\2\2KL\5\6\4\5LM\b\4"+
		"\1\2MO\3\2\2\2N\63\3\2\2\2N8\3\2\2\2N=\3\2\2\2NB\3\2\2\2NG\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2\7\13%\61NP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}