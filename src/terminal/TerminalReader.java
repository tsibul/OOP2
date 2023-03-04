package terminal;

import terminal.checks.InputCheck;
import terminal.executable.CommandExecutable;
import terminal.executable.factory.CommandExecutableFactoryImpl;
import terminal.message.ErrorMessage;
import terminal.message.InviteMessage;
import terminal.parser.CommandParser;
import zoo.Zoo;

import java.util.Scanner;

import static terminal.checks.InputCheck.isCheck;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private Zoo zoo;

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    private CommandParser commandParser;

    private CommandExecutable commandExecutable;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private void setCommandExecutable(Command command) {
        this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(command);
    }

    public void endless() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(zoo.toString() + "\n");
            new InviteMessage().consoleMessage();
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            if (isCheck(input)) {
                Command newCommand = this.commandParser.parseCommand(input);
                this.setCommandExecutable(newCommand);
                this.commandExecutable.execute();
            } else {
                new ErrorMessage().consoleMessage();
            }
        }
        scanner.close();
    }


}
