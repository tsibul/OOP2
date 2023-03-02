package animalUtils.comparator;

import animals.Wolf;

import java.util.Comparator;

public class WolfHwComparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if((o1.getWeight() > o2.getWeight()) ||
           (o1.getYearBirth() < o2.getYearBirth()) && (o1.getWeight() == o2.getWeight())){
            return 1;
        }
        else if((o1.getWeight() < o2.getWeight()) ||
                (o1.getYearBirth() > o2.getYearBirth()) && (o1.getWeight() == o2.getWeight())){
            return -1;
        }
        return 0;
    }
}
