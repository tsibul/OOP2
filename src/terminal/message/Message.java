package terminal.message;

public abstract class Message {
    protected String message;

    public void consoleMessage() {
        System.out.println(this.message);
    }

    ;

}
