
/*
方法重载：
	1.方法重载又被称为：overload

	2.什么情况下使用方法重载？？
		*功能相似的时候，尽量方法名相同
		【但是：功能不同/不相似的时候，尽量方法名不同】

	3.什么条件满足之后，构成了方法重载？
		*在同一个类当中
		*方法名相同
		*参数列表不同
			-参数数量不同
			-参数数据类型不同
			-参数顺序不同

    4.方法重载和什么有关系，和什么没关系？
	
		*方法重载和方法名、形参列表有关系
		
		*方法重载和修饰符列表无关
		*方法重载和返回值类型无关

*/

public class OverloadTest03{
	
	public static void main(String[] args){
		
		m1();
		m1(10);
		
		m2(1,2.0);
		m2(2.0,1);
		
		//编译报错：对m2的引用不明确
		//OverloadTest03 中的方法 m2(int,double) 和 OverloadTest03 中的方法 m2(double,int) 都匹配
		//m2(1,2);
		
		m3(10);
		m3(3.0);
		
		//m4(1,2);
		//m4(2,1);
		
	}
	
	//以下两方法构成方法重载
	public static void m1(){}
	public static void m1(int a){}
	
	//以下两方法构成方法重载
	public static void m2(int a,double b){}
	public static void m2(double a,int b){}
	
	//以下两方法构成方法重载
	public static void m3(int x){}
	public static void m3(double x){}
	
	//编译报错：已在类 OverloadTest03中定义了方法 m4(int,int)
	//方法的形参最重要的是数据类型而不是变量名。这根本就是方法重复
	/*
	public static void m4(int a,int b){}
	public static void m4(int b,int a){}
	*/
	
	//编译报错：已在类 OverloadTest03中定义了方法 m5()
	//方法重载与返回值类型无关。
	/*
	public static void m5(){}
	public static int m5(){
		return 1;
	}
	*/
	
	//编译报错：已在类 OverloadTest03中定义了方法 m6()
	//方法重载与修饰符列表无关
	/*
	public static void m6(){}
	void m6(){}
	*/
}






























