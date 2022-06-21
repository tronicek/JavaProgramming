package datarace;

/**
 * Incrementer increments the counter.
 *
 * @author Zdenek Tronicek
 */
public class Incrementer implements Runnable {

    private final Counter counter;

    public Incrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.increment();
        }
    }
}
