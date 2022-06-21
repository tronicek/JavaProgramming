package genericmethod;

/**
 * Generic method
 *
 * @author Zdenek Tronicek
 */
public class Util {

    public static <T> T[] fill(T[] p, T v) {
        for (int i = 0; i < p.length; i++) {
            p[i] = v;
        }
        return p;
    }
}
