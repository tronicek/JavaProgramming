package demo;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    static final int N = 5;

    public static void main(String[] args) {
        Fork[] forks = new Fork[N];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i + 1);
        }
        Philosopher[] phils = new Philosopher[N];
        for (int i = 0; i < phils.length; i++) {
            int j = (i + 1) % forks.length;
            phils[i] = new Philosopher(i + 1, forks[i], forks[j]);
        }
        for (Philosopher phil : phils) {
            new Thread(phil).start();
        }
    }
}
