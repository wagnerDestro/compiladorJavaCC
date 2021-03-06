/* Generated By:JavaCC: Do not edit this line. CompiladorAula.java */
public class CompiladorAula implements CompiladorAulaConstants {

  public static void main(final String[] args) throws ParseException
  {
    CompiladorAula parser = new CompiladorAula(System.in);
    while (true)
    {
      System.out.println("Lan?a o c?digo a?:");
      try
      {
        switch (CompiladorAula.main())
        {
          case 0 :
          System.out.println("Boa! Menor ta ligeiro na linguagem dos cria.");
          break;
          case 1 :
          System.out.println("Terminou.");
          break;
          default :
          break;
        }
      }
      catch (Exception e)
      {
        System.out.println("Ta lombrado menor?");
        System.out.println("                     .                          \r\n"
        		+ "                     M                          \r\n"
        		+ "                    dM                          \r\n"
        		+ "                    MMr                         \r\n"
        		+ "                   4MMML                  .     \r\n"
        		+ "                   MMMMM.                xf     \r\n"
        		+ "   .              \"MMMMM               .MM-     \r\n"
        		+ "    Mh..          +MMMMMM            .MMMM      \r\n"
        		+ "    .MMM.         .MMMMML.          MMMMMh      \r\n"
        		+ "     )MMMh.        MMMMMM         MMMMMMM       \r\n"
        		+ "      3MMMMx.     'MMMMMMf      xnMMMMMM\"       \r\n"
        		+ "      '*MMMMM      MMMMMM.     nMMMMMMP\"        \r\n"
        		+ "        *MMMMMx    \"MMMMM\\    .MMMMMMM=         \r\n"
        		+ "         *MMMMMh   \"MMMMM\"   JMMMMMMP           \r\n"
        		+ "           MMMMMM   3MMMM.  dMMMMMM            .\r\n"
        		+ "            MMMMMM  \"MMMM  .MMMMM(        .nnMP\"\r\n"
        		+ "=..          *MMMMx  MMM\"  dMMMM\"    .nnMMMMM*  \r\n"
        		+ "  \"MMn...     'MMMMr 'MM   MMM\"   .nMMMMMMM*\"   \r\n"
        		+ "   \"4MMMMnn..   *MMM  MM  MMP\"  .dMMMMMMM\"\"     \r\n"
        		+ "     ^MMMMMMMMx.  *ML \"M .M*  .MMMMMM**\"        \r\n"
        		+ "        *PMMMMMMhn. *x > M  .MMMM**\"\"           \r\n"
        		+ "           \"\"**MMMMhx/.h/ .=*\"                  \r\n"
        		+ "                    .3P\"%....                   \r\n"
        		+ "                  nP\"     \"*MMnx\n\n");
        System.out.println(e.getMessage());
        CompiladorAula.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public int main() throws ParseException {
    jj_consume_token(INICIOPROGRAMA);
    jj_consume_token(ABREBLOCO);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEIRO:
      case BOOLEANA:
      case STRING:
      case NUMERO:
      case IF:
      case FOR:
      case DO:
      case ID:
      case SOMA:
      case SUBTRACAO:
      case MULTIPLICACAO:
      case DIVISAO:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      comando();
    }
    jj_consume_token(FIMBLOCO);
 {if (true) return 0;}
    throw new Error("Missing return statement in function");
  }

  static final public void comando() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
    case ID:
    case SOMA:
    case SUBTRACAO:
    case MULTIPLICACAO:
    case DIVISAO:
      atribuir_ou_expressao();
      break;
    case INTEIRO:
    case BOOLEANA:
    case STRING:
      declaracaoVariavel();
      break;
    case IF:
      if_funcao();
      break;
    case FOR:
      for_funcao();
      break;
    case DO:
      do_funcao();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void atribuir_ou_expressao() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
    case SOMA:
    case SUBTRACAO:
    case MULTIPLICACAO:
    case DIVISAO:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        jj_consume_token(ID);
        atribuicao();
        break;
      case SOMA:
      case SUBTRACAO:
      case MULTIPLICACAO:
      case DIVISAO:
        expressao_matematica();
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case NUMERO:
      jj_consume_token(NUMERO);
      expressao_matematica();
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PONTOVIRGULA);
  }

