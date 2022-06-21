package computerstore;

/**
 * Computer
 *
 * @author Zdenek Tronicek
 */
public class Computer {

    private Processor processor;
    private HardDrive hardDrive;
    private Display display;

    public Computer(Processor processor, HardDrive hardDrive, Display display) {
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.display = display;
    }

    public void print() {
        processor.print();
        hardDrive.print();
        display.print();
    }
}
