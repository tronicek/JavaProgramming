package grobjects;

/**
 * Graphical objects
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        GrObject[] objs = new GrObject[4];
        objs[0] = new Rectangle(10, 20, 4, 5);
        objs[1] = new Square(20, 30, 6);
        objs[2] = new Ellipse(15, 15, 4, 6);
        objs[3] = new Circle(30, 40, 11);
        for (GrObject obj : objs) {
            obj.draw();
        }
    }
}
