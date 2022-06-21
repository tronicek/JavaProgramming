package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator demo. It throws an exception.
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Austin", "Dallas", "Houston");
        for (Iterator<String> it = cities.iterator(); it.hasNext();) {
            String city = it.next();
            System.out.println(city);
            if (city.length() > 6) {
                it.remove();
            }
        }
    }
}
