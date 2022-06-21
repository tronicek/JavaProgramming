package circle;

import java.util.Scanner;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double r3 = sc.nextDouble();
        Circle c1 = new Circle(r1, "purple");
        Circle c2 = new Circle(r2, "pink");
        Circle c3 = new Circle(r3, "green");
        c1.print();
        c2.print();
        c3.print();
    }
}
