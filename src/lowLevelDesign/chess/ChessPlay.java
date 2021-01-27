package lowLevelDesign.chess;

public class ChessPlay {
    public static void main(String[] args) {

        Player p1 = new Player(new User("Ritu","rg"),true);
        Player p2 = new Player(new User("Akash","aka"),false);
        Game chess = new Game(p1,p2);
        System.out.println(chess.getCurrentPlayer().getUser().getName());
        chess.playerMove(p1,0,0,1,0);
        chess.getBoard().printBoardState();
        System.out.println(chess.getCurrentPlayer().getUser().getName());
    }
}
