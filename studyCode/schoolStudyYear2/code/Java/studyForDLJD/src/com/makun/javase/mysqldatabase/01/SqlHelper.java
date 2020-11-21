

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class SqlHelper {
	private static Connection conn;
	public static Connection getConn() throws ClassNotFoundException, SQLException, IOException{
		Properties prop=new Properties();
		prop.load(SqlHelper.class.getClassLoader().getResourceAsStream("prop.properties"));
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String user=prop.getProperty("user");
		String pwd=prop.getProperty("pwd");
		//1.������������
//		Class.forName(driver);
		Class.forName("com.mysql.cj.jdbc.Driver");  // mysql
		//2.����һ������
//		String url="jdbc:sqlserver://localhost:1433;databaseName=soft1901";
		conn=DriverManager.getConnection(url,user,pwd);
		//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_demo","root","password");
		return conn;//Ӳ����
	}
	public static void closeConn(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
//	public static void main(String[] args) {
//		try {
//			Connection c=getConn();
//		//	System.out.print("���ݿ����ӳɹ���");
//			//��ѯ����
//			//1.����statement��һ������
//			Statement state=c.createStatement();
//			//2.��дsql���
//			String sql="select * from student";
//			//3.ִ��sql
//			ResultSet rs=state.executeQuery(sql);
//			//4.��ʾ����
//			System.out.print("ѧ��\t����\t�Ա�\t����\n");
//			while(rs.next()){
//				String id=rs.getString("stuId");
//				String name=rs.getString("stuName");
//				String sex=rs.getString("stuSex");
//				int age=rs.getInt("stuAge");
//				System.out.print(id+"\t"+name+"\t"+sex+"\t"+age+"\n");
//			}
//			//5.�ر�����
//			c.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
}
