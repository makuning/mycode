
/*

	依旧是体验程序，体验使用了方法重载机制的优点

		*程序员在调用方法的时候比较方便，虽然调用的是不同方法，但是感觉就像在调用一个方法一样
		不需要记忆更多的方法名

		*代码美观


	前提：功能相似的时候，方法名可以相同
	但是，功能不同的时候，尽可能让这两的名字不同


*/

public class OverloadTest02{
	
	public static void main(String[] args){
		
		//调用方法
		
		System.out.println(sum(1,2));
		
		System.out.println(sum(1.0,2.0));
		
		System.out.println(sum(1L,2L));
		
		//调用方法的时候感觉就像在使用一个方法一样
		//传递的实际参数类型不同，调用的方法不同
		//此时区分方法不再依靠方法名了，而是看参数的的数据类型
		
	}
	
	//自定义方法
	
	public static int sum(int a,int b){
		System.out.println("int,int");
		return a+b;
	}
	
	public static double sum(double a,double b){
		System.out.println("double,double");
		return a+b;
	}
	
	public static long sum(long a,long b){
		System.out.println("long,long");
		return a+b;
	}
}