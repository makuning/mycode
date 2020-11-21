package D;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentView extends JFrame implements ActionListener {
	private JPanel mainPanel,leftPanel,xinPanel;
	private JTable table;
	private JScrollPane js;
	private DefaultTableModel dm;
	private JButton btnAdd,btnDel,btnEdit;
	private JTextField;



	public StudentView(){
		mainPanel=new JPanel(new BorderLayout());
		String [] headers={"学号","姓名","性别","年龄"};
		dm=new DefaultTableModel(headers,0);
		table=new JTable(dm);
		js=new JScrollPane(table);

		leftPanel = new JPanel();
		BoxLayout box=new BoxLayout(leftPanel,BoxLayout.Y_AXIS);//从上到下布局
		leftPanel.setLayout(box);
		btnAdd = new JButton("添加");
		btnDel = new JButton("删除");
		btnEdit = new JButton("修改");
		//
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnEdit.addActionListener(this);

		//
		try {
			fillData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
		setContentPane(mainPanel);
		mainPanel.add(js,"Center");
		leftPanel.add(Box.createVerticalStrut(20));
		leftPanel.add(btnAdd);
		leftPanel.add(Box.createVerticalStrut(20));
		leftPanel.add(btnDel);
		leftPanel.add(Box.createVerticalStrut(20));
		leftPanel.add(btnEdit);
		mainPanel.add(leftPanel,"West");
		//
		setBounds(200,200,500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void fillData() throws Exception {
		//清空数据
		int n = dm.getRowCount();
		for(int i=0;i<n;i++){
			dm.removeRow(0);
		}
		//填充数据

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
		sql.closeConn();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnAdd)){
		    add();
		}
		if(e.getSource().equals(btnDel)){
			try {
				del();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource().equals(btnEdit)){

		}
	}

    private void add() {
       JTextField jTextField = new JTextField(100);
       add(jTextField);

    }

    private void del() throws Exception {
		Object obj = dm.getValueAt(table.getSelectedRow(),0);
		//JOptionPane.showMessageDialog(this,obj);
		StudentDAO dao = new StudentDAO();
		dao.delete(obj.toString());
		fillData();
		sql.closeConn();
	}
}
