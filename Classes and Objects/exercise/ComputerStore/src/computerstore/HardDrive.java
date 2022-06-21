package computerstore;

/**
 * Hard drive
 *
 * @author Zdenek Tronicek
 */
public class HardDrive {

    private String brand;
    private int capacity;

    public HardDrive(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public void print() {
        System.out.printf("Hard drive %s, capacity %d TB%n", brand, capacity);
    }
}
