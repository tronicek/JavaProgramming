package animals;

/**
 * Cat
 *
 * @author Zdenek Tronicek
 */
public class Cat extends Animal implements CanRun {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.printf("cat %s%n", name);
    }

    public void meow() {
        System.out.printf("%s: meow%n", name);
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
