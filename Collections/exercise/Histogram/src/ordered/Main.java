package ordered;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Histogram
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] words = line.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer freq = map.get(word);
            if (freq == null) {
                freq = 0;
            }
            map.put(word, freq + 1);
        }
        Set<Pair> set = new TreeSet<>();
        for (String word : map.keySet()) {
            Integer freq = map.get(word);
            Pair p = new Pair(word, freq);
            set.add(p);
        }
        for (Pair p : set) {
            System.out.println(p);
        }
    }
}
