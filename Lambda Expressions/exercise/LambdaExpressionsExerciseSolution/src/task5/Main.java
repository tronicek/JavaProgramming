package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * A lambda expression
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            nums.add(i);
        }
        print(nums, m -> m % 11 == 0);
    }

    static void print(List<Integer> nums, Predicate<Integer> p) {
        for (Integer num : nums) {
            if (p.test(num)) {
                System.out.println(num);
            }
        }
    }
}
