package cage;

import animals.Animal;
import animals.Snake;

import java.util.ArrayList;

public class SnakeCage implements AnimalCage<Snake> {

    private ArrayList<Snake> snakes;
    private int foodWeight;
    private int garbageWeight;

    public SnakeCage(ArrayList<Snake> snakes, int foodWeight, int garbageWeight) {
        this.snakes = snakes;
        this.foodWeight = foodWeight;
        this.garbageWeight = garbageWeight;
    }

    public ArrayList<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public int getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(int foodWeight) {
        this.foodWeight = foodWeight;
    }

    public int getGarbageWeight() {
        return garbageWeight;
    }

    public void setGarbageWeight(int garbageWeight) {
        this.garbageWeight = garbageWeight;
    }

    @Override
    public int addAnimal(Snake snake) {
        return 0;
    }

    @Override
    public void giveFood(int foodWeight) {
    }

    @Override
    public void cleanCage(int garbageWeight) {

    }

    @Override
    public Snake takeOffAnimal() {
        return null;
    }

    @Override
    public void sortByAge(ArrayList<Snake> animalList) {
        AnimalCage.super.sortByAge(animalList);
    }
}
