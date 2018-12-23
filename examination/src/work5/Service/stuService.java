package work5.Service;

import work5.Message.Student;
import work5.sql.stuSql;

import java.sql.SQLException;

public class stuService {       //该方法用于学长修改学员积分
    public void stuService(String senname, String password, Student student,int num) throws SQLException {
        //调用数据库核对学长信息

        stuSql stuSql=new stuSql();

        if (stuSql.login(senname,password)!=null) {
            stuSql.update(num, student.getStuname());        //修改成员积分
        }else {
            System.out.println("密码错误，无法登录");
        }
    }
}
