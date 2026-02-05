public class Monitor {

    private String size;
    private String resolution;

    public Monitor(String size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public String identity() {
        return "I am the Monitor. I display visual output from the computer.\n";
    }
}
