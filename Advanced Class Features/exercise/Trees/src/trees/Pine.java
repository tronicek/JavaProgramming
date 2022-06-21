package trees;

/**
 * Pine
 *
 * @author Zdenek Tronicek
 */
public class Pine extends Tree {

    public Pine(int age, int height) {
        super(age, height);
    }

    @Override
    public String toString() {
        return "Pine (age: " + age + " years, height: " + height + " ft)";
    }
}
