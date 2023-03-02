package terminal.executable;

import terminal.Command;
import terminal.executable.delete.DeleteWolfExecutable;
import zoo.Zoo;

public interface CommandExecutable {

    void execute();


    CommandExecutable getZoo(Zoo zoo, Command command);


}
