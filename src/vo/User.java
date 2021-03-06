package vo;

public class User {
    private String userName;
    private String passWord;
    private String chrName;
    private String role;

    public User(String userName, String passWord, String chrName, String role) {
        this.userName = userName;
        this.passWord = passWord;
        this.chrName = chrName;
        this.role = role;
    }

    public User() {
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getChrName() {
        return chrName;
    }

    public void setChrName(String chrName) {
        this.chrName = chrName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
