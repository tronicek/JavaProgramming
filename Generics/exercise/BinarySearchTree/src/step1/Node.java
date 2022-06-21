package step1;

/**
 * Tree node
 *
 * @author Zdenek Tronicek
 */
public class Node {

    private final int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    void add(int val) {
        if (val < value) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.add(val);
            }
        } else if (val > value) {
            if (right == null) {
                right = new Node(val);
            } else {
                right.add(val);
            }
        }
    }

    boolean contains(int val) {
        if (val < value) {
            if (left == null) {
                return false;
            }
            return left.contains(val);
        }
        if (val > value) {
            if (right == null) {
                return false;
            }
            return right.contains(val);
        }
        return true;
    }

    void print() {
        System.out.printf("%d [", value);
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
