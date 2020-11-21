package D;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	private Connection conn;
	public StudentDAO() throws IOException{
		try {
			conn=sql.getConn();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//��Ӽ�¼
	public void add(Student stu) throws SQLException{
		String sql="insert into student values('"+stu.getStuId()+"','"+stu.getStuName()+"'"
				+ ",'"+stu.getStuSex()+"',"+stu.getStuAge()+")";
		Statement state=conn.createStatement();
		state.executeUpdate(sql);
	}
	//ʹ��Ԥ�����statment
	public void add1(Student stu) throws SQLException{
		String sql="insert into student(stuId,stuName,stuSex,stuAge) values(?,?,?,?)";
		PreparedStatement pState=conn.prepareStatement(sql);
		pState.setString(1, stu.getStuId());
		pState.setString(2, stu.getStuName());
		pState.setString(3, stu.getStuSex());
		pState.setInt(4, stu.getStuAge());
		pState.executeUpdate();
	}
	
	//ɾ����¼
	public void delete(String stuId) throws SQLException{
		String sql="delete from student where stuId='" + stuId +"'";
		Statement state=conn.createStatement();
		state.execute(sql);
	}
	//ɾ��
	public void delete1(String stuId) throws SQLException{
		String sql="delete from student where stuId=?";
		PreparedStatement pState=conn.prepareStatement(sql);
		pState.setString(1, stuId);
		pState.executeUpdate();
	}
	//�޸ļ�¼
	public void edit(Student stu) throws SQLException{
		String sql="update student set stuName='"+stu.getStuName()+"',stuSex='"+stu.getStuSex()+"',"
				+ "stuAge="+stu.getStuAge()+" where stuId='"+stu.getStuId()+"'";
		Statement state=conn.createStatement();
		state.executeUpdate(sql);
	}
	//�޸�
	public void edit1(Student stu) throws SQLException{
		String sql="update student set stuName=?,stuSex=?,stuAge=? where stuId=?";
		PreparedStatement pState=conn.prepareStatement(sql);
		pState.setString(4, stu.getStuId());
		pState.setString(1, stu.getStuName());
		pState.setString(2, stu.getStuSex());
		pState.setInt(3, stu.getStuAge());
		pState.executeUpdate();
	}
	//����������ѯ
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
	//��ѯ
	public Student findById1(String stuId) throws SQLException{
		String sql="select * from student where stuId=?";
		Student stu=null;
		PreparedStatement pState=conn.prepareStatement(sql);
		pState.setString(1, stuId);
		ResultSet rs=pState.executeQuery();
		if(rs.next()){
			stu=new Student();
			stu.setStuId(stuId);
			stu.setStuName(rs.getString("stuName"));
			stu.setStuSex(rs.getString("stuSex"));
			stu.setStuAge(rs.getInt("stuAge"));
		}
		return stu;
	}
	//��ѯ���м�¼
	public List<Student> findAll() throws SQLException{
		String sql="select * from student";
		List<Student> list=new ArrayList<Student>();
		Statement state=conn.createStatement();
		ResultSet rs=state.executeQuery(sql);
		while(rs.next()){
			Student stu=new Student();
			stu.setStuId(rs.getString("stuId"));
			stu.setStuName(rs.getString("stuName"));
			stu.setStuSex(rs.getString("stuSex"));
			stu.setStuAge(rs.getInt("stuAge"));
			list.add(stu);
		}
		return list;
	}
	//�������Բ�ѯ
	public List<Student> findByProperty(String proName,Object proValue) throws SQLException{
		String sql="select * from student";
		if(proValue instanceof String){
			sql+=" where "+proName+" like '%"+proValue+"%'";
		}else{
			sql+=" where "+proName+"="+proValue;
		}
		List<Student> list=new ArrayList<Student>();
		Statement state=conn.createStatement();
		ResultSet rs=state.executeQuery(sql);
		while(rs.next()){
			Student stu=new Student();
			stu.setStuId(rs.getString("stuId"));
			stu.setStuName(rs.getString("stuName"));
			stu.setStuSex(rs.getString("stuSex"));
			stu.setStuAge(rs.getInt("stuAge"));
			list.add(stu);
		}
		return list;
	}
}
