package com.bjpowernode.javase.test002;

public class ThisTest {

	int num=10;
	//���ǳ�Ա���������������������ʵ������
	
	//���Ǵ���static�ķ���
	//JVM�������main������JVM����ô���õ���
	//ThisTest.main(String[]);
	public static void main(String[] args) {

		//����ʵ������
		//�����ڵ�ǰ����
	
		//���´���ʲô��˼��
		//���ʵ�ǰ�����num����
		//����this�ؼ��ֲ�����static������ʹ��
		//System.out.println(num);
		//System.out.println(this.num);
		//������󣬲���ֱ�ӷ���ʵ������
		
		//�������ô�죿
		ThisTest tt=new ThisTest();
		System.out.println(tt.num);
		
		
	}

}
