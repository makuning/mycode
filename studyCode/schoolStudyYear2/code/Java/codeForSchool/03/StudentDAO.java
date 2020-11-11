import java.sql.Connection;
import java.sql.SQLException;

public class StudentDAO {
    private Connection conn;
    public StudentDAO () {
        try {
            conn = SqlHelper.getConn();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // 添加记录

    public void add (Student stu) {
        String sql = "insert into student values('" + stu.getStuId() 
        + "','" + stu.getStuName() + ",'" + stu.getStuSex() + "'," + stu.getStuAge() + ")";

        Statement state = conn.createStatement();
        
    }
}
