package editdistance;

import java.util.Scanner;

/**
 * Edit distance
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int dist = editDistance(s1, s2);
        System.out.println(dist);
    }

    static int editDistance(String s1, String s2) {
        int[][] d = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < d.length; i++) {
            d[i][0] = i;
        }
        for (int j = 0; j < d[0].length; j++) {
            d[0][j] = j;
        }
        for (int i = 1; i < d.length; i++) {
            for (int j = 1; j < d[i].length; j++) {
                char c1 = s1.charAt(i - 1);
                char c2 = s2.charAt(j - 1);
                if (c1 == c2) {
                    d[i][j] = d[i - 1][j - 1];
                } else {
                    d[i][j] = min(d[i][j - 1], d[i - 1][j - 1], d[i - 1][j]) + 1;
                }
            }
        }
        return d[s1.length()][s2.length()];
    }

    static int min(int a, int b, int c) {
        int m = (a < b) ? a : b;
        return (m < c) ? m : c;
    }
}
