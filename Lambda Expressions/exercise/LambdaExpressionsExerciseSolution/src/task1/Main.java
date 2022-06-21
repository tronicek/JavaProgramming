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
        nats.removeIf(m -> m % 2 == 0);
        nats.removeIf(m -> m % 3 == 0);
        nats.removeIf(m -> m % 5 == 0);
        System.out.println(nats);
    }
}
