
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.jgranados.compi1_2024.flexycup;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ContadorOperacionesParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public ContadorOperacionesParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ContadorOperacionesParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ContadorOperacionesParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\002\005\000\002\002" +
    "\003\000\002\003\005\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\004\011\006\001\002\000\004\002\017\001" +
    "\002\000\006\002\uffff\004\015\001\002\000\012\005\011" +
    "\006\010\007\012\010\007\001\002\000\004\011\ufffa\001" +
    "\002\000\004\011\ufffc\001\002\000\004\011\ufffd\001\002" +
    "\000\004\011\ufffb\001\002\000\004\011\014\001\002\000" +
    "\006\002\ufffe\004\ufffe\001\002\000\004\011\006\001\002" +
    "\000\004\002\000\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\012\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\002\015" +
    "\003\004\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ContadorOperacionesParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ContadorOperacionesParser$actions(this);
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
    return action_obj.CUP$ContadorOperacionesParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    // Connect this parser to a scanner!
    public ContadorOperacionesParser(ContadorOperacionesLexer lex) {
	    super(lex);
	  }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ContadorOperacionesParser$actions {
  private final ContadorOperacionesParser parser;

  /** Constructor */
  CUP$ContadorOperacionesParser$actions(ContadorOperacionesParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ContadorOperacionesParser$do_action_part00000000(
    int                        CUP$ContadorOperacionesParser$act_num,
    java_cup.runtime.lr_parser CUP$ContadorOperacionesParser$parser,
    java.util.Stack            CUP$ContadorOperacionesParser$stack,
    int                        CUP$ContadorOperacionesParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ContadorOperacionesParser$result;

      /* select the action based on the action number */
      switch (CUP$ContadorOperacionesParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= operaciones EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.elementAt(CUP$ContadorOperacionesParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.elementAt(CUP$ContadorOperacionesParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ContadorOperacionesParser$stack.elementAt(CUP$ContadorOperacionesParser$top-1)).value;
		RESULT = start_val;
              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.elementAt(CUP$ContadorOperacionesParser$top-1)), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ContadorOperacionesParser$parser.done_parsing();
          return CUP$ContadorOperacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // operaciones ::= operacion P_COMA operaciones 
            {
              Object RESULT =null;

              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("operaciones",0, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.elementAt(CUP$ContadorOperacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          return CUP$ContadorOperacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // operaciones ::= operacion 
            {
              Object RESULT =null;

              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("operaciones",0, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          return CUP$ContadorOperacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // operacion ::= ENTERO simbolo ENTERO 
            {
              Object RESULT =null;

              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("operacion",1, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.elementAt(CUP$ContadorOperacionesParser$top-2)), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          return CUP$ContadorOperacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // simbolo ::= SUMA 
            {
              Object RESULT =null;

              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("simbolo",2, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          return CUP$ContadorOperacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // simbolo ::= RESTA 
            {
              Object RESULT =null;

              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("simbolo",2, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          return CUP$ContadorOperacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // simbolo ::= DIVISION 
            {
              Object RESULT =null;

              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("simbolo",2, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          return CUP$ContadorOperacionesParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // simbolo ::= MULTIPLICACION 
            {
              Object RESULT =null;

              CUP$ContadorOperacionesParser$result = parser.getSymbolFactory().newSymbol("simbolo",2, ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ContadorOperacionesParser$stack.peek()), RESULT);
            }
          return CUP$ContadorOperacionesParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ContadorOperacionesParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ContadorOperacionesParser$do_action(
    int                        CUP$ContadorOperacionesParser$act_num,
    java_cup.runtime.lr_parser CUP$ContadorOperacionesParser$parser,
    java.util.Stack            CUP$ContadorOperacionesParser$stack,
    int                        CUP$ContadorOperacionesParser$top)
    throws java.lang.Exception
    {
              return CUP$ContadorOperacionesParser$do_action_part00000000(
                               CUP$ContadorOperacionesParser$act_num,
                               CUP$ContadorOperacionesParser$parser,
                               CUP$ContadorOperacionesParser$stack,
                               CUP$ContadorOperacionesParser$top);
    }
}

}