package copy;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Integer[] primes = {2, 3, 5, 7, 11};
        List<Integer> pp = new ArrayList<>();
        copy(primes, pp);
        System.out.println(pp);
    }

    static <T> void copy(T[] src, List<T> dst) {
        for (T t : src) {
            dst.add(t);
        }
    }
}
