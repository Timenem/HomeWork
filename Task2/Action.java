package Task2;

import Task2.InterfacesMethods.Drowable;
import Task2.InterfacesMethods.Movable;

public class Action {
    public static void doAction(Object object) {
        if (object instanceof Drowable) {
            Drowable drawable = (Drowable) object;
            drawable.draw();
        }
        if (object instanceof Movable) {
            Movable movable = (Movable) object;
            movable.move();
        }
    }
}
