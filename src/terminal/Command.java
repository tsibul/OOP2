package terminal;

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
}
