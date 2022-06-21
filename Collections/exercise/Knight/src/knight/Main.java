package knight;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Knight
 *
 * @author Zdenek Tronicek
 */
public class Main {

    static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        int colStart = source.charAt(0) - 'a';
        int rowStart = source.charAt(1) - '1';
        board[rowStart][colStart] = 1;
        String dest = sc.next();
        int colEnd = dest.charAt(0) - 'a';
        int rowEnd = dest.charAt(1) - '1';
        if (rowStart == rowEnd && colStart == colEnd) {
            System.out.println("The knight is on the destination square.");
            return;
        }
        Queue<Square> queue = new ArrayDeque<>();
        queue.add(new Square(rowStart, colStart));
        while (!queue.isEmpty()) {
            Square sq = queue.remove();
            int row = sq.getRow();
            int col = sq.getCol();
            int dist = board[row][col];
            check(board, row + 2, col + 1, dist + 1, queue);
            check(board, row + 2, col - 1, dist + 1, queue);
            check(board, row - 2, col + 1, dist + 1, queue);
            check(board, row - 2, col - 1, dist + 1, queue);
            check(board, row + 1, col + 2, dist + 1, queue);
            check(board, row + 1, col - 2, dist + 1, queue);
            check(board, row - 1, col + 2, dist + 1, queue);
            check(board, row - 1, col - 2, dist + 1, queue);
            if (board[rowEnd][colEnd] > 0) {
                System.out.printf("The shortest path has %d moves.%n", board[rowEnd][colEnd] - 1);
                break;
            }
        }
    }

    static void check(int[][] board, int i, int j, int dist, Queue<Square> queue) {
        if (0 <= i && i < BOARD_SIZE && 0 <= j && j < BOARD_SIZE) {
            if (board[i][j] == 0) {
                board[i][j] = dist;
                Square sq = new Square(i, j);
                queue.add(sq);
            }
        }
    }
}
