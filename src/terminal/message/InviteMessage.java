package terminal.message;

public class InviteMessage extends Message{

    public InviteMessage() {
        this.message = "input what you want\n " +
                "Format: <type of animal> delete or\n " +
                "<type of animal> create name year_of_birth weight extra_number" +
                "(maneVolume, height, bodyLength etc.)";
    }
}
