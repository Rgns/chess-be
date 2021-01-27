package lowLevelDesign.chess;

public class Rook extends Piece {

    public Rook(boolean isWhite) {
        super(isWhite);
        super.name = "Rook";
    }

    @Override
    boolean canMove(Board board, Box start, Box end) {
        if (end.getPiece() != null && end.getPiece().isWhite() == this.isWhite()) { // same team
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        int tempX = start.getX();
        int tempY = start.getY();
        if (start.getX() > end.getX()) {

            while (tempX < end.getX()) {
                if (board.boxes[tempX][tempY].getPiece() == null) {
                    tempX--;
                } else {
                    return false;
                }
            }
        } else {
            while (tempX > end.getX()) {
                if (board.boxes[tempX][tempY].getPiece() == null) {
                    tempX++;
                } else {
                    return false;
                }
            }
        }
        if (start.getY() > end.getY()) {
            while (tempY < end.getY()) {
                if (board.boxes[tempX][tempY].getPiece() == null) {
                    tempY++;
                } else {
                    return false;
                }
            }
        } else {
            while (tempY > end.getY()) {
                if (board.boxes[tempX][tempY].getPiece() == null) {
                    tempY--;
                } else {
                    return false;
                }

            }
        }


        return true;
    }
}
