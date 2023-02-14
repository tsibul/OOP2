package cage;

import animals.Animal;

import java.util.ArrayList;

public class LionCage implements AnimalCage{
    private int clean;
    private ArrayList lions;

    @Override
    public int addAnimal(Animal animal) {
        if(animal.getType().equals("lion")){
            lions.add(animal);
        }
        return lions.size();
    }

    @Override
    public void giveFood(int foodWeight) {

    }

    @Override
    public void cleanCage(int garbageWeight) {

    }
}
