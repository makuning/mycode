package com.bjpowernode.javase.test005;

/**
 * �Զ�����������ͣ�
 * 		
 * 	this�����������
 * 		1.��������ʵ�������У�����ǰ�����﷨��ʽ��this.��
 *		2.�������ڹ��췽���У�ͨ����ǰ�Ĺ��췽�������������Ĺ��췽�����﷨��ʽ��this(ʵ��);��
 *
 *	�ص㡾���䡿��this()�����﷨ֻ�����ڹ��췽���еĵ�һ�С�
 */
public class Date {

	//�����ڵ����������Խ��з�װ
	private int year;
	private int month;
	private int day;
	
	//д�޲������췽��
	/**
	 * ���󣺵�����Ա�����޲������췽��ʱ������Ĭ��ֵΪ��1970-1-1
	 */
	public Date() {
	    //System.out.println();
		/*
		this.year=1970;
		this.month=1;
		this.day=1;
		*/
		
		//���˵�����Ժܶ࣬Ҫд�ܶ��д��룬��ô����һ��һ����������Ĭ��ֵ�Ƚ��鷳
		
		//���ϴ������ͨ��������һ�����췽�������
		//��ǰ�᡿�����ܴ����µĶ�������Ĵ��봴����һ���µĶ���
		//new Date(1970,1,1);
		
		//����ͨ�������޲����Ĺ��췽������ɴ����
		//�����﷨������ɡ�
		//���ַ�ʽ�����ᴴ��һ���µ�java����ͬʱ�ֿ��Դﵽ���������Ĺ��췽����Ŀ�ġ�
		this(1970,1,1);
	}
	
	//д�в������췽��
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//����set��get����
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	//�Զ��巽�������Դ�ӡ����������������
	
	public void print() {
		System.out.println(this.getYear()+"��"+this.getMonth()+"��"+this.getDay()+"��");
	}
	
}
