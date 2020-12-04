package com.makun.javase.chat;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServer extends JFrame implements Runnable,ActionListener{
	private JScrollPane scrollPane,eastScrollPane;
	private JTextArea txtContent;
	private JPanel southPanel;
	private JTextField txtTalk;
	private JButton btnSend;
	//静态的客户列表，保存每个客户的昵称和与之通话的socket
	public static HashMap<Socket, Vector<Object>> clientList=new HashMap<>();
	private List list;
	private ServerSocket sc;
	
	public ChatServer(){
		setTitle("网络聊天室——服务器");
		setLayout(new BorderLayout());
		txtContent=new JTextArea();
		scrollPane=new JScrollPane(txtContent);
		list=new List(10,true);
		eastScrollPane=new JScrollPane(list);
		txtTalk=new JTextField(28);
		btnSend=new JButton("发言");
		btnSend.addActionListener(this);
		southPanel=new JPanel(new FlowLayout());
		southPanel.add(txtTalk);
		southPanel.add(btnSend);
		add(eastScrollPane,"East");
		add(southPanel,"South");
		add(scrollPane,"Center");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		ChatServer chatServer=new ChatServer();
		chatServer.startNet();
	}
	private void startNet() {
		try {
			sc=new ServerSocket(22345);
			txtContent.append("等待客户连接...\n");
			/**
			 * 使用下面的线程t1来监听客户端的连接
			 */
			Thread t1=new Thread(this);
			t1.start();
			/**
			 * 监听客户是否关闭连接，实时更新客户列表的信息
			 */
			ListenClient lc=new ListenClient(list);
			Thread t2=new Thread(lc);
			t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			//对客户连接进行监听
			while(true){
				Socket socket=sc.accept();
				txtContent.append("有一个客户进来了。\n");
				/**
				 * 当一个客户连接进来之后，产生一个新的线程与客户通信
				 */
				Talk talk=new Talk(txtContent, socket);
				Thread t1=new Thread(talk);
				t1.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Vector<ObjectOutputStream> ooss=new Vector<>();
		UserData data=new UserData();
		data.setUserName("系统消息");
		data.setDate(new Date());
		data.setTalk(txtTalk.getText());
		HashSet<String> clientNames=new HashSet<>();
		Set<Socket> sockets=ChatServer.clientList.keySet();
		for (Socket sc : sockets) {
			clientNames.add((String)ChatServer.clientList.get(sc).get(0));
			ooss.add((ObjectOutputStream)clientList.get(sc).get(2));
		}
		data.setBroadcastClientList(clientNames);
		for(ObjectOutputStream oos:ooss){
			try {
				oos.writeObject(data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
