package terminal;

import animals.Lion;
import animals.Snake;
import zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{

    private Zoo zoo;
    private Snake snake;

    public CreateSnakeExecutable(Zoo zoo, Snake snake) {
        this.zoo = zoo;
        this.snake = snake;
    }

    @Override
    public void execute() {
        this.zoo.addSnake(snake);
    }
}
