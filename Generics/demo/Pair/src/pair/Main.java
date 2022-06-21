package pair;

/**
 * Pair demo
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1, "one");
        System.out.println(p);
        Pair<String, Integer> q = new Pair<>("two", 2);
        System.out.println(q);
    }
}
