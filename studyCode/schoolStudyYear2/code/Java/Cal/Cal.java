import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import javax.swing.text.JTextComponent;


import java.awt.event.ActionListener;

public class Cal extends JFrame{
	private JPanel mainPanel,topPanel,buttomPanel;
	public static JTextField txtResult;
	private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
					btnJia,btnJian,btnCheng,btnChu,btnDian,btnDeng;
	static String calScreen = "0";


	public Cal(){
		
		mainPanel=new JPanel(new FlowLayout());
		topPanel=new JPanel(new FlowLayout());
		buttomPanel=new JPanel(new GridLayout(4,4,2,2));
		this.setContentPane(mainPanel);
		mainPanel.add(topPanel);
		mainPanel.add(buttomPanel);
		txtResult=new JTextField(10);
		txtResult.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,20));
		topPanel.add(txtResult);

		//
		btn0=new MyButton("0");
		btn1=new MyButton("1");
		btn2=new MyButton("2");
		btn3=new MyButton("3");
		btn4=new MyButton("4");
		btn5=new MyButton("5");
		btn6=new MyButton("6");
		btn7=new MyButton("7");
		btn8=new MyButton("8");
		btn9=new MyButton("9");
		btnJia=new MyButton("+");
		btnJian=new MyButton("-");
		btnCheng=new MyButton("*");
		btnChu=new MyButton("/");
		btnDian=new MyButton(".");
		btnDeng=new MyButton("=");
		//
		buttomPanel.add(btn1);
		buttomPanel.add(btn2);
		buttomPanel.add(btn3);
		buttomPanel.add(btnJia);
		buttomPanel.add(btn4);
		buttomPanel.add(btn5);
		buttomPanel.add(btn6);
		buttomPanel.add(btnJian);
		buttomPanel.add(btn7);
		buttomPanel.add(btn8);
		buttomPanel.add(btn9);
		buttomPanel.add(btnCheng);
		buttomPanel.add(btn0);
		buttomPanel.add(btnDian);
		buttomPanel.add(btnDeng);
		buttomPanel.add(btnChu);
		//
		this.setBounds(200,200,250,255);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//µã»÷°´Å¥ÔÚÆÁÄ»¿òÏÔÊ¾°´Å¥ÄÚÈÝ
		
		btn0.addActionListener(new MyBtnListener('0'));
		// btn1.addActionListener(new MyBtnListener('1'));
		// btn2.addActionListener(new MyBtnListener('2'));
		// btn3.addActionListener(new MyBtnListener('3'));
		// btn4.addActionListener(new MyBtnListener('4'));
		// btn5.addActionListener(new MyBtnListener('5'));
		// btn6.addActionListener(new MyBtnListener('6'));
		// btn7.addActionListener(new MyBtnListener('7'));
		// btn8.addActionListener(new MyBtnListener('8'));
		// btn9.addActionListener(new MyBtnListener('9'));
		// btnJia.addActionListener(new MyBtnListener('+'));
		// btnJian.addActionListener(new MyBtnListener('-'));
		// btnCheng.addActionListener(new MyBtnListener('*'));
		// btnChu.addActionListener(new MyBtnListener('/'));
		// btnDian.addActionListener(new MyBtnListener('.'));
		// btnDeng.addActionListener(new MyBtnListener('='));

	}
}

class MyBtnListener implements ActionListener{
	public static String btnValue = "";

	@Override
	public void actionPerformed(ActionEvent event){
		Cal.calScreen = MyBtnListener.btnValue;
		String str = String.valueOf(Cal.calScreen);
		Cal.txtResult.setText(str);
	}
	// public static void screenChange(char btnVal){
	// 	String str = String.valueOf(btnVal);
	// 	MyBtnListener.btnValue = str;
	// }
	public MyBtnListener(char btnVal){
		//MyBtnListener.screenChange(btnVal);
		String str = String.valueOf(btnVal);
		MyBtnListener.btnValue = str;
	}

}