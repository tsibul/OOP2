package terminal;

import animals.Animal;
import animals.Lion;
import animals.Snake;
import animals.Wolf;
import zoo.Zoo;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutableFactory {
    private Zoo zoo;
    private Animal animal;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public CommandExecutable create(String[] input) {
        String code = input[0] + input[1];
        if (code.equals("wolfdelete")) return new DeleteWolfExecutable(zoo);
        else if (code.equals("liondelete")) return new DeleteLionExecutable(zoo);
        else if (code.equals("snakedelete")) return new DeleteSnakeExecutable(zoo);
        else if (code.equals("lioncreate")){
            Lion lion = new Lion(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]), 4, Integer.parseInt(input[5]));
            return new CreateLionExecutable(zoo, lion);
        }
        else if (code.equals("wolfcreate")){
            Wolf wolf = new Wolf(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]), 4, Integer.parseInt(input[5]));
            return new CreateWolfExecutable(zoo, wolf);
        }
        else if (code.equals("snakecreate")){
            Snake snake = new Snake(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]), 4, Integer.parseInt(input[5]));
            return new CreateSnakeExecutable(zoo, snake);
        }
        else return null;
    }

}
