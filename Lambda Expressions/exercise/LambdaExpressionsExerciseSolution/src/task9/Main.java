package task9;

import java.util.Arrays;
import java.util.List;

/**
 * A reference to a static method
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Person> pp = Arrays.asList(
                new Person("Jamie", 178),
                new Person("Chloe", 175),
                new Person("Carolin", 182),
                new Person("Amber", 185),
                new Person("Erin", 178),
                new Person("Jane", 178),
                new Person("Hannah", 175),
                new Person("Shady", 182),
                new Person("Jayla", 175),
                new Person("Tyra", 175)
        );
        pp.sort(Person::compare);
        for (Person p : pp) {
            System.out.println(p);
        }
    }
}
