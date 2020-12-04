package com.makun.javase.chat;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
/**
 * 该类是一个数据包的类，必须序列化，
 * 并且每个属性都必须是可序列化的。
 * 该类主要用于客户端和服务器在通信
 * 过程中的数据封装。 
 */
public class UserData implements Serializable{
	private String userName;//昵称
	private HashSet<String> clientList; //目的地列表，客户端使用
	private HashSet<String> broadcastClientList; //广播列表，服务器使用
	private String talk;//客户发言
	private Date date;//发言时间
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
