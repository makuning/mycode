package com.bjpowernode.javase.test004;

/**
 * ��this.��ʲôʱ����ʡ�ԣ�
 * 		��������ʵ�������;ֲ�������ʱ��
 *
 */
public class User {

	//����˽�л�����װ��
	private int id;
	private String name;
	
	//д�ղ������췽����
	public User() {
		
	}
	
	//д���ݲ����Ĺ��췽��
	/*
	public User(int a,String b) {
		id=a;
		name=b;
	}
	*/
	
	//this����ʡ�ԡ�
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//����set����
	/*
	public void setId(int a) {
		id = a;
	}
	//��Ȼ��������д��idʵ���Ͼ��ǵ�ǰ�����id��ʡ����this���ѡ�
	*/
	
	/*
	public void setId(int id) {
		id = id;
	}
	//ע�⣬����java���Ծͽ�ԭ����������id�����Ǿֲ�����id����δ�ﵽ�Զ����id���и�ֵ�������
	*/
	
	//����get��set����
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;//thisָ���ǵ�ǰ�������ֿ��ֲ�����id
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
