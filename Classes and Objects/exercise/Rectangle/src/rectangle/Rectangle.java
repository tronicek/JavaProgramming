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

    public Rectangle(int w, int h) {
        width = w;
        height = h;
        color = "purple";
    }

    public Rectangle(int w, int h, String c) {
        width = w;
        height = h;
        color = c;
    }

    public void print() {
        System.out.printf("rectangle [%d, %d, %s]%n", width, height, color);
    }
}
