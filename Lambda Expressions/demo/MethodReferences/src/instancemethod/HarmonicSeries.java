package instancemethod;

/**
 * Harmonic series
 *
 * @author Zdenek Tronicek
 */
public class HarmonicSeries {

    private int denominator;

    public double next() {
        denominator++;
        return 1.0 / denominator;
    }
}
