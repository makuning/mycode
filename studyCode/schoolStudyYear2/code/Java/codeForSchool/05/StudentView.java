

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentView extends JFrame{
	private JPanel mainPanel;
	private JTable table;
	private JScrollPane js;
	private DefaultTableModel dm;
	public StudentView(){
		mainPanel=new JPanel(new BorderLayout());
		String [] headers={"ѧ��","����","�Ա�","����"};
		dm=new DefaultTableModel(headers,0);
		table=new JTable(dm);
		js=new JScrollPane(table);
		//
		try {
			fillData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
		setContentPane(mainPanel);
		mainPanel.add(js,"Center");
		//
		setBounds(200,200,500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void fillData() throws Exception {
		StudentDAO dao=new StudentDAO();
		List<Student> list=dao.findAll();
		Object[] objs=new Object[4];
		for (Student s : list) {
			objs[0]=s.getStuId();
			objs[1]=s.getStuName();
			objs[2]=s.getStuSex();
			objs[3]=s.getStuAge();
			dm.addRow(objs);
		}
		SqlHelper.closeConn();
	}
}
