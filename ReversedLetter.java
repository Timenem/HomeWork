package basket;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 * Examples
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 * */

public class ReversedLetter {
    public static String reverseWords(final String original) {
        if (original.equals( " ")){
            return " ";
        }
        String[] strings = original.split(" ");
        List<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            stringList.add(new StringBuilder(str).reverse().toString());
        }
        return String.join(",",stringList).replace(","," ");
    }


    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god",reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", reverseWords("apple"));
        assertEquals("a b c d", reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", reverseWords("double  spaced  words"));
    }

    public static void main(String[] args) {
        reverseWords("The quick brown fox jumps over the lazy dog.");
    }
}
