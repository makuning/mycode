import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWin extends JFrame implements ActionListener{
	public JPanel mainPanel;//面板
	public JLabel lblLogin,lblUserName,lblUserPwd;
	public JTextField txtUserName;
	public JPasswordField txtPwd;
	public JButton btnLogin,btnExit;
	
	public MyWin(){
		setTitle("我的窗口");
		//this.setBounds(200, 200, 500, 300);
		this.setLocation(200,200);
		this.setSize(500, 300);
		///
		mainPanel=new JPanel(null);
		this.setContentPane(mainPanel);
		lblLogin=new JLabel("用户登录",JLabel.RIGHT);
		Font font=new Font("黑体", Font.BOLD, 32);
		lblLogin.setFont(font);
		lblLogin.setForeground(Color.red);
		lblUserName=new JLabel("登录名");
		lblUserPwd=new JLabel("密码",JLabel.RIGHT);
		txtUserName=new JTextField(30);
		txtPwd=new JPasswordField(30);
		btnLogin=new JButton("登录");
		btnExit=new JButton("退出");
		//
		btnLogin.addActionListener(this);
		btnExit.addActionListener(this);
		//
		lblLogin.setBounds(180,20,200,100);
		lblUserName.setBounds(50,100,90,30);
		txtUserName.setBounds(140,100,250,30);
		lblUserPwd.setBounds(50,140,90,30);
		txtPwd.setBounds(140,140,250,30);
		btnLogin.setBounds(160,180,60,30);
		btnExit.setBounds(280,180,60,30);
		//
//		lblUserName.setHorizontalAlignment(JLabel.RIGHT);
//		lblUserPwd.setHorizontalAlignment(JLabel.RIGHT);
		//
		mainPanel.add(lblLogin);
		mainPanel.add(lblUserName);
		mainPanel.add(txtUserName);
		mainPanel.add(lblUserPwd);
		mainPanel.add(txtPwd);
		mainPanel.add(btnLogin);
		mainPanel.add(btnExit);
		//
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnLogin)){
			String msg="登录名："+txtUserName.getText();
			msg+=",密码："+(new String(txtPwd.getPassword()));
			JOptionPane.showMessageDialog(this,msg);
		}
		if(e.getActionCommand().equals("退出")){
			System.exit(0);
		}
	}
}