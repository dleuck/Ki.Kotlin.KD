// Generated from /Users/danielleuck/projects/Ki/JVM/Ki.KD-JVM/src/main/kotlin/io/kixi/kd/KDLexer.g4 by ANTLR 4.8
package io.kixi.kd.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL=1, TRUE=2, FALSE=3, URL=4, FloatLiteral=5, DoubleLiteral=6, DecimalLiteral=7, 
		IntegerLiteral=8, HexLiteral=9, BinLiteral=10, LongLiteral=11, Version=12, 
		SimpleString=13, RawString=14, BlockStringStart=15, BlockRawStringStart=16, 
		BlockRawAltStringStart=17, CharLiteral=18, CompoundDuration=19, DayDuration=20, 
		HourDuration=21, MinuteDuration=22, SecondDuration=23, MillisecondDuration=24, 
		NanosecondDuration=25, Date=26, Time=27, IntegerQuantityLiteral=28, DecimalQuantityLiteral=29, 
		InclusiveRangeOp=30, ExclusiveRangeOp=31, ExclusiveLeftOp=32, ExclusiveRightOp=33, 
		DOT=34, COLON=35, SEMICOLON=36, EQUALS=37, OPEN=38, CLOSE=39, LPAREN=40, 
		RPAREN=41, LSQUARE=42, RSQUARE=43, COMMA=44, SLASH=45, DASH=46, AT=47, 
		PLUS=48, UNDERSCORE=49, BLOB_START=50, ID=51, BlockComment=52, LineComment=53, 
		WS=54, NL=55, BLOB_DATA=56, BLOB_END=57, BLOB_ERROR=58, BlockStringChunk=59, 
		BlockStringEnd=60, BlockStringError=61, BlockRawStringChunk=62, BlockRawStringEnd=63, 
		BlockRawStringError=64, BlockRawAltStringChunk=65, BlockRawAltStringEnd=66;
	public static final int
		WHITESPACE=2, COMMENTS=3;
	public static final int
		blob=1, blockString=2, blockRawString=3, blockRawAltString=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "WHITESPACE", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "blob", "blockString", "blockRawString", "blockRawAltString"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NULL", "TRUE", "FALSE", "URL", "DecDigit", "DecDigitNoZero", "DecDigitOrSeparator", 
			"DecDigits", "DoubleExponent", "NonZeroNumberPart", "NumberPart", "ASCIIAlpha", 
			"FloatLiteral", "DoubleLiteral", "DecimalLiteral", "IntegerLiteral", 
			"HexDigit", "HexDigitOrSeparator", "HexLiteral", "BinDigit", "BinDigitOrSeparator", 
			"BinLiteral", "LongLiteral", "Number", "Version", "VersionQualifierAndNum", 
			"SimpleString", "RawString", "BlockStringStart", "BlockRawStringStart", 
			"BlockRawAltStringStart", "UniCharacterLiteral", "EscapedIdentifier", 
			"Esc", "Unicode", "SafeCodePoint", "CharSafeCodePoint", "CharLiteral", 
			"DAYS", "HOURS", "MINUTES", "SECONDS", "MILLIS", "NANOS", "CompoundDuration", 
			"DayDuration", "HourDuration", "MinuteDuration", "SecondDuration", "MillisecondDuration", 
			"NanosecondDuration", "Date", "Time", "TimeZone", "IntegerQuantityLiteral", 
			"DecimalQuantityLiteral", "InclusiveRangeOp", "ExclusiveRangeOp", "ExclusiveLeftOp", 
			"ExclusiveRightOp", "DOT", "COLON", "SEMICOLON", "EQUALS", "OPEN", "CLOSE", 
			"LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "COMMA", "SLASH", "DASH", "AT", 
			"PLUS", "UNDERSCORE", "BLOB_START", "IDStart", "IDChar", "ID", "VersionQualifier", 
			"UnitID", "BlockComment", "LineComment", "WS", "NL", "BLOB_DATA", "BLOB_END", 
			"BLOB_ERROR", "BlockStringChunk", "BlockStringEnd", "BlockStringError", 
			"BlockStringChar", "BlockRawStringChunk", "BlockRawStringEnd", "BlockRawStringError", 
			"BlockRawStringChar", "BlockRawAltStringChunk", "BlockRawAltStringEnd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'@\"\"\"'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'..'", "'<..<'", "'<..'", 
			"'..<'", "'.'", "':'", "';'", "'='", "'{'", "'}'", "'('", null, "'['", 
			"']'", "','", "'/'", "'-'", "'@'", "'+'", "'_'", "'.blob('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULL", "TRUE", "FALSE", "URL", "FloatLiteral", "DoubleLiteral", 
			"DecimalLiteral", "IntegerLiteral", "HexLiteral", "BinLiteral", "LongLiteral", 
			"Version", "SimpleString", "RawString", "BlockStringStart", "BlockRawStringStart", 
			"BlockRawAltStringStart", "CharLiteral", "CompoundDuration", "DayDuration", 
			"HourDuration", "MinuteDuration", "SecondDuration", "MillisecondDuration", 
			"NanosecondDuration", "Date", "Time", "IntegerQuantityLiteral", "DecimalQuantityLiteral", 
			"InclusiveRangeOp", "ExclusiveRangeOp", "ExclusiveLeftOp", "ExclusiveRightOp", 
			"DOT", "COLON", "SEMICOLON", "EQUALS", "OPEN", "CLOSE", "LPAREN", "RPAREN", 
			"LSQUARE", "RSQUARE", "COMMA", "SLASH", "DASH", "AT", "PLUS", "UNDERSCORE", 
			"BLOB_START", "ID", "BlockComment", "LineComment", "WS", "NL", "BLOB_DATA", 
			"BLOB_END", "BLOB_ERROR", "BlockStringChunk", "BlockStringEnd", "BlockStringError", 
			"BlockRawStringChunk", "BlockRawStringEnd", "BlockRawStringError", "BlockRawAltStringChunk", 
			"BlockRawAltStringEnd"
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


	public KDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KDLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u03f8\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]"+
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u00d5\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00dd\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u00e7\n\4\3\5\3\5\7\5\u00eb\n\5\f\5\16\5\u00ee"+
		"\13\5\3\5\3\5\3\5\6\5\u00f3\n\5\r\5\16\5\u00f4\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\5\b\u00fd\n\b\3\t\3\t\7\t\u0101\n\t\f\t\16\t\u0104\13\t\3\t\3\t\3\t\5"+
		"\t\u0109\n\t\3\n\3\n\5\n\u010d\n\n\3\n\3\n\3\13\3\13\7\13\u0113\n\13\f"+
		"\13\16\13\u0116\13\13\3\13\3\13\3\13\5\13\u011b\n\13\3\f\3\f\7\f\u011f"+
		"\n\f\f\f\16\f\u0122\13\f\3\f\3\f\3\f\5\f\u0127\n\f\3\r\3\r\3\16\5\16\u012c"+
		"\n\16\3\16\5\16\u012f\n\16\3\16\3\16\3\16\5\16\u0134\n\16\3\16\3\16\3"+
		"\16\5\16\u0139\n\16\3\16\3\16\5\16\u013d\n\16\3\16\3\16\5\16\u0141\n\16"+
		"\3\17\5\17\u0144\n\17\3\17\5\17\u0147\n\17\3\17\3\17\3\17\5\17\u014c\n"+
		"\17\3\17\5\17\u014f\n\17\3\17\5\17\u0152\n\17\3\17\3\17\3\17\5\17\u0157"+
		"\n\17\3\17\5\17\u015a\n\17\3\17\3\17\3\17\5\17\u015f\n\17\3\20\5\20\u0162"+
		"\n\20\3\20\5\20\u0165\n\20\3\20\3\20\3\20\5\20\u016a\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0170\n\20\3\20\5\20\u0173\n\20\3\20\3\20\5\20\u0177\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u017d\n\20\5\20\u017f\n\20\3\21\5\21\u0182\n"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u018a\n\23\3\24\5\24\u018d\n\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0193\n\24\f\24\16\24\u0196\13\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u019d\n\24\3\25\3\25\3\26\3\26\5\26\u01a3\n\26\3"+
		"\27\5\27\u01a6\n\27\3\27\3\27\3\27\3\27\7\27\u01ac\n\27\f\27\16\27\u01af"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\5\27\u01b6\n\27\3\30\3\30\3\30\5\30\u01bb"+
		"\n\30\3\30\3\30\3\31\3\31\5\31\u01c1\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01d4\n\32"+
		"\5\32\u01d6\n\32\3\33\3\33\5\33\u01da\n\33\3\33\5\33\u01dd\n\33\3\34\3"+
		"\34\3\34\7\34\u01e2\n\34\f\34\16\34\u01e5\13\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\7\35\u01ed\n\35\f\35\16\35\u01f0\13\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\5#\u0211\n#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3\'\5\'\u0220\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u022b"+
		"\n(\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\5.\u023c\n.\3.\3.\3."+
		"\5.\u0241\n.\3.\3.\5.\u0245\n.\3.\3.\3.\5.\u024a\n.\3.\3.\3.\3.\3.\5."+
		"\u0251\n.\5.\u0253\n.\3.\5.\u0256\n.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\5\65\u026b\n\65"+
		"\3\65\3\65\3\65\3\65\5\65\u0271\n\65\3\65\3\65\3\65\5\65\u0276\n\65\3"+
		"\65\3\65\3\65\3\65\5\65\u027c\n\65\3\65\3\65\3\65\5\65\u0281\n\65\5\65"+
		"\u0283\n\65\3\66\3\66\5\66\u0287\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u0291\n\66\5\66\u0293\n\66\5\66\u0295\n\66\3\66\5\66\u0298"+
		"\n\66\3\67\3\67\3\67\5\67\u029d\n\67\3\67\3\67\3\67\3\67\5\67\u02a3\n"+
		"\67\3\67\3\67\3\67\5\67\u02a8\n\67\3\67\3\67\3\67\3\67\5\67\u02ae\n\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02b7\n\67\3\67\3\67\3\67\3\67"+
		"\6\67\u02bd\n\67\r\67\16\67\u02be\5\67\u02c1\n\67\3\67\5\67\u02c4\n\67"+
		"\38\58\u02c7\n8\38\38\38\38\58\u02cd\n8\39\59\u02d0\n9\39\39\39\39\39"+
		"\39\59\u02d8\n9\39\59\u02db\n9\39\39\39\59\u02e0\n9\39\39\39\59\u02e5"+
		"\n9\39\59\u02e8\n9\39\39\39\39\39\59\u02ef\n9\59\u02f1\n9\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\7Q\u0332\nQ\fQ\16Q\u0335\13Q\3"+
		"Q\3Q\5Q\u0339\nQ\3R\6R\u033c\nR\rR\16R\u033d\3S\3S\3S\3S\3S\5S\u0345\n"+
		"S\3S\5S\u0348\nS\3T\3T\3T\3T\3T\7T\u034f\nT\fT\16T\u0352\13T\3T\3T\3T"+
		"\3T\3T\3U\3U\3U\5U\u035c\nU\3U\7U\u035f\nU\fU\16U\u0362\13U\3U\3U\3V\3"+
		"V\3V\6V\u0369\nV\rV\16V\u036a\3V\3V\3W\6W\u0370\nW\rW\16W\u0371\3X\7X"+
		"\u0375\nX\fX\16X\u0378\13X\3X\7X\u037b\nX\fX\16X\u037e\13X\3X\7X\u0381"+
		"\nX\fX\16X\u0384\13X\3Y\3Y\3Y\3Y\3Z\3Z\3[\6[\u038d\n[\r[\16[\u038e\3["+
		"\7[\u0392\n[\f[\16[\u0395\13[\3[\7[\u0398\n[\f[\16[\u039b\13[\3[\6[\u039e"+
		"\n[\r[\16[\u039f\5[\u03a2\n[\3\\\3\\\3\\\3\\\3\\\3\\\3]\5]\u03ab\n]\3"+
		"]\3]\3^\3^\3^\3^\3^\3^\3^\3^\5^\u03b7\n^\3_\6_\u03ba\n_\r_\16_\u03bb\3"+
		"_\7_\u03bf\n_\f_\16_\u03c2\13_\3_\7_\u03c5\n_\f_\16_\u03c8\13_\3_\6_\u03cb"+
		"\n_\r_\16_\u03cc\5_\u03cf\n_\3`\3`\3`\3`\3`\3`\3a\3a\3b\3b\5b\u03db\n"+
		"b\3c\6c\u03de\nc\rc\16c\u03df\3c\7c\u03e3\nc\fc\16c\u03e6\13c\3c\7c\u03e9"+
		"\nc\fc\16c\u03ec\13c\3c\6c\u03ef\nc\rc\16c\u03f0\5c\u03f3\nc\3d\3d\3d"+
		"\3d\3\u0350\2e\7\3\t\4\13\5\r\6\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35"+
		"\2\37\7!\b#\t%\n\'\2)\2+\13-\2/\2\61\f\63\r\65\2\67\169\2;\17=\20?\21"+
		"A\22C\23E\2G\2I\2K\2M\2O\2Q\24S\2U\2W\2Y\2[\2]\2_\25a\26c\27e\30g\31i"+
		"\32k\33m\34o\35q\2s\36u\37w y!{\"}#\177$\u0081%\u0083&\u0085\'\u0087("+
		"\u0089)\u008b*\u008d+\u008f,\u0091-\u0093.\u0095/\u0097\60\u0099\61\u009b"+
		"\62\u009d\63\u009f\64\u00a1\2\u00a3\2\u00a5\65\u00a7\2\u00a9\2\u00ab\66"+
		"\u00ad\67\u00af8\u00b19\u00b3:\u00b5;\u00b7<\u00b9=\u00bb>\u00bd?\u00bf"+
		"\2\u00c1@\u00c3A\u00c5B\u00c7\2\u00c9C\u00cbD\7\2\3\4\5\6\36\4\2C\\c|"+
		"\7\2--/\60\62;C\\c|\n\2##%=??A]__aac|\u0080\u0080\4\2GGgg\4\2--//\4\2"+
		"HHhh\4\2FFff\5\2\62;CHch\4\2ZZzz\3\2\62\63\4\2DDdd\6\2\f\f\17\17$$^^\5"+
		"\2\f\f\17\17$$\t\2$$))^^ddppttvv\5\2\2!$$^^\5\2\2!))^^\4\2NNkk\6\2FFH"+
		"Hffhh\7\2FFHHNNffhh\4\2\f\f\17\17\5\2\13\13\17\17\"\"\4\2\f\f==\5\2\13"+
		"\f\17\17\"\"\7\2--\61;??C\\c|\4\2\13\f\17\17\3\2^^\3\2$$\3\2bb\5\u02e3"+
		"\2&\2&\2C\2\\\2a\2a\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00bc\2\u00bc"+
		"\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3\2\u02e2"+
		"\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0347\2\u0347\2\u0372\2\u0376"+
		"\2\u0378\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388\2\u038a"+
		"\2\u038c\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9\2\u0483"+
		"\2\u048c\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589\2\u05b2"+
		"\2\u05bf\2\u05c1\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9\2\u05c9"+
		"\2\u05d2\2\u05ec\2\u05f2\2\u05f4\2\u0612\2\u061c\2\u0622\2\u0659\2\u065b"+
		"\2\u0661\2\u0670\2\u06d5\2\u06d7\2\u06de\2\u06e3\2\u06ea\2\u06ef\2\u06f1"+
		"\2\u06fc\2\u06fe\2\u0701\2\u0701\2\u0712\2\u0741\2\u074f\2\u07b3\2\u07cc"+
		"\2\u07ec\2\u07f6\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0819\2\u081c\2\u082e"+
		"\2\u0842\2\u085a\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u08d6"+
		"\2\u08e1\2\u08e5\2\u08eb\2\u08f2\2\u093d\2\u093f\2\u094e\2\u0950\2\u0952"+
		"\2\u0957\2\u0965\2\u0973\2\u0985\2\u0987\2\u098e\2\u0991\2\u0992\2\u0995"+
		"\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf\2\u09c6"+
		"\2\u09c9\2\u09ca\2\u09cd\2\u09ce\2\u09d0\2\u09d0\2\u09d9\2\u09d9\2\u09de"+
		"\2\u09df\2\u09e1\2\u09e5\2\u09f2\2\u09f3\2\u09fe\2\u09fe\2\u0a03\2\u0a05"+
		"\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32\2\u0a34"+
		"\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a40\2\u0a44\2\u0a49\2\u0a4a"+
		"\2\u0a4d\2\u0a4e\2\u0a53\2\u0a53\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a72"+
		"\2\u0a77\2\u0a83\2\u0a85\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95\2\u0aaa"+
		"\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0ac7\2\u0ac9"+
		"\2\u0acb\2\u0acd\2\u0ace\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae5\2\u0afb\2\u0afe"+
		"\2\u0b03\2\u0b05\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c"+
		"\2\u0b32\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b46\2\u0b49\2\u0b4a"+
		"\2\u0b4d\2\u0b4e\2\u0b58\2\u0b59\2\u0b5e\2\u0b5f\2\u0b61\2\u0b65\2\u0b73"+
		"\2\u0b73\2\u0b84\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97"+
		"\2\u0b9b\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa"+
		"\2\u0bac\2\u0bb0\2\u0bbb\2\u0bc0\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bce"+
		"\2\u0bd2\2\u0bd2\2\u0bd9\2\u0bd9\2\u0c02\2\u0c05\2\u0c07\2\u0c0e\2\u0c10"+
		"\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c46\2\u0c48\2\u0c4a"+
		"\2\u0c4c\2\u0c4e\2\u0c57\2\u0c58\2\u0c5a\2\u0c5c\2\u0c62\2\u0c65\2\u0c82"+
		"\2\u0c85\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5"+
		"\2\u0cb7\2\u0cbb\2\u0cbf\2\u0cc6\2\u0cc8\2\u0cca\2\u0ccc\2\u0cce\2\u0cd7"+
		"\2\u0cd8\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce5\2\u0cf3\2\u0cf4\2\u0d02\2\u0d05"+
		"\2\u0d07\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d46\2\u0d48"+
		"\2\u0d4a\2\u0d4c\2\u0d4e\2\u0d50\2\u0d50\2\u0d56\2\u0d59\2\u0d61\2\u0d65"+
		"\2\u0d7c\2\u0d81\2\u0d84\2\u0d85\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5"+
		"\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0dd1\2\u0dd6\2\u0dd8\2\u0dd8"+
		"\2\u0dda\2\u0de1\2\u0df4\2\u0df5\2\u0e03\2\u0e3c\2\u0e42\2\u0e48\2\u0e4f"+
		"\2\u0e4f\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c"+
		"\2\u0e8f\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7"+
		"\2\u0ea7\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd\2\u0ebf"+
		"\2\u0ec2\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ecf\2\u0ecf\2\u0ede\2\u0ee1\2\u0f02"+
		"\2\u0f02\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73\2\u0f83\2\u0f8a\2\u0f99"+
		"\2\u0f9b\2\u0fbe\2\u1002\2\u1038\2\u103a\2\u103a\2\u103d\2\u1041\2\u1052"+
		"\2\u1064\2\u1067\2\u106a\2\u1070\2\u1088\2\u1090\2\u1090\2\u109e\2\u109f"+
		"\2\u10a2\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe"+
		"\2\u124a\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f"+
		"\2\u1262\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba"+
		"\2\u12c0\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312"+
		"\2\u1314\2\u1317\2\u131a\2\u135c\2\u1361\2\u1361\2\u1382\2\u1391\2\u13a2"+
		"\2\u13f7\2\u13fa\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681\2\u1683\2\u169c"+
		"\2\u16a2\2\u16ec\2\u16f0\2\u16fa\2\u1702\2\u170e\2\u1710\2\u1715\2\u1722"+
		"\2\u1735\2\u1742\2\u1755\2\u1762\2\u176e\2\u1770\2\u1772\2\u1774\2\u1775"+
		"\2\u1782\2\u17b5\2\u17b8\2\u17ca\2\u17d9\2\u17d9\2\u17de\2\u17de\2\u1822"+
		"\2\u1879\2\u1882\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1922\2\u192d"+
		"\2\u1932\2\u193a\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2"+
		"\2\u19cb\2\u1a02\2\u1a1d\2\u1a22\2\u1a60\2\u1a63\2\u1a76\2\u1aa9\2\u1aa9"+
		"\2\u1b02\2\u1b35\2\u1b37\2\u1b45\2\u1b47\2\u1b4d\2\u1b82\2\u1bab\2\u1bae"+
		"\2\u1bb1\2\u1bbc\2\u1be7\2\u1be9\2\u1bf3\2\u1c02\2\u1c37\2\u1c4f\2\u1c51"+
		"\2\u1c5c\2\u1c7f\2\u1c82\2\u1c8a\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf5\2\u1cf7"+
		"\2\u1cf8\2\u1d02\2\u1dc1\2\u1de9\2\u1df6\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f"+
		"\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d"+
		"\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe"+
		"\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8"+
		"\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u2073\2\u2073"+
		"\2\u2081\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109\2\u2109\2\u210c"+
		"\2\u2115\2\u2117\2\u2117\2\u211b\2\u211f\2\u2126\2\u2126\2\u2128\2\u2128"+
		"\2\u212a\2\u212a\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141\2\u2147"+
		"\2\u214b\2\u2150\2\u2150\2\u2162\2\u218a\2\u231c\2\u231d\2\u23eb\2\u23ee"+
		"\2\u23f2\2\u23f2\2\u23f5\2\u23f5\2\u24b8\2\u24eb\2\u25ff\2\u2600\2\u2616"+
		"\2\u2617\2\u264a\2\u2655\2\u2681\2\u2681\2\u2695\2\u2695\2\u26a3\2\u26a3"+
		"\2\u26ac\2\u26ad\2\u26bf\2\u26c0\2\u26c6\2\u26c7\2\u26d0\2\u26d0\2\u26d6"+
		"\2\u26d6\2\u26ec\2\u26ec\2\u26f4\2\u26f5\2\u26f7\2\u26f7\2\u26fc\2\u26fc"+
		"\2\u26ff\2\u26ff\2\u2707\2\u2707\2\u270c\2\u270d\2\u272a\2\u272a\2\u274e"+
		"\2\u274e\2\u2750\2\u2750\2\u2755\2\u2757\2\u2759\2\u2759\2\u2797\2\u2799"+
		"\2\u27b2\2\u27b2\2\u27c1\2\u27c1\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52\2\u2b57"+
		"\2\u2b57\2\u2c02\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0"+
		"\2\u2cf4\2\u2cf5\2\u2d02\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32"+
		"\2\u2d69\2\u2d71\2\u2d71\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0"+
		"\2\u2db2\2\u2db8\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2"+
		"\2\u2dd8\2\u2dda\2\u2de0\2\u2de2\2\u2e01\2\u2e31\2\u2e31\2\u3007\2\u3009"+
		"\2\u3023\2\u302b\2\u3033\2\u3037\2\u303a\2\u303e\2\u3043\2\u3098\2\u309f"+
		"\2\u30a1\2\u30a3\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3130\2\u3133\2\u3190"+
		"\2\u31a2\2\u31bc\2\u31f2\2\u3201\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\ua002"+
		"\2\ua48e\2\ua4d2\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua621\2\ua62c\2\ua62d"+
		"\2\ua642\2\ua670\2\ua676\2\ua67d\2\ua681\2\ua6f1\2\ua719\2\ua721\2\ua724"+
		"\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua803\2\ua805\2\ua807"+
		"\2\ua809\2\ua80c\2\ua80e\2\ua829\2\ua842\2\ua875\2\ua882\2\ua8c5\2\ua8c7"+
		"\2\ua8c7\2\ua8f4\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c\2\ua92c"+
		"\2\ua932\2\ua954\2\ua962\2\ua97e\2\ua982\2\ua9b4\2\ua9b6\2\ua9c1\2\ua9d1"+
		"\2\ua9d1\2\ua9e2\2\ua9e6\2\ua9e8\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa38"+
		"\2\uaa42\2\uaa4f\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaac0\2\uaac2"+
		"\2\uaac2\2\uaac4\2\uaac4\2\uaadd\2\uaadf\2\uaae2\2\uaaf1\2\uaaf4\2\uaaf7"+
		"\2\uab03\2\uab08\2\uab0b\2\uab10\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a"+
		"\2\uab30\2\uab32\2\uab5c\2\uab5e\2\uab67\2\uab72\2\uabec\2\uac02\2\ud7a5"+
		"\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02"+
		"\2\ufb08\2\ufb15\2\ufb19\2\ufb1f\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e"+
		"\2\ufb40\2\ufb40\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5"+
		"\2\ufd3f\2\ufd52\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76"+
		"\2\ufe78\2\ufefe\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4"+
		"\2\uffc9\2\uffcc\2\uffd1\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17"+
		"\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082\3\u00fc\3\u0142\3\u0176\3\u0282\3"+
		"\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321\3\u032f\3\u034c\3\u0352\3\u037c"+
		"\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca\3\u03d1\3\u03d3\3\u03d7\3\u0402"+
		"\3\u049f\3\u04b2\3\u04d5\3\u04da\3\u04fd\3\u0502\3\u0529\3\u0532\3\u0565"+
		"\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762\3\u0769\3\u0802\3\u0807\3\u080a"+
		"\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a\3\u083e\3\u083e\3\u0841\3\u0857"+
		"\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2\3\u08f4\3\u08f6\3\u08f7\3\u0902"+
		"\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9\3\u09c0\3\u09c1\3\u0a02\3\u0a05"+
		"\3\u0a07\3\u0a08\3\u0a0e\3\u0a15\3\u0a17\3\u0a19\3\u0a1b\3\u0a35\3\u0a62"+
		"\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6\3\u0b02\3\u0b37"+
		"\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93\3\u0c02\3\u0c4a\3\u0c82"+
		"\3\u0cb4\3\u0cc2\3\u0cf4\3\u1002\3\u1047\3\u1084\3\u10ba\3\u10d2\3\u10ea"+
		"\3\u1102\3\u1134\3\u1152\3\u1174\3\u1178\3\u1178\3\u1182\3\u11c1\3\u11c3"+
		"\3\u11c6\3\u11dc\3\u11dc\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215\3\u1236"+
		"\3\u1239\3\u1239\3\u1240\3\u1240\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c"+
		"\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12aa\3\u12b2\3\u12ea\3\u1302\3\u1305"+
		"\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334"+
		"\3\u1335\3\u1337\3\u133b\3\u133f\3\u1346\3\u1349\3\u134a\3\u134d\3\u134e"+
		"\3\u1352\3\u1352\3\u1359\3\u1359\3\u135f\3\u1365\3\u1402\3\u1443\3\u1445"+
		"\3\u1447\3\u1449\3\u144c\3\u1482\3\u14c3\3\u14c6\3\u14c7\3\u14c9\3\u14c9"+
		"\3\u1582\3\u15b7\3\u15ba\3\u15c0\3\u15da\3\u15df\3\u1602\3\u1640\3\u1642"+
		"\3\u1642\3\u1646\3\u1646\3\u1682\3\u16b7\3\u1702\3\u171b\3\u171f\3\u172c"+
		"\3\u18a2\3\u18e1\3\u1901\3\u1901\3\u1a02\3\u1a34\3\u1a37\3\u1a40\3\u1a52"+
		"\3\u1a85\3\u1a88\3\u1a99\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c\3\u1c38"+
		"\3\u1c3a\3\u1c40\3\u1c42\3\u1c42\3\u1c74\3\u1c91\3\u1c94\3\u1ca9\3\u1cab"+
		"\3\u1cb8\3\u1d02\3\u1d08\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d38\3\u1d3c\3\u1d3c"+
		"\3\u1d3e\3\u1d3f\3\u1d41\3\u1d43\3\u1d45\3\u1d45\3\u1d48\3\u1d49\3\u2002"+
		"\3\u239b\3\u2402\3\u2470\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648"+
		"\3\u6802\3\u6a3a\3\u6a42\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b38\3\u6b42"+
		"\3\u6b45\3\u6b65\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f80"+
		"\3\u6f95\3\u6fa1\3\u6fe2\3\u6fe3\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002"+
		"\3\ub120\3\ub172\3\ub2fd\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a"+
		"\3\ubc92\3\ubc9b\3\ubca0\3\ubca0\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0"+
		"\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb"+
		"\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f"+
		"\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546"+
		"\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4"+
		"\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750"+
		"\3\ud752\3\ud770\3\ud772\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6"+
		"\3\ud7cd\3\ue002\3\ue008\3\ue00a\3\ue01a\3\ue01d\3\ue023\3\ue025\3\ue026"+
		"\3\ue028\3\ue02c\3\ue802\3\ue8c6\3\ue902\3\ue945\3\ue949\3\ue949\3\uee02"+
		"\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29"+
		"\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44"+
		"\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51"+
		"\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d"+
		"\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66"+
		"\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80"+
		"\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab"+
		"\3\ueead\3\ueebd\3\uf006\3\uf006\3\uf0d1\3\uf0d1\3\uf132\3\uf14b\3\uf152"+
		"\3\uf16b\3\uf172\3\uf18b\3\uf190\3\uf190\3\uf193\3\uf19c\3\uf1e8\3\uf201"+
		"\3\uf203\3\uf203\3\uf21c\3\uf21c\3\uf231\3\uf231\3\uf234\3\uf238\3\uf23a"+
		"\3\uf23c\3\uf252\3\uf253\3\uf302\3\uf322\3\uf32f\3\uf337\3\uf339\3\uf37e"+
		"\3\uf380\3\uf395\3\uf3a2\3\uf3cc\3\uf3d1\3\uf3d5\3\uf3e2\3\uf3f2\3\uf3f6"+
		"\3\uf3f6\3\uf3fa\3\uf440\3\uf442\3\uf442\3\uf444\3\uf4fe\3\uf501\3\uf53f"+
		"\3\uf54d\3\uf550\3\uf552\3\uf569\3\uf57c\3\uf57c\3\uf597\3\uf598\3\uf5a6"+
		"\3\uf5a6\3\uf5fd\3\uf651\3\uf682\3\uf6c7\3\uf6ce\3\uf6ce\3\uf6d2\3\uf6d4"+
		"\3\uf6ed\3\uf6ee\3\uf6f6\3\uf6fa\3\uf912\3\uf93c\3\uf93e\3\uf940\3\uf942"+
		"\3\uf947\3\uf949\3\uf94e\3\uf952\3\uf96d\3\uf982\3\uf999\3\uf9c2\3\uf9c2"+
		"\3\uf9d2\3\uf9e8\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4"+
		"\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u0347\2%\2&\2,\2,\2\62\2;\2C"+
		"\2\\\2a\2a\2c\2|\2\u00ab\2\u00ac\2\u00b0\2\u00b0\2\u00b7\2\u00b7\2\u00bc"+
		"\2\u00bc\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3"+
		"\2\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0347\2\u0347\2\u0372"+
		"\2\u0376\2\u0378\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388"+
		"\2\u038a\2\u038c\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9"+
		"\2\u0483\2\u048c\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589"+
		"\2\u05b2\2\u05bf\2\u05c1\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9"+
		"\2\u05c9\2\u05d2\2\u05ec\2\u05f2\2\u05f4\2\u0612\2\u061c\2\u0622\2\u0659"+
		"\2\u065b\2\u066b\2\u0670\2\u06d5\2\u06d7\2\u06de\2\u06e3\2\u06ea\2\u06ef"+
		"\2\u06fe\2\u0701\2\u0701\2\u0712\2\u0741\2\u074f\2\u07b3\2\u07c2\2\u07ec"+
		"\2\u07f6\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0819\2\u081c\2\u082e\2\u0842"+
		"\2\u085a\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u08d6\2\u08e1"+
		"\2\u08e5\2\u08eb\2\u08f2\2\u093d\2\u093f\2\u094e\2\u0950\2\u0952\2\u0957"+
		"\2\u0965\2\u0968\2\u0971\2\u0973\2\u0985\2\u0987\2\u098e\2\u0991\2\u0992"+
		"\2\u0995\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf"+
		"\2\u09c6\2\u09c9\2\u09ca\2\u09cd\2\u09ce\2\u09d0\2\u09d0\2\u09d9\2\u09d9"+
		"\2\u09de\2\u09df\2\u09e1\2\u09e5\2\u09e8\2\u09f3\2\u09fe\2\u09fe\2\u0a03"+
		"\2\u0a05\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32"+
		"\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a40\2\u0a44\2\u0a49"+
		"\2\u0a4a\2\u0a4d\2\u0a4e\2\u0a53\2\u0a53\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60"+
		"\2\u0a68\2\u0a77\2\u0a83\2\u0a85\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95"+
		"\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0ac7"+
		"\2\u0ac9\2\u0acb\2\u0acd\2\u0ace\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae5\2\u0ae8"+
		"\2\u0af1\2\u0afb\2\u0afe\2\u0b03\2\u0b05\2\u0b07\2\u0b0e\2\u0b11\2\u0b12"+
		"\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f"+
		"\2\u0b46\2\u0b49\2\u0b4a\2\u0b4d\2\u0b4e\2\u0b58\2\u0b59\2\u0b5e\2\u0b5f"+
		"\2\u0b61\2\u0b65\2\u0b68\2\u0b71\2\u0b73\2\u0b73\2\u0b84\2\u0b85\2\u0b87"+
		"\2\u0b8c\2\u0b90\2\u0b92\2\u0b94\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e\2\u0b9e"+
		"\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb\2\u0bc0"+
		"\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc\2\u0bce\2\u0bd2\2\u0bd2\2\u0bd9\2\u0bd9"+
		"\2\u0be8\2\u0bf1\2\u0c02\2\u0c05\2\u0c07\2\u0c0e\2\u0c10\2\u0c12\2\u0c14"+
		"\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c46\2\u0c48\2\u0c4a\2\u0c4c\2\u0c4e"+
		"\2\u0c57\2\u0c58\2\u0c5a\2\u0c5c\2\u0c62\2\u0c65\2\u0c68\2\u0c71\2\u0c82"+
		"\2\u0c85\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac\2\u0cb5"+
		"\2\u0cb7\2\u0cbb\2\u0cbf\2\u0cc6\2\u0cc8\2\u0cca\2\u0ccc\2\u0cce\2\u0cd7"+
		"\2\u0cd8\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce5\2\u0ce8\2\u0cf1\2\u0cf3\2\u0cf4"+
		"\2\u0d02\2\u0d05\2\u0d07\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f"+
		"\2\u0d46\2\u0d48\2\u0d4a\2\u0d4c\2\u0d4e\2\u0d50\2\u0d50\2\u0d56\2\u0d59"+
		"\2\u0d61\2\u0d65\2\u0d68\2\u0d71\2\u0d7c\2\u0d81\2\u0d84\2\u0d85\2\u0d87"+
		"\2\u0d98\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8"+
		"\2\u0dd1\2\u0dd6\2\u0dd8\2\u0dd8\2\u0dda\2\u0de1\2\u0de8\2\u0df1\2\u0df4"+
		"\2\u0df5\2\u0e03\2\u0e3c\2\u0e42\2\u0e48\2\u0e4f\2\u0e4f\2\u0e52\2\u0e5b"+
		"\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f"+
		"\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7"+
		"\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd\2\u0ebf\2\u0ec2"+
		"\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ecf\2\u0ecf\2\u0ed2\2\u0edb\2\u0ede\2\u0ee1"+
		"\2\u0f02\2\u0f02\2\u0f22\2\u0f2b\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73"+
		"\2\u0f83\2\u0f8a\2\u0f99\2\u0f9b\2\u0fbe\2\u1002\2\u1038\2\u103a\2\u103a"+
		"\2\u103d\2\u104b\2\u1052\2\u1064\2\u1067\2\u106a\2\u1070\2\u1088\2\u1090"+
		"\2\u1090\2\u1092\2\u109b\2\u109e\2\u109f\2\u10a2\2\u10c7\2\u10c9\2\u10c9"+
		"\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe\2\u124a\2\u124c\2\u124f\2\u1252"+
		"\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262\2\u128a\2\u128c\2\u128f"+
		"\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0\2\u12c2\2\u12c2\2\u12c4"+
		"\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314\2\u1317\2\u131a\2\u135c"+
		"\2\u1361\2\u1361\2\u1382\2\u1391\2\u13a2\2\u13f7\2\u13fa\2\u13ff\2\u1403"+
		"\2\u166e\2\u1671\2\u1681\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f0\2\u16fa"+
		"\2\u1702\2\u170e\2\u1710\2\u1715\2\u1722\2\u1735\2\u1742\2\u1755\2\u1762"+
		"\2\u176e\2\u1770\2\u1772\2\u1774\2\u1775\2\u1782\2\u17b5\2\u17b8\2\u17ca"+
		"\2\u17d9\2\u17d9\2\u17de\2\u17de\2\u17e2\2\u17eb\2\u180d\2\u180f\2\u1812"+
		"\2\u181b\2\u1822\2\u1879\2\u1882\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920"+
		"\2\u1922\2\u192d\2\u1932\2\u193a\2\u1948\2\u196f\2\u1972\2\u1976\2\u1982"+
		"\2\u19ad\2\u19b2\2\u19cb\2\u19d2\2\u19db\2\u1a02\2\u1a1d\2\u1a22\2\u1a60"+
		"\2\u1a63\2\u1a76\2\u1a82\2\u1a8b\2\u1a92\2\u1a9b\2\u1aa9\2\u1aa9\2\u1b02"+
		"\2\u1b35\2\u1b37\2\u1b45\2\u1b47\2\u1b4d\2\u1b52\2\u1b5b\2\u1b82\2\u1bab"+
		"\2\u1bae\2\u1be7\2\u1be9\2\u1bf3\2\u1c02\2\u1c37\2\u1c42\2\u1c4b\2\u1c4f"+
		"\2\u1c7f\2\u1c82\2\u1c8a\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf5\2\u1cf7\2\u1cf8"+
		"\2\u1d02\2\u1dc1\2\u1de9\2\u1df6\2\u1e02\2\u1f17\2\u1f1a\2\u1f1f\2\u1f22"+
		"\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b\2\u1f5d\2\u1f5d"+
		"\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8\2\u1fbe\2\u1fc0"+
		"\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5\2\u1fd8\2\u1fdd"+
		"\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u200e\2\u200f\2\u203e"+
		"\2\u203e\2\u204b\2\u204b\2\u2073\2\u2073\2\u2081\2\u2081\2\u2092\2\u209e"+
		"\2\u2104\2\u2104\2\u2109\2\u2109\2\u210c\2\u2115\2\u2117\2\u2117\2\u211b"+
		"\2\u211f\2\u2124\2\u2124\2\u2126\2\u2126\2\u2128\2\u2128\2\u212a\2\u212a"+
		"\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141\2\u2147\2\u214b\2\u2150"+
		"\2\u2150\2\u2162\2\u218a\2\u2196\2\u219b\2\u21ab\2\u21ac\2\u231c\2\u231d"+
		"\2\u232a\2\u232a\2\u23d1\2\u23d1\2\u23eb\2\u23f5\2\u23fa\2\u23fc\2\u24b8"+
		"\2\u24eb\2\u25ac\2\u25ad\2\u25b8\2\u25b8\2\u25c2\2\u25c2\2\u25fd\2\u2600"+
		"\2\u2602\2\u2606\2\u2610\2\u2610\2\u2613\2\u2613\2\u2616\2\u2617\2\u261a"+
		"\2\u261a\2\u261f\2\u261f\2\u2622\2\u2622\2\u2624\2\u2625\2\u2628\2\u2628"+
		"\2\u262c\2\u262c\2\u2630\2\u2631\2\u263a\2\u263c\2\u2642\2\u2642\2\u2644"+
		"\2\u2644\2\u264a\2\u2655\2\u2662\2\u2662\2\u2665\2\u2665\2\u2667\2\u2668"+
		"\2\u266a\2\u266a\2\u267d\2\u267d\2\u2681\2\u2681\2\u2694\2\u2699\2\u269b"+
		"\2\u269b\2\u269d\2\u269e\2\u26a2\2\u26a3\2\u26ac\2\u26ad\2\u26b2\2\u26b3"+
		"\2\u26bf\2\u26c0\2\u26c6\2\u26c7\2\u26ca\2\u26ca\2\u26d0\2\u26d1\2\u26d3"+
		"\2\u26d3\2\u26d5\2\u26d6\2\u26eb\2\u26ec\2\u26f2\2\u26f7\2\u26f9\2\u26fc"+
		"\2\u26ff\2\u26ff\2\u2704\2\u2704\2\u2707\2\u2707\2\u270a\2\u270f\2\u2711"+
		"\2\u2711\2\u2714\2\u2714\2\u2716\2\u2716\2\u2718\2\u2718\2\u271f\2\u271f"+
		"\2\u2723\2\u2723\2\u272a\2\u272a\2\u2735\2\u2736\2\u2746\2\u2746\2\u2749"+
		"\2\u2749\2\u274e\2\u274e\2\u2750\2\u2750\2\u2755\2\u2757\2\u2759\2\u2759"+
		"\2\u2765\2\u2766\2\u2797\2\u2799\2\u27a3\2\u27a3\2\u27b2\2\u27b2\2\u27c1"+
		"\2\u27c1\2\u2936\2\u2937\2\u2b07\2\u2b09\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52"+
		"\2\u2b57\2\u2b57\2\u2c02\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced"+
		"\2\u2cf0\2\u2cf4\2\u2cf5\2\u2d02\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f"+
		"\2\u2d32\2\u2d69\2\u2d71\2\u2d71\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa"+
		"\2\u2db0\2\u2db2\2\u2db8\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0"+
		"\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0\2\u2de2\2\u2e01\2\u2e31\2\u2e31\2\u3007"+
		"\2\u3009\2\u3023\2\u302b\2\u3032\2\u3037\2\u303a\2\u303f\2\u3043\2\u3098"+
		"\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3130\2\u3133"+
		"\2\u3190\2\u31a2\2\u31bc\2\u31f2\2\u3201\2\u3299\2\u3299\2\u329b\2\u329b"+
		"\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\ua002\2\ua48e\2\ua4d2\2\ua4ff\2\ua502"+
		"\2\ua60e\2\ua612\2\ua62d\2\ua642\2\ua670\2\ua676\2\ua67d\2\ua681\2\ua6f1"+
		"\2\ua719\2\ua721\2\ua724\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9"+
		"\2\ua803\2\ua805\2\ua807\2\ua809\2\ua80c\2\ua80e\2\ua829\2\ua842\2\ua875"+
		"\2\ua882\2\ua8c5\2\ua8c7\2\ua8c7\2\ua8d2\2\ua8db\2\ua8f4\2\ua8f9\2\ua8fd"+
		"\2\ua8fd\2\ua8ff\2\ua8ff\2\ua902\2\ua92c\2\ua932\2\ua954\2\ua962\2\ua97e"+
		"\2\ua982\2\ua9b4\2\ua9b6\2\ua9c1\2\ua9d1\2\ua9db\2\ua9e2\2\ua9e6\2\ua9e8"+
		"\2\uaa00\2\uaa02\2\uaa38\2\uaa42\2\uaa4f\2\uaa52\2\uaa5b\2\uaa62\2\uaa78"+
		"\2\uaa7c\2\uaa7c\2\uaa80\2\uaac0\2\uaac2\2\uaac2\2\uaac4\2\uaac4\2\uaadd"+
		"\2\uaadf\2\uaae2\2\uaaf1\2\uaaf4\2\uaaf7\2\uab03\2\uab08\2\uab0b\2\uab10"+
		"\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c\2\uab5e"+
		"\2\uab67\2\uab72\2\uabec\2\uabf2\2\uabfb\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8"+
		"\2\ud7cd\2\ud7fd\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15"+
		"\2\ufb19\2\ufb1f\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40"+
		"\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52"+
		"\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe02\2\ufe11\2\ufe72\2\ufe76"+
		"\2\ufe78\2\ufefe\2\uff12\2\uff1b\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68"+
		"\2\uffc0\2\uffc4\2\uffc9\2\uffcc\2\uffd1\2\uffd4\2\uffd9\2\uffdc\2\uffde"+
		"\2\2\3\r\3\17\3(\3*\3<\3>\3?\3A\3O\3R\3_\3\u0082\3\u00fc\3\u0142\3\u0176"+
		"\3\u0282\3\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321\3\u032f\3\u034c\3\u0352"+
		"\3\u037c\3\u0382\3\u039f\3\u03a2\3\u03c5\3\u03ca\3\u03d1\3\u03d3\3\u03d7"+
		"\3\u0402\3\u049f\3\u04a2\3\u04ab\3\u04b2\3\u04d5\3\u04da\3\u04fd\3\u0502"+
		"\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762\3\u0769"+
		"\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a\3\u083e"+
		"\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2\3\u08f4"+
		"\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9\3\u09c0"+
		"\3\u09c1\3\u0a02\3\u0a05\3\u0a07\3\u0a08\3\u0a0e\3\u0a15\3\u0a17\3\u0a19"+
		"\3\u0a1b\3\u0a35\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb"+
		"\3\u0ae6\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93"+
		"\3\u0c02\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4\3\u1002\3\u1047\3\u1068"+
		"\3\u1071\3\u1084\3\u10ba\3\u10d2\3\u10ea\3\u10f2\3\u10fb\3\u1102\3\u1134"+
		"\3\u1138\3\u1141\3\u1152\3\u1174\3\u1178\3\u1178\3\u1182\3\u11c1\3\u11c3"+
		"\3\u11c6\3\u11d2\3\u11dc\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215\3\u1236"+
		"\3\u1239\3\u1239\3\u1240\3\u1240\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c"+
		"\3\u128f\3\u1291\3\u129f\3\u12a1\3\u12aa\3\u12b2\3\u12ea\3\u12f2\3\u12fb"+
		"\3\u1302\3\u1305\3\u1307\3\u130e\3\u1311\3\u1312\3\u1315\3\u132a\3\u132c"+
		"\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133f\3\u1346\3\u1349\3\u134a"+
		"\3\u134d\3\u134e\3\u1352\3\u1352\3\u1359\3\u1359\3\u135f\3\u1365\3\u1402"+
		"\3\u1443\3\u1445\3\u1447\3\u1449\3\u144c\3\u1452\3\u145b\3\u1482\3\u14c3"+
		"\3\u14c6\3\u14c7\3\u14c9\3\u14c9\3\u14d2\3\u14db\3\u1582\3\u15b7\3\u15ba"+
		"\3\u15c0\3\u15da\3\u15df\3\u1602\3\u1640\3\u1642\3\u1642\3\u1646\3\u1646"+
		"\3\u1652\3\u165b\3\u1682\3\u16b7\3\u16c2\3\u16cb\3\u1702\3\u171b\3\u171f"+
		"\3\u172c\3\u1732\3\u173b\3\u18a2\3\u18eb\3\u1901\3\u1901\3\u1a02\3\u1a34"+
		"\3\u1a37\3\u1a40\3\u1a52\3\u1a85\3\u1a88\3\u1a99\3\u1ac2\3\u1afa\3\u1c02"+
		"\3\u1c0a\3\u1c0c\3\u1c38\3\u1c3a\3\u1c40\3\u1c42\3\u1c42\3\u1c52\3\u1c5b"+
		"\3\u1c74\3\u1c91\3\u1c94\3\u1ca9\3\u1cab\3\u1cb8\3\u1d02\3\u1d08\3\u1d0a"+
		"\3\u1d0b\3\u1d0d\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d43"+
		"\3\u1d45\3\u1d45\3\u1d48\3\u1d49\3\u1d52\3\u1d5b\3\u2002\3\u239b\3\u2402"+
		"\3\u2470\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a"+
		"\3\u6a42\3\u6a60\3\u6a62\3\u6a6b\3\u6ad2\3\u6aef\3\u6b02\3\u6b38\3\u6b42"+
		"\3\u6b45\3\u6b52\3\u6b5b\3\u6b65\3\u6b79\3\u6b7f\3\u6b91\3\u6f02\3\u6f46"+
		"\3\u6f52\3\u6f80\3\u6f95\3\u6fa1\3\u6fe2\3\u6fe3\3\u7002\3\u87ee\3\u8802"+
		"\3\u8af4\3\ub002\3\ub120\3\ub172\3\ub2fd\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e"+
		"\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ubca0\3\ubca0\3\ud402\3\ud456\3\ud458"+
		"\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae"+
		"\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7\3\ud507\3\ud509"+
		"\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b\3\ud53d\3\ud540"+
		"\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554\3\ud6a7\3\ud6aa"+
		"\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe\3\ud716\3\ud718\3\ud736"+
		"\3\ud738\3\ud750\3\ud752\3\ud770\3\ud772\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac"+
		"\3\ud7c4\3\ud7c6\3\ud7cd\3\ud7d0\3\ud801\3\ue002\3\ue008\3\ue00a\3\ue01a"+
		"\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue802\3\ue8c6\3\ue902"+
		"\3\ue945\3\ue949\3\ue949\3\ue952\3\ue95b\3\uee02\3\uee05\3\uee07\3\uee21"+
		"\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36"+
		"\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49"+
		"\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56"+
		"\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f"+
		"\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e"+
		"\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b"+
		"\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\uf006"+
		"\3\uf006\3\uf0d1\3\uf0d1\3\uf132\3\uf14b\3\uf152\3\uf16b\3\uf172\3\uf18b"+
		"\3\uf190\3\uf190\3\uf193\3\uf19c\3\uf1e8\3\uf201\3\uf203\3\uf204\3\uf21c"+
		"\3\uf21c\3\uf231\3\uf231\3\uf234\3\uf23c\3\uf252\3\uf253\3\uf302\3\uf323"+
		"\3\uf326\3\uf395\3\uf398\3\uf399\3\uf39b\3\uf39d\3\uf3a0\3\uf3f2\3\uf3f5"+
		"\3\uf3f7\3\uf3f9\3\uf4ff\3\uf501\3\uf53f\3\uf54b\3\uf550\3\uf552\3\uf569"+
		"\3\uf571\3\uf572\3\uf575\3\uf57c\3\uf589\3\uf589\3\uf58c\3\uf58f\3\uf592"+
		"\3\uf592\3\uf597\3\uf598\3\uf5a6\3\uf5a7\3\uf5aa\3\uf5aa\3\uf5b3\3\uf5b4"+
		"\3\uf5be\3\uf5be\3\uf5c4\3\uf5c6\3\uf5d3\3\uf5d5\3\uf5de\3\uf5e0\3\uf5e3"+
		"\3\uf5e3\3\uf5e5\3\uf5e5\3\uf5ea\3\uf5ea\3\uf5f1\3\uf5f1\3\uf5f5\3\uf5f5"+
		"\3\uf5fc\3\uf651\3\uf682\3\uf6c7\3\uf6cd\3\uf6d4\3\uf6e2\3\uf6e7\3\uf6eb"+
		"\3\uf6eb\3\uf6ed\3\uf6ee\3\uf6f2\3\uf6f2\3\uf6f5\3\uf6fa\3\uf912\3\uf93c"+
		"\3\uf93e\3\uf940\3\uf942\3\uf947\3\uf949\3\uf94e\3\uf952\3\uf96d\3\uf982"+
		"\3\uf999\3\uf9c2\3\uf9c2\3\uf9d2\3\uf9e8\3\2\4\ua6d8\4\ua702\4\ub736\4"+
		"\ub742\4\ub81f\4\ub822\4\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u0102"+
		"\20\u01f1\20\u0296\2C\2\\\2c\2|\2\u00ac\2\u00ac\2\u00b7\2\u00b7\2\u00bc"+
		"\2\u00bc\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u02c3\2\u02c8\2\u02d3"+
		"\2\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0\2\u02f0\2\u0347\2\u0347\2\u0372"+
		"\2\u0376\2\u0378\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381\2\u0388\2\u0388"+
		"\2\u038a\2\u038c\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5\2\u03f7\2\u03f9"+
		"\2\u0483\2\u048c\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b\2\u0563\2\u0589"+
		"\2\u05b2\2\u05bf\2\u05c1\2\u05c1\2\u05c3\2\u05c4\2\u05c6\2\u05c7\2\u05c9"+
		"\2\u05c9\2\u05d2\2\u05ec\2\u05f2\2\u05f4\2\u0612\2\u061c\2\u0622\2\u0659"+
		"\2\u065b\2\u0661\2\u0670\2\u06d5\2\u06d7\2\u06de\2\u06e3\2\u06ea\2\u06ef"+
		"\2\u06f1\2\u06fc\2\u06fe\2\u0701\2\u0701\2\u0712\2\u0741\2\u074f\2\u07b3"+
		"\2\u07cc\2\u07ec\2\u07f6\2\u07f7\2\u07fc\2\u07fc\2\u0802\2\u0819\2\u081c"+
		"\2\u082e\2\u0842\2\u085a\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf"+
		"\2\u08d6\2\u08e1\2\u08e5\2\u08eb\2\u08f2\2\u093d\2\u093f\2\u094e\2\u0950"+
		"\2\u0952\2\u0957\2\u0965\2\u0973\2\u0985\2\u0987\2\u098e\2\u0991\2\u0992"+
		"\2\u0995\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4\2\u09b8\2\u09bb\2\u09bf"+
		"\2\u09c6\2\u09c9\2\u09ca\2\u09cd\2\u09ce\2\u09d0\2\u09d0\2\u09d9\2\u09d9"+
		"\2\u09de\2\u09df\2\u09e1\2\u09e5\2\u09f2\2\u09f3\2\u09fe\2\u09fe\2\u0a03"+
		"\2\u0a05\2\u0a07\2\u0a0c\2\u0a11\2\u0a12\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32"+
		"\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a\2\u0a3b\2\u0a40\2\u0a44\2\u0a49"+
		"\2\u0a4a\2\u0a4d\2\u0a4e\2\u0a53\2\u0a53\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60"+
		"\2\u0a72\2\u0a77\2\u0a83\2\u0a85\2\u0a87\2\u0a8f\2\u0a91\2\u0a93\2\u0a95"+
		"\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7\2\u0abb\2\u0abf\2\u0ac7"+
		"\2\u0ac9\2\u0acb\2\u0acd\2\u0ace\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae5\2\u0afb"+
		"\2\u0afe\2\u0b03\2\u0b05\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a"+
		"\2\u0b2c\2\u0b32\2\u0b34\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b46\2\u0b49"+
		"\2\u0b4a\2\u0b4d\2\u0b4e\2\u0b58\2\u0b59\2\u0b5e\2\u0b5f\2\u0b61\2\u0b65"+
		"\2\u0b73\2\u0b73\2\u0b84\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94"+
		"\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6"+
		"\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb\2\u0bc0\2\u0bc4\2\u0bc8\2\u0bca\2\u0bcc"+
		"\2\u0bce\2\u0bd2\2\u0bd2\2\u0bd9\2\u0bd9\2\u0c02\2\u0c05\2\u0c07\2\u0c0e"+
		"\2\u0c10\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c46\2\u0c48"+
		"\2\u0c4a\2\u0c4c\2\u0c4e\2\u0c57\2\u0c58\2\u0c5a\2\u0c5c\2\u0c62\2\u0c65"+
		"\2\u0c82\2\u0c85\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94\2\u0caa\2\u0cac"+
		"\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbf\2\u0cc6\2\u0cc8\2\u0cca\2\u0ccc\2\u0cce"+
		"\2\u0cd7\2\u0cd8\2\u0ce0\2\u0ce0\2\u0ce2\2\u0ce5\2\u0cf3\2\u0cf4\2\u0d02"+
		"\2\u0d05\2\u0d07\2\u0d0e\2\u0d10\2\u0d12\2\u0d14\2\u0d3c\2\u0d3f\2\u0d46"+
		"\2\u0d48\2\u0d4a\2\u0d4c\2\u0d4e\2\u0d50\2\u0d50\2\u0d56\2\u0d59\2\u0d61"+
		"\2\u0d65\2\u0d7c\2\u0d81\2\u0d84\2\u0d85\2\u0d87\2\u0d98\2\u0d9c\2\u0db3"+
		"\2\u0db5\2\u0dbd\2\u0dbf\2\u0dbf\2\u0dc2\2\u0dc8\2\u0dd1\2\u0dd6\2\u0dd8"+
		"\2\u0dd8\2\u0dda\2\u0de1\2\u0df4\2\u0df5\2\u0e03\2\u0e3c\2\u0e42\2\u0e48"+
		"\2\u0e4f\2\u0e4f\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c"+
		"\2\u0e8c\2\u0e8f\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5"+
		"\2\u0ea7\2\u0ea7\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0ebb\2\u0ebd"+
		"\2\u0ebf\2\u0ec2\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ecf\2\u0ecf\2\u0ede\2\u0ee1"+
		"\2\u0f02\2\u0f02\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f73\2\u0f83\2\u0f8a"+
		"\2\u0f99\2\u0f9b\2\u0fbe\2\u1002\2\u1038\2\u103a\2\u103a\2\u103d\2\u1041"+
		"\2\u1052\2\u1064\2\u1067\2\u106a\2\u1070\2\u1088\2\u1090\2\u1090\2\u109e"+
		"\2\u109f\2\u10a2\2\u10c7\2\u10c9\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc"+
		"\2\u10fe\2\u124a\2\u124c\2\u124f\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c"+
		"\2\u125f\2\u1262\2\u128a\2\u128c\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7"+
		"\2\u12ba\2\u12c0\2\u12c2\2\u12c2\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da"+
		"\2\u1312\2\u1314\2\u1317\2\u131a\2\u135c\2\u1361\2\u1361\2\u1382\2\u1391"+
		"\2\u13a2\2\u13f7\2\u13fa\2\u13ff\2\u1403\2\u166e\2\u1671\2\u1681\2\u1683"+
		"\2\u169c\2\u16a2\2\u16ec\2\u16f0\2\u16fa\2\u1702\2\u170e\2\u1710\2\u1715"+
		"\2\u1722\2\u1735\2\u1742\2\u1755\2\u1762\2\u176e\2\u1770\2\u1772\2\u1774"+
		"\2\u1775\2\u1782\2\u17b5\2\u17b8\2\u17ca\2\u17d9\2\u17d9\2\u17de\2\u17de"+
		"\2\u1822\2\u1879\2\u1882\2\u18ac\2\u18b2\2\u18f7\2\u1902\2\u1920\2\u1922"+
		"\2\u192d\2\u1932\2\u193a\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad"+
		"\2\u19b2\2\u19cb\2\u1a02\2\u1a1d\2\u1a22\2\u1a60\2\u1a63\2\u1a76\2\u1aa9"+
		"\2\u1aa9\2\u1b02\2\u1b35\2\u1b37\2\u1b45\2\u1b47\2\u1b4d\2\u1b82\2\u1bab"+
		"\2\u1bae\2\u1bb1\2\u1bbc\2\u1be7\2\u1be9\2\u1bf3\2\u1c02\2\u1c37\2\u1c4f"+
		"\2\u1c51\2\u1c5c\2\u1c7f\2\u1c82\2\u1c8a\2\u1ceb\2\u1cee\2\u1cf0\2\u1cf5"+
		"\2\u1cf7\2\u1cf8\2\u1d02\2\u1dc1\2\u1de9\2\u1df6\2\u1e02\2\u1f17\2\u1f1a"+
		"\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b"+
		"\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8"+
		"\2\u1fbe\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5"+
		"\2\u1fd8\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u2073"+
		"\2\u2073\2\u2081\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109\2\u2109"+
		"\2\u210c\2\u2115\2\u2117\2\u2117\2\u211b\2\u211f\2\u2126\2\u2126\2\u2128"+
		"\2\u2128\2\u212a\2\u212a\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141"+
		"\2\u2147\2\u214b\2\u2150\2\u2150\2\u2162\2\u218a\2\u24b8\2\u24eb\2\u2c02"+
		"\2\u2c30\2\u2c32\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5"+
		"\2\u2d02\2\u2d27\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71"+
		"\2\u2d71\2\u2d82\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8"+
		"\2\u2dba\2\u2dc0\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda"+
		"\2\u2de0\2\u2de2\2\u2e01\2\u2e31\2\u2e31\2\u3007\2\u3009\2\u3023\2\u302b"+
		"\2\u3033\2\u3037\2\u303a\2\u303e\2\u3043\2\u3098\2\u309f\2\u30a1\2\u30a3"+
		"\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3130\2\u3133\2\u3190\2\u31a2\2\u31bc"+
		"\2\u31f2\2\u3201\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\ua002\2\ua48e\2\ua4d2"+
		"\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua621\2\ua62c\2\ua62d\2\ua642\2\ua670"+
		"\2\ua676\2\ua67d\2\ua681\2\ua6f1\2\ua719\2\ua721\2\ua724\2\ua78a\2\ua78d"+
		"\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua803\2\ua805\2\ua807\2\ua809\2\ua80c"+
		"\2\ua80e\2\ua829\2\ua842\2\ua875\2\ua882\2\ua8c5\2\ua8c7\2\ua8c7\2\ua8f4"+
		"\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c\2\ua92c\2\ua932\2\ua954"+
		"\2\ua962\2\ua97e\2\ua982\2\ua9b4\2\ua9b6\2\ua9c1\2\ua9d1\2\ua9d1\2\ua9e2"+
		"\2\ua9e6\2\ua9e8\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa38\2\uaa42\2\uaa4f"+
		"\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaac0\2\uaac2\2\uaac2\2\uaac4"+
		"\2\uaac4\2\uaadd\2\uaadf\2\uaae2\2\uaaf1\2\uaaf4\2\uaaf7\2\uab03\2\uab08"+
		"\2\uab0b\2\uab10\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32"+
		"\2\uab5c\2\uab5e\2\uab67\2\uab72\2\uabec\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8"+
		"\2\ud7cd\2\ud7fd\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15"+
		"\2\ufb19\2\ufb1f\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40"+
		"\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52"+
		"\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76\2\ufe78\2\ufefe"+
		"\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9\2\uffcc"+
		"\2\uffd1\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3"+
		"A\3O\3R\3_\3\u0082\3\u00fc\3\u0142\3\u0176\3\u0282\3\u029e\3\u02a2\3\u02d2"+
		"\3\u0302\3\u0321\3\u032f\3\u034c\3\u0352\3\u037c\3\u0382\3\u039f\3\u03a2"+
		"\3\u03c5\3\u03ca\3\u03d1\3\u03d3\3\u03d7\3\u0402\3\u049f\3\u04b2\3\u04d5"+
		"\3\u04da\3\u04fd\3\u0502\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742"+
		"\3\u0757\3\u0762\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837"+
		"\3\u0839\3\u083a\3\u083e\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882"+
		"\3\u08a0\3\u08e2\3\u08f4\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b"+
		"\3\u0982\3\u09b9\3\u09c0\3\u09c1\3\u0a02\3\u0a05\3\u0a07\3\u0a08\3\u0a0e"+
		"\3\u0a15\3\u0a17\3\u0a19\3\u0a1b\3\u0a35\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e"+
		"\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62"+
		"\3\u0b74\3\u0b82\3\u0b93\3\u0c02\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4"+
		"\3\u1002\3\u1047\3\u1084\3\u10ba\3\u10d2\3\u10ea\3\u1102\3\u1134\3\u1152"+
		"\3\u1174\3\u1178\3\u1178\3\u1182\3\u11c1\3\u11c3\3\u11c6\3\u11dc\3\u11dc"+
		"\3\u11de\3\u11de\3\u1202\3\u1213\3\u1215\3\u1236\3\u1239\3\u1239\3\u1240"+
		"\3\u1240\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291\3\u129f"+
		"\3\u12a1\3\u12aa\3\u12b2\3\u12ea\3\u1302\3\u1305\3\u1307\3\u130e\3\u1311"+
		"\3\u1312\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b"+
		"\3\u133f\3\u1346\3\u1349\3\u134a\3\u134d\3\u134e\3\u1352\3\u1352\3\u1359"+
		"\3\u1359\3\u135f\3\u1365\3\u1402\3\u1443\3\u1445\3\u1447\3\u1449\3\u144c"+
		"\3\u1482\3\u14c3\3\u14c6\3\u14c7\3\u14c9\3\u14c9\3\u1582\3\u15b7\3\u15ba"+
		"\3\u15c0\3\u15da\3\u15df\3\u1602\3\u1640\3\u1642\3\u1642\3\u1646\3\u1646"+
		"\3\u1682\3\u16b7\3\u1702\3\u171b\3\u171f\3\u172c\3\u18a2\3\u18e1\3\u1901"+
		"\3\u1901\3\u1a02\3\u1a34\3\u1a37\3\u1a40\3\u1a52\3\u1a85\3\u1a88\3\u1a99"+
		"\3\u1ac2\3\u1afa\3\u1c02\3\u1c0a\3\u1c0c\3\u1c38\3\u1c3a\3\u1c40\3\u1c42"+
		"\3\u1c42\3\u1c74\3\u1c91\3\u1c94\3\u1ca9\3\u1cab\3\u1cb8\3\u1d02\3\u1d08"+
		"\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41"+
		"\3\u1d43\3\u1d45\3\u1d45\3\u1d48\3\u1d49\3\u2002\3\u239b\3\u2402\3\u2470"+
		"\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a\3\u6a42"+
		"\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b38\3\u6b42\3\u6b45\3\u6b65\3\u6b79"+
		"\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f80\3\u6f95\3\u6fa1\3\u6fe2"+
		"\3\u6fe3\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120\3\ub172\3\ub2fd"+
		"\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ubca0"+
		"\3\ubca0\3\ud402\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4"+
		"\3\ud4a7\3\ud4a8\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf"+
		"\3\ud4c5\3\ud4c7\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e"+
		"\3\ud520\3\ud53b\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c"+
		"\3\ud552\3\ud554\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de\3\ud6fc"+
		"\3\ud6fe\3\ud716\3\ud718\3\ud736\3\ud738\3\ud750\3\ud752\3\ud770\3\ud772"+
		"\3\ud78a\3\ud78c\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd\3\ue002\3\ue008"+
		"\3\ue00a\3\ue01a\3\ue01d\3\ue023\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue802"+
		"\3\ue8c6\3\ue902\3\ue945\3\ue949\3\ue949\3\uee02\3\uee05\3\uee07\3\uee21"+
		"\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29\3\uee29\3\uee2b\3\uee34\3\uee36"+
		"\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d\3\uee44\3\uee44\3\uee49\3\uee49"+
		"\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f\3\uee51\3\uee53\3\uee54\3\uee56"+
		"\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b\3\uee5d\3\uee5d\3\uee5f\3\uee5f"+
		"\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66\3\uee66\3\uee69\3\uee6c\3\uee6e"+
		"\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e\3\uee80\3\uee80\3\uee82\3\uee8b"+
		"\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7\3\ueeab\3\ueead\3\ueebd\3\uf132"+
		"\3\uf14b\3\uf152\3\uf16b\3\uf172\3\uf18b\3\2\4\ua6d8\4\ua702\4\ub736\4"+
		"\ub742\4\ub81f\4\ub822\4\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u045a"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2Q\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a5\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\3\u00b3\3\2\2\2\3\u00b5\3\2\2\2\3\u00b7\3\2\2"+
		"\2\4\u00b9\3\2\2\2\4\u00bb\3\2\2\2\4\u00bd\3\2\2\2\5\u00c1\3\2\2\2\5\u00c3"+
		"\3\2\2\2\5\u00c5\3\2\2\2\6\u00c9\3\2\2\2\6\u00cb\3\2\2\2\7\u00d4\3\2\2"+
		"\2\t\u00dc\3\2\2\2\13\u00e6\3\2\2\2\r\u00e8\3\2\2\2\17\u00f6\3\2\2\2\21"+
		"\u00f8\3\2\2\2\23\u00fc\3\2\2\2\25\u0108\3\2\2\2\27\u010a\3\2\2\2\31\u011a"+
		"\3\2\2\2\33\u0126\3\2\2\2\35\u0128\3\2\2\2\37\u0140\3\2\2\2!\u015e\3\2"+
		"\2\2#\u017e\3\2\2\2%\u0181\3\2\2\2\'\u0185\3\2\2\2)\u0189\3\2\2\2+\u018c"+
		"\3\2\2\2-\u019e\3\2\2\2/\u01a2\3\2\2\2\61\u01a5\3\2\2\2\63\u01ba\3\2\2"+
		"\2\65\u01c0\3\2\2\2\67\u01d5\3\2\2\29\u01d7\3\2\2\2;\u01de\3\2\2\2=\u01e8"+
		"\3\2\2\2?\u01f3\3\2\2\2A\u01f9\3\2\2\2C\u0200\3\2\2\2E\u0204\3\2\2\2G"+
		"\u020b\3\2\2\2I\u0210\3\2\2\2K\u0212\3\2\2\2M\u0218\3\2\2\2O\u021a\3\2"+
		"\2\2Q\u021c\3\2\2\2S\u022a\3\2\2\2U\u022c\3\2\2\2W\u022e\3\2\2\2Y\u0232"+
		"\3\2\2\2[\u0234\3\2\2\2]\u0237\3\2\2\2_\u023b\3\2\2\2a\u0257\3\2\2\2c"+
		"\u025a\3\2\2\2e\u025d\3\2\2\2g\u0260\3\2\2\2i\u0263\3\2\2\2k\u0266\3\2"+
		"\2\2m\u0282\3\2\2\2o\u0286\3\2\2\2q\u02c3\3\2\2\2s\u02c6\3\2\2\2u\u02f0"+
		"\3\2\2\2w\u02f2\3\2\2\2y\u02f5\3\2\2\2{\u02fa\3\2\2\2}\u02fe\3\2\2\2\177"+
		"\u0302\3\2\2\2\u0081\u0304\3\2\2\2\u0083\u0306\3\2\2\2\u0085\u0308\3\2"+
		"\2\2\u0087\u030a\3\2\2\2\u0089\u030c\3\2\2\2\u008b\u030e\3\2\2\2\u008d"+
		"\u0310\3\2\2\2\u008f\u0312\3\2\2\2\u0091\u0314\3\2\2\2\u0093\u0316\3\2"+
		"\2\2\u0095\u0318\3\2\2\2\u0097\u031a\3\2\2\2\u0099\u031c\3\2\2\2\u009b"+
		"\u031e\3\2\2\2\u009d\u0320\3\2\2\2\u009f\u0322\3\2\2\2\u00a1\u032b\3\2"+
		"\2\2\u00a3\u032d\3\2\2\2\u00a5\u032f\3\2\2\2\u00a7\u033b\3\2\2\2\u00a9"+
		"\u0344\3\2\2\2\u00ab\u0349\3\2\2\2\u00ad\u035b\3\2\2\2\u00af\u0368\3\2"+
		"\2\2\u00b1\u036f\3\2\2\2\u00b3\u0376\3\2\2\2\u00b5\u0385\3\2\2\2\u00b7"+
		"\u0389\3\2\2\2\u00b9\u03a1\3\2\2\2\u00bb\u03a3\3\2\2\2\u00bd\u03aa\3\2"+
		"\2\2\u00bf\u03b6\3\2\2\2\u00c1\u03ce\3\2\2\2\u00c3\u03d0\3\2\2\2\u00c5"+
		"\u03d6\3\2\2\2\u00c7\u03da\3\2\2\2\u00c9\u03f2\3\2\2\2\u00cb\u03f4\3\2"+
		"\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d5"+
		"\7n\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d5\7n\2\2\u00d4"+
		"\u00cd\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\b\3\2\2\2\u00d6\u00d7\7v\2\2"+
		"\u00d7\u00d8\7t\2\2\u00d8\u00d9\7w\2\2\u00d9\u00dd\7g\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dd\7p\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\n\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e7\7g\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7h\2\2"+
		"\u00e5\u00e7\7h\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\f\3"+
		"\2\2\2\u00e8\u00ec\t\2\2\2\u00e9\u00eb\t\3\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7<\2\2\u00f0\u00f2\7\61\2\2\u00f1"+
		"\u00f3\t\4\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\16\3\2\2\2\u00f6\u00f7\4\62;\2\u00f7\20"+
		"\3\2\2\2\u00f8\u00f9\4\63;\2\u00f9\22\3\2\2\2\u00fa\u00fd\5\17\6\2\u00fb"+
		"\u00fd\7a\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\24\3\2\2\2"+
		"\u00fe\u0102\5\17\6\2\u00ff\u0101\5\23\b\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\5\17\6\2\u0106\u0109\3\2\2\2\u0107\u0109\5"+
		"\17\6\2\u0108\u00fe\3\2\2\2\u0108\u0107\3\2\2\2\u0109\26\3\2\2\2\u010a"+
		"\u010c\t\5\2\2\u010b\u010d\t\6\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5\25\t\2\u010f\30\3\2\2\2\u0110\u0114"+
		"\5\21\7\2\u0111\u0113\5\23\b\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u0118\5\17\6\2\u0118\u011b\3\2\2\2\u0119\u011b\5\17\6\2"+
		"\u011a\u0110\3\2\2\2\u011a\u0119\3\2\2\2\u011b\32\3\2\2\2\u011c\u0120"+
		"\5\17\6\2\u011d\u011f\5\23\b\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\5\17\6\2\u0124\u0127\3\2\2\2\u0125\u0127\5\17\6\2"+
		"\u0126\u011c\3\2\2\2\u0126\u0125\3\2\2\2\u0127\34\3\2\2\2\u0128\u0129"+
		"\t\2\2\2\u0129\36\3\2\2\2\u012a\u012c\7/\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\5\33\f\2\u012e\u012d\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\60\2\2\u0131"+
		"\u0133\5\33\f\2\u0132\u0134\5\27\n\2\u0133\u0132\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\t\7\2\2\u0136\u0141\3\2\2\2\u0137"+
		"\u0139\7/\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\5\33\f\2\u013b\u013d\5\27\n\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\t\7\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u012b\3\2\2\2\u0140\u0138\3\2\2\2\u0141 \3\2\2\2\u0142\u0144"+
		"\7/\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0147\5\33\f\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0149\7\60\2\2\u0149\u014b\5\33\f\2\u014a\u014c\5\27\n\2"+
		"\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f"+
		"\t\b\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u015f\3\2\2\2\u0150"+
		"\u0152\7/\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\5\33\f\2\u0154\u0156\5\27\n\2\u0155\u0157\t\b\2\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015f\3\2\2\2\u0158\u015a\7/"+
		"\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\5\33\f\2\u015c\u015d\t\b\2\2\u015d\u015f\3\2\2\2\u015e\u0143\3"+
		"\2\2\2\u015e\u0151\3\2\2\2\u015e\u0159\3\2\2\2\u015f\"\3\2\2\2\u0160\u0162"+
		"\7/\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0165\5\33\f\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3"+
		"\2\2\2\u0166\u0167\7\60\2\2\u0167\u0169\5\33\f\2\u0168\u016a\5\27\n\2"+
		"\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016f\3\2\2\2\u016b\u016c"+
		"\7d\2\2\u016c\u0170\7f\2\2\u016d\u016e\7D\2\2\u016e\u0170\7F\2\2\u016f"+
		"\u016b\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u017f\3\2\2\2\u0171\u0173\7/"+
		"\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\5\33\f\2\u0175\u0177\5\27\n\2\u0176\u0175\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\u017c\3\2\2\2\u0178\u0179\7d\2\2\u0179\u017d\7f\2\2\u017a"+
		"\u017b\7D\2\2\u017b\u017d\7F\2\2\u017c\u0178\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017d\u017f\3\2\2\2\u017e\u0161\3\2\2\2\u017e\u0172\3\2\2\2\u017f$"+
		"\3\2\2\2\u0180\u0182\7/\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\5\33\f\2\u0184&\3\2\2\2\u0185\u0186\t\t\2\2"+
		"\u0186(\3\2\2\2\u0187\u018a\5\'\22\2\u0188\u018a\7a\2\2\u0189\u0187\3"+
		"\2\2\2\u0189\u0188\3\2\2\2\u018a*\3\2\2\2\u018b\u018d\7/\2\2\u018c\u018b"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u019c\3\2\2\2\u018e\u018f\7\62\2\2"+
		"\u018f\u0190\t\n\2\2\u0190\u0194\5\'\22\2\u0191\u0193\5)\23\2\u0192\u0191"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\5\'\22\2\u0198\u019d\3"+
		"\2\2\2\u0199\u019a\7\62\2\2\u019a\u019b\t\n\2\2\u019b\u019d\5\'\22\2\u019c"+
		"\u018e\3\2\2\2\u019c\u0199\3\2\2\2\u019d,\3\2\2\2\u019e\u019f\t\13\2\2"+
		"\u019f.\3\2\2\2\u01a0\u01a3\5-\25\2\u01a1\u01a3\7a\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a1\3\2\2\2\u01a3\60\3\2\2\2\u01a4\u01a6\7/\2\2\u01a5\u01a4"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01b5\3\2\2\2\u01a7\u01a8\7\62\2\2"+
		"\u01a8\u01a9\t\f\2\2\u01a9\u01ad\5-\25\2\u01aa\u01ac\5/\26\2\u01ab\u01aa"+
		"\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5-\25\2\u01b1\u01b6\3\2"+
		"\2\2\u01b2\u01b3\7\62\2\2\u01b3\u01b4\t\f\2\2\u01b4\u01b6\5-\25\2\u01b5"+
		"\u01a7\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\62\3\2\2\2\u01b7\u01bb\5%\21"+
		"\2\u01b8\u01bb\5+\24\2\u01b9\u01bb\5\61\27\2\u01ba\u01b7\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7N"+
		"\2\2\u01bd\64\3\2\2\2\u01be\u01c1\5%\21\2\u01bf\u01c1\5!\17\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\66\3\2\2\2\u01c2\u01c3\5\33\f\2\u01c3"+
		"\u01c4\7/\2\2\u01c4\u01c5\59\33\2\u01c5\u01d6\3\2\2\2\u01c6\u01c7\5\33"+
		"\f\2\u01c7\u01c8\7\60\2\2\u01c8\u01c9\5\33\f\2\u01c9\u01ca\7/\2\2\u01ca"+
		"\u01cb\59\33\2\u01cb\u01d6\3\2\2\2\u01cc\u01cd\5\33\f\2\u01cd\u01ce\7"+
		"\60\2\2\u01ce\u01cf\5\33\f\2\u01cf\u01d0\7\60\2\2\u01d0\u01d3\5\33\f\2"+
		"\u01d1\u01d2\7/\2\2\u01d2\u01d4\59\33\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01c2\3\2\2\2\u01d5\u01c6\3\2\2\2\u01d5"+
		"\u01cc\3\2\2\2\u01d68\3\2\2\2\u01d7\u01dc\5\u00a7R\2\u01d8\u01da\7/\2"+
		"\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd"+
		"\5\33\f\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd:\3\2\2\2\u01de"+
		"\u01e3\7$\2\2\u01df\u01e2\5I#\2\u01e0\u01e2\n\r\2\2\u01e1\u01df\3\2\2"+
		"\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7$\2\2\u01e7"+
		"<\3\2\2\2\u01e8\u01e9\7B\2\2\u01e9\u01ea\7$\2\2\u01ea\u01ee\3\2\2\2\u01eb"+
		"\u01ed\n\16\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3"+
		"\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f2\7$\2\2\u01f2>\3\2\2\2\u01f3\u01f4\7$\2\2\u01f4\u01f5\7$\2\2\u01f5"+
		"\u01f6\7$\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\b\36\2\2\u01f8@\3\2\2\2"+
		"\u01f9\u01fa\7B\2\2\u01fa\u01fb\7$\2\2\u01fb\u01fc\7$\2\2\u01fc\u01fd"+
		"\7$\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\b\37\3\2\u01ffB\3\2\2\2\u0200"+
		"\u0201\7b\2\2\u0201\u0202\3\2\2\2\u0202\u0203\b \4\2\u0203D\3\2\2\2\u0204"+
		"\u0205\7^\2\2\u0205\u0206\7w\2\2\u0206\u0207\5\'\22\2\u0207\u0208\5\'"+
		"\22\2\u0208\u0209\5\'\22\2\u0209\u020a\5\'\22\2\u020aF\3\2\2\2\u020b\u020c"+
		"\7^\2\2\u020c\u020d\t\17\2\2\u020dH\3\2\2\2\u020e\u0211\5E!\2\u020f\u0211"+
		"\5G\"\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211J\3\2\2\2\u0212\u0213"+
		"\7w\2\2\u0213\u0214\5\'\22\2\u0214\u0215\5\'\22\2\u0215\u0216\5\'\22\2"+
		"\u0216\u0217\5\'\22\2\u0217L\3\2\2\2\u0218\u0219\n\20\2\2\u0219N\3\2\2"+
		"\2\u021a\u021b\n\21\2\2\u021bP\3\2\2\2\u021c\u021f\7)\2\2\u021d\u0220"+
		"\5I#\2\u021e\u0220\5O&\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\7)\2\2\u0222R\3\2\2\2\u0223\u0224\7f\2\2\u0224"+
		"\u0225\7c\2\2\u0225\u022b\7{\2\2\u0226\u0227\7f\2\2\u0227\u0228\7c\2\2"+
		"\u0228\u0229\7{\2\2\u0229\u022b\7u\2\2\u022a\u0223\3\2\2\2\u022a\u0226"+
		"\3\2\2\2\u022bT\3\2\2\2\u022c\u022d\7j\2\2\u022dV\3\2\2\2\u022e\u022f"+
		"\7o\2\2\u022f\u0230\7k\2\2\u0230\u0231\7p\2\2\u0231X\3\2\2\2\u0232\u0233"+
		"\7u\2\2\u0233Z\3\2\2\2\u0234\u0235\7o\2\2\u0235\u0236\7u\2\2\u0236\\\3"+
		"\2\2\2\u0237\u0238\7p\2\2\u0238\u0239\7u\2\2\u0239^\3\2\2\2\u023a\u023c"+
		"\7/\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0240\3\2\2\2\u023d"+
		"\u023e\5a/\2\u023e\u023f\7<\2\2\u023f\u0241\3\2\2\2\u0240\u023d\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\5\25\t\2\u0243"+
		"\u0245\5U)\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2"+
		"\2\u0246\u0247\7<\2\2\u0247\u0249\5\25\t\2\u0248\u024a\5W*\2\u0249\u0248"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7<\2\2\u024c"+
		"\u0252\5\25\t\2\u024d\u024e\7\60\2\2\u024e\u0250\5\33\f\2\u024f\u0251"+
		"\5\27\n\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2"+
		"\u0252\u024d\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0256"+
		"\5Y+\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256`\3\2\2\2\u0257\u0258"+
		"\5\65\31\2\u0258\u0259\5S(\2\u0259b\3\2\2\2\u025a\u025b\5\65\31\2\u025b"+
		"\u025c\5U)\2\u025cd\3\2\2\2\u025d\u025e\5\65\31\2\u025e\u025f\5W*\2\u025f"+
		"f\3\2\2\2\u0260\u0261\5\65\31\2\u0261\u0262\5Y+\2\u0262h\3\2\2\2\u0263"+
		"\u0264\5%\21\2\u0264\u0265\5[,\2\u0265j\3\2\2\2\u0266\u0267\5%\21\2\u0267"+
		"\u0268\5]-\2\u0268l\3\2\2\2\u0269\u026b\7/\2\2\u026a\u0269\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\5\25\t\2\u026d\u026e\7"+
		"\61\2\2\u026e\u0270\5\17\6\2\u026f\u0271\5\17\6\2\u0270\u026f\3\2\2\2"+
		"\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\7\61\2\2\u0273\u0275"+
		"\5\17\6\2\u0274\u0276\5\17\6\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2"+
		"\u0276\u0283\3\2\2\2\u0277\u0278\5\25\t\2\u0278\u0279\7/\2\2\u0279\u027b"+
		"\5\17\6\2\u027a\u027c\5\17\6\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2"+
		"\u027c\u027d\3\2\2\2\u027d\u027e\7/\2\2\u027e\u0280\5\17\6\2\u027f\u0281"+
		"\5\17\6\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2"+
		"\u0282\u026a\3\2\2\2\u0282\u0277\3\2\2\2\u0283n\3\2\2\2\u0284\u0287\5"+
		"\u0099K\2\u0285\u0287\7V\2\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u0289\5\25\t\2\u0289\u028a\7<\2\2\u028a\u0294\5\25"+
		"\t\2\u028b\u028c\7<\2\2\u028c\u0292\5\25\t\2\u028d\u028e\7\60\2\2\u028e"+
		"\u0290\5\33\f\2\u028f\u0291\5\27\n\2\u0290\u028f\3\2\2\2\u0290\u0291\3"+
		"\2\2\2\u0291\u0293\3\2\2\2\u0292\u028d\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0295\3\2\2\2\u0294\u028b\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2"+
		"\2\2\u0296\u0298\5q\67\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"p\3\2\2\2\u0299\u029a\7-\2\2\u029a\u029c\5\17\6\2\u029b\u029d\5\17\6\2"+
		"\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a2\3\2\2\2\u029e\u029f"+
		"\7<\2\2\u029f\u02a0\5\17\6\2\u02a0\u02a1\5\17\6\2\u02a1\u02a3\3\2\2\2"+
		"\u02a2\u029e\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02c4\3\2\2\2\u02a4\u02c0"+
		"\7/\2\2\u02a5\u02a7\5\17\6\2\u02a6\u02a8\5\17\6\2\u02a7\u02a6\3\2\2\2"+
		"\u02a7\u02a8\3\2\2\2\u02a8\u02ad\3\2\2\2\u02a9\u02aa\7<\2\2\u02aa\u02ab"+
		"\5\17\6\2\u02ab\u02ac\5\17\6\2\u02ac\u02ae\3\2\2\2\u02ad\u02a9\3\2\2\2"+
		"\u02ad\u02ae\3\2\2\2\u02ae\u02c1\3\2\2\2\u02af\u02b0\7W\2\2\u02b0\u02b1"+
		"\7V\2\2\u02b1\u02b7\7E\2\2\u02b2\u02b3\7I\2\2\u02b3\u02b4\7O\2\2\u02b4"+
		"\u02b7\7V\2\2\u02b5\u02b7\7\\\2\2\u02b6\u02af\3\2\2\2\u02b6\u02b2\3\2"+
		"\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02c1\3\2\2\2\u02b8\u02b9\5\35\r\2\u02b9"+
		"\u02ba\5\35\r\2\u02ba\u02bc\7\61\2\2\u02bb\u02bd\5\35\r\2\u02bc\u02bb"+
		"\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c1\3\2\2\2\u02c0\u02a5\3\2\2\2\u02c0\u02b6\3\2\2\2\u02c0\u02b8\3\2"+
		"\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c4\7\\\2\2\u02c3\u0299\3\2\2\2\u02c3"+
		"\u02a4\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4r\3\2\2\2\u02c5\u02c7\7/\2\2\u02c6"+
		"\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\5\33"+
		"\f\2\u02c9\u02cc\5\u00a9S\2\u02ca\u02cb\7<\2\2\u02cb\u02cd\t\22\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cdt\3\2\2\2\u02ce\u02d0\7/\2\2\u02cf"+
		"\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\5\33"+
		"\f\2\u02d2\u02d3\5\u00a9S\2\u02d3\u02d4\7<\2\2\u02d4\u02d5\t\23\2\2\u02d5"+
		"\u02f1\3\2\2\2\u02d6\u02d8\7/\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2"+
		"\2\2\u02d8\u02da\3\2\2\2\u02d9\u02db\5\33\f\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7\60\2\2\u02dd\u02df\5"+
		"\33\f\2\u02de\u02e0\5\27\n\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e4\5\u00a9S\2\u02e2\u02e3\7<\2\2\u02e3\u02e5\t"+
		"\24\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02f1\3\2\2\2\u02e6"+
		"\u02e8\7/\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\u02ea\5\33\f\2\u02ea\u02eb\5\27\n\2\u02eb\u02ee\5\u00a9S\2"+
		"\u02ec\u02ed\7<\2\2\u02ed\u02ef\t\24\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef"+
		"\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02cf\3\2\2\2\u02f0\u02d7\3\2\2\2\u02f0"+
		"\u02e7\3\2\2\2\u02f1v\3\2\2\2\u02f2\u02f3\7\60\2\2\u02f3\u02f4\7\60\2"+
		"\2\u02f4x\3\2\2\2\u02f5\u02f6\7>\2\2\u02f6\u02f7\7\60\2\2\u02f7\u02f8"+
		"\7\60\2\2\u02f8\u02f9\7>\2\2\u02f9z\3\2\2\2\u02fa\u02fb\7>\2\2\u02fb\u02fc"+
		"\7\60\2\2\u02fc\u02fd\7\60\2\2\u02fd|\3\2\2\2\u02fe\u02ff\7\60\2\2\u02ff"+
		"\u0300\7\60\2\2\u0300\u0301\7>\2\2\u0301~\3\2\2\2\u0302\u0303\7\60\2\2"+
		"\u0303\u0080\3\2\2\2\u0304\u0305\7<\2\2\u0305\u0082\3\2\2\2\u0306\u0307"+
		"\7=\2\2\u0307\u0084\3\2\2\2\u0308\u0309\7?\2\2\u0309\u0086\3\2\2\2\u030a"+
		"\u030b\7}\2\2\u030b\u0088\3\2\2\2\u030c\u030d\7\177\2\2\u030d\u008a\3"+
		"\2\2\2\u030e\u030f\7*\2\2\u030f\u008c\3\2\2\2\u0310\u0311\7+\2\2\u0311"+
		"\u008e\3\2\2\2\u0312\u0313\7]\2\2\u0313\u0090\3\2\2\2\u0314\u0315\7_\2"+
		"\2\u0315\u0092\3\2\2\2\u0316\u0317\7.\2\2\u0317\u0094\3\2\2\2\u0318\u0319"+
		"\7\61\2\2\u0319\u0096\3\2\2\2\u031a\u031b\7/\2\2\u031b\u0098\3\2\2\2\u031c"+
		"\u031d\7B\2\2\u031d\u009a\3\2\2\2\u031e\u031f\7-\2\2\u031f\u009c\3\2\2"+
		"\2\u0320\u0321\7a\2\2\u0321\u009e\3\2\2\2\u0322\u0323\7\60\2\2\u0323\u0324"+
		"\7d\2\2\u0324\u0325\7n\2\2\u0325\u0326\7q\2\2\u0326\u0327\7d\2\2\u0327"+
		"\u0328\7*\2\2\u0328\u0329\3\2\2\2\u0329\u032a\bN\5\2\u032a\u00a0\3\2\2"+
		"\2\u032b\u032c\t\36\2\2\u032c\u00a2\3\2\2\2\u032d\u032e\t\37\2\2\u032e"+
		"\u00a4\3\2\2\2\u032f\u0333\5\u00a1O\2\u0330\u0332\5\u00a3P\2\u0331\u0330"+
		"\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0338\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\7\60\2\2\u0337\u0339\5"+
		"\u00a5Q\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u00a6\3\2\2\2"+
		"\u033a\u033c\t \2\2\u033b\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033b"+
		"\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u00a8\3\2\2\2\u033f\u0345\5\u00a5Q"+
		"\2\u0340\u0345\7\u2115\2\2\u0341\u0342\7o\2\2\u0342\u0345\7\u2115\2\2"+
		"\u0343\u0345\7\u00b2\2\2\u0344\u033f\3\2\2\2\u0344\u0340\3\2\2\2\u0344"+
		"\u0341\3\2\2\2\u0344\u0343\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u0348\4\u00b4"+
		"\u00b5\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u00aa\3\2\2\2\u0349"+
		"\u034a\7\61\2\2\u034a\u034b\7,\2\2\u034b\u0350\3\2\2\2\u034c\u034f\5\u00ab"+
		"T\2\u034d\u034f\13\2\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f"+
		"\u0352\3\2\2\2\u0350\u0351\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0353\3\2"+
		"\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7,\2\2\u0354\u0355\7\61\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0357\bT\6\2\u0357\u00ac\3\2\2\2\u0358\u035c\7%\2"+
		"\2\u0359\u035a\7\61\2\2\u035a\u035c\7\61\2\2\u035b\u0358\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035c\u0360\3\2\2\2\u035d\u035f\n\25\2\2\u035e\u035d\3"+
		"\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0364\bU\6\2\u0364\u00ae\3\2"+
		"\2\2\u0365\u0369\t\26\2\2\u0366\u0367\7^\2\2\u0367\u0369\7\f\2\2\u0368"+
		"\u0365\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0368\3\2"+
		"\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\bV\6\2\u036d"+
		"\u00b0\3\2\2\2\u036e\u0370\t\27\2\2\u036f\u036e\3\2\2\2\u0370\u0371\3"+
		"\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u00b2\3\2\2\2\u0373"+
		"\u0375\t\30\2\2\u0374\u0373\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3"+
		"\2\2\2\u0376\u0377\3\2\2\2\u0377\u037c\3\2\2\2\u0378\u0376\3\2\2\2\u0379"+
		"\u037b\t\31\2\2\u037a\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3"+
		"\2\2\2\u037c\u037d\3\2\2\2\u037d\u0382\3\2\2\2\u037e\u037c\3\2\2\2\u037f"+
		"\u0381\t\30\2\2\u0380\u037f\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3"+
		"\2\2\2\u0382\u0383\3\2\2\2\u0383\u00b4\3\2\2\2\u0384\u0382\3\2\2\2\u0385"+
		"\u0386\7+\2\2\u0386\u0387\3\2\2\2\u0387\u0388\bY\7\2\u0388\u00b6\3\2\2"+
		"\2\u0389\u038a\13\2\2\2\u038a\u00b8\3\2\2\2\u038b\u038d\t\32\2\2\u038c"+
		"\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2"+
		"\2\2\u038f\u0393\3\2\2\2\u0390\u0392\5\u00bf^\2\u0391\u0390\3\2\2\2\u0392"+
		"\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u03a2\3\2"+
		"\2\2\u0395\u0393\3\2\2\2\u0396\u0398\t\32\2\2\u0397\u0396\3\2\2\2\u0398"+
		"\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039d\3\2"+
		"\2\2\u039b\u0399\3\2\2\2\u039c\u039e\5\u00bf^\2\u039d\u039c\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2"+
		"\2\2\u03a1\u038c\3\2\2\2\u03a1\u0399\3\2\2\2\u03a2\u00ba\3\2\2\2\u03a3"+
		"\u03a4\7$\2\2\u03a4\u03a5\7$\2\2\u03a5\u03a6\7$\2\2\u03a6\u03a7\3\2\2"+
		"\2\u03a7\u03a8\b\\\7\2\u03a8\u00bc\3\2\2\2\u03a9\u03ab\t\33\2\2\u03aa"+
		"\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\13"+
		"\2\2\2\u03ad\u00be\3\2\2\2\u03ae\u03af\7$\2\2\u03af\u03b0\7$\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b7\n\34\2\2\u03b2\u03b3\7$\2\2\u03b3\u03b7\n\34"+
		"\2\2\u03b4\u03b7\5I#\2\u03b5\u03b7\5M%\2\u03b6\u03ae\3\2\2\2\u03b6\u03b2"+
		"\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7\u00c0\3\2\2\2\u03b8"+
		"\u03ba\t\32\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03b9\3"+
		"\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03c0\3\2\2\2\u03bd\u03bf\5\u00c7b\2"+
		"\u03be\u03bd\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1"+
		"\3\2\2\2\u03c1\u03cf\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c5\t\32\2\2"+
		"\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7"+
		"\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03cb\5\u00c7b"+
		"\2\u03ca\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd"+
		"\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03b9\3\2\2\2\u03ce\u03c6\3\2\2\2\u03cf"+
		"\u00c2\3\2\2\2\u03d0\u03d1\7$\2\2\u03d1\u03d2\7$\2\2\u03d2\u03d3\7$\2"+
		"\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\b`\7\2\u03d5\u00c4\3\2\2\2\u03d6\u03d7"+
		"\13\2\2\2\u03d7\u00c6\3\2\2\2\u03d8\u03db\t\33\2\2\u03d9\u03db\5\u00bf"+
		"^\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2\2\u03db\u00c8\3\2\2\2\u03dc"+
		"\u03de\t\32\2\2\u03dd\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03dd\3"+
		"\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e4\3\2\2\2\u03e1\u03e3\n\35\2\2\u03e2"+
		"\u03e1\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2"+
		"\2\2\u03e5\u03f3\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\t\32\2\2\u03e8"+
		"\u03e7\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ef\n\35\2\2\u03ee"+
		"\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2"+
		"\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03dd\3\2\2\2\u03f2\u03ea\3\2\2\2\u03f3"+
		"\u00ca\3\2\2\2\u03f4\u03f5\7b\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\bd\7"+
		"\2\u03f7\u00cc\3\2\2\2\u0084\2\3\4\5\6\u00d4\u00dc\u00e6\u00ec\u00f4\u00fc"+
		"\u0102\u0108\u010c\u0114\u011a\u0120\u0126\u012b\u012e\u0133\u0138\u013c"+
		"\u0140\u0143\u0146\u014b\u014e\u0151\u0156\u0159\u015e\u0161\u0164\u0169"+
		"\u016f\u0172\u0176\u017c\u017e\u0181\u0189\u018c\u0194\u019c\u01a2\u01a5"+
		"\u01ad\u01b5\u01ba\u01c0\u01d3\u01d5\u01d9\u01dc\u01e1\u01e3\u01ee\u0210"+
		"\u021f\u022a\u023b\u0240\u0244\u0249\u0250\u0252\u0255\u026a\u0270\u0275"+
		"\u027b\u0280\u0282\u0286\u0290\u0292\u0294\u0297\u029c\u02a2\u02a7\u02ad"+
		"\u02b6\u02be\u02c0\u02c3\u02c6\u02cc\u02cf\u02d7\u02da\u02df\u02e4\u02e7"+
		"\u02ee\u02f0\u0333\u0338\u033d\u0344\u0347\u034e\u0350\u035b\u0360\u0368"+
		"\u036a\u0371\u0376\u037c\u0382\u038e\u0393\u0399\u039f\u03a1\u03aa\u03b6"+
		"\u03bb\u03c0\u03c6\u03cc\u03ce\u03da\u03df\u03e4\u03ea\u03f0\u03f2\b\7"+
		"\4\2\7\5\2\7\6\2\7\3\2\2\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}