package animalUtils.comparator;

import animals.Lion;

import java.util.Comparator;

public class LionComparatorMane implements Comparator<Lion> {

    @Override
    public int compare(Lion o1, Lion o2) {
        if (o1.getManeVolume() < o2.getManeVolume()) {
            return -1;
        } else if (o1.getManeVolume() > o2.getManeVolume()) {
            return 1;
        }
        return 0;
    }
}
