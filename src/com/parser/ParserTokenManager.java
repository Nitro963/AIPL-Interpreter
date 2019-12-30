/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package com.parser;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import nodes.*;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 5;
            return 4;
         }
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 31;
            return 30;
         }
         if ((active0 & 0x1000000000L) != 0L)
            return 4;
         if ((active0 & 0x400000200L) != 0L)
            return 38;
         if ((active0 & 0x8000000000L) != 0L)
            return 50;
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 31;
            return 17;
         }
         if ((active0 & 0x4000000000L) != 0L)
            return 35;
         if ((active0 & 0x400L) != 0L)
            return 3;
         return -1;
      case 1:
         if ((active0 & 0x6000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
            return 30;
         }
         return -1;
      case 2:
         if ((active0 & 0x4000000L) != 0L)
            return 30;
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
            return 30;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 20);
      case 34:
         return jjStartNfaWithStates_0(0, 39, 50);
      case 36:
         return jjStopAtPos(0, 15);
      case 38:
         return jjStopAtPos(0, 21);
      case 39:
         return jjStartNfaWithStates_0(0, 38, 35);
      case 40:
         return jjStopAtPos(0, 23);
      case 41:
         return jjStopAtPos(0, 24);
      case 44:
         return jjStopAtPos(0, 42);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 58:
         return jjStartNfaWithStates_0(0, 36, 4);
      case 59:
         return jjStopAtPos(0, 37);
      case 60:
         jjmatchedKind = 9;
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 61:
         return jjStopAtPos(0, 8);
      case 62:
         return jjStartNfaWithStates_0(0, 10, 3);
      case 63:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 64:
         return jjStopAtPos(0, 22);
      case 94:
         return jjStopAtPos(0, 7);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 124:
         return jjStopAtPos(0, 14);
      case 126:
         return jjStopAtPos(0, 16);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      case 62:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 63:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 102:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 30);
         break;
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 50;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 50:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  else if (curChar == 34)
                  {
                     if (kind > 40)
                        kind = 40;
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 19)
                        kind = 19;
                     jjCheckNAddStates(0, 3);
                  }
                  else if ((0x842000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  else if ((0x280000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                  }
                  else if (curChar == 60)
                     jjAddStates(4, 5);
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(35, 36);
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(32, 33);
                  else if (curChar == 58)
                     jjCheckNAdd(4);
                  else if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 3;
                  if (curChar == 47)
                     jjCheckNAdd(4);
                  else if (curChar == 42)
                     jjCheckNAdd(4);
                  else if (curChar == 45)
                     jjCheckNAdd(4);
                  else if (curChar == 43)
                     jjCheckNAdd(4);
                  break;
               case 35:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAdd(36);
                  else if (curChar == 39)
                  {
                     if (kind > 41)
                        kind = 41;
                  }
                  break;
               case 17:
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(30);
                  break;
               case 38:
                  if (curChar == 62)
                  {
                     if (kind > 13)
                        kind = 13;
                  }
                  else if (curChar == 61)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  break;
               case 1:
                  if ((0x842000000000L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 2:
                  if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if (curChar == 61 && kind > 12)
                     kind = 12;
                  break;
               case 4:
                  if (curChar == 61 && kind > 17)
                     kind = 17;
                  break;
               case 5:
                  if (curChar == 58)
                     jjCheckNAdd(4);
                  break;
               case 6:
                  if (curChar == 43)
                     jjCheckNAdd(4);
                  break;
               case 7:
                  if (curChar == 45)
                     jjCheckNAdd(4);
                  break;
               case 8:
                  if (curChar == 42)
                     jjCheckNAdd(4);
                  break;
               case 9:
                  if (curChar == 47)
                     jjCheckNAdd(4);
                  break;
               case 31:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 32:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 33:
                  if (curChar == 34 && kind > 40)
                     kind = 40;
                  break;
               case 34:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(35, 36);
                  break;
               case 36:
                  if (curChar == 39 && kind > 41)
                     kind = 41;
                  break;
               case 37:
                  if (curChar == 60)
                     jjAddStates(4, 5);
                  break;
               case 39:
                  if (curChar == 62 && kind > 13)
                     kind = 13;
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAddStates(0, 3);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(41);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddStates(6, 8);
                  break;
               case 43:
                  if (curChar == 46)
                     jjCheckNAdd(44);
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddTwoStates(44, 45);
                  break;
               case 46:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(47);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddTwoStates(47, 48);
                  break;
               case 48:
                  if (curChar == 46)
                     jjCheckNAdd(49);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(49);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 50:
               case 32:
                  jjCheckNAddTwoStates(32, 33);
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 27;
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 17;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 35:
                  jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 17:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 10:
                  if (curChar == 116 && kind > 27)
                     kind = 27;
                  break;
               case 11:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 101 && kind > 27)
                     kind = 27;
                  break;
               case 14:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 18:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 114 && kind > 27)
                     kind = 27;
                  break;
               case 20:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 103 && kind > 27)
                     kind = 27;
                  break;
               case 24:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(30);
                  break;
               case 30:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(30);
                  break;
               case 45:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(9, 10);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 50:
               case 32:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 35:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 50 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   41, 42, 43, 45, 38, 39, 42, 43, 45, 46, 47, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\136", "\75", "\74", "\76", null, 
null, null, "\174", "\44", "\176", null, null, null, "\41", "\46", "\100", "\50", 
"\51", "\146\165\156\143", "\144\145\146", null, null, null, null, null, "\77", 
"\77\77", "\74\55", "\55\76", "\72", "\73", "\47", "\42", null, null, "\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7ffaffbffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[50];
static private final int[] jjstateSet = new int[100];
static protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 50; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
