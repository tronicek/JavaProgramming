package instancemethod;

import staticmethod.Vector;

/**
 * A reference to an instance method of a particular object
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        HarmonicSeries hs = new HarmonicSeries();
        Vector v = new Vector(6);
        v.initialize(hs::next);
        v.print();
    }
}
