package calculator;

/**
 * Main
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.set(10);
        calc.add(2);
        calc.multiply(3);
        calc.divide(4);
        calc.sqrt();
        System.out.println(calc.get());
    }
}
