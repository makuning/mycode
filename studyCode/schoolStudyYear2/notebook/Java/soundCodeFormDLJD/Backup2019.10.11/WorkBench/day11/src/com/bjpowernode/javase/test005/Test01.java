package com.bjpowernode.javase.test005;

/**
 * ���ʿ���Ȩ�����η�
 *
 *		1.���ʿ���Ȩ�����η�������Ԫ�صķ��ʷ�Χ
 *
 *		2.���ʿ���Ȩ�����η�������
 *				
 *				public									��ʾ�����ģ��κ�λ�ö��ܷ���
 *				protected                             ͬ��������
 *				ȱʡ(default)							ͬ��
 *				private                                  ˽�еģ�ֻ���ڱ����з���
 *
 *		3.���ʿ���Ȩ�����η����������ࡢ����������...
 *
 *		4.��ĳ������ֻ��ϣ������ʹ�ã�ʹ��protected��������
 *
 *		5.���η���Χ��
 *			
 *			private < ȱʡ < protected < public 
 *
 *		6.��ֻ�ܲ���public��ȱʡ���������Σ��ڲ������
 *
 */
public class Test01 {

	public static void main(String[] args) {

		//����User���󣬷���i��j
		User u=new User();
		
		System.out.println(u.i);
		
		System.out.println(u.j);
		
	}

}
