package lowLevelDesign.chess;

public class Player {

    private User user;
    private boolean isWhite;

    public Player(User user, boolean isWhite) {
        this.user = user;
        this.isWhite = isWhite;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }
}
