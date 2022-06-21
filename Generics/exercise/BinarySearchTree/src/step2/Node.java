package step2;

/**
 * Tree node
 *
 * @author Zdenek Tronicek
 * @param <T>
 */
public class Node<T extends Comparable<T>> {

    private final T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    void add(T val) {
        int c = value.compareTo(val);
        if (c > 0) {
            if (left == null) {
                left = new Node<>(val);
            } else {
                left.add(val);
            }
        } else if (c < 0) {
            if (right == null) {
                right = new Node<>(val);
            } else {
                right.add(val);
            }
        }
    }

    boolean contains(T val) {
        int c = value.compareTo(val);
        if (c > 0) {
            if (left == null) {
                return false;
            }
            return left.contains(val);
        }
        if (c < 0) {
            if (right == null) {
                return false;
            }
            return right.contains(val);
        }
        return true;
    }

    void print() {
        System.out.printf("%s [", value);
        if (left == null) {
            System.out.print("- ");
        } else {
            left.print();
        }
        if (right == null) {
            System.out.print("-");
        } else {
            right.print();
        }
        System.out.print("] ");
    }
}
