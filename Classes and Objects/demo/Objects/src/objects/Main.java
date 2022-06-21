package objects;

/**
 * Objects
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Cat tiger = new Cat();
        tiger.name = "Tiger";
        tiger.meow();
        Cat leo = new Cat();
        leo.name = "Leo";
        leo.meow();
    }
}
