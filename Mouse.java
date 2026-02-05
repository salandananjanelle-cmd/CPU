public class Mouse {
    private int dpi;
    private boolean wireless;

    public Mouse(int dpi, boolean wireless) {
        this.dpi = dpi;
        this.wireless = wireless;
    }

    public String click() {
        return "Mouse click registered.\n";
    }

    public String movePointer() {
        return "Mouse pointer moved.\n";
    }

    public String identify() {
        return "I am the Mouse class. I control pointer movement and clicks.\n";
    }
}
