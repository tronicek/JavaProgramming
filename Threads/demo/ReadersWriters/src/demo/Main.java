package demo;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Display disp = new Display();
        Reader r = new Reader(disp);
        Writer w = new Writer(disp);
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(w).start();
        new Thread(w).start();
    }
}
