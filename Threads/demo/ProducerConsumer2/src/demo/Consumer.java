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
        int count = 'z' - 'a' + 1;
        for (; count > 0; count--) {
            char c = buffer.pop();
            System.out.printf("consumed: %c%n", c);
        }
    }
}
