package tictactoe;

import java.util.Scanner;

/**
 * Tic-tac-toe
 *
 * @author Zdenek Tronicek
 */
public class Main {

    static final int BOARD_SIZE = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int m = 0; m < s.length(); m++) {
            int i = m / BOARD_SIZE;
            int j = m % BOARD_SIZE;
            board[i][j] = s.charAt(m);
        }
        if (won(board, 'x')) {
            System.out.println("X won");
        } else if (won(board, 'o')) {
            System.out.println("O won");
        } else if (draw(board)) {
            System.out.println("Draw");
        } else {
            System.out.println("In progress");
        }
    }

    static boolean won(char[][] board, char who) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == who && board[i][1] == who && board[i][2] == who) {
                return true;
            }
        }
        for (int j = 0; j < BOARD_SIZE; j++) {
            if (board[0][j] == who && board[1][j] == who && board[2][j] == who) {
                return true;
            }
        }
        if (board[0][0] == who && board[1][1] == who && board[2][2] == who) {
            return true;
        }
        if (board[0][2] == who && board[1][1] == who && board[2][0] == who) {
            return true;
        }
        return false;
    }

    static boolean draw(char[][] board) {
        for (char[] row : board) {
            for (char sq : row) {
                if (sq == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
