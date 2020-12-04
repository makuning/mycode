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
				//�Ƴ��뿪�Ŀͻ�socket
				Set<Socket> keys=ChatServer.clientList.keySet();
				for (Socket sc : keys) {
					if(sc.isClosed()){
						ChatServer.clientList.keySet().remove(sc);
					}
				}
				//���µ��û��б���ڷ������Ľ�������ʾ
				list.removeAll();
				keys=ChatServer.clientList.keySet();
				for (Socket sc : keys) {
					list.add((String)ChatServer.clientList.get(sc).get(0));
				}
				//5��ˢ��һ��
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			
		}
	}
}
