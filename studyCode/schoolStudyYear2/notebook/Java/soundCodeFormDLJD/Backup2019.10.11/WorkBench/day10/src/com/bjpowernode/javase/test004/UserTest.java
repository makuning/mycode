package com.bjpowernode.javase.test004;

public class UserTest {

	public static void main(String[] args) {

		//����User����
		User u1=new User(100,"zhangsan");
		
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		
		//������������
		//Ҫ�������ԭ�ȶ����ϡ�
		//����ֻ�ܲ���set��������Ϊ���ù��췽������ô�����һ������ſ�������
		//�����в����Ĺ��췽����set&get��������ͻ�����ظ�Ŷ
		
		u1.setName("lisi");
		System.out.println(u1.getName());
		
	}

}
