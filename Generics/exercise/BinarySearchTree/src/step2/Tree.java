package step2;

/**
 * Tree
 *
 * @author Zdenek Tronicek
 * @param <T>
 */
public class Tree<T extends Comparable<T>> {

    private Node<T> root;

    public void add(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            root.add(value);
        }
    }

    public boolean contains(T value) {
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
