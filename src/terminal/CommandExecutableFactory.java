package terminal;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(String[] input) {
        String code = input[0] + input[1];
        switch (code) {
            case "wolfdelete" -> {
                return new DeleteWolfExecutable(zoo);
            }
            case "liondelete" -> {
                return new DeleteLionExecutable(zoo);
            }
            case "snakedelete" -> {
                return new DeleteSnakeExecutable(zoo);
            }
            case "lioncreate" -> {
                Lion lion = new Lion(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]), 4, Integer.parseInt(input[5]));
                return new CreateLionExecutable(zoo, lion);
            }
            case "wolfcreate" -> {
                Wolf wolf = new Wolf(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]), 4, Integer.parseInt(input[5]));
                return new CreateWolfExecutable(zoo, wolf);
            }
            case "snakecreate" -> {
                Snake snake = new Snake(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]), 4, Integer.parseInt(input[5]));
                return new CreateSnakeExecutable(zoo, snake);
            }
            default -> {
                return null;
            }
        }
    }

}
