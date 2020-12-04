package com.makun.javase.chat;

import java.awt.List;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.HashSet;

import javax.swing.JTextArea;
public class ReadServerData implements Runnable {
	private List list;
	private Socket socket;
	private JTextArea txtConetent;
	private ObjectInputStream ois;
	private String txtName;

	public ReadServerData(List list, Socket socket, JTextArea txtContent,
			String txtName) {
		this.list = list;
		this.socket = socket;
		this.txtConetent = txtContent;
		this.txtName = txtName;
	}

	@Override
	public void run() {
		try {
			ObjectInputStream ois = new ObjectInputStream(
					socket.getInputStream());// /////////////
			while (socket.isConnected()) {
				UserData data = (UserData) ois.readObject();
				if (data != null) {
					if (null == data.getClientList()) {
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
						txtConetent.append(data.getUserName() + " "+strTime+"\n");
						txtConetent.append("  "	+ data.getTalk() +"\n");
					} else {
						HashSet<String> set = data.getClientList();
						for (String name : set) {
							if (name.equals(txtName)
									&& !data.getUserName().equals(txtName)) {
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
								txtConetent.append(data.getUserName() + " "+strTime+"\n");
								txtConetent.append("  "	+ data.getTalk() +"\n");
							}
						}
					}
					ChatClient.clientList = data.getBroadcastClientList();
					list.removeAll();
					for (String str : ChatClient.clientList) {
						list.add(str);
					}
				}
			}
		} catch (Exception e) {
			txtConetent.append("服务器断开了连接！\n");
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
	}
}
