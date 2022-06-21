package computerstore;

/**
 * Computer store
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Processor i7 = new Processor("Intel", 12, "4.8");
        HardDrive hd = new HardDrive("Seagate", 16);
        Display disp = new Display("15.6", 3840, 2160);
        Computer laptop = new Computer(i7, hd, disp);
        laptop.print();
    }
}
