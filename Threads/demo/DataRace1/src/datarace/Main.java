package datarace;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            Counter c = new Counter();
            Thread inc = new Thread(new Incrementer(c));
            Thread dec = new Thread(new Decrementer(c));
            inc.start();
            dec.start();
            inc.join();
            dec.join();
            System.out.println(c.getValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
