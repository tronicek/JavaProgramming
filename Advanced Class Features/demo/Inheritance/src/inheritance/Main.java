package inheritance;

/**
 * Main
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Dog cooper = new Dog();
        cooper.name = "Cooper";
        cooper.bark();
        Cat tiger = new Cat();
        tiger.name = "Tiger";
        tiger.meow();
    }
}
