package century;

import java.util.Scanner;

/**
 * Century
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1 || year > 2050) {
            System.out.println("The input year must be between 1 and 2050 (inclusive).");
            return;
        }
        int cent = (year - 1) / 100 + 1;
        switch (cent) {
            case 1:
            case 21:
                System.out.printf("%d is the %dst century.%n", year, cent);
                break;
            case 2:
                System.out.printf("%d is the %dnd century.%n", year, cent);
                break;
            case 3:
                System.out.printf("%d is the %drd century.%n", year, cent);
                break;
            default:
                System.out.printf("%d is the %dth century.%n", year, cent);
        }
    }
}
