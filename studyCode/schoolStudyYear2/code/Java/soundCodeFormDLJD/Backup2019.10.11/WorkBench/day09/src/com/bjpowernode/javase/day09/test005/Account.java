package com.bjpowernode.javase.day09.test005;

//�˻���
public class Account {

	//�˺�
	private String actno;
	
	//���
	private double balance;

	//�޲���������
	public Account() {
		//��ʼ��ʵ���������ڴ�ռ�
		//actno=null;
		//balance=0.0;
	}
	
	public Account(String s) {
		actno = s;
	}

	public Account(double d) {
		balance = d;
	}
	
	public Account(String s, double d) {
		actno = s;
		balance = d;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
