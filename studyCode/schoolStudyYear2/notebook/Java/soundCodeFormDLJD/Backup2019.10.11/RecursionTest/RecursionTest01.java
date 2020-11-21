
/*
方法递归：
	
	1.什么是递归
	
	方法自身调用自身
	a(){
		a();
	}

	2.递归式很耗费栈内存的，递归算法能不用的时候尽量别用
	
	3.以下程序在运行的时候发生了一个错误【不是异常，是错误Error】
		java.lang.StackOverflowError
		栈内存溢出错误。
		错误发生无法挽回，只有一个结果，就是JVM停止工作
		
	4.递归必须有结束条件，没有结束条件，一定会发生栈内存溢出错误
	
	5.递归即使有了结束条件，即使结束条件正确，也可能会发生栈内存溢出错误，
	都怪递归太深了。
	
	注意：递归能不用尽量不用，
		  但是有些情况下必须依靠递归方式。[目录拷贝]
	
*/

public class RecursionTest01{
	
	//主方法
	public static void main(String[] args){
		
		System.out.println("main begin");
		
		//调用doSome方法
		doSome();
		
		System.out.println("main over");
		
	}
	
	//以下代码片段虽然只有一份
	//但是可以被重复调用，并且只要调用doSome方法就一定会在栈内存中新分配一块所属的内存空间
	public static void doSome(){
		
		System.out.println("doSome begin");
		
		doSome();//这行代码未执行结束，下一行代码永远不能被执行
			
		System.out.println("doSome over");
	}
	
	
}