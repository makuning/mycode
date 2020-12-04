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
	//��̬�Ŀͻ��б�����ÿ���ͻ����ǳƺ���֮ͨ����socket
	public static HashMap<Socket, Vector<Object>> clientList=new HashMap<>();
	private List list;
	private ServerSocket sc;
	
	public ChatServer(){
		setTitle("���������ҡ���������");
		setLayout(new BorderLayout());
		txtContent=new JTextArea();
		scrollPane=new JScrollPane(txtContent);
		list=new List(10,true);
		eastScrollPane=new JScrollPane(list);
		txtTalk=new JTextField(28);
		btnSend=new JButton("����");
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
			txtContent.append("�ȴ��ͻ�����...\n");
			/**
			 * ʹ��������߳�t1�������ͻ��˵�����
			 */
			Thread t1=new Thread(this);
			t1.start();
			/**
			 * �����ͻ��Ƿ�ر����ӣ�ʵʱ���¿ͻ��б����Ϣ
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
			//�Կͻ����ӽ��м���
			while(true){
				Socket socket=sc.accept();
				txtContent.append("��һ���ͻ������ˡ�\n");
				/**
				 * ��һ���ͻ����ӽ���֮�󣬲���һ���µ��߳���ͻ�ͨ��
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
		data.setUserName("ϵͳ��Ϣ");
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
