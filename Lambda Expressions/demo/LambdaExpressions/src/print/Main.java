package print;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * A lambda expression demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 19, 10, 42, 18, 26, 11);
        print(nums, new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i < 10;
            }
        });
        print(nums, (Integer i) -> {
            return i < 10;
        });
        print(nums, (Integer i) -> i < 10);
        print(nums, i -> i < 10);
    }

    static void print(List<Integer> nums, Predicate<Integer> p) {
        for (Integer num : nums) {
            if (p.test(num)) {
                System.out.println(num);
            }
        }
    }
}
