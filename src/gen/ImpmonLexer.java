// Generated from E:/code/Impmon/src/impmon\Impmon.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImpmonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, IDENTIFIER=48, INTEGER=49, CHARACTER=50, STRING=51, 
		BASETYPE=52, SKIP_TOKEN=53, LINE_COMMENT=54, BLOCK_COMMENT=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "IDENTIFIER", "INTEGER", 
		"CHARACTER", "STRING", "BASETYPE", "SKIP_TOKEN", "LINE_COMMENT", "BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'.'", "';'", "'('", "')'", "'='", "'['", "']'", "'{'", 
		"'}'", "':'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", 
		"'default'", "'break'", "'continue'", "'goto'", "'return'", "'print'", 
		"'+='", "'-='", "'*='", "'/='", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'static'", 
		"'void'", "'string'", "'int'", "','", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENTIFIER", "INTEGER", "CHARACTER", "STRING", "BASETYPE", "SKIP_TOKEN", 
		"LINE_COMMENT", "BLOCK_COMMENT"
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


	public ImpmonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Impmon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0193\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\5\61\u0122\n\61\3\61\7\61\u0125\n\61\f\61\16\61\u0128"+
		"\13\61\3\62\3\62\7\62\u012c\n\62\f\62\16\62\u012f\13\62\3\62\5\62\u0132"+
		"\n\62\3\62\5\62\u0135\n\62\3\62\3\62\3\62\6\62\u013a\n\62\r\62\16\62\u013b"+
		"\3\62\5\62\u013f\n\62\3\62\5\62\u0142\n\62\3\62\3\62\7\62\u0146\n\62\f"+
		"\62\16\62\u0149\13\62\3\62\5\62\u014c\n\62\3\62\5\62\u014f\n\62\5\62\u0151"+
		"\n\62\3\63\3\63\7\63\u0155\n\63\f\63\16\63\u0158\13\63\3\63\3\63\3\64"+
		"\3\64\7\64\u015e\n\64\f\64\16\64\u0161\13\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0172\n\65\3\66"+
		"\6\66\u0175\n\66\r\66\16\66\u0176\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u017f"+
		"\n\67\f\67\16\67\u0182\13\67\3\67\3\67\38\38\38\38\78\u018a\n8\f8\168"+
		"\u018d\138\38\38\38\38\38\3\u018b\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\13\5\2C\\aac|\6\2\62;C\\aac"+
		"|\3\2\63;\3\2\62;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2\f\f\17\17\5\2\13\f\16"+
		"\17\"\"\2\u01a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5x\3\2\2\2\7z\3\2\2\2\t|\3\2\2"+
		"\2\13~\3\2\2\2\r\u0080\3\2\2\2\17\u0082\3\2\2\2\21\u0084\3\2\2\2\23\u0086"+
		"\3\2\2\2\25\u0088\3\2\2\2\27\u008a\3\2\2\2\31\u008c\3\2\2\2\33\u008f\3"+
		"\2\2\2\35\u0094\3\2\2\2\37\u009a\3\2\2\2!\u009e\3\2\2\2#\u00a5\3\2\2\2"+
		"%\u00aa\3\2\2\2\'\u00b2\3\2\2\2)\u00b8\3\2\2\2+\u00c1\3\2\2\2-\u00c6\3"+
		"\2\2\2/\u00cd\3\2\2\2\61\u00d3\3\2\2\2\63\u00d6\3\2\2\2\65\u00d9\3\2\2"+
		"\2\67\u00dc\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e5"+
		"\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2E\u00eb\3\2\2\2G\u00ee\3\2\2\2I"+
		"\u00f1\3\2\2\2K\u00f4\3\2\2\2M\u00f7\3\2\2\2O\u00fa\3\2\2\2Q\u00fd\3\2"+
		"\2\2S\u0100\3\2\2\2U\u0103\3\2\2\2W\u010a\3\2\2\2Y\u010f\3\2\2\2[\u0116"+
		"\3\2\2\2]\u011a\3\2\2\2_\u011c\3\2\2\2a\u0121\3\2\2\2c\u0150\3\2\2\2e"+
		"\u0152\3\2\2\2g\u015b\3\2\2\2i\u0171\3\2\2\2k\u0174\3\2\2\2m\u017a\3\2"+
		"\2\2o\u0185\3\2\2\2qr\7k\2\2rs\7o\2\2st\7r\2\2tu\7q\2\2uv\7t\2\2vw\7v"+
		"\2\2w\4\3\2\2\2xy\7\60\2\2y\6\3\2\2\2z{\7=\2\2{\b\3\2\2\2|}\7*\2\2}\n"+
		"\3\2\2\2~\177\7+\2\2\177\f\3\2\2\2\u0080\u0081\7?\2\2\u0081\16\3\2\2\2"+
		"\u0082\u0083\7]\2\2\u0083\20\3\2\2\2\u0084\u0085\7_\2\2\u0085\22\3\2\2"+
		"\2\u0086\u0087\7}\2\2\u0087\24\3\2\2\2\u0088\u0089\7\177\2\2\u0089\26"+
		"\3\2\2\2\u008a\u008b\7<\2\2\u008b\30\3\2\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7h\2\2\u008e\32\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\34\3\2\2\2\u0094\u0095\7y\2\2\u0095"+
		"\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097\u0098\7n\2\2\u0098\u0099\7g\2\2"+
		"\u0099\36\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c\u009d\7"+
		"t\2\2\u009d \3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\"\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7n\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7t\2"+
		"\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7m\2\2\u00b7(\3\2"+
		"\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7w\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7v\2\2\u00c4\u00c5\7q\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\u00cc\7p\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7t\2"+
		"\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\60\3"+
		"\2\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d5\7?\2\2\u00d5\62\3\2\2\2\u00d6\u00d7"+
		"\7/\2\2\u00d7\u00d8\7?\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7,\2\2\u00da\u00db"+
		"\7?\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\7?\2\2\u00de"+
		"8\3\2\2\2\u00df\u00e0\7,\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2"+
		"<\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6@"+
		"\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7>\2\2\u00eaD\3"+
		"\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed\7?\2\2\u00edF\3\2\2\2\u00ee\u00ef"+
		"\7>\2\2\u00ef\u00f0\7?\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3J\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7?\2\2\u00f6L\3"+
		"\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7(\2\2\u00f9N\3\2\2\2\u00fa\u00fb"+
		"\7~\2\2\u00fb\u00fc\7~\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\u00ff"+
		"\7-\2\2\u00ffR\3\2\2\2\u0100\u0101\7/\2\2\u0101\u0102\7/\2\2\u0102T\3"+
		"\2\2\2\u0103\u0104\7u\2\2\u0104\u0105\7v\2\2\u0105\u0106\7c\2\2\u0106"+
		"\u0107\7v\2\2\u0107\u0108\7k\2\2\u0108\u0109\7e\2\2\u0109V\3\2\2\2\u010a"+
		"\u010b\7x\2\2\u010b\u010c\7q\2\2\u010c\u010d\7k\2\2\u010d\u010e\7f\2\2"+
		"\u010eX\3\2\2\2\u010f\u0110\7u\2\2\u0110\u0111\7v\2\2\u0111\u0112\7t\2"+
		"\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\u0115\7i\2\2\u0115Z\3\2"+
		"\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118\u0119\7v\2\2\u0119\\"+
		"\3\2\2\2\u011a\u011b\7.\2\2\u011b^\3\2\2\2\u011c\u011d\7\60\2\2\u011d"+
		"\u011e\7\60\2\2\u011e\u011f\7\60\2\2\u011f`\3\2\2\2\u0120\u0122\t\2\2"+
		"\2\u0121\u0120\3\2\2\2\u0122\u0126\3\2\2\2\u0123\u0125\t\3\2\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"b\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012d\t\4\2\2\u012a\u012c\t\5\2\2"+
		"\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\7W\2\2\u0131"+
		"\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\7N"+
		"\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0151\3\2\2\2\u0136"+
		"\u0137\7\62\2\2\u0137\u0139\t\6\2\2\u0138\u013a\t\7\2\2\u0139\u0138\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013f\7W\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u0142\7N\2\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0151\3\2\2\2\u0143\u0147\7\62\2\2\u0144\u0146\t"+
		"\b\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c\7W"+
		"\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014f\7N\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u0129\3\2\2\2\u0150\u0136\3\2\2\2\u0150\u0143\3\2\2\2\u0151"+
		"d\3\2\2\2\u0152\u0156\7)\2\2\u0153\u0155\n\t\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7)\2\2\u015af\3\2\2\2\u015b\u015f"+
		"\7$\2\2\u015c\u015e\n\t\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0162\u0163\7$\2\2\u0163h\3\2\2\2\u0164\u0165\7x\2\2\u0165\u0166"+
		"\7q\2\2\u0166\u0167\7k\2\2\u0167\u0172\7f\2\2\u0168\u0169\7k\2\2\u0169"+
		"\u016a\7p\2\2\u016a\u0172\7v\2\2\u016b\u016c\7u\2\2\u016c\u016d\7v\2\2"+
		"\u016d\u016e\7t\2\2\u016e\u016f\7k\2\2\u016f\u0170\7p\2\2\u0170\u0172"+
		"\7i\2\2\u0171\u0164\3\2\2\2\u0171\u0168\3\2\2\2\u0171\u016b\3\2\2\2\u0172"+
		"j\3\2\2\2\u0173\u0175\t\n\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\b\66\2\2\u0179l\3\2\2\2\u017a\u017b\7\61\2\2\u017b\u017c\7\61\2\2\u017c"+
		"\u0180\3\2\2\2\u017d\u017f\n\t\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0184\b\67\2\2\u0184n\3\2\2\2\u0185\u0186\7\61\2"+
		"\2\u0186\u0187\7,\2\2\u0187\u018b\3\2\2\2\u0188\u018a\13\2\2\2\u0189\u0188"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7,\2\2\u018f\u0190\7\61"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b8\2\2\u0192p\3\2\2\2\27\2\u0121"+
		"\u0124\u0126\u012d\u0131\u0134\u0139\u013b\u013e\u0141\u0147\u014b\u014e"+
		"\u0150\u0156\u015f\u0171\u0176\u0180\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}