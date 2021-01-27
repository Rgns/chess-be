package lowLevelDesign.chess;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentPlayer;
    private GameStatus gameStatus;

    public Game(Player p1, Player p2) {
        players = new Player[2];
        board = new Board();
        initializeGame(p1, p2);
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    private void initializeGame(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;
        board.initializeBoard();
        if (p1.isWhite()) {
            this.currentPlayer = p1;
        } else {
            this.currentPlayer = p2;
        }
    }

    public boolean playerMove(Player currentPlayer, int startX, int startY, int endX, int endY) {
        Box start = board.boxes[startX][startY];
        Box end = board.boxes[endX][endY];
        Piece sourcePiece = start.getPiece();
        boolean canMove = sourcePiece.canMove(board, start, end);
        if (canMove) {
            Piece endPiece = end.getPiece();
            if (endPiece != null) {
                endPiece.setKilled(true);

            }
            if (checkIfPlayerWon(end)) {
                gameStatus = GameStatus.WON;
                end.setPiece(sourcePiece);
                System.out.println("Game Over " + currentPlayer.getUser().getName() + " won");
                return false;
            }
            end.setPiece(sourcePiece);
            board.boxes[startX][startY].setPiece(null);
            changeTurn();
            return true;
        }
        System.out.println("Move not allowed!");
        return false;
    }

    private void changeTurn() {

        if (currentPlayer == players[0]) {
            currentPlayer = players[1];
        } else {
            currentPlayer = players[0];
        }
    }

    private boolean checkIfPlayerWon(Box end) {
        return end.getPiece() instanceof Queen;
    }

}
