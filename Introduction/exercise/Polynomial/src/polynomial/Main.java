package polynomial;

import java.util.Scanner;

/**
 * Polynomial
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] p = new int[m + 1];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int xp = 1;
        int v = 0;
        for (int i = p.length - 1; i >= 0; i--) {
            v += p[i] * xp;
            xp *= x;
        }
        System.out.println(v);
    }
}
