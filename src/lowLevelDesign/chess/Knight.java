package lowLevelDesign.chess;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
        super.name = "Knight";
    }

    @Override
    boolean canMove(Board board, Box start, Box end) {
        if (end.getPiece().isWhite() == this.isWhite()) { // same team
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        return x * y == 2;
    }
}
