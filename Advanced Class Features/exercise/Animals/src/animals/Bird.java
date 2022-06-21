package animals;

/**
 * Bird
 *
 * @author Zdenek Tronicek
 */
public class Bird extends Animal implements CanFly, CanRun {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.printf("bird %s%n", name);
    }

    @Override
    public void fly() {
        System.out.printf("%s: flying...%n", name);
    }

    @Override
    public void stop() {
        System.out.printf("%s: stopped%n", name);
    }

    @Override
    public void run() {
        System.out.printf("%s: running...%n", name);
    }
}
