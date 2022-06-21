package standardoutput;

/**
 * Standard output
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        int answer = 42;
        System.out.printf("answer is %d%n", answer);
        int a = 3, b = 4, c = 5;
        System.out.printf("the triangle has sides %d, %d and %d%n", a, b, c);
    }
}
