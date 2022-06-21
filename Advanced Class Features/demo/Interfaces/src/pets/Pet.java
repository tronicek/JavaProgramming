package pets;

/**
 * Pet
 *
 * @author Zdenek Tronicek
 */
public abstract class Pet implements Comparable<Pet> {

    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet p) {
        return name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
