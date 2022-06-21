package dynamicarray;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        DynamicArray p = new DynamicArray(1);
        p.add(2);
        p.add(3);
        p.add(5);
        p.add(7);
        p.add(11);
        for (Integer v : p) {
            System.out.println(v);
        }
    }
}
