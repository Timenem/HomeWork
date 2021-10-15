package Task2;

import Task2.Figures.Circle;
import Task2.Figures.Square;
import Task2.Items.Box;
import Task2.Items.Table;

public class Generator {
    private static int roundRobin;
    static Object generate(){
        roundRobin %=4;
        switch (roundRobin++) {
            case 0: return new Square() ;
            case 1: return new Circle();
            case 2: return new Box();
            case 3: return new Table();
        }
        return null;
    }
}
