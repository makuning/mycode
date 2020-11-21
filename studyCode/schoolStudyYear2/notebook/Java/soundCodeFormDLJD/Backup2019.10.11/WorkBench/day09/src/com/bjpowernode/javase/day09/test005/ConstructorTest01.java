package com.bjpowernode.javase.day09.test005;

/**
 * 关于java类中的构造方法：
 * 
 * 		1.构造方法又被称为构造函数/构造器/Constructor
 * 
 * 		2.构造方法语法结构：
 * 			[修饰符列表] 构造方法名(形参列表){
 * 				构造方法体;
 * 			}
 * 			
 * 		3.普通方法语法结构：
 * 			[修饰符列表] 返回值类型 方法名(形参列表){
 * 				方法体;
 * 			}
 * 
 * 		4.对于构造方法来说，“返回值类型”不需要指定，并且也不能写void，
 * 		如果写上void，这个方法就变成了普通方法
 * 
 * 		5.对于构造方法来说，构造方法的方法名必须和类名保持一致
 * 
 * 		6.构造方法的作用？
 * 			构造方法存在的意义，是通过构造方法的调用，可以创建对象
 * 
 * 		7.构造方法应该怎么调用？
 * 			-普通方法调用：
 * 				类名.方法名(实参列表) 修饰符列表有static关键字的
 * 				引用.方法名(实参列表) 修饰符列表没有static关键字的
 * 			-构造方法的调用：
 * 				new 构造方法名(实参列表)
 * 
 * 		8.构造方法在调用后有返回值吗？
 * 			每一个构造方法在执行结束后都有返回值，但是这个“return 值;”语句不需要写。构造方法结束的时候java程序自动返回值。
 * 			并且返回值类型是构造方法所在类的类型。由于构造方法的返回值类型是类本身，所以返回值类型不需要写
 * 
 * 		9.注释：ctrl +/  多行注释：选中，ctrl+shift+/
 * 
 * 		10.当一个类中没有定义任何构造方法的时候，系统会默认给该类构造一个无参数的构造方法，这个构造方法被称为“缺省构造器”
 * 
 * 		11.当一个类显示的将构造方法定义出来了，那么系统将不再会给这个类提供缺省构造器，建议在实际开发中，手动为当前类提供无参数的构造方法，因为无参数构造方法太常用了。
 * 
 * 		12.构造方法支持重载机制，在一个类当中编写多个构造方法，这多个构造方法显然构成方法重载
 *
 */

public class ConstructorTest01 {

	public static void main(String[] args) {

		//创建一个User对象
		//调用User类的构造方法来完成对象的创建
		//以下程序创建了4个对象，只要构造函数调用就会创建对象，并且一定是在“堆内存”当中开辟空间
		User u1=new User();
		User u2=new User(10);
		User u3=new User("zhangsan");
		User u4=new User(10,"zhangsan");
		
		//调用带有static的方法
		ConstructorTest01.doSome();
		doSome();
		
		//调用不带static的方法
		//doOther方法存在于ConstructorTest01类中，所以需要创建ConstructorTest01对象
		//创建ConstructorTest01对象，调用无参数构造方法
		ConstructorTest01 t=new ConstructorTest01();//没有任何构造方法会默认有缺省构造器
		t.doOther();
		
	}
	
	public static void doSome() {
		System.out.println("do some!");
	}
	
	public void doOther() {
		System.out.println("do other!");
	}
	
	
	

}
