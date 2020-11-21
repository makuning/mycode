import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlHelper {
    private static Connection conn;
    public static Connection getConn() throws ClassNotFoundException, SQLException, IOException{

        // 1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.创建一个连接
        // url
		String url="jdbc:mysql://localhost:3306/soft1901?useSSL=FALSE&serverTimezone=UTC&" +
                "useUnicode=true&characterEncoding=UTF-8";
		// user
        String user = "root";
        // password
        String pwd = "mk20010624";
        conn = DriverManager.getConnection(url, user, pwd);

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