package com.bjpowernode.javase.test001;

public class CustomerTest {

	public static void main(String[] args) {

		//创建Customer对象
		Customer c1=new Customer();
		c1.name="zhangsan";
		
		//c1购物
		c1.shopping();
		
		//再创建另一个Customer对象
		Customer c2=new Customer();
		c2.name="lisi";
		
		//c2购物
		c2.shopping();
		
		Customer.doSome();
		
		Customer.doOther();
		
		
	}

}
