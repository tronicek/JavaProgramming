package box;

/**
 * Generic box demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Box<Integer> i = new Box<>(42);
        System.out.println(i.getValue());
        Box<String> s = new Box<>("hi");
        System.out.println(s.getValue());
    }
}
