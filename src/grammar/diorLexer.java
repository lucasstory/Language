// Generated from C:/Users/Lucas/Documents/GitHub/Language/src/grammar\dior.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class diorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, INT=13, WS=14, EQUALS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ID", "INT", "WS", "EQUALS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'var'", "'loop'", "'continue'", "'end loop'", "'+'", "'<'", 
			"'>'", "'=>'", "'<='", "'print'", null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "WS", "EQUALS"
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


	public diorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dior.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rR\n\r\r\r\16\rS\3\16\6\16W\n\16"+
		"\r\16\16\16X\3\17\6\17\\\n\17\r\17\16\17]\3\17\3\17\3\20\3\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\4\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7\'\3\2\2\2\t,\3\2\2"+
		"\2\13\65\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25G\3"+
		"\2\2\2\27J\3\2\2\2\31Q\3\2\2\2\33V\3\2\2\2\35[\3\2\2\2\37a\3\2\2\2!\""+
		"\7=\2\2\"\4\3\2\2\2#$\7x\2\2$%\7c\2\2%&\7t\2\2&\6\3\2\2\2\'(\7n\2\2()"+
		"\7q\2\2)*\7q\2\2*+\7r\2\2+\b\3\2\2\2,-\7e\2\2-.\7q\2\2./\7p\2\2/\60\7"+
		"v\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7w\2\2\63\64\7g\2\2\64\n\3\2\2\2"+
		"\65\66\7g\2\2\66\67\7p\2\2\678\7f\2\289\7\"\2\29:\7n\2\2:;\7q\2\2;<\7"+
		"q\2\2<=\7r\2\2=\f\3\2\2\2>?\7-\2\2?\16\3\2\2\2@A\7>\2\2A\20\3\2\2\2BC"+
		"\7@\2\2C\22\3\2\2\2DE\7?\2\2EF\7@\2\2F\24\3\2\2\2GH\7>\2\2HI\7?\2\2I\26"+
		"\3\2\2\2JK\7r\2\2KL\7t\2\2LM\7k\2\2MN\7p\2\2NO\7v\2\2O\30\3\2\2\2PR\t"+
		"\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\32\3\2\2\2UW\4\62;\2V"+
		"U\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\34\3\2\2\2Z\\\t\3\2\2[Z\3\2\2"+
		"\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\17\2\2`\36\3\2\2\2ab\7"+
		"?\2\2b \3\2\2\2\6\2SX]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}