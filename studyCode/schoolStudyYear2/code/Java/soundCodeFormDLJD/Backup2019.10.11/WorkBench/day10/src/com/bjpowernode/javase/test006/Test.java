package com.bjpowernode.javase.test006;

/**
 * ��һ����Ҫ��ס���ǣ����մ����ִ��˳��һ��һ������
 * �ڶ�����Ҫ��ס���ǣ�ʡ�ԣ�ָ����ʡ��ʲô������.����ʡ�ԡ�this.����ʡ��
 * ��������Ҫ��ס���ǣ�����static�ķ�����ʵ�������������ڲ��϶�����һ��this��ʾ��ǰ����
 * ���ĸ���Ҫ��ס���ǣ��ܹ��������¶���ľͲ�Ҫ�����¶��󣬻������ģ�������������
 * �������Ҫ��ס���ǣ���/��static����������/��static�ķ���������Ҫ�����μǵ�����
 *
 */
public class Test {

	//û��static�ı���
	int i=10;
	
	//����static�ķ���
	public static void doSome() {
		System.out.println("do some!");
	}
	
	//����static�ķ���
	public void doOther() {
		System.out.println("do other!");
	}
	
	//����static�ķ���
    public static void method1() {
    	//����doSome
    	//������ʽ����
    	//ʡ�Է�ʽ����
    	
    	Test.doSome();
    	doSome();
    	
    	
    	//����doOther
    	//������ʽ����
    	//ʡ�Է�ʽ����
    	
    	Test t=new Test();
    	t.doOther();
    	
    	
    	//����i
    	//������ʽ����
    	//ʡ�Է�ʽ����
    	
        System.out.println(t.i);
    	
    }
    
	//����static�ķ���
    public void method2() {
    	//����doSome
    	//������ʽ����
    	//ʡ�Է�ʽ����
    	
    	Test.doSome();
    	//doSome();//??����
    	
    	//���ʡ��ʡ����ʲô��
    	//this.doSome();//??����
    	
    	
    	//����doOther
    	//������ʽ����
    	//ʡ�Է�ʽ����
    	
    	/*
    	 * ���ô�������.......
    	Test t=new Test();
    	t.doOther();
    	*/
    	
    	this.doOther();
    	doOther();
    	
    	//����i
    	//������ʽ����
    	//ʡ�Է�ʽ����
    	
    	//System.out.println(t.i);
    	
    	System.out.println(this.i);
    	System.out.println(i);
    	
    }
	
	
	public static void main(String[] args) {

		//Ҫ���������д�������method1
		//ʹ��������ʽ����
		//ʹ��ʡ�Է�ʽ����
		
		Test.method1();
		method1();
	
		
		//Ҫ���������д�������method2
		//ʹ��������ʽ����
		//ʹ��ʡ�Է�ʽ����
		
		Test t=new Test();
		t.method2();
	}

}
