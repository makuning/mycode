package com.makun.javase.chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.swing.JTextArea;

public class Talk implements Runnable {
	private JTextArea txtContent;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket socket;
	public Talk(JTextArea txtContent, Socket socket) {
		this.txtContent=txtContent;
		this.socket=socket;
	}

	@Override
	public void run() {
		try {
			if(socket.isConnected()){
				ois=new ObjectInputStream(socket.getInputStream());
				oos=new ObjectOutputStream(socket.getOutputStream());
			}
			while(socket.isConnected()){
				UserData data=(UserData)ois.readObject();
				/**
				 * 如果用户列表里面没有保存该客户的信息，则保存。
				 */
				boolean flag=false;
				Set<Socket> key=ChatServer.clientList.keySet();
				for (Socket sc : key) {
					if(sc==socket){
						flag=true;
						break;
					}
				}
				if(!flag){
					Vector<Object> v=new Vector<>();
					v.add(data.getUserName());
					v.add(ois);
					v.add(oos);
					ChatServer.clientList.put(socket, v);
				}
				Calendar cal=Calendar.getInstance();
				cal.setTime(data.getDate());
				int y=cal.get(Calendar.YEAR);
				int M=cal.get(Calendar.MONTH)+1;
				int d=cal.get(Calendar.DAY_OF_MONTH);
				int h=cal.get(Calendar.HOUR_OF_DAY);
				int m=cal.get(Calendar.MINUTE);
				int s=cal.get(Calendar.SECOND);
				String strTime = y + "-" + M + "-" + d + " "
						+ h + ":" + m + ":" + s;
				txtContent.append(data.getUserName() + " "+strTime+"\n");
				txtContent.append("  "	+ data.getTalk() +"\n");
				//服务器接收到客户端的数据后立刻转发给每个客户端
				Set<Socket> keys=ChatServer.clientList.keySet();
				for (Socket socket : keys) {
					if(socket.isConnected()){
						ObjectOutputStream oos=(ObjectOutputStream)ChatServer.clientList.get(socket).get(2);
						HashSet<String> clientNames=new HashSet<>();
						Set<Socket> sockets=ChatServer.clientList.keySet();
						for (Socket sc : sockets) {
							clientNames.add((String)ChatServer.clientList.get(sc).get(0));
						}
						if(socket.isConnected()){
							data.setBroadcastClientList(clientNames);
							oos.writeObject(data);
//							oos.writeObject(null);
							oos.flush();
						}
					}
				}
				
			}
		} catch (Exception e) {
			txtContent.append(ChatServer.clientList.get(socket).get(0)+"挥一挥手，离开了。\n");
		}
		finally{
			try {
				ois.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
