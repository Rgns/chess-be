package lowLevelDesign.chess;

public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
        super.name = "King";
    }

    @Override
    boolean canMove(Board board, Box start, Box end) {
        if (end.getPiece().isWhite() == this.isWhite()) { // same team
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x + y == 1 && end.getPiece() == null) { // neibighor check
            return true;
        } else return x + y == 2;
    }
}
