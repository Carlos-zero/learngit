package work5.Service;

import work5.Message.Shop;
import work5.Message.Student;
import work5.Message.Things;
import work5.sql.stuSql;

import java.sql.SQLException;

public class ThingService {     //该方法用于学院购买商品
    public void shopThing(String thing, Student student, Things things) throws SQLException {
        Shop shop=new Shop(things);
        if (thing.equals(shop.getThings().getName())){
            if (student.getNum() >= shop.getThings().getPrice()){
                int yue=student.getNum()-shop.getThings().getPrice();
                stuSql stuSql=new stuSql();
                stuSql.update(yue,student.getStuname());
            }else {
                System.out.println("您的积分不足！");
            }
        }else {
            System.out.println("没有您需要的商品！");
        }
    }
}
