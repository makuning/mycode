package com.bjpowernode.javase.test007;

/**
 * 什么时候程序在运行的时候会出现空指针异常？
 *		空引用访问实例相关的数据，因为实例相关的数据就是对象相关的数据。
 *		这些数据在访问的时候，必须有对象的参与，当空引用的时候，对象不存在，
 *		访问这些实例数据一定会出现空指针异常。
 *		
 *实例相关的数据包括：
 *		实例变量
 *		实例方法
 *
 */
public class Test {

	public static void main(String[] args) {

		Test.doSome();
		doSome();
		
		Test t=new Test();
		t.doSome();
		
		//引用为空
		t=null;
		
		//带有static的方法，其实既可以通过类名.的方式调用，也可以使用引用.的方式调用
		//但是即使采用了引用.的方式访问，实际上执行的时候和引用指向的对象无关
		//在eclipse开发时，使用引用的方式访问带有static的方法，程序会出现警告
		//所以带有static的方法建议还是使用类名.的方式访问。
		t.doSome();//不会出现空指针异常，因为根本没有对象参与。
		
	}
	
	//带有static的方法需要通过类名.的方式来访问
	public static void doSome() {
		System.out.println("do some!");
	}

}
