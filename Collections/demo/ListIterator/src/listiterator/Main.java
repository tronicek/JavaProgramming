package listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * List iterator demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        ListIterator<Integer> it = primes.listIterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.printf("%d ", i);
        }
        System.out.println();
        while (it.hasPrevious()) {
            int i = it.previous();
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
