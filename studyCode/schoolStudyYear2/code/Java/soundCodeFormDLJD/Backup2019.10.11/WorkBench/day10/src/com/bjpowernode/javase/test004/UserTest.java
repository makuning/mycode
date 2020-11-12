package com.bjpowernode.javase.test004;

public class UserTest {

	public static void main(String[] args) {

		//创建User对象
		User u1=new User(100,"zhangsan");
		
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		
		//更改姓名需求
		//要求必须在原先对象上。
		//所以只能采用set方法，因为调用构造方法必须得创建另一个对象才可以做到
		//所以有参数的构造方法和set&get方法不冲突，不重复哦
		
		u1.setName("lisi");
		System.out.println(u1.getName());
		
	}

}
