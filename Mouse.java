public class Mouse {

    private int dpi;
    private boolean wireless;

    public Mouse(int dpi, boolean wireless) {
        this.dpi = dpi;
        this.wireless = wireless;
    }

    public String identity() {
        return "I am the Mouse class. I handle pointer movement and clicking actions.\n";
    }
}
