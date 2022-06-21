package perfectnumbers;

/**
 * Perfect numbers
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10_000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
    
    static boolean isPerfect(int m) {
        int s = 0;
        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                s += i;
            }
        }
        return s == m;
    }
}
