package reversedorder;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Reversed order
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        String[] names = {"Julia", "Jamie", "Melanie", "Tyra", "Emma"};
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                if (name1.length() < name2.length()) {
                    return 1;
                }
                if (name1.length() > name2.length()) {
                    return -1;
                }
                return name2.compareTo(name1);
            }
        });
        for (String name : names) {
            System.out.println(name);
        }
    }
}
