package knight;

/**
 * Square on a chessboard
 *
 * @author Zdenek Tronicek
 */
public class Square {

    private final int row;
    private final int col;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square sq) {
            return row == sq.row && col == sq.col;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 37 * row + col;
    }
}
