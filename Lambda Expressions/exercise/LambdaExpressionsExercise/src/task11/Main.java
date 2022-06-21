package task11;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * A lambda expression
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-10, -3, -8, -6, -9, -4, -5, -1, -2, -7);
        // call reduce() so that it returns the maximum value in nums
        Integer m = reduce(nums, nums.get(0), /* lambda expression */);
        // expected output: -1
        System.out.println(m);
    }

    public static <T> T reduce(List<T> list, T init, BinaryOperator<T> oper) {
        T result = init;
        for (T t : list) {
            result = oper.apply(result, t);
        }
        return result;
    }
}
