package com.bjpowernode.javase.test003;

public class FinalTest03 {

	public static void main(String[] args) {

		//�����û�����
		User u=new User(100);//User u=0x1234;
		
		//�ִ�����һ���µĶ���
		//����ִ�е������ʾ����Ķ����ѱ���������ݣ��ȴ���������������
		u=new User(200);//u=0x2589;
		
		
		//�����û�����
		final User user=new User(30);
		//user=new User(50);//final���ε�����һ��ָ��ĳ������֮�󣬲�������ȥָ������������ô��ָ��Ķ�����Զ���ܱ���������������
		//user=null;
		System.out.println(user.id);
		
		user.id=50;//final���ε�������Ȼָ��ĳ���������ָ���������󣬵�����ָ��Ķ����ڲ����ڴ��ǿ��Ը��ĵ�
		
		System.out.println(user.id);
		
	}

}
