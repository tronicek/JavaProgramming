package treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>(new StringComparator());
        m.put("one", 1);
        m.put("two", 2);
        m.put("three", 3);
        m.put("four", 4);
        m.put("five", 5);
        m.put("six", 6);
        m.put("seven", 7);
        m.put("eight", 8);
        for (String key : m.keySet()) {
            System.out.println(key);
        }
    }
}
