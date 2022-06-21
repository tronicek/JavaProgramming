package phonekeypad;

import java.util.Scanner;

/**
 * Phone keypad
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String word = s.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char key = map(c);
            if (i > 0) {
                System.out.print("-");
            }
            System.out.print(key);
        }
        System.out.println();
    }

    static char map(char c) {
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
                return '2';
            case 'd':
            case 'e':
            case 'f':
                return '3';
            case 'g':
            case 'h':
            case 'i':
                return '4';
            case 'j':
            case 'k':
            case 'l':
                return '5';
            case 'm':
            case 'n':
            case 'o':
                return '6';
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return '7';
            case 't':
            case 'u':
            case 'v':
                return '8';
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return '9';
            default:
                return '?';
        }
    }
}
