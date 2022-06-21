package circle;

/**
 * Circle
 *
 * @author Zdenek Tronicek
 */
public class Circle {

    double radius;
    String color;

    Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public void print() {
        System.out.printf("circle [%.2f, %s]%n", radius, color);
    }
}
