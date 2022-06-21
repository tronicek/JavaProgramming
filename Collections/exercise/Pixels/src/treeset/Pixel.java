package treeset;

/**
 * Pixel
 *
 * @author Zdenek Tronicek
 */
public class Pixel implements Comparable<Pixel> {

    private final int x;
    private final int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("[%d,%d]", x, y);
    }

    @Override
    public int compareTo(Pixel p) {
        if (x < p.x) {
            return -1;
        }
        if (x > p.x) {
            return 1;
        }
        if (y < p.y) {
            return -1;
        }
        if (y > p.y) {
            return 1;
        }
        return 0;
    }
}
