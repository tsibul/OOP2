package terminal.executable.factory;

import terminal.Command;
import terminal.executable.CommandExecutable;

public interface CommandExecutableFactory {

    CommandExecutable create(Command input);

    }
