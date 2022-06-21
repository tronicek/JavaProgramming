package fraction;

/**
 * Fraction
 *
 * @author Zdenek Tronicek
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private void reduce() {
        if (numerator == 0) {
            return;
        }
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        numerator /= a;
        denominator /= a;
    }

    public void add(Fraction f) {
        numerator = numerator * f.denominator + denominator * f.numerator;
        denominator = denominator * f.denominator;
        reduce();
    }

    public void add(int m) {
        numerator += m * denominator;
        reduce();
    }

    public void subtract(Fraction f) {
        numerator = numerator * f.denominator - denominator * f.numerator;
        denominator = denominator * f.denominator;
        reduce();
    }

    public void subtract(int m) {
        numerator -= m * denominator;
        reduce();
    }

    public void multiply(Fraction f) {
        numerator *= f.numerator;
        denominator *= f.denominator;
        reduce();
    }

    public void multiply(int m) {
        numerator *= m;
        reduce();
    }

    public void print() {
        System.out.printf("%d/%d%n", numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
