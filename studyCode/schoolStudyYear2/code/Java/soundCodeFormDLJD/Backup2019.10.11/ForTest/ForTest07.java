/*
继续来for循环嵌套
*/

public class ForTest07{
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){//循环10次。
			System.out.println("Begin");
			//循环体里的代码执行10遍
			for(int j=0;j<1;j++){//循环一次，输出0
				System.out.println("j--->"+j);
			}
			System.out.println("Over");
		}
		
		/*
		结果：
		    Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
			Begin
			j--->0
			Over
		*/
		
		
		for(int i=1;i<=5;i++){
			System.out.println("开始");
			for(int j=1;j<=5;j++){
				System.out.println(i*j);
			}
			System.out.println("结束");
		}
		
		/*
		    开始
			1
			2
			3
			4
			5
			结束
			开始
			2
			4
			6
			8
			10
			结束
			开始
			3
			6
			9
			12
			15
			结束
			开始
			4
			8
			12
			16
			20
			结束
			开始
			5
			10
			15
			20
			25
			结束
		*/
		
		//分析以上结果的原理
		/*
		首先外层循环，它是循环5次，其次内层循环也是5次。
		在第一次进入到外层循环循环体，也就是第一次大循环中，执行第一次循环，在第一次循环中，
		内层循环开始执行，此时i的值并未发生变化，总是1，变的都是j，所以
		结果就是输出1*1 1*2 1*3 1*4 1*5，内层循环结束，输出“结束”。第一次大循环结束。
		紧接着，执行i++更新表达式，i的值变成2，再次执行第二次大循环。
		在第二次大循环中，这个内层for循环焕然一新，它已经是一个全新for循环【for循环结束后释放内存】
		此时，i的值变成2，输出2*1 2*2 2*3 2*4 2*5，内层循环结束，输出“结束”。第二次大循环结束。
		直到i的值变成5，第五次大循环结束，i++变成6，外层for循环结束。
		*/
		
		//将i和j的值范围扩大，就能制定出一个99乘法表了。
		
		
		
		
		
	}
}