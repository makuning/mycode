
//方法调用时要求实参和形参个数对应相同，数据类型对应相同
//类型不同时要求进行相应的自动类型转换

public class MethodTest05{
	
	public static void main(String[] args){
		
		//编译报错，参数数量不同
		//MethodTest05.sum();		
		
		//编译报错，实参和形参类型不相同
		//MethodTest05.sum(true,false);
		
		//可以
		MethodTest05.sum(10L,20L);
		
		//存在自动类型转换，int转换long
		MethodTest05.sum(10,20);
		
		//编译报错，参数类型不是对应相同
		//MethodTest05.sum(3.0,20);
		
		//可以
		MethodTest05.sum((long)3.0,20);
	}
	
	public static void sum(long a,long b){
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
}