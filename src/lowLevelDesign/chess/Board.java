package lowLevelDesign.chess;

public class Board {

    private final int ROW = 8;
    private final int COL = 8;
    Box[][] boxes;

    Board() {
        initializeBoard();
        printBoardState();
    }

    public void initializeBoard() {
        boxes = new Box[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                boxes[i][j] = new Box(i, j, null);
            }
        }
        initializeWhitePieces(0, true);
        initializeWhitePieces(7, false);
    }

    public void printBoardState() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (boxes[i][j].getPiece() == null) {
                    System.out.print("               |    ");
                } else {
                    System.out.print("    " + boxes[i][j].getPiece().name + "      |    ");
                }
            }
            System.out.println();
        }
    }

    private void initializeWhitePieces(int row, boolean isWhite) {
        for (int j = 0; j < COL; j++) {
            if (j == 0 || j == 7) {
                boxes[row][j] = new Box(row, j, new Rook(isWhite));
            } else if (j == 1 || j == 6) {
                boxes[row][j] = new Box(row, j, new Knight(isWhite));
            } else if (j == 2 || j == 5) {
                boxes[row][j] = new Box(row, j, new Bishop(isWhite));
            } else if (j == 3) {
                if (isWhite) {
                    boxes[row][j] = new Box(row, j, new Queen(isWhite));
                } else {
                    boxes[row][j] = new Box(row, j, new King(isWhite));
                }
            } else if (j == 4) {
                if (isWhite) {
                    boxes[row][j] = new Box(row, j, new King(isWhite));
                } else {
                    boxes[row][j] = new Box(row, j, new Queen(isWhite));
                }
            }
        }
    }
}


