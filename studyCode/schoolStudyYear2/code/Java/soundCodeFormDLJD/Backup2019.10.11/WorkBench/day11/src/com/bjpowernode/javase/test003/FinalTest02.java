package com.bjpowernode.javase.test003;

public class FinalTest02 {

	//成员变量之实例变量
	int i;
	
	//实例变量有默认值，final修饰的变量一旦赋值不能重新赋值
	//综上考虑，java语言最终规定实例变量一旦被final修饰必须手动赋值，不能采用系统默认值
	//final int age;//编译报错
	
	//第一种解决方案
	
	final int age=10;
	
	
	//第二种解决方案
	
	final int num;
	public FinalTest02() {
		this.num=200;
	}
	
	
	//其实，本质上来说这两种解决方案都是一种解决方案，都是在构造方法执行过程当中给实例变量赋值
	
	public static void main(String[] args) {

	}

}
