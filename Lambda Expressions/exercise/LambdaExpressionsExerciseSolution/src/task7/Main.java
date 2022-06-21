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
        fill(nums, () -> rand.nextInt(100));
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
