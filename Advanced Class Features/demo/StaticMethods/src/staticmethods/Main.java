package staticmethods;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Static methods
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m != 0) {
            BigDecimal amount = new BigDecimal(m);
            Invoice i = new Invoice(amount);
            send(i);
            m = sc.nextInt();
        }
    }
    
    static void send(Invoice invoice) {
        System.out.printf("Sending %s...%n", invoice);
    }
}
