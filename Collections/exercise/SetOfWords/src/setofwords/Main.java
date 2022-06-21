package setofwords;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set of words
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split("\\s+");
        Set<String> set = new TreeSet<>();
        for (String word : words) {
            set.add(word);
        }
        for (String word : set) {
            System.out.println(word);
        }
    }
}
