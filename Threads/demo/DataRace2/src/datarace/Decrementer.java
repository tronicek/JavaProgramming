package datarace;

/**
 * Decrementer decrements the counter.
 *
 * @author Zdenek Tronicek
 */
public class Decrementer implements Runnable {

    private final Counter counter;

    public Decrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.decrement();
        }
    }
}
