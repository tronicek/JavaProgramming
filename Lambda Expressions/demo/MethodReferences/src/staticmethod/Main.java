package staticmethod;

/**
 * A reference to a static method
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Vector ones = new Vector(4);
        ones.initialize(() -> 1.0);
        ones.print();
        Vector rand = new Vector(5);
        rand.initialize(Math::random);
        rand.print();
    }
}
