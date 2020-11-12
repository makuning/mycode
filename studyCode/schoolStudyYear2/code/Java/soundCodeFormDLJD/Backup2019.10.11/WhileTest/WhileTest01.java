/*
	while循环语句：
	1.while循环的语法结构：
		while(布尔表达式){
			循环体
		}
	2.while循环的执行原理：
		1.先判断布尔表达式结果
			1.1.结果为true
				执行循环体
				重复1操作
			1.2.结果为false
				循环结束
	3.while循环的循环次数：
		0~N次
		注意：while循环的执行次数可能为0

*/

public class WhileTest01{
	
	public static void main(String[] args){
		
		//死循环
		//while(true){
		//	System.out.println("死循环");
		//}
		//System.out.println("Hello World！");
		//while死循环后，编译器检测到第28行代码会永远执行不到，编译报错！
		//无法访问的语句。【编译通过，因为JDK版本较高导致】
		
		//int i=10;
		//int j=3;
		//while(i>j){
		//	System.out.println("i>j");
		//}
		//编译通过
		
		int i=10;
		int j=3;
		//while(10>3){
		//	System.out.println("i>j");
		//}
		//System.out.println("Hello World！");
		//编译报错！编译器检测到10>3恒成立，所以，44行代码无法被执行到
		//无法访问的语句。【编译通过，因为JDK版本较高导致】
		
		//同理，布尔表达式为i>3，在while循环后编写java语句是可以编译通过的，因为
		//编译器只检查语法，它认为变量i可能<3,编译通过。
		
		//【由于JDK版本较高的原因，上述代码即使在死循环后写语句也是可以通过......】
		
		//while(false){
		//	System.out.println("1");
		//}
		//53行错误，无法访问的语句，因为这行代码被判定为无法执行。
		
		while(i<3){
			System.out.println("1");
		}
		//【成功骗过编译器......】
	}
}