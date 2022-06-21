package task15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * A reference to an instance method
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Fraction> ff = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Fraction f = new Fraction(1, i);
            ff.add(f);
        }
        Fraction sum = new Fraction(0, 1);
        // call reduce() so that it sums fractions in ff
        // by method add() in Fraction
        reduce(ff, /* method reference */);
        // expected output: 7381/2520
        System.out.println(sum);
    }

    static void reduce(List<Fraction> ff, Consumer<Fraction> func) {
        for (Fraction f : ff) {
            func.accept(f);
        }
    }
}
