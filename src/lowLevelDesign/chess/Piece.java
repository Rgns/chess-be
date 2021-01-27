package lowLevelDesign.chess;

public abstract class Piece {

    private boolean isKilled = false;
    private boolean isWhite = false;
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    abstract boolean canMove(Board board, Box start, Box end);
}
