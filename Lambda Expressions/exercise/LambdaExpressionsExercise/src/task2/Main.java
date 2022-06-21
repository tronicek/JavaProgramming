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
        // call replaceAll() so that it increases the values by a factor of two
        primes.replaceAll(/* lambda expression */);
        // expected output: [4, 6, 10, 14, 22, 26, 34, 38]
        System.out.println(primes);
    }
}
