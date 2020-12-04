package com.makun.javase.chat;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener{
	private JScrollPane scrollPane,eastScrollPane;
	private JTextArea txtContent;
	private JPanel southPanel;
	private JTextField txtTalk;
	private JButton btnSend;
	private List list;
	private ObjectOutputStream oos;
	private String txtName;
	public static HashSet<String> clientList;
	public ChatClient(String txtName){
		clientList=new HashSet<>();
		setLayout(new BorderLayout());
		txtContent=new JTextArea();
		scrollPane=new JScrollPane(txtContent);
		list=new List(10,true);
		eastScrollPane=new JScrollPane(list);
		txtTalk=new JTextField(28);
		btnSend=new JButton("发言");
		southPanel=new JPanel(new FlowLayout());
		southPanel.add(txtTalk);
		southPanel.add(btnSend);
		add(eastScrollPane,"East");
		add(southPanel,"South");
		add(scrollPane,"Center");
		btnSend.addActionListener(this);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.txtName=txtName;
		setTitle(txtName+"，网络聊天室欢迎您！");
	}
	public void getNet(){
		try {
			Socket socket=new Socket("127.0.0.1",22345);
			txtContent.append("连接进服务器了。。。\n");
			UserData data=new UserData();
			data.setUserName(txtName);
			data.setTalk("大家好.");
			data.setDate(new Date());
			if(socket.isConnected()){
				oos=new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(data);
			}
			/**
			 * 读取服务器的数据
			 */
			ReadServerData ls=new ReadServerData(list,socket,txtContent,txtName);
			Thread t1=new Thread(ls);
			t1.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnSend)){
			if(txtContent.getText().equals("")){
				return;
			}
			HashSet<String> set=new HashSet<>();
			String[] strs=list.getSelectedItems();
			String strClientList="";
			for (String string : strs) {
				set.add(string);
				if(!string.equals(txtName))
					strClientList=strClientList+" "+string;
			}
			UserData data=new UserData();
			data.setUserName(txtName);
			data.setDate(new Date());
			data.setTalk(txtTalk.getText());
			data.setClientList(set);
			
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(data.getDate());
			int y = cal.get(Calendar.YEAR);
			int M = cal.get(Calendar.MONTH) + 1;
			int d = cal.get(Calendar.DAY_OF_MONTH);
			int h = cal.get(Calendar.HOUR_OF_DAY);
			int m = cal.get(Calendar.MINUTE);
			int s = cal.get(Calendar.SECOND);
			String strTime = y + "-" + M + "-" + d + " "
					+ h + ":" + m + ":" + s;
			txtContent.append("我对"+strClientList+"说" + " "+strTime+"\n");
			txtContent.append("  "	+ data.getTalk() +"\n");
			txtTalk.setText("");
			try {
				oos.writeObject(data);
				oos.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
