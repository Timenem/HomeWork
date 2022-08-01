package app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You will be given an array and a limit value.
 * You must check that all values in the array are below or equal to the limit value.
 * If they are, return true. Else, return false.
 * You can assume all values in the array are numbers.
 * */

public class SmallEnough {
    public static boolean smallEnough(int[]array ,int limit){

        List<Integer> integerList = IntStream.of(array).boxed().filter(i->i<=limit).collect(Collectors.toList());
        boolean b = integerList.size() == array.length;
        return b;
    }


    public static void main(String[] args) {
  
    }
}
