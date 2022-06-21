package threads;

/**
 * Task B
 *
 * @author Zdenek Tronicek
 */
public class TaskB implements Runnable {

    @Override
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
