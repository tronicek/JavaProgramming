package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph
 *
 * @author Zdenek Tronicek
 */
public class Graph {

    private final List<Vertex> vertices = new ArrayList<>();

    public synchronized int size() {
        return vertices.size();
    }

    public synchronized void addVertex(int id) {
        Vertex v = new Vertex(id);
        vertices.add(v);
    }

    public synchronized Vertex findVertex(int id) {
        for (Vertex v : vertices) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public void addEdge(int from, int to) {
        Vertex v1 = findVertex(from);
        Vertex v2 = findVertex(to);
        v1.addEdgeTo(v2);
    }

    public void addEdgesBetween(int from, int to) {
        Vertex v1 = findVertex(from);
        Vertex v2 = findVertex(to);
        v1.addEdgeToAndBack(v2);
    }

    public synchronized void print() {
        for (Vertex v : vertices) {
            v.print();
        }
    }
}
