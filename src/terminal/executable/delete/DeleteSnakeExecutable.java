package terminal.executable.delete;

import terminal.Command;
import terminal.executable.CommandExecutable;
import terminal.executable.create.CreateLionExecutable;
import zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public DeleteSnakeExecutable() {

    }

    public  DeleteSnakeExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteSnakeExecutable(zoo);
    }


    @Override
    public void execute() {
        this.zoo.takeOfSnake();
    }
}
