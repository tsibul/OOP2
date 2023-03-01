package terminal.executable.factory;

import terminal.Command;
import terminal.executable.CommandExecutable;
import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    @Override
    public CommandExecutable create(Command command) {
        System.out.println("begin");
        CommandExecutable com = super.create(command);
        System.out.println("end");
        return com;
    }
}
