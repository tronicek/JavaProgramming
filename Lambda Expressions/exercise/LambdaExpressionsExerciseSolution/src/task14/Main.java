package task14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * A reference to a static method
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Point> pp = new ArrayList<>();
        pp.add(new Point(10, 20));
        pp.add(new Point(30, 40));
        apply(pp, Point::swap);
        for (Point p : pp) {
            System.out.println(p);
        }
    }
    
    static void apply(List<Point> pp, Consumer<Point> func) {
        for (Point p : pp) {
            func.accept(p);
        }
    }
}
