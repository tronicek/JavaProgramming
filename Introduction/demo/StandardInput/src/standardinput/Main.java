package standardinput;

import java.util.Scanner;

/**
 * Standard input
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        System.out.printf("The answer is %d.%n", answer);
    }
}
