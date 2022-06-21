package inheritance;

/**
 * Dog
 *
 * @author Zdenek Tronicek
 */
public class Dog extends Pet {

    public void bark() {
        System.out.println("woof from " + name);
    }
}
