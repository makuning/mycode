package com.bjpowernode.javase.test006;

/**
 * 第一个需要记住的是：按照代码的执行顺序一步一步来。
 * 第二个需要记住的是：省略，指的是省略什么？类名.可以省略。this.可以省略
 * 第三个需要记住的是：不带static的方法是实例方法，里面内部肯定会有一个this表示当前对象
 * 第四个需要记住的是：能够不创建新对象的就不要创建新对象，会出问题的！！！！！！！
 * 第五个需要记住的是：有/无static方法调用有/无static的方法两个都要看。牢记第三个
 *
 */
public class Test {

	//没有static的变量
	int i=10;
	
	//带有static的方法
	public static void doSome() {
		System.out.println("do some!");
	}
	
	//不带static的方法
	public void doOther() {
		System.out.println("do other!");
	}
	
	//带有static的方法
    public static void method1() {
    	//调用doSome
    	//完整方式调用
    	//省略方式调用
    	
    	Test.doSome();
    	doSome();
    	
    	
    	//调用doOther
    	//完整方式调用
    	//省略方式调用
    	
    	Test t=new Test();
    	t.doOther();
    	
    	
    	//访问i
    	//完整方式访问
    	//省略方式访问
    	
        System.out.println(t.i);
    	
    }
    
	//不带static的方法
    public void method2() {
    	//调用doSome
    	//完整方式调用
    	//省略方式调用
    	
    	Test.doSome();
    	//doSome();//??疑问
    	
    	//这个省略省的是什么？
    	//this.doSome();//??疑问
    	
    	
    	//调用doOther
    	//完整方式调用
    	//省略方式调用
    	
    	/*
    	 * 不用创建对象.......
    	Test t=new Test();
    	t.doOther();
    	*/
    	
    	this.doOther();
    	doOther();
    	
    	//访问i
    	//完整方式访问
    	//省略方式访问
    	
    	//System.out.println(t.i);
    	
    	System.out.println(this.i);
    	System.out.println(i);
    	
    }
	
	
	public static void main(String[] args) {

		//要求在这里编写程序调用method1
		//使用完整方式调用
		//使用省略方式调用
		
		Test.method1();
		method1();
	
		
		//要求在这里编写程序调用method2
		//使用完整方式调用
		//使用省略方式调用
		
		Test t=new Test();
		t.method2();
	}

}
