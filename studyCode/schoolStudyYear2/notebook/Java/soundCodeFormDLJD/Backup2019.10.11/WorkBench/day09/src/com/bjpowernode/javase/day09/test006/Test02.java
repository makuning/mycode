package com.bjpowernode.javase.day09.test006;

/**
 * 最终结论：
 * 		方法在调用的时候，涉及到参数传递的问题，传递的时候，java只遵循一种语法机制：
 * 		那就是将变量中保存的哪个“值”给传递过去了，只不过有时候这个值是字面值10，有的
 * 		时候，这个值它是另外一个堆内存java对象的内存地址0x1234。
 *
 */
public class Test02 {

	public static void main(String[] args) {

		//通过调用有参数的构造方法来，创建一个User对象，并且给实例变量赋值。
		User u=new User(20);
		
		//传递的是什么？
		//传递的是main方法中u引用这个变量中保存的值，是一个内存地址。
		add(u);
		System.out.println("main -->"+u.age);//访问的是main方法中这个u引用的指向对象中实例变量age属性
		//由于在前面代码中，传递给add方法中，指向了同一个内存地址，虽然此时add方法执行结束后弹栈，但是在堆内存中
		//所做的对User对象实例变量的更改仍然保留。所以，在读取main方法中u引用指向的同一内存地址，也会受到影响。
		
		//始终牢牢记住，java中参数的传递都是变量中保存的“值”，无论它是字面值还是一个java对象的内存地址。
		//按照代码执行顺序，一步一步画图，理解本质的东西。
		//同时，局部变量本身也是有它自己的内存地址的，不要把它肚子中保存的内存地址给弄混淆。传递的是肚子里的“值”。
		
	}
	
	public static void add(User u) {
		u.age++;
		System.out.println("add -->"+u.age);//输出肯定是21
	}

}

class User{
	
	//实例变量age
	int age;
	
	//需要传递参数的构造方法
	public User(int i) {
		age=i;
	}
}