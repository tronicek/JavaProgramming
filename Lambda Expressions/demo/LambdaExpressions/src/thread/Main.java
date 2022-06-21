package thread;

/**
 * A lambda expression demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        t.start();
        Thread t2 = new Thread(() -> {
            System.out.println("Hello");
        });
        t2.start();
    }
}
