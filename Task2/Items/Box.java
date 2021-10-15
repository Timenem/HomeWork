package Task2.Items;

import Task2.InterfacesMethods.Movable;

public class Box implements Movable {
    @Override
    public void move() {
        System.out.println("box was moved ");
    }
}
