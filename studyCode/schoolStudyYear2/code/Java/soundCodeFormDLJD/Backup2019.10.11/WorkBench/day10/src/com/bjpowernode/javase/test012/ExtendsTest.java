package com.bjpowernode.javase.test012;

/**
 * 关于java语言中的继承：
 * 
 * 			1.继承是面向对象三大特征之一，三大特征分别是：封装、继承和多态。
 * 
 * 			2.继承“基本”的作用是代码复用。但是继承最“重要”的作用是：有了继承才有了以后的方法覆盖和多态
 *
 *			3.继承语法格式：
 *				[修饰符列表] class 类名 extends 父类名{
 *						类体=属性+方法;
 *				}
 *
 *			4.java语言当中的继承只支持单继承，一个类不能同时继承多个父类，只能继承一个类，在C++中支持多继承
 *
 *			5.关于继承的一些术语：
 *				B类继承A类，其中：
 *						A类称为：父类、基类、超类、superclass
 *						B类称为：子类、派生类、subclass
 *
 *			6.在java语言中子类都继承了父类哪些数据呢？
 *				-私有的不支持继承
 *				-构造方法不继承
 *				-其他的数据都能继承
 *
 *			7.虽然java中只支持单继承，但是一个类也可以间接继承其他类，例如：
 *					C extends B{
 *					
 *					}
 *
 *  				B extends A{
 *					
 *					}
 *
 * 					A extends T{
 *					
 *					}
 *					
 *					C类直接继承B类，但是C类间接继承A类、T类
 *
 *			8.java语言中假设一个类并没有显示继承任何类，该类默认继承javase类库当中提供的java.lang.Object类。
 *				java中任一个类都有Object类的特征。
 *
 */
public class ExtendsTest {

	public static void main(String[] args) {

		ExtendsTest et=new ExtendsTest();
		String s=et.toString();//这里编译通过，说明确实继承Object类
		System.out.println(s);//com.bjpowernode.javase.test012.ExtendsTest@1f32e575
		
		CreditAccount act=new CreditAccount();
		act.setActno("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
		
		System.out.println(act.getActno()+","+act.getBalance()+","+act.getCredit());
		
		
		
	}

}
