package methods;

/**
 * Dog
 *
 * @author Zdenek Tronicek
 */
public class Dog {

    private String name;

    Dog(String n) {
        name = n;
    }

    void setName(String newName) {
        name = newName;
    }

    void bark() {
        System.out.println("woof from " + name);
    }
}
