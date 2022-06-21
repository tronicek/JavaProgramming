package task8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * A reference to an instance method
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        // call method apply() so that it prints all values in primes
        apply(primes, /* method reference */);
    }

    static void apply(List<Integer> nums, Consumer<Integer> cons) {
        for (Integer num : nums) {
            cons.accept(num);
        }
    }
}
