package polynomial;

/**
 * Main
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Polynomial p = new Polynomial(new int[]{1, 2, 3, 4, 5});
        p.print();
        Polynomial q = new Polynomial(new int[]{-1, -2, -3});
        q.print();
        p.add(q);
        p.print();
    }
}
