package histogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        for (String word : map.keySet()) {
            Integer freq = map.get(word);
            System.out.printf("%s: %d%n", word, freq);
        }
    }
}
