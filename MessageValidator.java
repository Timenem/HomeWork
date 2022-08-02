package app;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MessageValidator {
    public static boolean isAValidMessage(String message) {
        String text = message.toLowerCase();
        if (text.length() == 0) {
            return true;
        }else if (Character.isAlphabetic(text.charAt(0))){
            return false;
        }
//        remove others element
        String strs = text.replaceAll("[0-9]", " ").trim()
                .replaceAll("\\s+", ",");
        String nums = text.replaceAll("[a-z]", " ").trim()
                .replaceAll("\\s+", ",");
//       to int array
        int[] arr = Arrays.stream(nums.split(",")).map(String::trim)
                .mapToInt(Integer::parseInt).toArray();
//        to list string
        List<String> stringList = Stream.of(strs.split(",")).map(String::trim)
                .collect(Collectors.toList());
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            try {
                answer = arr[i] == stringList.get(i).length();

            }catch (IndexOutOfBoundsException e ){
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
    }
}
