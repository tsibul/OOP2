package terminal;

import animals.Animal;
import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

//    private CommandParser commandParser;

/*    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }


 */
    public void endless(Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("input what you want\n " +
                    "Format: <type of animal> delete or\n " +
                    "<type of animal> create name year_of_birth weight extra_number" +
                    "(maneVolume, height, bodyLength etc.)");
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            String[] inputList = input.split(" ");
            if(inputCheck(inputList)){
                CommandExecutableFactory oper = new CommandExecutableFactory(zoo);
                oper.create(inputList).execute();
            }
            else {
                System.out.println("Wrong input try again\n");
            }
        }
        scanner.close();
    }

    boolean inputCheck(String[] inputList) {
        if (inputList.length != 2 && inputList.length != 6) return false;
        else if (inputList[0].equals("wolf") && inputList[0].equals("lion") && inputList[0].equals("snake")) return false;
            // можно создать set со зверями и проверять на присутствие в сете,
            // но это будет актуально, если сделать автоматическое создание класса
        else if (inputList[1].equals("delete") && inputList[1].equals("create")) return false;
        else if (inputList.length == 6 && (!inputList[3].matches("\\d+") ||
                !inputList[4].matches("\\d+") ||
                !inputList[5].matches("\\d+"))) return false;
        return true;
    }
}
