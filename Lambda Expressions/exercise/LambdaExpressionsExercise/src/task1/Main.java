package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda expressions
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nats = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            nats.add(i);
        }
        // call removeIf() so that it removes even numbers
        nats.removeIf(m -> m % 2 == 0);
        // call removeIf() so that it removes multiples of 3
        nats.removeIf(/* lambda expression */);
        // call removeIf() so that it removes multiples of 5
        nats.removeIf(/* lambda expression */);
        // expected output: [1, 7, 11, 13, 17, 19]
        System.out.println(nats);
    }
}
