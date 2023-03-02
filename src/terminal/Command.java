package terminal;

import terminal.executable.CommandTypes;

import java.util.ArrayList;

public class Command {
    private String action;
    private String animal;
    private ArrayList<String> parameters;

    public String getAction() {
        return action;
    }

    public String getAnimal() {
        return animal;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public Command(String action, String animal, ArrayList<String> parameters) {
        this.action = action;
        this.animal = animal;
        this.parameters = parameters;
    }

    public CommandTypes getCommandEnum(){
        for (CommandTypes x: CommandTypes.values())
              {
            if(x.getTitle().equals(this.action+this.animal)){
                return (CommandTypes) x;
            }
        }
        return null;
    }
}
