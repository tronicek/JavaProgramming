package demo;

/**
 * Consumer
 *
 * @author Zdenek Tronicek
 */
public class Consumer implements Runnable {

    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            if (!buffer.isEmpty()) {
                char c = buffer.pop();
                System.out.printf("consumed: %c%n", c);
            }
        }
    }
}
