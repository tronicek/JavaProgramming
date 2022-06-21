package knights;

import java.util.Scanner;

/**
 * Knights
 *
 * @author Zdenek Tronicek
 */
public class Main {

    static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < s.length(); i += 2) {
            int col = s.charAt(i) - 'a';
            int row = s.charAt(i + 1) - '1';
            board[row][col] = 1;
        }
        mark(board);
        int c = count(board);
        System.out.println(c);
    }

    static void mark(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    check(board, i + 2, j + 1);
                    check(board, i + 2, j - 1);
                    check(board, i - 2, j + 1);
                    check(board, i - 2, j - 1);
                    check(board, i + 1, j + 2);
                    check(board, i + 1, j - 2);
                    check(board, i - 1, j + 2);
                    check(board, i - 1, j - 2);
                }
            }
        }
    }

    static void check(int[][] board, int i, int j) {
        if (0 <= i && i < BOARD_SIZE && 0 <= j && j < BOARD_SIZE) {
            if (board[i][j] == 0) {
                board[i][j] = 2;
            }
        }
    }
    
    static int count(int[][] board) {
        int c = 0;
        for (int[] row : board) {
            for (int sq : row) {
                if (sq > 0) {
                    c++;
                }
            }
        }
        return c;
    }
}
