package comscitc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	private Connection conn;
	public StudentDAO(){
		try {
			conn=SqlHelper.getConn();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//添加纪录
	public void add(Student stu) throws SQLException{
		String sql="insert into student values('"+stu.getStuId()+"','"+stu.getStuName()+"'"
				+ ",'"+stu.getStuSex()+"',"+stu.getStuAge()+")";
		Statement state=conn.createStatement();
		state.executeUpdate(sql);
	}
	
	//删除记录
	public void delete(String stuId) throws SQLException{
		String sql="delete from student where stuId='" + stuId +"'";
		Statement state=conn.createStatement();
		state.execute(sql);
	}
	//修改纪录
	public void edit(Student stu) throws SQLException{
		String sql="update student set stuName='"+stu.getStuName()+"',stuSex='"+stu.getStuSex()+"',"
				+ "stuAge="+stu.getStuAge()+" where stuId='"+stu.getStuId()+"'";
		Statement state=conn.createStatement();
		state.executeUpdate(sql);
	}
	//根据主键查询
	public Student findById(String stuId) throws SQLException{
		String sql="select * from student where stuId='"+stuId+"'";
		Student stu=null;
		Statement state=conn.createStatement();
		ResultSet rs=state.executeQuery(sql);
		if(rs.next()){
			stu=new Student();
			stu.setStuId(stuId);
			stu.setStuName(rs.getString("stuName"));
			stu.setStuSex(rs.getString("stuSex"));
			stu.setStuAge(rs.getInt("stuAge"));
		}
		return stu;
	}
}
