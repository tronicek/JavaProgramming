package stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Stack
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        d.push(5);
        while (!d.isEmpty()) {
            Integer i = d.pop();
            System.out.println(i);
        }
    }
}
