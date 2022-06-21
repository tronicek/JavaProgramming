package grobjects;

/**
 * Rectangle
 *
 * @author Zdenek Tronicek
 */
public class Rectangle extends GrObject {

    protected final int width;
    protected final int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("draw rectangle [%d,%d,%d,%d]%n", x, y, width, height);
    }

    @Override
    public void hide() {
        System.out.printf("hide rectangle [%d,%d,%d,%d]%n", x, y, width, height);
    }

    public double area() {
        return width * height;
    }

    public int circumference() {
        return 2 * (width + height);
    }
}
