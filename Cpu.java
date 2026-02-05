public class Cpu {

    private String processor;
    private int ram;

    private Monitor monitor;     
    private Mouse mouse;         
    private Keyboard keyboard;   

    public Cpu(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;

        this.mouse = new Mouse(1200, true);
        this.keyboard = new Keyboard("Mechanical", 104);
    }

    public void connectMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String identity() {
        return "I am the CPU class. I control execution and manage connected hardware.\n";
    }

    public static void main(String[] args) {

        Monitor monitor = new Monitor("24 inches", "1920x1080"); 

        Cpu cpu = new Cpu("Intel i5", 8);
        cpu.connectMonitor(monitor);

        String output =
                cpu.identity()
              + cpu.keyboard.identity()
              + cpu.mouse.identity()
              + monitor.identity();

        System.out.println(output); 
    }
}
