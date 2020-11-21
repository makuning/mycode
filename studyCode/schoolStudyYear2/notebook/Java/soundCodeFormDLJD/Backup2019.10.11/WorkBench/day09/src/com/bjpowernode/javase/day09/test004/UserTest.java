package com.bjpowernode.javase.day09.test004;

public class UserTest {

	public static void main(String[] args) {

		//创建User对象
		User user=new User();
		
		//编译报错，age属性私有化，在外部程序中无法进行直接访问
		//至此，age属性安全性提高，但是过于安全
		//对目前程序来说，age属性在外部彻底访问不了
		//System.out.println(user.age);
		
		//修改
		user.setAge(-100);
		
		//读取
		System.out.println(user.getAge());
		
		//年龄不合法，return执行，输出提示语句，此时并未赋值，会输出默认值
		
	}

}
