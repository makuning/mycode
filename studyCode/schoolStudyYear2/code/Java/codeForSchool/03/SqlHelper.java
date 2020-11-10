import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlHelper {
    private static Connection conn;
    public static Connection getConn() throws ClassNotFoundException,SQLException {
        // 1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.创建一个连接
        String url = "jdbc:mysql://localhost:3306/soft1901";
        conn = DriverManager.getConnection(url,"root","");
        return conn;
    }
    public static void closeConn () {
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main (String[] args) {
        try {
            Connection c = getConn();
            System.out.println("lianjiechenggong ");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}