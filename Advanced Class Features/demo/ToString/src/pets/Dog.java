package pets;

/**
 * Dog
 *
 * @author Zdenek Tronicek
 */
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am " + name;
    }
}
