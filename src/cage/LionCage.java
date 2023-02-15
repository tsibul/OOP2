package cage;

import animals.Animal;
import animals.Lion;
import animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class LionCage implements AnimalCage{
    private int foodWeight;
    private int garbageWeight;
    private ArrayList<Animal> lions;

    public LionCage() {
        this.lions = lions;
    }

    public void setLions(ArrayList lions) {
        this.lions = lions;
    }

    public void setFoodWeight(int foodWeight) {
        this.foodWeight = foodWeight;
    }

    public void setGarbageWeight(int garbageWeight) {
        this.garbageWeight = garbageWeight;
    }

    public int getFoodWeight() {
        return foodWeight;
    }

    public int getGarbageWeight() {
        return garbageWeight;
    }

    public ArrayList<Animal> getLions() {
        return lions;
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "foodWeight=" + foodWeight +
                ", garbageWeight=" + garbageWeight +
                ", lions=" + lions.size() +
                '}';
    }

    @Override
    public int addAnimal(Animal animal) {
        if(animal.getType().equals("lion")){
            lions.add(animal);
        }
        return lions.size();
    }

    @Override
    public void giveFood(int foodWeight) {
        int tmpFood = foodWeight + this.foodWeight;
        for (Animal lion: lions) {
            if(tmpFood > lion.getMAX_WEIGHT()){
                tmpFood -= lion.getMAX_WEIGHT();
            }
            else {
                tmpFood = 0;
            }
            lion.feed(tmpFood);
        }
        this.foodWeight = tmpFood;
    }

    @Override
    public void cleanCage(int garbageWeight) {
        if (garbageWeight < this.garbageWeight) {
            this.garbageWeight -= garbageWeight;
        }
        else {
            this.garbageWeight = 0;
        }
    }

    public Lion takeOffAnimal(){
        Random random = new Random();
        int i = random.nextInt(lions.size());
        return (Lion) lions.remove(i);
    }

}
