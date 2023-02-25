package terminal;

public interface CommandParser {

    public static String[] parseCommand(String inputCommand){
        return inputCommand.split(" ");
    };

}
