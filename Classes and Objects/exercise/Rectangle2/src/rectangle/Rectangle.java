package rectangle;

/**
 * Rectangle
 *
 * @author Zdenek Tronicek
 */
public class Rectangle {

    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height) {
        this(width, height, "purple");
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void print() {
        System.out.printf("rectangle [%d, %d, %s]%n", width, height, color);
    }
}
