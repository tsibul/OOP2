package terminal.executable.factory;

import terminal.Command;
import terminal.executable.*;
import zoo.Zoo;


public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {
        CommandTypes codeEnum = input.getCommandEnum();
        CommandExecutable exec = codeEnum.getMethod();
        return exec.getZoo(zoo, input);
    }
}
