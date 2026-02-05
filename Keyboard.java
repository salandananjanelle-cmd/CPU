public class Keyboard {

    private String type;
    private int numberOfKeys;

    public Keyboard(String type, int numberOfKeys) {
        this.type = type;
        this.numberOfKeys = numberOfKeys;
    }

    public String identity() {
        return "I am the Keyboard. I allow the user to input text and commands.\n";
    }
}
