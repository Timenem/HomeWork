package basket;


/*
Write function alternateCase which switch every letter in string from upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD
* **/
public class SwapCase {
    static String alternateCase(final String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

}
