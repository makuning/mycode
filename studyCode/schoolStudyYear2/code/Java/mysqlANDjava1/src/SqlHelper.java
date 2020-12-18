import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SqlHelper {
    private static Connection conn;
    public static Connection getConn() throws ClassNotFoundException, SQLException, IOException{

        // 获取配置文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("config");

        // 获取配置文件中的值
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        // 1.加载驱动程序
        Class.forName(driver);
        // 2.创建一个连接,传入用户名和密码
        conn = DriverManager.getConnection(url, user, password);

        return conn;//硬编码
    }

    // 关闭
    public static void closeConn(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}