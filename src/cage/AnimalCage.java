package cage;

import animals.Animal;

public interface AnimalCage {

    int addAnimal(Animal animal);

    void giveFood(int foodWeight);

    void cleanCage(int garbageWeight);

    Animal takeOffAnimal();
}
