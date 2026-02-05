public class CPU {

    private String processor;
    private int ram;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public CPU(String processor, int ram, Monitor monitor, Mouse mouse) {
        this.processor = processor;
        this.ram = ram;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public void connectKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public static void main(String[] args) {

        Monitor monitor = new Monitor("24 inches", "1920x1080");
        Mouse mouse = new Mouse(1200, true);
        Keyboard keyboard = new Keyboard("Mechanical", 104);

        CPU cpu = new CPU("Intel i5", 8, monitor, mouse);
        cpu.connectKeyboard(keyboard);

        String output =
                identity()
              + cpu.identity()
              + monitor.identity()
              + mouse.identity()
              + keyboard.identity();

        System.out.println(output); // ✅ ONLY println in the entire program
    }

    public static String identity() {
        return "I am the CPU class. I control the execution of the computer system.\n";
    }

    public String identity() {
        return "I am a CPU object. I manage processing tasks and connected hardware.\n";
    }
}
