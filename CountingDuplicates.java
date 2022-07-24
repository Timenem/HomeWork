/*
Count the number of Duplicates

Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example

"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
*/


import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String textLower = text.toLowerCase();
        Set<Character> uniqueRepeats = new HashSet<>();

        for (int i = 0; i < textLower.length() - 1; i++) {
            char character = textLower.charAt(i);

            if (!uniqueRepeats.contains(character) && textLower.indexOf(character, i + 1) != -1) {
                uniqueRepeats.add(character);
            }
        }

        return uniqueRepeats.size();
    }
}
