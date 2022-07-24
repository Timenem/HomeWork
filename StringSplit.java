
import java.util.ArrayList;

/**
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
Examples:
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
*/

public class StringSplit {
    public static String[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<String> strings = new ArrayList<>();
        if (sb.length() % 2 == 0) {
            for (int i = 0; i < sb.length(); i += 2) {
                strings.add(s.substring(i, i + 2));
            }
        } else {
            sb.append("_");
            for (int i = 0; i < sb.length(); i += 2) {
                strings.add(sb.substring(i, i + 2));
            }
        }
        System.out.println(strings);
        return strings.toArray(new String[0]);
    }


    public static void main(String[] args) {

        solution("abce");
        solution("abc");
    }
}
