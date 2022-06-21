package task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * A reference to an instance method
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(2);
        set.add(9);
        set.add(8);
        set.add(3);
        set.add(5);
        set.add(4);
        List<Integer> list = new ArrayList<>();
        // call apply() so that it adds the values in set into list
        apply(set, /* method reference */);
        // expected output:
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9
        // 10
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    static void apply(Set<Integer> nums, Consumer<Integer> cons) {
        for (Integer num : nums) {
            cons.accept(num);
        }
    }
}
