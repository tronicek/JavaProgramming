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
        // sort the countries by the length of name; countries with the 
        // same length sort lexicographically
        countries.sort(/* lambda expression */);
        // expected output:
        // Cuba
        // Peru
        // Chile
        // Brazil
        // Canada
        // Guyana
        // Mexico
        // Panama
        // Bolivia
        // Ecuador
        // Uruguay
        // Colombia
        // Honduras
        // Paraguay
        // Argentina
        // Guatemala
        // Nicaragua
        // Venezuela
        // Costa Rica
        // United States        
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
