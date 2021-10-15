package Task1;

import Task1.Cars.*;

import java.util.Random;

public class Factory {
    public static void main(String[] args) {

    }
    public static Car make(int qt) {
    int randomNum = new Random().nextInt(100);
        if (randomNum >=0 && randomNum<=15)
            return new Mercedes();
        if (randomNum >=16 && randomNum <=31)
            return  new Bmw();
        if (randomNum >=32 && randomNum<=63)
            return new Nissan();
        if (randomNum >=64 && randomNum <76)
            return  new Toyota();
        if (randomNum >=76 && randomNum<=100)
            return new Mercedes();
        throw new IllegalArgumentException();
    }
}
