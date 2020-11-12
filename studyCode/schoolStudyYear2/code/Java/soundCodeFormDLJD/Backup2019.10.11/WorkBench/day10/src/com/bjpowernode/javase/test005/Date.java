package com.bjpowernode.javase.test005;

/**
 * 自定义的日期类型：
 * 		
 * 	this可以用在哪里？
 * 		1.可以用在实例方法中，代表当前对象【语法格式：this.】
 *		2.可以用在构造方法中，通过当前的构造方法来调用其他的构造方法【语法格式：this(实参);】
 *
 *	重点【记忆】：this()这种语法只能用在构造方法中的第一行。
 */
public class Date {

	//对日期的年月日属性进行封装
	private int year;
	private int month;
	private int day;
	
	//写无参数构造方法
	/**
	 * 需求：当程序员调用无参数构造方法时，设立默认值为：1970-1-1
	 */
	public Date() {
	    //System.out.println();
		/*
		this.year=1970;
		this.month=1;
		this.day=1;
		*/
		
		//如果说，属性很多，要写很多行代码，那么这样一个一个单独设立默认值比较麻烦
		
		//以上代码可以通过调用另一个构造方法来完成
		//【前提】：不能创建新的对象。下面的代码创建了一个新的对象。
		//new Date(1970,1,1);
		
		//可以通过调用无参数的构造方法来完成此项工作
		//以下语法可以完成。
		//这种方式并不会创建一个新的java对象，同时又可以达到调用其他的构造方法的目的。
		this(1970,1,1);
	}
	
	//写有参数构造方法
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//创建set和get方法
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	//自定义方法，可以打印输出创建对象的日期
	
	public void print() {
		System.out.println(this.getYear()+"年"+this.getMonth()+"月"+this.getDay()+"日");
	}
	
}
