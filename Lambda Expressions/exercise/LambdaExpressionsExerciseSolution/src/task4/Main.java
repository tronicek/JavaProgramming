package task4;

import java.util.Arrays;
import java.util.List;

/**
 * A lambda expression
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<String> countries = Arrays.asList(
                "Canada", "United States", "Mexico", "Cuba",
                "Guatemala", "Honduras", "Nicaragua", "Costa Rica",
                "Panama", "Venezuela", "Colombia", "Guyana",
                "Ecuador", "Brazil", "Peru", "Bolivia",
                "Paraguay", "Chile", "Uruguay", "Argentina"
        );
        countries.sort((c1, c2) -> {
            if (c1.length() < c2.length()) {
                return -1;
            }
            if (c1.length() > c2.length()) {
                return 1;
            }
            return c1.compareTo(c2);
        });
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
