package comscitc;

import java.sql.SQLException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s=new Student();
//		s.setStuId("900");
//		s.setStuName("Å·Ñô·æ");
//		s.setStuSex("ÄÐ");
//		s.setStuAge(63);
		StudentDAO dao=new StudentDAO();
//		try {
//			dao.add(s);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		
//		try {
//			dao.delete("900");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			s=dao.findById("003");
			s.setStuName("»ÆÈØ");
			s.setStuSex("Å®");
			dao.edit(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		SqlHelper.closeConn();
	}

}
