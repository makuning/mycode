package com.bjpowernode.javase.test003;

/**
 * ���ս��ۣ�
 * 		�ڴ���static�ķ����в��ܡ�ֱ�ӡ�����ʵ�������͵���ʵ�������ġ�
 * 		��Ϊʵ��������ʵ����������Ҫ����Ĵ��ڡ�
 * 		��static��û��this��Ҳ����˵��ǰ���󲻴��ڡ�
 * 		��ȻҲ�޷����ʵ�ǰ�����ʵ��������ʵ��������
 *
 */
public class ThisTest {

	//����������������static
	public static void main(String[] args) {

		//����doSome����
		ThisTest.doSome();
		
		//����doSome����
		doSome();
		
		//����doOther����
		//�����뱨��
		//ThisTest.doOther();//ʵ�����������ȴ�������ͨ������.��ʽ����
		
		//doOther��ʵ������
		//ʵ���������ñ����ж���Ĵ��ڣ�
		//���´���ĺ����ǣ����õ�ǰ�����doOther����
		//����main��������static��������this���������·������ܵ���
		//doOther();
		//this.doOther();
		
		ThisTest tt=new ThisTest();
	    tt.doOther();
	    
	    tt.run();
	    
	    //˭ȥ�������ʵ��������˭����this
	    
	    
		
	}

	//����static
	public static void doSome() {
		System.out.println("do some!");
	}
	
	//ʵ������
	public void doOther() {
		//this��ʾ��ǰ����
		System.out.println("do other!");
	}
	
	//run��ʵ������������run����һ�����ж���Ĵ��ڵ�
	//һ���Ǵ����˶�����ܵ���run����
	public void run() {
		
		//�ڴ������д���ִ�й�����һ���Ǵ��ڡ���ǰ���󡱵�
		//Ҳ����˵������һ������this
		System.out.println("run execute!");
		
		//doOther��һ��ʵ��������ʵ���������ñ����ж���Ĵ���
		//���´���ĺ�����ǣ����õ�ǰ�����doOther����
		doOther();//this�󲿷������ʡ��
		//this.doOther();//����д��
	}
}
