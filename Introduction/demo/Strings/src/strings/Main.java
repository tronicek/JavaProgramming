package strings;

import java.util.Scanner;

/**
 * Strings
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            System.out.println(c);
        }
        String word2 = word + ":" + word;
        System.out.println(word2);
    }
}
