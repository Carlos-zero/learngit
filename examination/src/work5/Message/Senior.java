package work5.Message;

public class Senior {
    private String senname;
    private String password;

    public Senior() {
    }

    public Senior(String senname, String password) {
        this.senname = senname;
        this.password = password;
    }

    public String getSenname() {
        return senname;
    }

    public void setSenname(String senname) {
        this.senname = senname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
