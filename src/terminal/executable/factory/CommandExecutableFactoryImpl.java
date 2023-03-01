package terminal.executable.factory;

import terminal.Command;
import terminal.executable.*;
import terminal.executable.create.CreateLionExecutable;
import terminal.executable.create.CreateSnakeExecutable;
import terminal.executable.create.CreateWolfExecutable;
import terminal.executable.delete.DeleteLionExecutable;
import terminal.executable.delete.DeleteSnakeExecutable;
import terminal.executable.delete.DeleteWolfExecutable;
import zoo.Zoo;


public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {
        String code = input.getAction() + input.getAnimal();
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
                return new CreateLionExecutable(zoo, input);
            }
            case "wolfcreate" -> {
                return new CreateWolfExecutable(zoo, input);
            }
            case "snakecreate" -> {
                return new CreateSnakeExecutable(zoo, input);
            }
            default -> {
                return null;
            }
        }
    }

}
