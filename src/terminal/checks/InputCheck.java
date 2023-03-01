package terminal.checks;

public class InputCheck {

    private String input;
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public InputCheck(String input) {
        this.input = input;
        this.check = inputCheck();
    }

    public boolean inputCheck() {
        String[] inputList = input.split(" ");
        if (inputList.length != 2 && inputList.length != 6) {
            check = false;
        } else if (!inputList[0].equals("wolf") && !inputList[0].equals("lion") && !inputList[0].equals("snake")){
            check = false;}
        else if (!inputList[1].equals("delete") && !inputList[1].equals("create")) {
            check = false;
        }
        else if (inputList.length == 6 && !(inputList[3].matches("\\d+") &&
                inputList[4].matches("\\d+") &&
                inputList[5].matches("\\d+"))){
            check = false;
        }
        else if(inputList.length == 2 && inputList[1].equals("create")){
            check = false;
        }
        else {
            check = true;
        }
        return check;
    }
}
