package terminal;

import animals.Lion;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Lion lion) {
        this.zoo = zoo;
        this.lion = lion;
    }

    @Override
    public void execute() {
        this.zoo.addLion(lion);
    }
}
