package com.bjpowernode.javase.test004;

/**
 * “this.”什么时候不能省略？
 * 		用来区分实例变量和局部变量的时候
 *
 */
public class User {

	//属性私有化，封装。
	private int id;
	private String name;
	
	//写空参数构造方法。
	public User() {
		
	}
	
	//写传递参数的构造方法
	/*
	public User(int a,String b) {
		id=a;
		name=b;
	}
	*/
	
	//this不能省略。
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//设置set方法
	/*
	public void setId(int a) {
		id = a;
	}
	//当然可以这样写，id实际上就是当前对象的id，省略了this而已。
	*/
	
	/*
	public void setId(int id) {
		id = id;
	}
	//注意，根据java语言就近原则，这三个“id”都是局部变量id，并未达到对对象的id进行赋值这个需求。
	*/
	
	//生成get和set方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;//this指的是当前对象，区分开局部变量id
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
