
/*
以下代码不使用“方法重载机制”，不适用overload，分析程序存在的缺点？

1.sumInt、sumLong、sumDouble方法虽然功能不同，但是功能相似，都是求和。
在以下程序中，功能相似的方法分别起了三个不同的名字，这对程序员来说，
调用方法的时候不方便，程序员需要记忆更多的方法，才能完成调用。【不方便】

2.代码不美观


有没有这样的一种机制：
功能虽然不同，但是“功能相似”的时候，有没有这样一种机制，可以让程序员使用这些
方法的时候就像在使用一个方法一样，这样程序员编写起来代码会非常方便，
也不需要记忆更多的方法名，代码也会很美观。

这种机制叫做：方法重载机制

值得注意的是：




*/

public class OverloadTest01{
	
	public static void main(String[] args){
		
		//调用方法
		int result1=sumInt(1,2);
		System.out.println(result1);
		
		double result2=sumDouble(1.0,2.0);
		System.out.println(result2);
		
		long result3=sumLong(1L,2L);
		System.out.println(result3);
		
	}
	
	//自定义方法
	
	//计算两个int类型数据和
	public static int sumInt(int a,int b){
		return a+b;
	}
	
	//计算两个double类型数据和
	public static double sumDouble(double a,double b){
		return a+b;
	}
	
	//计算两个long类型数据和
	public static long sumLong(long a,long b){
		return a+b;
	}
	
	//最终希望达到：程序员使用上述三个相似的方法就像在用一个方法一样
	//Java支持这种机制【有些语言不支持，比如以后学习的javascript】
}















