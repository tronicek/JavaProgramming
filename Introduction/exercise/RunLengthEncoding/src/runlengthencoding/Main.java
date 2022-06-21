package runlengthencoding;

import java.util.Scanner;

/**
 * Run-length encoding
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int prev = m;
        int c = 0;
        while (m != 0) {
            if (m == prev) {
                c++;
            } else {
                System.out.printf("(%d,%d)", prev, c);
                prev = m;
                c = 1;
            }
            m = sc.nextInt();
        }
        if (c > 0) {
            System.out.printf("(%d,%d)%n", prev, c);
        }
    }
}
