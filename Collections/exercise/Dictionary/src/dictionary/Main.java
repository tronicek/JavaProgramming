package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Dictionary
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("cat", "gato");
        dict.put("dog", "perro");
        dict.put("house", "casa");
        dict.put("city", "ciudad");
        Scanner sc = new Scanner(System.in);
        String eng = sc.next();
        String spa = dict.get(eng);
        System.out.println("English to Spanish translation:");
        if (spa == null) {
            System.out.printf("%s: unknown word%n", eng);
        } else {
            System.out.printf("%s -> %s%n", eng, spa);
        }
    }
}
