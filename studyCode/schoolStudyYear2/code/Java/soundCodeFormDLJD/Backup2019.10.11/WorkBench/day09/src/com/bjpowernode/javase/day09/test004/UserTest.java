package com.bjpowernode.javase.day09.test004;

public class UserTest {

	public static void main(String[] args) {

		//����User����
		User user=new User();
		
		//���뱨��age����˽�л������ⲿ�������޷�����ֱ�ӷ���
		//���ˣ�age���԰�ȫ����ߣ����ǹ��ڰ�ȫ
		//��Ŀǰ������˵��age�������ⲿ���׷��ʲ���
		//System.out.println(user.age);
		
		//�޸�
		user.setAge(-100);
		
		//��ȡ
		System.out.println(user.getAge());
		
		//���䲻�Ϸ���returnִ�У������ʾ��䣬��ʱ��δ��ֵ�������Ĭ��ֵ
		
	}

}
