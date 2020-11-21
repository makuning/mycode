package com.bjpowernode.javase.test012;

public class ExtendsTest2 {

	public static void main(String[] args) {

		C c=new C();
		c.doSome();//调用的是从B类里继承过来的doSome
		
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