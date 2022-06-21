package sumofdigits;

import java.util.Scanner;

/**
 * Sum of digits
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = 0;
        while (m > 0) {
            s += m % 10;
            m /= 10;
        }
        System.out.println(s);
    }
}
