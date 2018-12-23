package work5.Message;

public class Student {
    private String stuname;
    private String password;
    private int num;

    public Student() {
    }

    public Student(String stuname, String password, int num) {
        this.stuname = stuname;
        this.password = password;
        this.num = num;
    }

    public Student(String stuname, String password) {
        this.stuname = stuname;
        this.password = password;
    }

    public Student(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getStuname() {
        return stuname;
    }
}
