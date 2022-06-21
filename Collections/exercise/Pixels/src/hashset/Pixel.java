package hashset;

/**
 * Pixel
 *
 * @author Zdenek Tronicek
 */
public class Pixel {

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
    public boolean equals(Object obj) {
        if (obj instanceof Pixel p) {
            return x == p.x && y == p.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}
