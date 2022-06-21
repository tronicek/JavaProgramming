package task3;

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
        // sort the countries in reversed lexicographical order
        countries.sort(/* lambda expression */);
        // expected output:
        // Venezuela
        // Uruguay
        // United States
        // Peru
        // Paraguay
        // Panama
        // Nicaragua
        // Mexico
        // Honduras
        // Guyana
        // Guatemala
        // Ecuador
        // Cuba
        // Costa Rica
        // Colombia
        // Chile
        // Canada
        // Brazil
        // Bolivia
        // Argentina        
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
