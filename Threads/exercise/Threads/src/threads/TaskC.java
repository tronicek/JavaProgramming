package threads;

import java.util.Random;

/**
 * Task C
 *
 * @author Zdenek Tronicek
 */
public class TaskC implements Runnable {

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            int r = rand.nextInt(500);
            System.out.println(r);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
