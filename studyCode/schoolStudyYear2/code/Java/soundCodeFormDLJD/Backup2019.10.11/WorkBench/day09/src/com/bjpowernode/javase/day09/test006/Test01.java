package com.bjpowernode.javase.day09.test006;

/**
 * java�����У��������õ�ʱ���漰���������ݵ����⡣
 * ��������ʵ���ϴ��ݵ��Ǳ����б���ľ���ֵ
 * 
 *int i=10;
 *add(i);��ͬ��add(10);
 */
public class Test01 {

	public static void main(String[] args) {

		int i=10;
		add(i);//11 add�������õ�ʱ�򣬴��ݵ�ʵ����ֻ��10�������ֵ
		System.out.println("main -->"+i);//10
	}
	
	public static void add(int i) {
		i++;
		System.out.println("add -->"+i);//11
	}

}
