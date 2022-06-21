package animals;

/**
 * Snake
 *
 * @author Zdenek Tronicek
 */
public class Snake extends Animal {

    public Snake(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.printf("snake %s%n", name);
    }

    public void hiss() {
        System.out.printf("%s: sss%n", name);
    }
}
