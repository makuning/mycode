package connsq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlHlper {
    //定义变量
    String driver,url,user,psw;
    Connection c;
    //连接数据库方法
    public Connection getConn(){
        //mysql的驱动程序类
        driver = "com.mysql.cj.jdbc.Driver";
//        //SQLServer的驱动程序类
//        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        //mysql的url
        url = "jdbc:mysql://localhost:3306/soft1901?usessl=ture&serverTimezone=GMT";
//        //SQLServer的url
//        url = "jdbc:sqlserver://localhost:1433;DatabaseName=student";

        //mysql的用户名
        user = "root";
//        //SQLServer的用户名
//        user = "sa";

        //mysql的密码;
        psw = "mk20010624";
//        //SQLServer的密码;
//        psw = "fr100869";

        try {
            //1.加载驱动程序
            Class.forName(driver);
            //创建数据库连接对象
            c = DriverManager.getConnection(url,user,psw);
            System.out.println("数据库连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("数据库连接失败");
        }
        return c;
    }

    public static void main(String[] args) {
        MySqlHlper m = new MySqlHlper();
        m.getConn();
    }
}
