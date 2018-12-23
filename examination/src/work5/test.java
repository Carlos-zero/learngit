package work5;

import work5.Message.Student;
import work5.Service.stuService;
import work5.sql.stuSql;

import java.sql.SQLException;

public class test {

    public static void main(String args[]) throws SQLException {
        stuService stuService=new stuService();
        stuSql stuSql=new stuSql();
        Student student=stuSql.studentlogin("test","123");
        stuService.stuService("CCC","123",student,200);
    }
}
