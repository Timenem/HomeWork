package CodeWars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
**/

public class Kata {
    public static int findShort(String s) {
        String[] newStrint = s.split(" ");
        List<Integer> lenWords = new ArrayList<>();
        for (String n:newStrint) {
            lenWords.add(n.length());
        }
        return lenWords.stream().min(Integer::compareTo).get();

    }
}



/**
 * Created by Javatlacati on 01/03/2017.
 */
class KataTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
    }

}
