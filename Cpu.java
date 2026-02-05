public class CPU {
    private String processor;
    private int ram;
    private Keyboard keyboard;      // Composition
    private Mouse mouse;             // Aggregation
    private Monitor monitor;          // Aggregation

    public CPU(String processor, int ram, Mouse mouse, Monitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
        this.keyboard = new Keyboard("Mechanical", 104);
    }

    public String identify() {
        return "I am the CPU class. I manage and control all connected devices.\n";
    }
}
