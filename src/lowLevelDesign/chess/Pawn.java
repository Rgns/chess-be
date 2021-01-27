package lowLevelDesign.chess;

public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
        super.name = "Pawn";
    }

    @Override
    boolean canMove(Board board, Box start, Box end) {
        if (end.getPiece().isWhite() == this.isWhite()) { // same team
            return false;
        }
        int x = start.getX() - end.getX();
        int y = Math.abs(start.getY() - end.getY());
        if (x == 1 && y == 0 && end.getPiece() == null) { // neibighor check
            return true;
        } else if (x == 1 && y == 1 && end.getPiece() != null) {
            return true;
        }
        return false;
    }
}
