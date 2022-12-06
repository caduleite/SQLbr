package Lexico;
import static Lexico.Token.*; 
class Lexer {
    public static final int YYEOF = -1;
    
private static final int ZZ_BUFFERSIZE = 16384; 

public static final int YYINITIAL = 0;

private static final int ZZ_LEXSTATE[] = { 0, 0
};
private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\46\1\11\1\47\1\47\1\11\22\0\1\41\1\0\1\7"+ 
    "\5\0\1\21\1\21\1\12\1\12\1\21\1\12\1\6\1\12\12\2"+ 
    "\1\0\1\21\1\13\1\15\1\14\2\0\1\22\1\23\1\35\1\32"+ 
    "\1\20\1\42\1\40\1\44\1\25\1\36\1\1\1\27\1\30\1\33"+ 
    "\1\16\1\34\1\1\1\24\1\31\1\26\1\17\1\37\1\1\1\43"+ 
    "\1\1\1\45\1\21\1\10\1\21\1\0\1\4\1\0\32\1\1\0"+
"\1\46\10\0\1\47\u1f96\0\1\3\1\5\12\0\1\47\1\47\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED); private static final int [] ZZ_ACTION = zzUnpackAction();
private static final String ZZ_ACTION_PACKED_0 = "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+ "\2\7\3\2\1\4\7\2\5\0\1\10\1\0\1\7"+ "\4\2\1\11\6\2\1\11\4\2\1\0\1\12\1\13"+ "\1\10\3\2\1\0\16\2\1\0\15\2\1\0\13\2"+ "\3\0\5\2\1\0\2\2\3\0\3\2\13\0\1\11"+
"\27\0";

private static int [] zzUnpackAction() { int [] result = new int[145];
int offset = 0;
offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result); return result;
}
private static int zzUnpackAction(String packed, int offset, int [] result) { int i = 0;	/* index in packed string */
int j = offset; /* index in unpacked array */ int l = packed.length();
while (i < l) {
int count = packed.charAt(i++); int value = packed.charAt(i++);
do result[j++] = value; while (--count > 0);
}
return j;
}
private static final int [] ZZ_ROWMAP = zzUnpackRowMap(); private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\50"+
"\0\u0118\0\u0140\0\u0168\0\u0190\0\u01b8\0\50\0\u01e0\0\u0208"+ "\0\u0230\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320\0\u0348"+ "\0\u0370\0\310\0\50\0\u0398\0\50\0\u03c0\0\u03e8\0\u0410"+ "\0\u0438\0\120\0\u0460\0\u0488\0\u04b0\0\u04d8\0\u0500\0\u0528"+ "\0\u0550\0\u0578\0\u05a0\0\u05c8\0\u05f0\0\u0618\0\u0320\0\50"+ "\0\310\0\u0640\0\u0668\0\u0690\0\u06b8\0\u06e0\0\u0708\0\u0730"+ "\0\u0758\0\u0780\0\u07a8\0\u07d0\0\u07f8\0\u0820\0\u0848\0\u0870"+ "\0\u0898\0\u08c0\0\u08e8\0\u0910\0\u0938\0\u0960\0\u0988\0\u09b0"+ "\0\u09d8\0\u0a00\0\u0a28\0\u0a50\0\u0a78\0\u0aa0\0\u0ac8\0\u0af0"+ "\0\u0b18\0\u0b40\0\u0b68\0\u0b90\0\u0bb8\0\u0be0\0\u0c08\0\u0c30"+ "\0\u0c58\0\u0c80\0\u0ca8\0\u0cd0\0\u0cf8\0\u0d20\0\u0d48\0\u0d70"+ "\0\u0d98\0\u0dc0\0\u0de8\0\u0e10\0\u0e38\0\u0e60\0\u0e88\0\u0eb0"+ "\0\u0ed8\0\u0f00\0\u0f28\0\u0f50\0\u0f78\0\u0fa0\0\u0fc8\0\u0ff0"+
"\0\u1018\0\u1040\0\u1068\0\u1090\0\u10b8\0\u10e0\0\u1108\0\u1130"+ "\0\u1158\0\50\0\u1180\0\u11a8\0\u11d0\0\u11f8\0\u1220\0\u1248"+ "\0\u1270\0\u1298\0\u12c0\0\u12e8\0\u1310\0\u1338\0\u1360\0\u1388"+ "\0\u13b0\0\u13d8\0\u1400\0\u1428\0\u1450\0\u1478\0\u14a0\0\u14c8"+ "\0\u14f0";
private static int [] zzUnpackRowMap() { int [] result = new int[145];
int offset = 0;
offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result); return result;
}
private static int zzUnpackRowMap(String packed, int offset, int [] result) { int i = 0; /* index in packed string */
int j = offset; /* index in unpacked array */ int l = packed.length();
while (i < l) {
int high = packed.charAt(i++) << 16; result[j++] = high | packed.charAt(i++);
}
return j;
}
private static final int [] ZZ_TRANS = zzUnpackTrans(); private static final String ZZ_TRANS_PACKED_0 = "\1\2\1\3\1\4\3\2\1\5\1\6\1\2\1\7"+ "\1\10\1\11\1\12\1\2\1\13\1\14\1\15\1\16"+ "\1\17\5\3\1\20\1\21\1\22\2\3\1\23\1\3"+ "\1\24\1\3\1\7\1\25\3\3\1\7\52\0\2\3"+ "\1\26\12\0\3\3\1\0\17\3\1\0\4\3\4\0"+ "\1\4\3\0\1\27\57\0\1\30\1\0\1\31\27\0"+ "\7\32\1\33\1\34\1\0\36\32\11\0\1\7\27\0"+ "\1\7\4\0\1\7\15\0\2\35\47\0\1\35\33\0"+ "\2\3\1\26\12\0\3\3\1\0\2\3\1\36\6\3"+ "\1\37\5\3\1\0\4\3\3\0\2\3\1\26\12\0"+ "\3\3\1\0\11\3\1\40\5\3\1\0\4\3\3\0"+ "\2\3\1\26\12\0\3\3\1\0\6\3\1\41\10\3"+ "\1\0\2\3\1\42\1\3\3\0\2\3\1\26\12\0"+ "\3\3\1\0\1\3\1\43\2\3\1\44\11\3\1\45"+ "\1\0\4\3\3\0\2\3\1\26\12\0\1\46\1\3"+ "\1\47\1\0\17\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\1\50\2\3\1\0\17\3\1\0\4\3\3\0"+ "\2\3\1\26\12\0\2\3\1\51\1\0\17\3\1\0"+ "\4\3\3\0\2\3\1\26\12\0\1\52\2\3\1\0"+ "\2\3\1\53\14\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\1\54\16\3\1\0\4\3\3\0"+ "\2\3\1\26\12\0\3\3\1\0\3\3\1\55\13\3"+ "\1\0\4\3\6\0\1\56\45\0\1\57\64\0\1\31"+ "\36\0\1\60\41\0\7\32\1\61\1\34\1\0\36\32"+ "\1\0\2\3\1\26\12\0\3\3\1\0\10\3\1\62"+ "\6\3\1\0\4\3\3\0\2\3\1\26\12\0\3\3"+ "\1\0\10\3\1\63\6\3\1\0\4\3\3\0\2\3"+ "\1\26\12\0\3\3\1\0\3\3\1\64\13\3\1\0"+ "\4\3\3\0\2\3\1\26\1\65\11\0\3\3\1\0"+ "\17\3\1\0\4\3\3\0\2\3\1\26\12\0\3\3"+ "\1\0\2\3\1\66\14\3\1\0\4\3\3\0\2\3"+ "\1\26\12\0\3\3\1\0\2\3\1\67\14\3\1\0"+ "\4\3\3\0\2\3\1\26\12\0\3\3\1\0\2\3"+ "\1\70\14\3\1\0\4\3\3\0\2\3\1\26\12\0"+ "\3\3\1\0\7\3\1\71\7\3\1\0\4\3\3\0"+ "\2\3\1\26\12\0\3\3\1\0\10\3\1\72\6\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\6\3\1\73\10\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\13\3\1\74\3\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\3\3\1\0\11\3\1\75"+
"\5\3\1\0\4\3\3\0\2\3\1\26\12\0\2\3"+ "\1\76\1\0\17\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\5\3\1\77\11\3\1\0\3\3"+ "\1\100\3\0\2\3\1\26\12\0\3\3\1\0\5\3"+ "\1\101\11\3\1\0\4\3\7\0\1\3\43\0\2\3"+ "\1\26\12\0\2\3\1\102\1\0\17\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\2\3\1\42\1\0\17\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\10\3\1\103\6\3\1\0\4\3\37\0\1\104\13\0"+ "\2\3\1\26\12\0\3\3\1\0\3\3\1\105\13\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\1\106\16\3\1\0\4\3\3\0\2\3\1\26\12\0"+ "\1\3\1\107\1\3\1\0\17\3\1\0\4\3\3\0"+ "\2\3\1\26\12\0\3\3\1\0\4\3\1\110\12\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\3\3\1\111\13\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\1\112\16\3\1\0\4\3\3\0"+ "\2\3\1\26\12\0\3\3\1\0\2\3\1\53\14\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\4\3\1\113\12\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\7\3\1\114\7\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\1\115\2\3\1\0\17\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\3\3\1\116\13\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\4\3\1\117\12\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\3\3\1\0\11\3\1\120"+ "\5\3\1\0\4\3\3\0\2\3\1\26\12\0\3\3"+ "\1\0\1\121\16\3\1\0\4\3\20\0\1\122\32\0"+ "\2\3\1\26\12\0\3\3\1\0\2\3\1\123\14\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\15\3\1\124\1\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\12\3\1\125\4\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\3\3\1\0\2\3\1\126"+ "\14\3\1\0\4\3\3\0\2\3\1\26\12\0\3\3"+ "\1\0\1\42\16\3\1\0\4\3\3\0\2\3\1\26"+ "\12\0\3\3\1\0\4\3\1\127\12\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\2\3\1\130\1\0\1\131"+ "\16\3\1\0\4\3\3\0\2\3\1\26\12\0\3\3"+ "\1\0\13\3\1\132\3\3\1\0\4\3\3\0\2\3"+ "\1\26\12\0\3\3\1\0\2\3\1\133\14\3\1\0"+ "\4\3\3\0\2\3\1\26\12\0\1\42\2\3\1\0"+ "\17\3\1\0\4\3\3\0\2\3\1\26\12\0\3\3"+ "\1\0\2\3\1\134\14\3\1\0\4\3\3\0\2\3"+ "\1\26\12\0\3\3\1\0\1\135\16\3\1\0\4\3"+ "\3\0\2\3\1\26\1\136\11\0\3\3\1\0\17\3"+ "\1\0\4\3\35\0\1\137\15\0\2\3\1\26\1\140"+ "\11\0\3\3\1\0\17\3\1\0\4\3\3\0\2\3"+ "\1\26\12\0\2\3\1\141\1\0\17\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\3\3\1\0\1\142\16\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\1\131\16\3\1\0\4\3\3\0\2\3\1\26\12\0"+ "\1\143\2\3\1\0\17\3\1\0\4\3\3\0\2\3"+ "\1\26\12\0\3\3\1\0\11\3\1\144\5\3\1\0"+ "\4\3\3\0\2\3\1\26\12\0\3\3\1\0\2\3"+ "\1\42\14\3\1\0\4\3\3\0\2\3\1\26\12\0"+ "\2\3\1\145\1\0\17\3\1\0\4\3\3\0\2\3"+ "\1\26\1\146\11\0\3\3\1\0\17\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\1\147\2\3\1\0\17\3"+ "\1\0\4\3\3\0\2\3\1\26\12\0\3\3\1\0"+ "\2\3\1\150\14\3\1\0\4\3\37\0\1\151\50\0"+ "\1\152\37\0\1\153\22\0\2\3\1\26\12\0\3\3"+ "\1\0\7\3\1\154\7\3\1\0\4\3\3\0\2\3"+ "\1\26\12\0\3\3\1\0\2\3\1\155\14\3\1\0"+
"\4\3\3\0\2\3\1\26\12\0\3\3\1\0\2\3"+ "\1\72\14\3\1\0\4\3\3\0\2\3\1\26\12\0"+ "\3\3\1\0\10\3\1\116\6\3\1\0\4\3\3\0"+ "\2\3\1\26\12\0\3\3\1\0\11\3\1\156\5\3"+ "\1\0\4\3\32\0\1\157\20\0\2\3\1\26\1\160"+ "\11\0\3\3\1\0\17\3\1\0\4\3\3\0\2\3"+ "\1\26\1\161\11\0\3\3\1\0\17\3\1\0\4\3"+ "\20\0\1\162\50\0\1\163\52\0\1\164\26\0\2\3"+ "\1\26\1\165\11\0\3\3\1\0\17\3\1\0\4\3"+ "\3\0\2\3\1\26\12\0\3\3\1\0\17\3\1\161"+ "\4\3\3\0\2\3\1\26\12\0\3\3\1\0\4\3"+ "\1\63\12\3\1\0\4\3\24\0\1\166\2\0\1\167"+ "\54\0\1\170\51\0\1\171\43\0\1\172\52\0\1\173"+ "\37\0\1\174\56\0\1\175\60\0\1\176\37\0\1\176"+ "\32\0\1\177\47\0\1\200\57\0\1\201\41\0\1\202"+ "\51\0\1\203\52\0\1\204\26\0\1\205\67\0\1\172"+ "\41\0\1\206\60\0\1\207\24\0\1\210\73\0\1\211"+ "\57\0\1\212\13\0\1\136\65\0\1\172\54\0\1\213"+ "\36\0\1\172\55\0\1\214\50\0\1\215\41\0\1\216"+ "\70\0\1\217\43\0\1\211\35\0\1\220\62\0\1\221"+ "\34\0\1\211\25\0";
private static int [] zzUnpackTrans() { int [] result = new int[5400];
int offset = 0;
offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result); return result;
}
private static int zzUnpackTrans(String packed, int offset, int [] result) { int i = 0;	/* index in packed string */
int j = offset; /* index in unpacked array */ int l = packed.length();
while (i < l) {
int count = packed.charAt(i++); int value = packed.charAt(i++); value--;
do result[j++] = value; while (--count > 0);
}
return j;
}
private static final int ZZ_UNKNOWN_ERROR = 0; private static final int ZZ_NO_MATCH = 1;
private static final int ZZ_PUSHBACK_2BIG = 2; private static final String ZZ_ERROR_MSG[] = { "Unknown internal scanner error",
"Error: could not match input",
"Error: pushback value was too large"
};
private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute(); private static final String ZZ_ATTRIBUTE_PACKED_0 =
"\1\0\1\11\5\1\1\11\5\1\1\11\7\1\5\0"+ "\1\11\1\0\1\11\20\1\1\0\1\1\1\11\4\1"+ "\1\0\16\1\1\0\15\1\1\0\13\1\3\0\5\1"+ "\1\0\2\1\3\0\3\1\13\0\1\11\27\0";
private static int [] zzUnpackAttribute() { int [] result = new int[145];
int offset = 0;
offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result); return result;
}
private static int zzUnpackAttribute(String packed, int offset, int [] result) { int i = 0;	/* index in packed string */
int j = offset; /* index in unpacked array */ int l = packed.length();
while (i < l) {
int count = packed.charAt(i++); int value = packed.charAt(i++);
do result[j++] = value; while (--count > 0);
}
return j;
}
private java.io.Reader zzReader; private int zzState;
private int zzLexicalState = YYINITIAL;
private char zzBuffer[] = new char[ZZ_BUFFERSIZE]; private int zzMarkedPos;
private int zzCurrentPos; private int zzStartRead; private int zzEndRead; private int yyline;
private int yychar; private int yycolumn;
private boolean zzAtBOL = true; private boolean zzAtEOF; private boolean zzEOFDone;
private int zzFinalHighSurrogate = 0;
private void imprimir(String token, String lexema) { System.out.println(lexema + " ==>> " + token);
}
Lexer(java.io.Reader in) { this.zzReader = in;
}
private static char [] zzUnpackCMap(String packed) { char [] map = new char[0x110000];
int i = 0; /* index in packed string */ int j = 0; /* index in unpacked array */ while (i < 172) {
int count = packed.charAt(i++); char value = packed.charAt(i++);
do map[j++] = value; while (--count > 0);
}
return map;
}
private boolean zzRefill() throws java.io.IOException { if (zzStartRead > 0) {
zzEndRead += zzFinalHighSurrogate; zzFinalHighSurrogate = 0; System.arraycopy(zzBuffer, zzStartRead,
zzBuffer, 0,
zzEndRead-zzStartRead); zzEndRead-= zzStartRead; zzCurrentPos-= zzStartRead; zzMarkedPos-= zzStartRead; zzStartRead = 0;
}
if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) { char newBuffer[] = new char[zzBuffer.length*2]; System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length); zzBuffer = newBuffer;
zzEndRead += zzFinalHighSurrogate; zzFinalHighSurrogate = 0;
}
int requested = zzBuffer.length - zzEndRead;
int numRead = zzReader.read(zzBuffer, zzEndRead, requested); if (numRead == 0) {
throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
}
if (numRead > 0) { zzEndRead += numRead;
if (numRead == requested) {
if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
--zzEndRead; zzFinalHighSurrogate = 1;
}
}
}
return true;
}
public final void yyclose() throws java.io.IOException { zzAtEOF = true;	/* indicate end of file */ zzEndRead = zzStartRead;  /* invalidate buffer	*/
if (zzReader != null) zzReader.close();
}
public final void yyreset(java.io.Reader reader) { zzReader = reader;
zzAtBOL = true; zzAtEOF = false; zzEOFDone = false;
zzEndRead = zzStartRead = 0; zzCurrentPos = zzMarkedPos = 0; zzFinalHighSurrogate = 0;
yyline = yychar = yycolumn = 0; zzLexicalState = YYINITIAL;
if (zzBuffer.length > ZZ_BUFFERSIZE) zzBuffer = new char[ZZ_BUFFERSIZE];
}
public final int yystate() { return zzLexicalState;
}
public final void yybegin(int newState) { zzLexicalState = newState;
}
public final String yytext() {
return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
}
public final char yycharat(int pos) { return zzBuffer[zzStartRead+pos];
}
public final int yylength() {
return zzMarkedPos-zzStartRead;
}
private void zzScanError(int errorCode) { String message;
try {
message = ZZ_ERROR_MSG[errorCode];
}
catch (ArrayIndexOutOfBoundsException e) {
message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
}
throw new Error(message);
}
public void yypushback(int number) { if ( number > yylength() )
zzScanError(ZZ_PUSHBACK_2BIG); zzMarkedPos -= number;
}
public Token yylex() throws java.io.IOException { int zzInput;
int zzAction;
int zzCurrentPosL; int zzMarkedPosL;
int zzEndReadL = zzEndRead; char [] zzBufferL = zzBuffer; char [] zzCMapL = ZZ_CMAP; int [] zzTransL = ZZ_TRANS;
int [] zzRowMapL = ZZ_ROWMAP; int [] zzAttrL = ZZ_ATTRIBUTE; while (true) {
zzMarkedPosL = zzMarkedPos; zzAction = -1;
zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL; zzState = ZZ_LEXSTATE[zzLexicalState];
int zzAttributes = zzAttrL[zzState]; if ( (zzAttributes & 1) == 1 ) { zzAction = zzState;
}
zzForAction: { while (true) {
if (zzCurrentPosL < zzEndReadL) {
zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL); zzCurrentPosL += Character.charCount(zzInput);
}
else if (zzAtEOF) { zzInput = YYEOF; break zzForAction;
}
else {
zzCurrentPos = zzCurrentPosL; zzMarkedPos = zzMarkedPosL; boolean eof = zzRefill(); zzCurrentPosL = zzCurrentPos; zzMarkedPosL = zzMarkedPos; zzBufferL	= zzBuffer; zzEndReadL		= zzEndRead;
if (eof) {
zzInput = YYEOF; break zzForAction;
}
else {
zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL); zzCurrentPosL += Character.charCount(zzInput);
}
}
int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ]; if (zzNext == -1) break zzForAction;
zzState = zzNext;
zzAttributes = zzAttrL[zzState]; if ( (zzAttributes & 1) == 1 ) { zzAction = zzState;
zzMarkedPosL = zzCurrentPosL;
if ( (zzAttributes & 8) == 8 ) break zzForAction;
}
}
}
zzMarkedPos = zzMarkedPosL;
if (zzInput == YYEOF && zzStartRead == zzCurrentPos) { zzAtEOF = true;
{
return null;
}
}
else {
switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) { case 1:
{ imprimir ("<<< CARACTER INVALIDO!!! >>>	",yytext()); return ERROR;
}
case 12: break;
case 2:
{ imprimir("IDENTIFICADOR -----> ", yytext()); return ID;
}
case 13: break;
case 3:
{ imprimir("NUMERO INTEIRO -----> ", yytext()); return INT;
}
case 14: break;
case 4:
{ imprimir("SIMBOLOS ESPEC.-----> ", yytext()); return SIMB_ESPEC;
}
case 15: break;
case 5:
{ return BRANCO;
}
case 16: break;
case 6:
{ imprimir("OPERADOR ARITM.-----> ", yytext()); return OPARITM;
}
case 17: break;
case 7:
{ imprimir("OPERADOR COMP. -----> ", yytext()); return OPCOMP;
}
case 18: break;
case 8:
{ imprimir("LITERAL	-----> ", yytext()); return CTE;
}
case 19: break;
case 9:
{ imprimir("PALAVRA-CHAVE -----> ", yytext()); return PL;
}
case 20: break;
case 10:
{ imprimir("NUMERO DECIMAL -----> ", yytext()); return DEC;
}
case 21: break;
case 11:
{ imprimir("OPERADOR LOGICOS ---> ", yytext()); return OPLOG;
}
case 22: break; default:
zzScanError(ZZ_NO_MATCH);
}
}
}
}
}
