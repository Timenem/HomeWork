
public class Mask {

    public static String maskify(String s ){
        int lenString = s.length()-4;
        if (s.length() < 4){
            return s ;
        }else {
            System.out.println( ("#".repeat(lenString)+s.substring(lenString)));
            return ("#".repeat(lenString)+s.substring(lenString));
        }
    }

    public static void main(String[] args) {
    }
}
