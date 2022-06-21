package animals;

/**
 * Animal
 *
 * @author Zdenek Tronicek
 */
public abstract class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }
}
