package cage;

import animals.Animal;
import animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfCage implements AnimalCage{

    private ArrayList<Animal> wolves;
    private int foodWeight;
    private int garbageWeight;

    public ArrayList<Animal> getWolves() {
        return wolves;
    }

    public void setWolves(ArrayList<Animal> wolves) {
        this.wolves = wolves;
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
    public int addAnimal(Animal animal) {
        if(animal.getType().equals("wolf")){
            wolves.add(animal);
        }
        return wolves.size();
    }

    @Override
    public void giveFood(int foodWeight) {
        int tmpFood = foodWeight + this.foodWeight;
        try {
            for (Animal wolf : wolves) {
                wolf.feed(tmpFood);
                if (tmpFood > wolf.getmaxWeight()) {
                    tmpFood -= wolf.getmaxWeight();
                } else {
                    tmpFood = 0;
                }
            }
            this.foodWeight = tmpFood;
        }
        catch (Exception e){
            this.foodWeight = 0;
            this.garbageWeight = tmpFood;
        }

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

    public Wolf takeOffAnimal(){
        if(wolves == null){
            return null;
        }
        else {
            Random random = new Random();
            int i = random.nextInt(wolves.size());
            return (Wolf) wolves.remove(i);
        }
    }
}
