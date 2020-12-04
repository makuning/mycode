package com.makun.javase.chat;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
/**
 * ������һ�����ݰ����࣬�������л���
 * ����ÿ�����Զ������ǿ����л��ġ�
 * ������Ҫ���ڿͻ��˺ͷ�������ͨ��
 * �����е����ݷ�װ�� 
 */
public class UserData implements Serializable{
	private String userName;//�ǳ�
	private HashSet<String> clientList; //Ŀ�ĵ��б��ͻ���ʹ��
	private HashSet<String> broadcastClientList; //�㲥�б�������ʹ��
	private String talk;//�ͻ�����
	private Date date;//����ʱ��
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTalk() {
		return talk;
	}
	public void setTalk(String talk) {
		this.talk = talk;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public HashSet<String> getClientList() {
		return clientList;
	}
	public void setClientList(HashSet<String> clientList) {
		this.clientList = clientList;
	}
	public HashSet<String> getBroadcastClientList() {
		return broadcastClientList;
	}
	public void setBroadcastClientList(HashSet<String> broadcastClientList) {
		this.broadcastClientList = broadcastClientList;
	}
}
