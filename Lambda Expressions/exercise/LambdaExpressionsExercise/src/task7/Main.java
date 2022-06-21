package task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * A lambda expression
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        // call method fill so that it fills nums with
        // random integers 0 thru 99
        fill(nums, /* lambda expression */);
        // example of output:
        // 32
        // 27
        // 90
        // 86
        // 91
        // 28
        // 98
        // 1
        // 38
        // 43
        for (Integer num : nums) {
            System.out.println(num);
        }
    }

    static void fill(List<Integer> nums, Supplier<Integer> supp) {
        for (int i = 0; i < 10; i++) {
            nums.add(supp.get());
        }
    }
}
