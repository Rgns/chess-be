package lowLevelDesign.chess;

public class User {

    private String name;
    private String userName;
    private String emailId;

    public User(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public User(String name, String userName, String emailId) {
        this(name, userName);
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
