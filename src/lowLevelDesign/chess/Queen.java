package lowLevelDesign.chess;

public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
        super.name = "Queen";
    }

    @Override
    boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
