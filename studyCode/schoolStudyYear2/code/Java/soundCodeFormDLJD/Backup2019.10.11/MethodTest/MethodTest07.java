
/*

	输出结果：
		main begin
		m1 begin
		m2 begin
		m3 begin
		m3 over
		m2 over
		m1 over
		main over

	对于当前程序来说：
		*main方法最先被调用，main方法也是最后一个结束
		*m3方法最后调用，m3方法也是最先结束

	main方法结束后，整个程序结束【在现阶段来】

	无需刻意记忆，
	方法体中代码由上而下按顺序依次执行，上一行代码未执行结束，下一行代码永远不会执行

*/

public class MethodTest07{
	
	public static void main(String[] args){
		
		System.out.println("main begin");
		m1();
		System.out.println("main over");
		
	}
	
	public static void m1(){
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}
	
	public static void m2(){
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}
	
	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
	
	
}




