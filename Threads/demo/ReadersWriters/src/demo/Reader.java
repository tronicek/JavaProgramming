package demo;

/**
 * The reader thread
 *
 * @author Zdenek Tronicek
 */
public class Reader implements Runnable {

    private final Display file;

    public Reader(Display file) {
        this.file = file;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            file.read();
        }
    }
}
