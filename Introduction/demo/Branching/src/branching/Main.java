package branching;

import java.util.Scanner;

/**
 * Branching
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        printDay(day);
    }

    static void printDay(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
            case 6:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("invalid day");
        }
    }

    static void printDay2(int day) {
        switch (day) {
            case 0 -> System.out.println("Monday");
            case 1 -> System.out.println("Tuesday");
            case 2 -> System.out.println("Wednesday");
            case 3 -> System.out.println("Thursday");
            case 4 -> System.out.println("Friday");
            case 5, 6 -> System.out.println("Weekend");
            default -> System.out.println("invalid day");
        }
    }
}
