
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,3,0,4,0,0,1,0,1,4,0,4);
//        int zeros = (int) integerList.stream().filter(x -> x == 0).count();
//        System.out.println(zeros);
        List <Integer> withoutZeros = integerList.stream().filter(x -> x >0).collect(Collectors.toList());
        System.out.println(withoutZeros);
        while (withoutZeros.size() < integerList.size()){
            withoutZeros.add(0);
        }
        System.out.println(withoutZeros);
    }

}
