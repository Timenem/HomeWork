package basket;


/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * It should look like this:
 * Sam Harris => S.H
 * patrick feeney => P.F
 * */
public class TwoWordName {

    public static String abbrevName(String name) {
        String x = name.replace(" ", ".");
        int dotIndex = x.indexOf(".");
        StringBuilder sb = new StringBuilder();
        sb.append(x.substring(0, 1).toUpperCase()).append(".")
                .append(x.substring(dotIndex + 1, dotIndex + 2).toUpperCase());
        return sb.toString();
    }
    public static void main(String[] args) {
        abbrevName("jon mkkln");
    }
}
