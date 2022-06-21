package array;

/**
 * Array
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        int[] coeffs = new int[10];
        initialize(coeffs);
        print(coeffs);
    }

    static void initialize(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = -1;
        }
    }

    static void print(int[] values) {
        for (int val : values) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }
}
