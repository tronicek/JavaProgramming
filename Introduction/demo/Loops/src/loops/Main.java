package loops;

import java.util.Scanner;

/**
 * Loops
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        powers(m);
        powers2(m);
        numbers(m);
    }

    static void powers(int m) {
        int p = 1;
        while (p <= m) {
            System.out.println(p);
            p *= 2;
        }
    }

    static void powers2(int m) {
        int p = 1;
        do {
            System.out.println(p);
            p *= 2;
        } while (p <= m);
    }

    static void numbers(int m) {
        for (int i = 1; i <= m; i++) {
            System.out.println(i);
        }
    }
}
