package primenumbers;

/**
 * Prime numbers
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        int c = 0;
        int m = 1_000_000;
        while (c < 10) {
            m++;
            if (isPrime(m)) {
                System.out.println(m);
                c++;
            }
        }
    }

    static boolean isPrime(int m) {
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
}
