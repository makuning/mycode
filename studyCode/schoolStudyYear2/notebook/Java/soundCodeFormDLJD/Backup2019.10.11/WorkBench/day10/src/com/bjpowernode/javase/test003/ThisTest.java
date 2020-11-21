package com.bjpowernode.javase.test003;

/**
 * 最终结论：
 * 		在带有static的方法中不能“直接”访问实例变量和调用实例方法的。
 * 		因为实例变量和实例方法都需要对象的存在。
 * 		而static中没有this，也就是说当前对象不存在。
 * 		自然也无法访问当前对象的实例变量和实例方法。
 *
 */
public class ThisTest {

	//这是主方法，带有static
	public static void main(String[] args) {

		//调用doSome方法
		ThisTest.doSome();
		
		//调用doSome方法
		doSome();
		
		//调用doOther方法
		//【编译报错】
		//ThisTest.doOther();//实例方法必须先创建对象，通过引用.方式访问
		
		//doOther是实例方法
		//实例方法调用必须有对象的存在，
		//以下代码的含义是：调用当前对象的doOther方法
		//但是main方法里有static，不存在this，所以以下方法不能调用
		//doOther();
		//this.doOther();
		
		ThisTest tt=new ThisTest();
	    tt.doOther();
	    
	    tt.run();
	    
	    //谁去访问这个实例方法，谁就是this
	    
	    
		
	}

	//带有static
	public static void doSome() {
		System.out.println("do some!");
	}
	
	//实例方法
	public void doOther() {
		//this表示当前对象
		System.out.println("do other!");
	}
	
	//run是实例方法，调用run方法一定是有对象的存在的
	//一定是创建了对象才能调用run方法
	public void run() {
		
		//在大括号中代码执行过程中一定是存在“当前对象”的
		//也就是说，这里一定存在this
		System.out.println("run execute!");
		
		//doOther是一个实例方法，实例方法调用必须有对象的存在
		//以下代码的含义就是：调用当前对象的doOther方法
		doOther();//this大部分情况下省略
		//this.doOther();//完整写法
	}
}
