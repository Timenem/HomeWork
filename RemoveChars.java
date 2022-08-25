/*
  It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
*/

public class RemoveChars {
     public static String remove(String str) {
     StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() -1 );

        return sb.toString();
        }
}
