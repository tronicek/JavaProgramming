package reversedinput;

import java.util.Scanner;

/**
 * Reversed input
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double[] values = new double[m];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextDouble();
        }
        reverse(values);
        print(values);
    }

    static void reverse(double[] values) {
        for (int i = 0, j = values.length - 1; i < j; i++, j--) {
            double d = values[i];
            values[i] = values[j];
            values[j] = d;
        }
    }

    static void print(double[] values) {
        for (double d : values) {
            System.out.printf("%.2f ", d);
        }
        System.out.println();
    }
}
