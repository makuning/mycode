package com.bjpowernode.javase.day09.test004;

/**
 * 封装的步骤：
 * 
 * 	1.所有属性私有化，使用private关键字进行修饰，private表示私有的的，修饰的所有数据只能在本类中访问
 * 
 * 	2.对外提供简单的操作入口，也就是说外部程序以后想访问age属性，必须通过这些简单的入口进行访问： -对外提供两个方法，分别是set方法和get方法
 * 		-修改age属性，调用set方法
 * 	 	-读取age属性，调用get方法
 * 
 * 	3.set方法的命名规范：
 *  	public void setAge(int a){
 * 			age=a;
 * 		}
 * 
 * 	4.get方法的命名规范：
 * 		public int getAge(){
 * 			return age;
 * 		}
 *
 *回想一下：一个属性的通常访问的时候包括哪几种访问方式？
 *	-第一种方式：想读取这个属性的值，读取get
 *	-第二种方式：想修改这个属性的值，修改set
 *
 *需要背会：
 *
 *	-setter & getter 方法没有static关键字
 *	-有static关键字调用：类名.方法名(实参);
 *	-没有static关键字调用：引用.方法名(实参);
 *
 * @author ASUS
 *
 */
public class User {

	//属性私有化
	private int age;
	
	//set方法没有返回值，因为set方法只负责修改数据
	/*
	public void setAge(int age) {
		age=age;//java具有就近原则，这里其实并没有给age属性赋值，这里的age都是局部变量age
	}
	*/
	
	//setter	
	public void setAge(int a) {
		//编写业务逻辑代码进行安全控制
		//age=a;
		
		if(a<0||a>150) {
			System.out.println("对不起，您提供的年龄不合法");
			return;
		}
		
		//程序执行到这里，说明return没有执行，年龄合法
		//进行赋值运算
		age=a;
	}	
	
	//getter
	public int getAge() {
		return age;
	}
	
}
