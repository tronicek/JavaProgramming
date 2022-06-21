package test;

import java.util.Scanner;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int exp = sc.nextInt();
            if (exp == 0) {
                break;
            }
            PrimalityTest pt = new PrimalityTest(exp);
            Thread t = new Thread(pt);
            t.start();
        }
    }
}
