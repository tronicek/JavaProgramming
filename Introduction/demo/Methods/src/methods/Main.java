package methods;

import java.util.Scanner;

/**
 * Methods
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (isEven(m)) {
            System.out.println("The value is even.");
        } else {
            System.out.println("The value is odd.");
        }
    }

    static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
