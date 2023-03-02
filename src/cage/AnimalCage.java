package cage;

import animals.Animal;
import animalUtils.comparator.AnimalAgeComparator;

import java.util.ArrayList;
import java.util.Collections;

public interface AnimalCage<T extends Animal> {

    int addAnimal(T t);

    void giveFood(int foodWeight);

    void cleanCage(int garbageWeight);

    T takeOffAnimal();

    int countAnimals();

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AnimalAgeComparator());
    }



}
