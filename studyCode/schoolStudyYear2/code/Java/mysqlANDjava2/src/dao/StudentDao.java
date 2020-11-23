package dao;

import connsq.MySqlHlper;
import mode.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    //完成对student的增、删、改、查
    //创建Connection数据库连接对象
    Connection conn;
    public StudentDao(){
        conn = new MySqlHlper().getConn();
    }
    //查询所有学生     <> 泛型
    public List<Student> findAll(){
        //定义list集合
        List<Student> list = new ArrayList<>();
        //定义sql语句
        String sql = "select * from student";
        try {
            Statement st = conn.createStatement();
            //执行sql语句
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                Student s = new Student();
                s.setStu_id(rs.getString(1));
                s.setStu_name(rs.getString(2));
                s.setStu_sex(rs.getString(3));
                s.setStu_birth(rs.getString(4));
//                s.setStu_dept(rs.getString(5));
                list.add(s);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

}
