package staticmethod;

import java.util.function.Supplier;

/**
 * A vector of double values
 *
 * @author Zdenek Tronicek
 */
public class Vector {

    private final double[] values;

    public Vector(int m) {
        values = new double[m];
    }

    public void initialize(Supplier<Double> sup) {
        for (int i = 0; i < values.length; i++) {
            values[i] = sup.get();
        }
    }

    public void print() {
        for (double d : values) {
            System.out.printf("%f ", d);
        }
        System.out.println();
    }
}
