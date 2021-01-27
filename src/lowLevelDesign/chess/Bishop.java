package lowLevelDesign.chess;

public class Bishop extends Piece{

    public Bishop(boolean isWhite) {
        super(isWhite);
        super.name = "Bishop";
    }

    @Override
    boolean canMove(Board board, Box start, Box end) {
        if (end.getPiece().isWhite() == this.isWhite()) { // same team
            return false;
        }
        int startX = start.getX();
        int endX = end.getX();
        int startY = start.getY();
        int endY = end.getY();
        int x = Math.abs(startX - endX);
        int y = Math.abs(startY - endY);
        if(x == y){
            int tempX = startX;
            int tempY = startY;
            if(startX > endX){
                if(startY > endY){
                    while (tempX > endX && tempY < endY ){
                        if (board.boxes[tempX][tempY].getPiece() == null){
                            tempX--;
                            tempY++;
                        }else {
                            return false;
                        }
                    }

                }else {

                    while (tempX > endX && tempY > endY ){
                        if (board.boxes[tempX][tempY].getPiece() == null){
                            tempX--;
                            tempY--;
                        }else {
                            return false;
                        }
                    }

                }
            }else {
                if(startY > endY){
                    while (tempX < endX && tempY < endY ){
                        if (board.boxes[tempX][tempY].getPiece() == null){
                            tempX++;
                            tempY++;
                        }else {
                            return false;
                        }
                    }

                }else {

                    while (tempX < endX && tempY > endY ){
                        if (board.boxes[tempX][tempY].getPiece() == null){
                            tempX++;
                            tempY--;
                        }else {
                            return false;
                        }
                    }

                }
            }
        }
        return false;
    }
}
