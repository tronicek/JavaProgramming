package demo;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Buffer buf = new Buffer(32);
        Producer prod = new Producer(buf);
        Consumer cons = new Consumer(buf);
        new Thread(prod).start();
        new Thread(cons).start();
    }
}
