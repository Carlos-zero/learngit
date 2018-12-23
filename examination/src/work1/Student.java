package work1;

public class Student {

    private String stuid;
    private String name;
    private int usenum;

    public Student(String stuid,String name){
        this.stuid=stuid;
        this.name=name;
    }


    public String getStuid() {
        return stuid;
    }

    public String getName() {
        return name;
    }

    public int getUsenum() {
        return usenum;
    }

    public void setUsenum() {
        this.usenum++;
    }

}
