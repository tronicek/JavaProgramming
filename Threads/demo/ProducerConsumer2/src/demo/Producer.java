package demo;

/**
 * Producer
 *
 * @author Zdenek Tronicek
 */
public class Producer implements Runnable {

    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("produced: %c%n", c);
            buffer.push(c);
        }
    }
}
