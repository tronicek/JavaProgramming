package grobjects;

/**
 * Ellipse
 *
 * @author Zdenek Tronicek
 */
public class Ellipse extends GrObject {

    protected final int a;
    protected final int b;

    public Ellipse(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.printf("draw ellipse [%d,%d,%d,%d]%n", x, y, a, b);
    }

    @Override
    public void hide() {
        System.out.printf("hide ellipse [%d,%d,%d,%d]%n", x, y, a, b);
    }

    public double area() {
        return Math.PI * a * b;
    }
}
