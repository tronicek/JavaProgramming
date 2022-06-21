package threads;

/**
 * Threads
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();
        TaskC taskC = new TaskC();
        new Thread(taskA).start();
        new Thread(taskB).start();
        new Thread(taskC).start();
    }
}
