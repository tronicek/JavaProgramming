package trees;

/**
 * Oak
 *
 * @author Zdenek Tronicek
 */
public class Oak extends Tree {

    public Oak(int age, int height) {
        super(age, height);
    }

    @Override
    public String toString() {
        return "Oak (age: " + age + " years, height: " + height + " ft)";
    }
}
