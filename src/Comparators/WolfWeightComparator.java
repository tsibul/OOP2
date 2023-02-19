package Comparators;

import animals.Wolf;

import java.util.Comparator;

public class WolfWeightComparator implements Comparator <Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if(o1.getWeight() > o2.getWeight()){
            return 1;
        }
        if(o1.getWeight() < o2.getWeight()){
            return -1;
        }
        return 0;
    }
}
