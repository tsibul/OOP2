package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeCage = snakeTerrarium;
    }

    public Lion takeOfLion(){
        return this.lionCage.takeOffAnimal();
    }

    public Wolf takeOfWolf(){
        return this.wolfCage.takeOffAnimal();
    }

    public Snake takeOfSnake(){
        return this.snakeCage.takeOffAnimal();
    }

    public int addLion(Lion animal){
        return this.lionCage.addAnimal(animal);
    }

    public int addSnake(Snake animal){
        return this.snakeCage.addAnimal(animal);
    }

    public int addWolf(Wolf animal){
        return this.wolfCage.addAnimal(animal);
    }

    public AnimalCage<Wolf> getWolfCage() {
        return wolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Snake> getSnakeTerrarium() {
        return snakeCage;
    }

    public void setSnakeTerrarium(AnimalCage<Snake> snakeTerrarium) {
        this.snakeCage = snakeTerrarium;
    }

    @Override
    public String toString() {
        int wolfCount = 0;
        int snakeCount = 0;
        int lionCount = 0;
        if(wolfCage != null){
            wolfCount = wolfCage.countAnimals();
        }
        if(snakeCage != null){
            snakeCount = snakeCage.countAnimals();
        }
        if(lionCage != null){
            lionCount = lionCage.countAnimals();
        }
        return "Zoo{" +
                "wolves=" + wolfCount +
                ", lions=" + lionCount +
                ", snakes=" + snakeCount +
                '}';
    }
}


