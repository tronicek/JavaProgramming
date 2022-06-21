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
        // call apply() so that it applies swap() in Point
        // on each point in pp
        apply(pp, /* method reference */);
        // expected output:
        // [20,10]
        // [40,30]
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
