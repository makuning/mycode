package com.bjpowernode.javase.test008;

/**
 * ���й��ˡ���
 *
 */
public class Chinese {

	//���֤�š�ÿһ���й��˶������֤�Ų�һ����
	//ʵ������
	String id;
	
	//������ÿһ�������������ͬ��
	//ʵ������
	String name;
	
	//������ÿһ���й��˶��������ͬ�������й���
	//����ͨ��Chinese��ʵ�������ٸ�java������Щjava����Ĺ������ǡ��й���
	//ʵ��������ʵ��������һ��java�������һ�ݣ�100���������100��country��������������Ʒ�ʽ��ȱ�㡣
	//ʵ���������ڶ��ڴ棬���췽��ִ��ʱ��ʼ��
	String country;
	
	//�����޲������췽��
	public Chinese() {
		
	}
	
	//�����в�������
	public Chinese(String id,String name,String country) {
		this.id=id;
		this.name=name;
		this.country=country;
	}
	
	
}
