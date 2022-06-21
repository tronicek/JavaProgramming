package identitymatrix;

import java.util.Scanner;

/**
 * Identity matrix
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = (i == j) ? 1 : 0;
                System.out.printf("%d ", d);
            }
            System.out.println();
        }
    }
}
