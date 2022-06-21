package animals;

/**
 * Dog
 *
 * @author Zdenek Tronicek
 */
public class Dog extends Animal implements CanRun {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.printf("dog %s%n", name);
    }

    public void bark() {
        System.out.printf("%s: woof%n", name);
    }

    @Override
    public void run() {
        System.out.printf("%s: running...%n", name);
    }

    @Override
    public void stop() {
        System.out.printf("%s: stopped%n", name);
    }
}
