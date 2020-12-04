package com.makun.javase.chat;

import java.awt.List;
import java.net.Socket;
import java.util.Set;

public class ListenClient implements Runnable {
	private List list;
	public ListenClient(List list) {
		this.list=list;
	}
	@Override
	public void run() {
		try {
			while(true){
				//移除离开的客户socket
				Set<Socket> keys=ChatServer.clientList.keySet();
				for (Socket sc : keys) {
					if(sc.isClosed()){
						ChatServer.clientList.keySet().remove(sc);
					}
				}
				//将新的用户列表放在服务器的界面上显示
				list.removeAll();
				keys=ChatServer.clientList.keySet();
				for (Socket sc : keys) {
					list.add((String)ChatServer.clientList.get(sc).get(0));
				}
				//5秒刷新一次
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			
		}
	}
}
