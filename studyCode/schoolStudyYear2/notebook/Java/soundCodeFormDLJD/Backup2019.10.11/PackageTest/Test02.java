package com.bjpowernode.javase.day11;

public class Test02{
	
	public static void main(String[] args){
		
		//����������com.bjpowernode.javase.day11.Test01
		com.bjpowernode.javase.day11.Test01 t=new com.bjpowernode.javase.day11.Test01();
		System.out.println(t);//com.bjpowernode.javase.day11.Test01@2ff4acd0
		
		//����ʡ�Բ�д��������ΪTest01��Test02��ͬһ��Ŀ¼��
		Test01 tt=new Test01();
		System.out.println(tt);//com.bjpowernode.javase.day11.Test01@54bedef2
		
		
		//com.bjpowernode.javase.day11����洢��class�ļ������������ҵ���
		
		
	}
}