package maximumofthree;

import java.util.Scanner;

/**
 * Maximum of three
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = (a > b) ? a : b;
        if (c > m) {
            m = c;
        }
        System.out.println(m);
    }
}
