
/*
	方法返回值类型不是void的时候：

		1.方法必须百分百保证执行“return 值;”语句来值的返回。没有即报错。

		2.一个方法有返回值时，我们调用这个方法，方法返回了一个值，
		对于调用者来说，可以选择接收，也可以选择不接收
		但是大部分情况下时要接收的
		
*/

public class MethodTest08{
	
	public static void main(String[] args){
		
		//调用方法
		divide(10,3);
		//【什么都没发生，因为这里并没有选择接收返回值，但是方法运行了】
		
		//接收返回值
		//利用变量接收
		//变量数据类型必须和返回值类型保持一致，或者可以自动类型转换
		//boolean b=divide(10,3);//编译报错，类型不兼容
		
		//赋值运算符右边先执行，将执行结果赋值给左边的变量
		int i=divide(10,3);
		System.out.println(i);
		
		long x=divide(10,3);
		System.out.println(x);
		
		System.out.println(divide(10,3));//也可以直接将返回值打印输出出来
		
	}
	
	//编译报错：缺少返回语句
	/*
	public static int divide(int a,int b){
		
	}
	*/
	
	//编译报错：缺少返回值
	/*
	public static int divide(int a,int b){
		return;
	}
	*/
	
	//编译报错：方法定义的时候要求返回int类型，此时返回布尔类型，类型不兼容
	/*
	public static int divide(int a,int b){
		return true;
	}
	*/
	
	//可以，但是没有满足需求
	/*
	public static int divide(int a,int b){
		return 1;
	}
	*/
	
	/*
	public static int divide(int a,int b){
		int c=a/b;
		return c;
	}
	*/
	
	public static int divide(int a,int b){
		return a/b;
	}
	
}