package HW_5;

import java.util.ArrayList;

public class Bag <T> {
    private int capacity;
    ArrayList<T> bag = new ArrayList<>();

    public Bag(int capacity) {
        this.capacity = capacity;

    }

    public int getCapacity(){
        return capacity;
    }
}
