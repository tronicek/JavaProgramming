package threads;

/**
 * Task A
 *
 * @author Zdenek Tronicek
 */
public class TaskA implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
