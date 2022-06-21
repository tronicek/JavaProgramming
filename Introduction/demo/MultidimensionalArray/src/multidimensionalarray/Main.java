package multidimensionalarray;

import java.util.Scanner;

/**
 * Multidimensional array
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        int[][] sq = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sq.length; i++) {
            for (int j = 0; j < sq[i].length; j++) {
                sq[i][j] = sc.nextInt();
            }
        }
        print(sq);
    }
    
    static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int m : row) {
                System.out.printf("%d ", m);
            }
            System.out.println();
        }
    }
}
