package genericmethod;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        Util.fill(names, "no name");
        print(names);
        Number[] nums = new Integer[3];
        Util.fill(nums, 1);
        print(nums);
    }
    
    static void print(Object[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%d: %s%n", i, p[i]);
        }
    }
}
