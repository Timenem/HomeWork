
import java.util.ArrayList;
import java.util.List;

public class Multiple{
    public static int solution(int number){
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (i%3==0 || i%5==0){
                    integerList.add(i);
            }
        }
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }
}
