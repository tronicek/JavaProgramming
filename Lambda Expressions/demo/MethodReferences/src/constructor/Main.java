package constructor;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * A reference to a constructor
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        BigDecimal d = convert(s -> new BigDecimal(s));
        System.out.println(d);
        BigDecimal d2 = convert(BigDecimal::new);
        System.out.println(d2);
    }

    static BigDecimal convert(Function<String, BigDecimal> func) {
        return func.apply("3.14159265");
    }
}
