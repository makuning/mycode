package com.bjpowernode.javase.test003;

/**
 *关于java语言中的final关键字：
 *		1.final是一个关键字，表示最终的，不变的
 * 		2.final修饰的类无法被继承
 * 		3.final修饰的方法无法被覆盖
 * 		4.final修饰的变量“一旦”赋值之后不可重新赋值【不可二次赋值】
 *		5.final修饰的实例变量，必须手动赋值，不能采用系统默认值
 *		6.final修饰的引用一旦指向某个对象之后，不能让它去指向其他对象，那么被指向的对象永远不能被垃圾回收器回收
 *			final修饰的引用虽然指向某个对象后不能指向其他对象，但是所指向的对象内部的内存是可以更改的
 *		7.final修饰的实例变量一般和static联合使用，称为“常量”。
 *
 *
 */
public class FinalTest {

	public static void main(String[] args) {
		
		int i=10;
		System.out.println(i);
		i=20;
		System.out.println(i);
		
		final int k=100;
		//编译错误，无法为最终变量k分配值
		//k=200;
		
		final int m;
		m=200;
		//编译错误，无法为最终变量m分配值
		//m=300;
		
		
	}
}
