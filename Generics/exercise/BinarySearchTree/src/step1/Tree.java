package step1;

/**
 * Tree
 *
 * @author Zdenek Tronicek
 */
public class Tree {

    private Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.add(value);
        }
    }

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        return root.contains(value);
    }

    public void print() {
        if (root == null) {
            System.out.println("empty tree");
        } else {
            root.print();
            System.out.println();
        }
    }
}
