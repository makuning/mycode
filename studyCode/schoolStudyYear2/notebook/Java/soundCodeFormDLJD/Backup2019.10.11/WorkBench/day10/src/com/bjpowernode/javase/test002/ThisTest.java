package com.bjpowernode.javase.test002;

public class ThisTest {

	int num=10;
	//这是成员变量，而且这个变量还是实例变量
	
	//这是带有static的方法
	//JVM负责调用main方法，JVM是怎么调用的呢
	//ThisTest.main(String[]);
	public static void main(String[] args) {

		//访问实例变量
		//不存在当前对象
	
		//以下代码什么意思？
		//访问当前对象的num属性
		//但是this关键字不能在static方法中使用
		//System.out.println(num);
		//System.out.println(this.num);
		//编译错误，不能直接访问实例变量
		
		//想访问怎么办？
		ThisTest tt=new ThisTest();
		System.out.println(tt.num);
		
		
	}

}
