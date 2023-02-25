package terminal;

import zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable{

    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfSnake();
    }
}
