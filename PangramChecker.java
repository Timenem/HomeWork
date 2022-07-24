import java.util.HashSet;
import java.util.Set;

/*
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.


*/

public class PangramChecker {
  public boolean check(String sentence){
    String str = sentence.toLowerCase().replaceAll("[^a-z]", "");
    Set<Character> set = new HashSet<>();
    for (char c : str.toCharArray()) {
      set.add(c);
    }
    return set.size() == 26;
  }
}
