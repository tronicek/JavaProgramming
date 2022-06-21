package calculator;

/**
 * Calculator
 *
 * @author Zdenek Tronicek
 */
public class Calculator {

    private double result;

    public double add(double value) {
        result += value;
        return result;
    }

    public double subtract(double value) {
        result -= value;
        return result;
    }

    public double multiply(double value) {
        result *= value;
        return result;
    }

    public double divide(double value) {
        result /= value;
        return result;
    }

    public double squared() {
        result *= result;
        return result;
    }

    public double sqrt() {
        result = Math.sqrt(result);
        return result;
    }

    public double changeSign() {
        result = -result;
        return result;
    }

    public double get() {
        return result;
    }

    public void set(double result) {
        this.result = result;
    }
}
