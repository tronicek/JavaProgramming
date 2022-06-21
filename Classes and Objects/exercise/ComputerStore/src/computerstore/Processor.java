package computerstore;

/**
 * Processor
 *
 * @author Zdenek Tronicek
 */
public class Processor {

    private String brand;
    private int cores;
    private String frequency;

    public Processor(String brand, int cores, String frequency) {
        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }

    public void print() {
        System.out.printf("Processor %s, %d cores, frequency %s GHz%n", brand, cores, frequency);
    }
}
