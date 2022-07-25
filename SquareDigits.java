/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
/*

public class SquareDigit {

public int squareDigits(int n) {
    char[] numbersArray = String.valueOf(n).toCharArray();
    StringBuilder sb = new StringBuilder();

    for (char number : numbersArray) {
        sb.append(Character.getNumericValue(number) * Character.getNumericValue(number));
    }
    return Integer.parseInt(sb.toString());
  }
  
 
}
