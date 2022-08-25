/**
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
The string can contain any char.

Examples input/output:

*/

public class XO {
      public static boolean getXO(String str){
        String lowerString = str.toLowerCase();
        long x = lowerString.codePoints().filter(ch->ch=='x').count();
        long o = lowerString.codePoints().filter(ch->ch=='o').count();
        boolean answer = (x==o)?true:false;        
        return answer;
    }

}
