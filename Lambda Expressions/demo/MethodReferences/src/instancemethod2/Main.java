package instancemethod2;

import java.util.function.Function;

/**
 * A reference to an instance method
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        print(m -> m / 2.0f);
        print(Float::intBitsToFloat);
        print(Integer::floatValue);
    }

    static void print(Function<Integer, Float> func) {
        float f = func.apply(42);
        System.out.println(f);
    }
}
