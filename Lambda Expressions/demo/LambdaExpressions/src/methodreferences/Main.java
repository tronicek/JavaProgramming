package methodreferences;

import java.util.Arrays;
import java.util.List;

/**
 * A lambda expression demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 5, 7, 11);
        nums.forEach(i -> {
            print(i);
        });
        nums.forEach(System.out::println);
        nums.forEach(Main::print);
    }

    static void print(Integer i) {
        System.out.println(i);
    }
}
