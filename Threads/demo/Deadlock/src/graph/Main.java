package graph;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    static final int N = 100;

    public static void main(String[] args) {
        try {
            Graph g = new Graph();
            for (int i = 0; i < N; i++) {
                g.addVertex(i);
            }
            Builder b = new Builder(g);
            Thread t1 = new Thread(b);
            Thread t2 = new Thread(b);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            g.print();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
