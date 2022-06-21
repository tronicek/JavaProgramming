package task6;

import java.util.Arrays;
import java.util.List;

/**
 * A lambda expression
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Jamie",
                "Chloe",
                "Carolin",
                "Amber",
                "Erin",
                "Jane",
                "Hannah",
                "Shady",
                "Jayla",
                "Tyra"
        );
        // call method forEach() so that it prints the names
        // for which test() returns true
        // expected output:
        // Jamie
        // Erin
        // Jane
        names.forEach(/* lambda expression */);
    }

    static boolean test(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowels++;
            }
        }
        return vowels >= (str.length() + 1) / 2;
    }
}
