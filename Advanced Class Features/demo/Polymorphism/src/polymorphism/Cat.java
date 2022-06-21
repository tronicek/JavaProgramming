package polymorphism;

/**
 * Cat
 *
 * @author Zdenek Tronicek
 */
public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am " + name;
    }
}
