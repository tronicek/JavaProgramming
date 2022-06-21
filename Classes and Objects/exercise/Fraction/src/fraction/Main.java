package fraction;

/**
 * Main
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(14, 22);
        Fraction f2 = new Fraction(3, 5);
        f1.add(f2);
        f1.print();
    }
}
