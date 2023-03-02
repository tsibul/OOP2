package animalUtils.comparator;

import animals.Wolf;

import java.util.Comparator;

public class WolfWeightComparator implements Comparator <Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
