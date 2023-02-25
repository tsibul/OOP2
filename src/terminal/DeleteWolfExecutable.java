package terminal;

import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable{

    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfWolf();
    }
}
