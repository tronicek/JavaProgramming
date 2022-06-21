package hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Points in HashSet
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Set<Pixel> pp = new HashSet<>();
        pp.add(new Pixel(7, 4));
        pp.add(new Pixel(7, 5));
        pp.add(new Pixel(6, 6));
        pp.add(new Pixel(5, 5));
        pp.add(new Pixel(4, 4));
        pp.add(new Pixel(3, 3));
        pp.add(new Pixel(3, 5));
        pp.add(new Pixel(2, 2));
        pp.add(new Pixel(2, 6));
        pp.add(new Pixel(2, 7));
        for (Pixel p : pp) {
            System.out.println(p);
        }
    }
}
