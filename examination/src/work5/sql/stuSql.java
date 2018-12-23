package work5.sql;

import work5.Message.Senior;
import work5.Message.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class stuSql {
    public static JdbcUtils conn = new JdbcUtils();           //实例化连接数据库的方法

    public void update(int num, String stuname) throws SQLException {        //注册用户使用
        Connection connection = conn.getConnection();             //连接数据库
        PreparedStatement statement = null;                       //
        String sql="UPDATE students SET num= ? WHERE stuname=? ";
        statement=connection.prepareStatement(sql);
        statement.setInt(1,num);
        statement.setString(2,stuname);
        statement=connection.prepareStatement(sql);
        statement.executeUpdate();
        JdbcUtils.close(connection,statement);
    }
    public Student studentlogin(String username, String password) throws SQLException{
        Student user=null;
        Connection connection=conn.getConnection();
        PreparedStatement statement=null;
        String sql="select * from students where stuname=? and password=?";
        statement=connection.prepareStatement(sql);
        statement.setString(1,username);
        statement.setString(2,password);
        ResultSet resultSet=statement.executeQuery();
        if (resultSet.next()) {
            user=new Student();
            user.setStuname(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
        }
        JdbcUtils.close(connection,statement,resultSet);
        return user;
    }
    public Senior login(String username, String password) throws SQLException{
        Senior user=null;
        Connection connection=conn.getConnection();
        PreparedStatement statement=null;
        String sql="select * from users where username=? and password=?";
        statement=connection.prepareStatement(sql);
        statement.setString(1,username);
        statement.setString(2,password);
        ResultSet resultSet=statement.executeQuery();
        if (resultSet.next()) {
            user=new Senior();
            user.setSenname(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
        }
        JdbcUtils.close(connection,statement,resultSet);
        return user;
    }
}
