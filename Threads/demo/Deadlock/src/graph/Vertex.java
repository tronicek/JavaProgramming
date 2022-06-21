package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Vertex
 *
 * @author Zdenek Tronicek
 */
public class Vertex {

    private final int id;
    private final List<Edge> edges = new ArrayList<>();

    public Vertex(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public synchronized void addEdgeTo(Vertex to) {
        Edge e = new Edge(to);
        edges.add(e);
    }

    public synchronized void addEdgeToAndBack(Vertex to) {
        Edge e = new Edge(to);
        edges.add(e);
        to.addEdgeTo(this);
    }

    public synchronized void print() {
        System.out.printf("%d: ", id);
        for (Edge e : edges) {
            Vertex to = e.getTo();
            System.out.printf("  -> %d%n", to.getId());
        }
    }
}
