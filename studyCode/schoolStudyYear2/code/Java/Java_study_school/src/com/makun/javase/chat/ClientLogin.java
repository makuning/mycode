package com.makun.javase.chat;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClientLogin extends JFrame implements ActionListener{
	private JLabel lblName,lblTitle,lblMsg;
	private JTextField txtName;
	private JButton btnLogin,btnExit;
	public ClientLogin(){
		lblName=new JLabel("Í«≥∆:");
		lblTitle=new JLabel("Õ¯¬Á¡ƒÃÏ “");
		lblTitle.setFont(new Font("∫⁄ÃÂ",Font.PLAIN,30));
		lblMsg=new JLabel();
		txtName=new JTextField();
		btnLogin=new JButton("µ«¬º");
		btnExit=new JButton("ÕÀ≥ˆ");
		///
		lblTitle.setBounds(70,20,270,40);
		lblName.setBounds(50,70,50,25);
		txtName.setBounds(100,70,150,25);
		btnLogin.setBounds(60,105,70,25);
		btnExit.setBounds(170,105,70,25);
		lblMsg.setBounds(50,140,170,25);
		lblMsg.setForeground(Color.red);
		///
		add(lblTitle);
		add(lblName);
		add(txtName);
		add(btnLogin);
		add(btnExit);
		add(lblMsg);
		btnExit.addActionListener(this);
		btnLogin.addActionListener(this);
		////
		setLayout(null);
		setSize(300,200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ClientLogin();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnExit)){
			System.exit(1);
		}
		if(e.getSource().equals(btnLogin)){
			if(txtName.getText()==null||txtName.getText().trim().equals("")){
				lblMsg.setText("ƒ„±ÿ–Î ‰»ÎÍ«≥∆£°");
			}else {
				this.dispose();
				ChatClient chatClient=new ChatClient(txtName.getText());
				chatClient.getNet();
			}
		}
	}

}
