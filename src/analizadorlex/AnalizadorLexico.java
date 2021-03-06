/* The following code was generated by JFlex 1.5.0-SNAPSHOT */

/*Seccion de codigo de usuario*/
package analizadorlex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//clase de los token devueltos
class Yytoken {
    Yytoken (int numToken,String token, String tipo, int linea, int columna){
        //Contador para el número de tokens reconocidos
        this.numToken = numToken;
        //String del token reconocido
        this.token = new String(token);
        //Tipo de componente léxico encontrado
        this.tipo = tipo;
        //Número de linea
        this.linea = linea;
        //Columna donde empieza el primer carácter del token
        this.columna = columna;
    }
    //Métodos de los atributos de la clase
    public int numToken;
    public String token;
    public String tipo;
    public int linea;
    public int columna;
    //Metodo que devuelve los datos necesarios que escribiremos en un archive de salida
    public String toString() {
        return "Token #"+numToken+": "+token+" C.Lexico: "+tipo+" ["+linea
        + "," +columna + "]";
    }
}

/* Seccion de opciones y declaraciones de JFlex */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>alexico.flex</tt>
 */
public class AnalizadorLexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\4\2\0\1\5\22\0\1\3\1\0\1\6\5\0\1\53"+
    "\1\54\1\10\1\45\1\60\1\7\1\63\1\47\12\2\1\63\1\57"+
    "\1\50\1\46\1\55\1\0\1\61\1\1\1\14\2\1\1\23\1\25"+
    "\2\1\1\11\2\1\1\24\3\1\1\31\2\1\1\17\1\27\4\1"+
    "\1\30\1\1\3\0\1\56\1\26\1\0\1\33\1\1\1\32\1\41"+
    "\1\35\1\36\1\22\1\37\1\21\2\1\1\16\1\1\1\12\1\15"+
    "\1\42\1\1\1\20\1\34\1\13\1\44\1\40\1\43\3\1\1\51"+
    "\1\0\1\52\1\62\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\0\1\5\1\6"+
    "\15\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\0\1\26\1\0\6\1\1\27\4\1\1\30\1\1"+
    "\1\31\4\1\1\32\3\1\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\4\1\1\42\13\1\1\43\1\44"+
    "\1\45\1\46\5\1\1\47\1\50\1\51\1\1\1\52"+
    "\2\1\1\0\2\1\1\53\1\54\1\55\1\56\1\0"+
    "\1\1\1\57\1\0\1\1\1\0\1\60\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\234\0\320\0\u0104\0\u0138"+
    "\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\234\0\u04ac\0\234\0\234\0\234\0\234\0\234\0\234"+
    "\0\234\0\234\0\234\0\234\0\234\0\u0138\0\234\0\u016c"+
    "\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\64\0\u0618"+
    "\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\64\0\u0750\0\u0784"+
    "\0\u07b8\0\u07ec\0\64\0\u0820\0\u0854\0\u0888\0\234\0\234"+
    "\0\234\0\234\0\64\0\64\0\64\0\u08bc\0\u08f0\0\u0924"+
    "\0\u0958\0\64\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90"+
    "\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\64\0\64\0\64"+
    "\0\64\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\64\0\64"+
    "\0\64\0\u0ccc\0\64\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0"+
    "\0\64\0\64\0\64\0\64\0\u0e04\0\u0e38\0\64\0\u0e6c"+
    "\0\u0ea0\0\u0ed4\0\64\0\234";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\2\1\21\4\2\1\0\3\2\1\22\2\2\1\23"+
    "\1\24\3\2\1\25\1\26\1\2\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\0\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\0\2\2\6\0\15\2"+
    "\1\0\16\2\21\0\1\3\151\0\1\5\60\0\3\7"+
    "\2\0\1\45\2\0\15\7\1\0\16\7\20\0\3\46"+
    "\3\0\1\47\1\0\15\46\1\0\16\46\20\0\3\50"+
    "\4\0\1\47\15\50\1\0\16\50\20\0\2\2\6\0"+
    "\1\2\1\51\13\2\1\0\16\2\20\0\2\2\6\0"+
    "\4\2\1\52\10\2\1\0\6\2\1\53\7\2\20\0"+
    "\2\2\6\0\7\2\1\54\5\2\1\0\10\2\1\55"+
    "\5\2\20\0\2\2\6\0\4\2\1\56\10\2\1\0"+
    "\16\2\20\0\2\2\6\0\15\2\1\0\7\2\1\57"+
    "\6\2\20\0\2\2\6\0\4\2\1\60\10\2\1\0"+
    "\6\2\1\61\7\2\20\0\2\2\6\0\2\2\1\62"+
    "\7\2\1\63\2\2\1\0\16\2\20\0\2\2\6\0"+
    "\1\2\1\64\13\2\1\0\5\2\1\65\1\2\1\66"+
    "\6\2\20\0\2\2\6\0\5\2\1\67\7\2\1\0"+
    "\4\2\1\70\11\2\20\0\2\2\6\0\5\2\1\71"+
    "\7\2\1\0\5\2\1\72\10\2\20\0\2\2\6\0"+
    "\10\2\1\73\4\2\1\0\4\2\1\74\11\2\20\0"+
    "\2\2\6\0\4\2\1\75\10\2\1\0\16\2\20\0"+
    "\2\2\6\0\15\2\1\0\10\2\1\76\5\2\65\0"+
    "\1\77\72\0\1\100\15\0\1\101\36\0\1\102\16\0"+
    "\2\2\6\0\2\2\1\103\12\2\1\0\16\2\20\0"+
    "\2\2\6\0\2\2\1\104\12\2\1\0\16\2\20\0"+
    "\2\2\6\0\15\2\1\0\14\2\1\105\1\2\20\0"+
    "\2\2\6\0\15\2\1\0\15\2\1\106\20\0\2\2"+
    "\6\0\15\2\1\0\6\2\1\107\7\2\20\0\2\2"+
    "\6\0\4\2\1\110\10\2\1\0\16\2\20\0\2\2"+
    "\6\0\4\2\1\111\10\2\1\0\16\2\20\0\2\2"+
    "\6\0\2\2\1\112\12\2\1\0\16\2\20\0\2\2"+
    "\6\0\7\2\1\113\5\2\1\0\16\2\20\0\2\2"+
    "\6\0\13\2\1\114\1\2\1\0\16\2\20\0\2\2"+
    "\6\0\15\2\1\0\10\2\1\115\5\2\20\0\2\2"+
    "\6\0\15\2\1\0\11\2\1\116\4\2\20\0\2\2"+
    "\6\0\15\2\1\0\4\2\1\117\11\2\20\0\2\2"+
    "\6\0\15\2\1\0\5\2\1\120\10\2\20\0\2\2"+
    "\6\0\15\2\1\0\5\2\1\121\10\2\20\0\2\2"+
    "\6\0\15\2\1\0\4\2\1\122\11\2\20\0\2\2"+
    "\6\0\5\2\1\123\7\2\1\0\16\2\20\0\2\2"+
    "\6\0\4\2\1\124\10\2\1\0\16\2\20\0\2\2"+
    "\6\0\10\2\1\125\4\2\1\0\16\2\20\0\2\2"+
    "\6\0\15\2\1\0\6\2\1\126\7\2\20\0\2\2"+
    "\6\0\1\2\1\127\13\2\1\0\16\2\20\0\2\2"+
    "\6\0\5\2\1\130\7\2\1\0\16\2\20\0\2\2"+
    "\6\0\15\2\1\0\13\2\1\131\2\2\20\0\2\2"+
    "\6\0\10\2\1\132\4\2\1\0\16\2\20\0\2\2"+
    "\6\0\14\2\1\133\1\0\16\2\20\0\2\2\6\0"+
    "\15\2\1\0\6\2\1\134\7\2\20\0\2\2\6\0"+
    "\4\2\1\135\10\2\1\0\16\2\20\0\2\2\6\0"+
    "\15\2\1\0\5\2\1\136\10\2\20\0\2\2\6\0"+
    "\15\2\1\0\6\2\1\137\7\2\20\0\2\2\6\0"+
    "\15\2\1\0\6\2\1\140\7\2\20\0\2\2\6\0"+
    "\15\2\1\0\3\2\1\141\12\2\20\0\2\2\6\0"+
    "\15\2\1\0\5\2\1\142\10\2\20\0\2\2\6\0"+
    "\5\2\1\143\7\2\1\0\16\2\20\0\2\2\6\0"+
    "\5\2\1\144\7\2\1\0\16\2\20\0\2\2\6\0"+
    "\1\2\1\145\13\2\1\0\16\2\20\0\2\2\6\0"+
    "\15\2\1\146\16\2\20\0\2\2\6\0\7\2\1\147"+
    "\5\2\1\0\16\2\20\0\2\2\6\0\10\2\1\150"+
    "\4\2\1\0\16\2\20\0\2\2\6\0\15\2\1\0"+
    "\5\2\1\151\10\2\20\0\2\2\6\0\15\2\1\0"+
    "\6\2\1\152\7\2\20\0\2\2\6\0\15\2\1\0"+
    "\6\2\1\153\7\2\20\0\2\2\6\0\11\2\1\154"+
    "\3\2\1\0\16\2\46\0\1\155\35\0\2\2\6\0"+
    "\10\2\1\156\4\2\1\0\16\2\20\0\2\2\6\0"+
    "\15\2\1\0\12\2\1\157\3\2\47\0\1\160\34\0"+
    "\2\2\6\0\2\2\1\161\12\2\1\0\16\2\50\0"+
    "\1\162\33\0\2\2\6\0\15\2\1\0\5\2\1\163"+
    "\10\2\42\0\1\164\40\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3848];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\1\2\11\1\1\1\0\21\1\1\11\1\1"+
    "\13\11\1\0\1\11\1\0\26\1\4\11\43\1\1\0"+
    "\6\1\1\0\2\1\1\0\1\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	
    private int contador;
    private ArrayList<Yytoken> tokens;

	private void writeOutputFile() throws IOException{
			String filename = "file.out";
			BufferedWriter out = new BufferedWriter(
				new FileWriter(filename));
            System.out.println("\n*** Tokens guardados en archivo ***\n");
			for(Yytoken t: this.tokens){
				System.out.println(t);
				out.write(t + "\n");
			}
			out.close();
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
      contador = 0;
	tokens = new ArrayList<Yytoken>();
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 148) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    	try{
		this.writeOutputFile();
        System.exit(0);
	}catch(IOException ioe){
		ioe.printStackTrace();
	}

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Yytoken nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"id",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 50: break;
        case 2: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"num",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 51: break;
        case 3: 
          { //ignorar
          }
        case 52: break;
        case 4: 
          { //contador++;
    //Yytoken t = new Yytoken(contador,"","fin_linea",yyline,yycolumn);
    //tokens.add(t);
    //return t;
          }
        case 53: break;
        case 5: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"resta",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 54: break;
        case 6: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"multiplicacion",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 55: break;
        case 7: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"suma",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 56: break;
        case 8: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asigna",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 57: break;
        case 9: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"division",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 58: break;
        case 10: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"menora",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 59: break;
        case 11: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"llaveizquierda",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 60: break;
        case 12: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"llavederecha",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 61: break;
        case 13: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"parentesisizquierdo",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 62: break;
        case 14: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"parentesisderecho",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 63: break;
        case 15: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"potencia",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 64: break;
        case 16: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"puntoycoma",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 65: break;
        case 17: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"coma",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 66: break;
        case 18: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"arroba",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 67: break;
        case 19: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"circunflejo",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 68: break;
        case 20: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"dospuntos",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 69: break;
        case 21: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"cadena",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 70: break;
        case 22: 
          { //    contador++;
//    Yytoken t = new Yytoken(contador,yytext(),"comentariotipouno",yyline,yycolumn);
//    tokens.add(t);
//    return t;
          }
        case 71: break;
        case 23: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"of",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 72: break;
        case 24: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"in",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 73: break;
        case 25: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"if",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 74: break;
        case 26: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"fi",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 75: break;
        case 27: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asigna_suma",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 76: break;
        case 28: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asignacionderecha",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 77: break;
        case 29: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"asignacionizquierda",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 78: break;
        case 30: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"menoroiguala",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 79: break;
        case 31: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_entero",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 80: break;
        case 32: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"not",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 81: break;
        case 33: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"new",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 82: break;
        case 34: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"let",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 83: break;
        case 35: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"true",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 84: break;
        case 36: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"then",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 85: break;
        case 37: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_booleano",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 86: break;
        case 38: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"loop",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 87: break;
        case 39: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"case",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 88: break;
        case 40: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"else",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 89: break;
        case 41: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"esac",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 90: break;
        case 42: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"pool",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 91: break;
        case 43: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"class",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 92: break;
        case 44: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"false",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 93: break;
        case 45: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"while",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 94: break;
        case 46: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_cadena",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 95: break;
        case 47: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"isvoid",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 96: break;
        case 48: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"inherits",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 97: break;
        case 49: 
          { contador++;
    Yytoken t = new Yytoken(contador,yytext(),"tipo_this",yyline,yycolumn);
    tokens.add(t);
    return t;
          }
        case 98: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
