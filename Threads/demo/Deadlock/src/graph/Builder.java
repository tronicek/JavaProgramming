package graph;

import java.util.Random;

/**
 * Builder
 *
 * @author Zdenek Tronicek
 */
public class Builder implements Runnable {

    private final Graph graph;

    public Builder(Graph graph) {
        this.graph = graph;
    }

    @Override
    public void run() {
        Random rand = new Random();
        final int N = graph.size();
        for (int i = 0; i < N * N * N; i++) {
            int from = rand.nextInt(N);
            int to = rand.nextInt(N);
            graph.addEdgesBetween(from, to);
        }
    }
}
