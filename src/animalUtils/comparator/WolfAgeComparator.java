package animalUtils.comparator;

import animals.Wolf;

import java.util.Comparator;

public class WolfAgeComparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if(o1.getYearBirth() < o2.getYearBirth()){
            return 1;
        }
        else if(o1.getYearBirth() > o2.getYearBirth()){
            return -1;
        }
        return 0;
    }
}
