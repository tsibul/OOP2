package animalUtils.iterator;

import animals.Wolf;

import java.util.ArrayList;
import java.util.Iterator;

public class WolfIterator implements Iterator {

    private ArrayList<Wolf> wolves;
    private int cursor;

    public WolfIterator(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
    }

    @Override
    public boolean hasNext() {
        return cursor < wolves.size();
    }

    @Override
    public Wolf next() {
        return wolves.get(cursor++);
    }
}
