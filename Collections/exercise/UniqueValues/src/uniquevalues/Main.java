package uniquevalues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Unique values
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m != 0) {
            if (!queue.contains(m)) {
                queue.add(m);
            }
            m = sc.nextInt();
        }
        for (int v : queue) {
            System.out.println(v);
        }
    }
}
