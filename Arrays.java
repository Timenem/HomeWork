import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


/*
*Write a function that can return the smallest value of an array or the index of that value.
*The function's 2nd parameter will tell whether it should return the value or the index.
*Assume the first parameter will always be an array filled with at least 1 number and no duplicates. 
*Assume the second parameter will be a string holding one of two values: 'value' and 'index'.
Arrays.findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
Arrays.findSmallest(new int[]{1,2,3,4,5}, 'index') // => 0
*/

public class Arrays {

    public static int findSmallest(final int[] numbers,final  String toReturn){
        List<Integer> integerList =  java.util.Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int answer =0;
        if (Objects.equals(toReturn, "index")){
            answer = integerList.indexOf(Collections.min(integerList));
        }else {
            answer = Collections.min(integerList);
        }
        return answer;
    }
}
