package task10;

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
        List<Integer> nums = Arrays.asList(10, 3, 8, 6, 9, 4, 5, 1, 2, 7);
        Integer m = reduce(nums, 0, (x, y) -> x + y);
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
