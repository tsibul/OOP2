package cage;

import animalUtils.iterator.WolfIterator;
import animalUtils.comparator.WolfAgeComparator;
import animalUtils.comparator.WolfHwComparator;
import animalUtils.comparator.WolfWeightComparator;
import animals.Animal;
import animals.Wolf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {

    private ArrayList<Wolf> wolves;
    private int foodWeight;
    private int garbageWeight;

    public WolfCage(ArrayList<Wolf> wolves, int foodWeight, int garbageWeight) {
        this.wolves = wolves;
        this.foodWeight = foodWeight;
        this.garbageWeight = garbageWeight;
    }

    public WolfCage() {
        this.wolves = new ArrayList<Wolf>();
    }

    public ArrayList<Wolf> getWolves() {
        return wolves;
    }

    public void setWolves(ArrayList<Wolf> wolves) {
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
    public int addAnimal(Wolf animal) {
        if (animal.getType().equals("wolf")) {
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
        } catch (Exception e) {
            this.foodWeight = 0;
            this.garbageWeight = tmpFood;
        }

    }

    @Override
    public void cleanCage(int garbageWeight) {
        if (garbageWeight < this.garbageWeight) {
            this.garbageWeight -= garbageWeight;
        } else {
            this.garbageWeight = 0;
        }
    }

    public Wolf takeOffAnimal() {
        if (this.wolves.isEmpty()) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(wolves.size());
            return (Wolf) wolves.remove(i);
        }
    }

    @Override
    public int countAnimals() {
        return wolves.size();
    }

    public void wolfWeightSort() {
        Collections.sort(wolves, new WolfWeightComparator());
    }

    public void wolfAgeSort() {
        Collections.sort(wolves, new WolfAgeComparator());
    }

    public void wolfHwSort() {
        Collections.sort(wolves, new WolfHwComparator());
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }

}
