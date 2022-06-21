package graph;

/**
 * Edge
 *
 * @author Zdenek Tronicek
 */
public class Edge {

    private final Vertex to;

    public Edge(Vertex to) {
        this.to = to;
    }

    public Vertex getTo() {
        return to;
    }
}
