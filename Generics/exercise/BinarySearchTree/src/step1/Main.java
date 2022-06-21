package step1;

import java.util.Scanner;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Tree t = new Tree();
        // 7 3 13 2 5 11 17 0
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        while (v != 0) {
            t.add(v);
            v = sc.nextInt();
        }
        t.print();
        int m = sc.nextInt();
        if (t.contains(m)) {
            System.out.printf("%d is in the tree%n", m);
        } else {
            System.out.printf("%d is not in the tree%n", m);
        }
    }
}
