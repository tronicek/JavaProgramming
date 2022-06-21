package caesarcipher;

import java.util.Scanner;

/**
 * Caesar cipher
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        if (shift < 1 || shift > 25) {
            System.out.println("invalid shift: " + shift);
            return;
        }
        String cmd = sc.next();
        String msg = sc.nextLine().trim();
        switch (cmd) {
            case "encrypt":
                encrypt(shift, msg);
                break;
            case "decrypt":
                decrypt(shift, msg);
                break;
            default:
                System.out.println("invalid command: " + cmd);
        }
    }

    static void encrypt(int shift, String msg) {
        int size = 'z' - 'a' + 1;
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if ('a' <= c && c <= 'z') {
                int j = (c - 'a' + shift) % size;
                c = (char) ('a' + j);
            }
            System.out.print(c);
        }
        System.out.println();
    }

    static void decrypt(int shift, String msg) {
        int size = 'z' - 'a' + 1;
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if ('a' <= c && c <= 'z') {
                int j = (c - 'a' - shift + size) % size;
                c = (char) ('a' + j);
            }
            System.out.print(c);
        }
        System.out.println();
    }
}