  static final public void for_funcao() throws ParseException {
    jj_consume_token(FOR);
    variavel_for();
    jj_consume_token(TO);
    variavel_for();
    jj_consume_token(ABREBLOCO);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEIRO:
      case BOOLEANA:
      case STRING:
      case NUMERO:
      case IF:
      case FOR:
      case DO:
      case ID:
      case SOMA:
      case SUBTRACAO:
      case MULTIPLICACAO:
      case DIVISAO:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_2;
      }
      comando();
    }
    jj_consume_token(FIMBLOCO);
  }

  static final public void variavel_for() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      break;
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void if_funcao() throws ParseException {
    jj_consume_token(IF);
    expressao_logica();
    jj_consume_token(ABREBLOCO);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEIRO:
      case BOOLEANA:
      case STRING:
      case NUMERO:
      case IF:
      case FOR:
      case DO:
      case ID:
      case SOMA:
      case SUBTRACAO:
      case MULTIPLICACAO:
      case DIVISAO:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_3;
      }
      comando();
    }
    jj_consume_token(FIMBLOCO);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      jj_consume_token(ELSE);
      jj_consume_token(ABREBLOCO);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INTEIRO:
        case BOOLEANA:
        case STRING:
        case NUMERO:
        case IF:
        case FOR:
        case DO:
        case ID:
        case SOMA:
        case SUBTRACAO:
        case MULTIPLICACAO:
        case DIVISAO:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_4;
        }
        comando();
      }
      jj_consume_token(FIMBLOCO);
      break;
    default:
      jj_la1[8] = jj_gen;
      ;
    }
  }

  static final public void do_funcao() throws ParseException {
    jj_consume_token(DO);
    jj_consume_token(ABREBLOCO);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEIRO:
      case BOOLEANA:
      case STRING:
      case NUMERO:
      case IF:
      case FOR:
      case DO:
      case ID:
      case SOMA:
      case SUBTRACAO:
      case MULTIPLICACAO:
      case DIVISAO:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_5;
      }
      comando();
    }
    jj_consume_token(FIMBLOCO);
    jj_consume_token(TO);
    expressao_logica();
  }

  static final public void expressao_logica() throws ParseException {
    variavel_if();
    operador_logico();
    variavel_if();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
    case OR:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        jj_consume_token(AND);
        break;
      case OR:
        jj_consume_token(OR);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      expressao_logica();
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
  }

  static final public void variavel_if() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      break;
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case PALAVRA:
      jj_consume_token(PALAVRA);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void operador_logico() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MAIOR:
      jj_consume_token(MAIOR);
      break;
    case MENOR:
      jj_consume_token(MENOR);
      break;
    case MENOR_IGUAL:
      jj_consume_token(MENOR_IGUAL);
      break;
    case MAIOR_IGUAL:
      jj_consume_token(MAIOR_IGUAL);
      break;
    case DIFERENTE:
      jj_consume_token(DIFERENTE);
      break;
    case IGUAL:
      jj_consume_token(IGUAL);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void declaracaoVariavel() throws ParseException {
    tipoDado();
    identificador_variaveis();
    jj_consume_token(PONTOVIRGULA);
  }

  static final public void identificador_variaveis() throws ParseException {
    nomeVariavel();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ATRIBUICAO:
      jj_consume_token(ATRIBUICAO);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        jj_consume_token(ID);
        break;
      case NUMERO:
        jj_consume_token(NUMERO);
        break;
      case FALSE:
        jj_consume_token(FALSE);
        break;
      case TRUE:
        jj_consume_token(TRUE);
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VIRGULA:
      declararMais();
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
  }

  static final public void declararMais() throws ParseException {
    label_6:
    while (true) {
      jj_consume_token(VIRGULA);
      nomeVariavel();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ATRIBUICAO:
        atribuicao();
        break;
      default:
        jj_la1[17] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_6;
      }
    }
  }

  static final public void nomeVariavel() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      break;
    case LETRA:
      jj_consume_token(LETRA);
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void atribuicao() throws ParseException {
    jj_consume_token(ATRIBUICAO);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      break;
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    case FALSE:
      jj_consume_token(FALSE);
      break;
    case TRUE:
      jj_consume_token(TRUE);
      break;
    case PALAVRA:
      jj_consume_token(PALAVRA);
      break;
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void tipoDado() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEIRO:
      jj_consume_token(INTEIRO);
      break;
    case BOOLEANA:
      jj_consume_token(BOOLEANA);
      break;
    case STRING:
      jj_consume_token(STRING);
      break;
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void expressao_matematica() throws ParseException {
    operador_matematico();
    extremidade_expressao();
  }

  static final public void extremidade_expressao() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
      break;
    case NUMERO:
      jj_consume_token(NUMERO);
      break;
    default:
      jj_la1[22] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void operador_matematico() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SOMA:
      jj_consume_token(SOMA);
      break;
    case SUBTRACAO:
      jj_consume_token(SUBTRACAO);
      break;
    case MULTIPLICACAO:
      jj_consume_token(MULTIPLICACAO);
      break;
    case DIVISAO:
      jj_consume_token(DIVISAO);
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorAulaTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[24];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x957400,0x957400,0x800000,0x804000,0x957400,0x804000,0x957400,0x957400,0x20000,0x957400,0x0,0x0,0x2804000,0xfc000000,0xe04000,0x800,0x80,0x800,0x80,0x1800000,0x2e04000,0x3400,0x804000,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x3c,0x3c,0x3c,0x3c,0x3c,0x0,0x3c,0x3c,0x0,0x3c,0x3,0x3,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x3c,};
   }

  /** Constructor with InputStream. */
  public CompiladorAula(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CompiladorAula(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorAulaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public CompiladorAula(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorAulaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public CompiladorAula(CompiladorAulaTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorAulaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[38];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 24; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 38; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
