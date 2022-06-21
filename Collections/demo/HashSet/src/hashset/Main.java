package hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Arthur");
        names.add("Brenda");
        names.add("Carolin");
        names.add("Donald");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
