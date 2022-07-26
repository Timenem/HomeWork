/*
You will be given a number and you will need to return it as a string in Expanded Form. For example:
Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
NOTE: All numbers will be whole numbers greater than 0.

*/


public class ExpandedForm{
public static String expandedForm(int num){
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;   
        return outs;
    }
}


/**
//bad practice 
    public static String expandedForm(int n ){
        String number = String.valueOf(n);
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            integerList.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }
        String s = "";
        switch (integerList.size()){
            case 3:
                s = String.format("%d+%d+%d%n", integerList.get(0)*100,
                        integerList.get(1)*10,integerList.get(2));
                break;
            case 4:
                s = String.format("%d+%d+%d+%d%n", integerList.get(0)*1000,
                        integerList.get(1)*100,integerList.get(2)*10,
                        integerList.get(3));
                break;
            case 5:
                s = String.format("%d+%d+%d+%d+%d%n", integerList.get(0)*10000,
                        integerList.get(1)*1000,integerList.get(2)*100,
                        integerList.get(3)*10,integerList.get(4));
                break;
            case 6:
                s = String.format("%d+%d+%d+%d+%d+%d%n", integerList.get(0)*100000,
                        integerList.get(1)*10000,integerList.get(2)*1000,
                        integerList.get(3)*100,integerList.get(4)*10,integerList.get(5));
                break;
        }
         return s ;
    }





*/
