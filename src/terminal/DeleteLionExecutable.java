package terminal;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;
import zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable{

    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfLion();
    }
}
