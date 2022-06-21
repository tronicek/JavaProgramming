package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap demo
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("one", 1);
        m.put("two", 2);
        m.put("three", 3);
        m.put("four", 4);
        m.put("five", 5);
        m.put("six", 6);
        m.put("seven", 7);
        m.put("eight", 8);
        for (String key : m.keySet()) {
            Integer value = m.get(key);
            System.out.printf("%s:%d%n", key, value);
        }
    }
}
