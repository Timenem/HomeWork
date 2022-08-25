/*
This time no story, no theory. The examples below show you how to write function accum:
Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"


**/


public class Accumul {
    
    public static String accum(String s){
        String newS = new String(" "+s);
        StringBuilder sb = new StringBuilder();
        String temp = new String();
        for (int i = 0; i < newS.length(); i++) {
            temp = String.valueOf(newS.charAt(i)).repeat(i).toLowerCase();
            if (temp.length()==1){
                sb.append(temp.toUpperCase());
            }else if (temp.length()>=2){
                sb.append('-'+temp.substring(0,1).toUpperCase()+temp.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }
    
}
