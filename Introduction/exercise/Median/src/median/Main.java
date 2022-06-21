package median;

import java.util.Scanner;

/**
 * Median
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            int m = a;
            a = b;
            b = m;
        }
        if (b > c) {
            int m = b;
            b = c;
            c = m;
        }
        if (a > b) {
            int m = a;
            a = b;
            b = m;
        }
        System.out.println(b);
    }
}
