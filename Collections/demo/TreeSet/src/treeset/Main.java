package treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Hailey");
        names.add("Emma");
        names.add("Grayson");
        names.add("Frank");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
