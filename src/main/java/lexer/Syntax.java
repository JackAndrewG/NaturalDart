
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Jan 28 19:24:54 ECT 2022
//----------------------------------------------------

package lexer;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Jan 28 19:24:54 ECT 2022
  */
public class Syntax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Syntax() {super();}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\061\000\002\002\004\000\002\003\011\000\002\003" +
    "\014\000\002\002\003\000\002\002\003\000\002\002\003" +
    "\000\002\004\003\000\002\004\004\000\002\004\003\000" +
    "\002\004\004\000\002\004\003\000\002\004\004\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\007\000\002\005\007\000\002\005\011\000\002\005\003" +
    "\000\002\007\011\000\002\007\007\000\002\007\007\000" +
    "\002\007\007\000\002\010\011\000\002\010\015\000\002" +
    "\012\011\000\002\012\011\000\002\012\011\000\002\012" +
    "\011\000\002\012\011\000\002\012\011\000\002\012\011" +
    "\000\002\012\011\000\002\012\010\000\002\012\010\000" +
    "\002\012\010\000\002\012\010\000\002\012\010\000\002" +
    "\012\010\000\002\012\010\000\002\013\003\000\002\013" +
    "\003\000\002\013\003\000\002\013\003\000\002\011\005" +
    "\000\002\011\005\000\002\011\005\000\002\006\003\000" +
    "\002\006\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\204\000\012\004\004\005\011\006\006\007\010\001" +
    "\002\000\004\032\ufffe\001\002\000\004\032\176\001\002" +
    "\000\004\032\ufffc\001\002\000\004\002\175\001\002\000" +
    "\004\032\012\001\002\000\004\032\ufffd\001\002\000\004" +
    "\022\013\001\002\000\004\023\014\001\002\000\004\024" +
    "\015\001\002\000\016\004\017\005\030\006\021\010\024" +
    "\011\022\032\025\001\002\000\020\004\017\005\030\006" +
    "\021\010\024\011\022\025\174\032\025\001\002\000\004" +
    "\032\154\001\002\000\022\004\ufff7\005\ufff7\006\ufff7\010" +
    "\ufff7\011\ufff7\013\ufff7\025\ufff7\032\ufff7\001\002\000\004" +
    "\032\145\001\002\000\004\022\123\001\002\000\022\004" +
    "\uffef\005\uffef\006\uffef\010\uffef\011\uffef\013\uffef\025\uffef" +
    "\032\uffef\001\002\000\004\022\102\001\002\000\004\014" +
    "\055\001\002\000\022\004\ufffb\005\ufffb\006\ufffb\010\ufffb" +
    "\011\ufffb\013\ufffb\025\ufffb\032\ufffb\001\002\000\022\004" +
    "\ufff9\005\ufff9\006\ufff9\010\ufff9\011\ufff9\013\ufff9\025\ufff9" +
    "\032\ufff9\001\002\000\004\032\031\001\002\000\006\014" +
    "\033\026\032\001\002\000\022\004\ufff4\005\ufff4\006\ufff4" +
    "\010\ufff4\011\ufff4\013\ufff4\025\ufff4\032\ufff4\001\002\000" +
    "\006\031\035\032\034\001\002\000\012\015\041\016\040" +
    "\017\043\020\042\001\002\000\014\015\041\016\040\017" +
    "\043\020\042\026\037\001\002\000\006\031\045\032\044" +
    "\001\002\000\022\004\ufff1\005\ufff1\006\ufff1\010\ufff1\011" +
    "\ufff1\013\ufff1\025\ufff1\032\ufff1\001\002\000\010\030\uffd8" +
    "\031\uffd8\032\uffd8\001\002\000\010\030\uffd9\031\uffd9\032" +
    "\uffd9\001\002\000\010\030\uffd6\031\uffd6\032\uffd6\001\002" +
    "\000\010\030\uffd7\031\uffd7\032\uffd7\001\002\000\004\026" +
    "\047\001\002\000\004\026\046\001\002\000\022\004\uffe4" +
    "\005\uffe4\006\uffe4\010\uffe4\011\uffe4\013\uffe4\025\uffe4\032" +
    "\uffe4\001\002\000\022\004\uffe2\005\uffe2\006\uffe2\010\uffe2" +
    "\011\uffe2\013\uffe2\025\uffe2\032\uffe2\001\002\000\006\031" +
    "\052\032\051\001\002\000\004\026\054\001\002\000\004" +
    "\026\053\001\002\000\022\004\uffe3\005\uffe3\006\uffe3\010" +
    "\uffe3\011\uffe3\013\uffe3\025\uffe3\032\uffe3\001\002\000\022" +
    "\004\uffe1\005\uffe1\006\uffe1\010\uffe1\011\uffe1\013\uffe1\025" +
    "\uffe1\032\uffe1\001\002\000\010\030\056\031\060\032\057" +
    "\001\002\000\012\015\041\016\040\017\043\020\042\001" +
    "\002\000\012\015\041\016\040\017\043\020\042\001\002" +
    "\000\012\015\041\016\040\017\043\020\042\001\002\000" +
    "\006\031\063\032\062\001\002\000\004\026\065\001\002" +
    "\000\004\026\064\001\002\000\022\004\uffdd\005\uffdd\006" +
    "\uffdd\010\uffdd\011\uffdd\013\uffdd\025\uffdd\032\uffdd\001\002" +
    "\000\022\004\uffdb\005\uffdb\006\uffdb\010\uffdb\011\uffdb\013" +
    "\uffdb\025\uffdb\032\uffdb\001\002\000\010\030\067\031\071" +
    "\032\070\001\002\000\004\026\074\001\002\000\004\026" +
    "\073\001\002\000\004\026\072\001\002\000\022\004\uffdc" +
    "\005\uffdc\006\uffdc\010\uffdc\011\uffdc\013\uffdc\025\uffdc\032" +
    "\uffdc\001\002\000\022\004\uffda\005\uffda\006\uffda\010\uffda" +
    "\011\uffda\013\uffda\025\uffda\032\uffda\001\002\000\022\004" +
    "\uffdf\005\uffdf\006\uffdf\010\uffdf\011\uffdf\013\uffdf\025\uffdf" +
    "\032\uffdf\001\002\000\006\030\076\032\077\001\002\000" +
    "\004\026\101\001\002\000\004\026\100\001\002\000\022" +
    "\004\uffde\005\uffde\006\uffde\010\uffde\011\uffde\013\uffde\025" +
    "\uffde\032\uffde\001\002\000\022\004\uffe0\005\uffe0\006\uffe0" +
    "\010\uffe0\011\uffe0\013\uffe0\025\uffe0\032\uffe0\001\002\000" +
    "\012\021\103\030\104\031\106\032\105\001\002\000\004" +
    "\032\116\001\002\000\004\023\113\001\002\000\004\023" +
    "\111\001\002\000\004\023\107\001\002\000\004\026\110" +
    "\001\002\000\022\004\uffec\005\uffec\006\uffec\010\uffec\011" +
    "\uffec\013\uffec\025\uffec\032\uffec\001\002\000\004\026\112" +
    "\001\002\000\022\004\uffeb\005\uffeb\006\uffeb\010\uffeb\011" +
    "\uffeb\013\uffeb\025\uffeb\032\uffeb\001\002\000\004\026\114" +
    "\001\002\000\022\004\uffed\005\uffed\006\uffed\010\uffed\011" +
    "\uffed\013\uffed\025\uffed\032\uffed\001\002\000\006\021\117" +
    "\032\120\001\002\000\006\021\uffd2\032\uffd2\001\002\000" +
    "\004\023\121\001\002\000\006\021\uffd1\032\uffd1\001\002" +
    "\000\004\026\122\001\002\000\022\004\uffee\005\uffee\006" +
    "\uffee\010\uffee\011\uffee\013\uffee\025\uffee\032\uffee\001\002" +
    "\000\004\032\124\001\002\000\004\027\141\001\002\000" +
    "\004\023\126\001\002\000\004\024\127\001\002\000\016" +
    "\004\017\005\030\006\021\010\024\011\022\032\025\001" +
    "\002\000\020\004\017\005\030\006\021\010\024\011\022" +
    "\025\132\032\025\001\002\000\022\004\ufff6\005\ufff6\006" +
    "\ufff6\010\ufff6\011\ufff6\013\ufff6\025\ufff6\032\ufff6\001\002" +
    "\000\024\004\uffea\005\uffea\006\uffea\010\uffea\011\uffea\012" +
    "\135\013\uffea\025\uffea\032\uffea\001\002\000\022\004\ufffa" +
    "\005\ufffa\006\ufffa\010\ufffa\011\ufffa\013\ufffa\025\ufffa\032" +
    "\ufffa\001\002\000\022\004\ufff8\005\ufff8\006\ufff8\010\ufff8" +
    "\011\ufff8\013\ufff8\025\ufff8\032\ufff8\001\002\000\004\024" +
    "\136\001\002\000\016\004\017\005\030\006\021\010\024" +
    "\011\022\032\025\001\002\000\020\004\017\005\030\006" +
    "\021\010\024\011\022\025\140\032\025\001\002\000\022" +
    "\004\uffe9\005\uffe9\006\uffe9\010\uffe9\011\uffe9\013\uffe9\025" +
    "\uffe9\032\uffe9\001\002\000\010\030\142\031\144\032\143" +
    "\001\002\000\004\023\uffd5\001\002\000\004\023\uffd3\001" +
    "\002\000\004\023\uffd4\001\002\000\006\014\147\026\146" +
    "\001\002\000\022\004\ufff3\005\ufff3\006\ufff3\010\ufff3\011" +
    "\ufff3\013\ufff3\025\ufff3\032\ufff3\001\002\000\004\021\150" +
    "\001\002\000\004\032\116\001\002\000\006\021\152\032" +
    "\120\001\002\000\004\026\153\001\002\000\022\004\ufff0" +
    "\005\ufff0\006\ufff0\010\ufff0\011\ufff0\013\ufff0\025\ufff0\032" +
    "\ufff0\001\002\000\006\014\156\026\155\001\002\000\022" +
    "\004\ufff5\005\ufff5\006\ufff5\010\ufff5\011\ufff5\013\ufff5\025" +
    "\ufff5\032\ufff5\001\002\000\006\030\157\032\160\001\002" +
    "\000\014\015\041\016\040\017\043\020\042\026\167\001" +
    "\002\000\012\015\041\016\040\017\043\020\042\001\002" +
    "\000\006\030\162\032\163\001\002\000\004\026\165\001" +
    "\002\000\004\026\164\001\002\000\022\004\uffe5\005\uffe5" +
    "\006\uffe5\010\uffe5\011\uffe5\013\uffe5\025\uffe5\032\uffe5\001" +
    "\002\000\022\004\uffe6\005\uffe6\006\uffe6\010\uffe6\011\uffe6" +
    "\013\uffe6\025\uffe6\032\uffe6\001\002\000\006\030\170\032" +
    "\171\001\002\000\022\004\ufff2\005\ufff2\006\ufff2\010\ufff2" +
    "\011\ufff2\013\ufff2\025\ufff2\032\ufff2\001\002\000\004\026" +
    "\173\001\002\000\004\026\172\001\002\000\022\004\uffe7" +
    "\005\uffe7\006\uffe7\010\uffe7\011\uffe7\013\uffe7\025\uffe7\032" +
    "\uffe7\001\002\000\022\004\uffe8\005\uffe8\006\uffe8\010\uffe8" +
    "\011\uffe8\013\uffe8\025\uffe8\032\uffe8\001\002\000\004\002" +
    "\000\001\002\000\004\002\001\001\002\000\004\022\177" +
    "\001\002\000\004\023\200\001\002\000\004\024\201\001" +
    "\002\000\016\004\017\005\030\006\021\010\024\011\022" +
    "\032\025\001\002\000\020\004\017\005\030\006\021\010" +
    "\024\011\022\013\203\032\025\001\002\000\004\032\204" +
    "\001\002\000\004\026\205\001\002\000\004\025\206\001" +
    "\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\204\000\006\002\004\003\006\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\004\015\005\025" +
    "\007\022\010\026\012\017\001\001\000\012\005\132\007" +
    "\022\010\133\012\130\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\013\047\001\001" +
    "\000\004\013\035\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\074\001\001\000\004" +
    "\013\065\001\001\000\004\013\060\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\114\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\124\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\004" +
    "\127\005\025\007\022\010\026\012\017\001\001\000\012" +
    "\005\132\007\022\010\133\012\130\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\004\136\005\025\007\022\010" +
    "\026\012\017\001\001\000\012\005\132\007\022\010\133" +
    "\012\130\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\150\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\165\001\001\000\004\013\160\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\014\004\201\005\025\007\022\010\026\012\017\001\001" +
    "\000\012\005\132\007\022\010\133\012\130\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Syntax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Syntax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Syntax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Symbol s;

    public void syntax_error (Symbol s) {
        this.s = s;
    }

    public Symbol getS() {
        return this.s;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Syntax$actions {
  private final Syntax parser;

  /** Constructor */
  CUP$Syntax$actions(Syntax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Syntax$do_action(
    int                        CUP$Syntax$act_num,
    java_cup.runtime.lr_parser CUP$Syntax$parser,
    java.util.Stack            CUP$Syntax$stack,
    int                        CUP$Syntax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Syntax$result;

      /* select the action based on the action number */
      switch (CUP$Syntax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // TEXT ::= TEXT IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("TEXT",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // TEXT ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("TEXT",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // CONDITION ::= IDENTIFIER COMPARATOR IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITION",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // CONDITION ::= IDENTIFIER COMPARATOR NFLOAT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITION",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // CONDITION ::= IDENTIFIER COMPARATOR NUMBER 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITION",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // OPERATION ::= DIVIDE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATION",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // OPERATION ::= MULTIPLY 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATION",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // OPERATION ::= SUBTRACT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATION",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // OPERATION ::= ADD 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATION",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // OPERATIONS ::= IDENTIFIER ASSIGN IDENTIFIER OPERATION IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // OPERATIONS ::= IDENTIFIER ASSIGN NFLOAT OPERATION IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // OPERATIONS ::= IDENTIFIER ASSIGN IDENTIFIER OPERATION NFLOAT EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // OPERATIONS ::= IDENTIFIER ASSIGN NFLOAT OPERATION NFLOAT EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // OPERATIONS ::= IDENTIFIER ASSIGN NUMBER OPERATION IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // OPERATIONS ::= IDENTIFIER ASSIGN IDENTIFIER OPERATION NUMBER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // OPERATIONS ::= IDENTIFIER ASSIGN NUMBER OPERATION NUMBER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // OPERATIONS ::= FLOAT IDENTIFIER ASSIGN IDENTIFIER OPERATION IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // OPERATIONS ::= FLOAT IDENTIFIER ASSIGN NFLOAT OPERATION IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // OPERATIONS ::= FLOAT IDENTIFIER ASSIGN IDENTIFIER OPERATION NFLOAT EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // OPERATIONS ::= FLOAT IDENTIFIER ASSIGN NFLOAT OPERATION NFLOAT EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // OPERATIONS ::= INTEGER IDENTIFIER ASSIGN IDENTIFIER OPERATION IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // OPERATIONS ::= INTEGER IDENTIFIER ASSIGN IDENTIFIER OPERATION NUMBER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // OPERATIONS ::= INTEGER IDENTIFIER ASSIGN NUMBER OPERATION IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // OPERATIONS ::= INTEGER IDENTIFIER ASSIGN NUMBER OPERATION NUMBER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERATIONS",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CONDITIONAL ::= IFC POPEN CONDITION PCLOSE WOPEN BLOCK WCLOSE ELSEC WOPEN BLOCK WCLOSE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITIONAL",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-10)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CONDITIONAL ::= IFC POPEN CONDITION PCLOSE WOPEN BLOCK WCLOSE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITIONAL",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // PRINTOUT ::= PRINT POPEN IDENTIFIER PCLOSE EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("PRINTOUT",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // PRINTOUT ::= PRINT POPEN NFLOAT PCLOSE EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("PRINTOUT",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // PRINTOUT ::= PRINT POPEN NUMBER PCLOSE EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("PRINTOUT",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // PRINTOUT ::= PRINT POPEN QUOTES TEXT QUOTES PCLOSE EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("PRINTOUT",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARATION ::= PRINTOUT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARATION ::= STRING IDENTIFIER ASSIGN QUOTES TEXT QUOTES EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARATION ::= FLOAT IDENTIFIER ASSIGN NFLOAT EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARATION ::= INTEGER IDENTIFIER ASSIGN NUMBER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARATION ::= STRING IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLARATION ::= FLOAT IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DECLARATION ::= INTEGER IDENTIFIER EOL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // BLOCK ::= BLOCK OPERATIONS 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BLOCK",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // BLOCK ::= OPERATIONS 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BLOCK",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // BLOCK ::= BLOCK CONDITIONAL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BLOCK",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // BLOCK ::= CONDITIONAL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BLOCK",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // BLOCK ::= BLOCK DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BLOCK",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // BLOCK ::= DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BLOCK",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // FTYPE ::= STRING 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("FTYPE",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // FTYPE ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("FTYPE",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // FTYPE ::= INTEGER 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("FTYPE",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // BEGIN ::= FTYPE IDENTIFIER POPEN PCLOSE WOPEN BLOCK RETURNC IDENTIFIER EOL WCLOSE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BEGIN",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-9)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // BEGIN ::= VOID IDENTIFIER POPEN PCLOSE WOPEN BLOCK WCLOSE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BEGIN",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= BEGIN EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;
		RESULT = start_val;
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Syntax$parser.done_parsing();
          return CUP$Syntax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

