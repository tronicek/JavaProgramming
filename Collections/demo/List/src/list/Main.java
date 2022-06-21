package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }
}
