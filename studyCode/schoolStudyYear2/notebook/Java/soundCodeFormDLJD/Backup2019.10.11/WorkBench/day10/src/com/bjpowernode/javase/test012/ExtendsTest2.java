package com.bjpowernode.javase.test012;

public class ExtendsTest2 {

	public static void main(String[] args) {

		C c=new C();
		c.doSome();//���õ��Ǵ�B����̳й�����doSome
		
	}

}

class A{
	public void doSome() {
		System.out.println("do some!");
	}
}

class B extends A{
	
}

class C extends B{
	
}