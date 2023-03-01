package terminal.executable.create;

import animals.Snake;
import animals.Wolf;
import terminal.Command;
import terminal.executable.CommandExecutable;
import zoo.Zoo;

import java.util.ArrayList;

public class CreateWolfExecutable implements CommandExecutable {

    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.wolf = new Wolf(input.get(0), Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)), 0,
                Integer.parseInt(input.get(3)));
    }

    @Override
    public void execute() {
        this.zoo.addWolf(wolf);
    }
}
