package task2;

import java.util.Arrays;
import java.util.List;

/**
 * A lambda expression
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        primes.replaceAll(m -> 2 * m);
        System.out.println(primes);
    }
}
