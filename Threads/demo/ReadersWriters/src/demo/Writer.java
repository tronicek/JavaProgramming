package demo;

/**
 * The writer thread
 *
 * @author Zdenek Tronicek
 */
public class Writer implements Runnable {

    private final Display file;

    public Writer(Display file) {
        this.file = file;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            file.write();
        }
    }
}
