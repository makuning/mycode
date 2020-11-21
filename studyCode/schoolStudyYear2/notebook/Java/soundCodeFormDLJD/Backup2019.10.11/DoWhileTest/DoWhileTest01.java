/*
do...while循环
	1.do...while循环的语法结构：
	    do{
			循环体
		}while(布尔表达式);   
	2.do...while循环的执行原理：
	    1.执行循环体
		2.判断布尔表达式结果
			2.1结果为true
				重复第1步操作
			2.2结果为false
				结束
	3.do...while循环的执行次数：
		1~N次【循环体至少执行1次】
	4.使用do...while循环的注意事项:
        do...while循环语句末尾有一个“分号”，别丢了。
*/

public class DoWhileTest01{
	
	public static void main(String[] args){
		
		int i=10;
		
		do{
			System.out.println(i);
		}while(i>100);
		//输出10
		
		System.out.println("--------------");
		
		while(i>100){
			System.out.println("i-->"+i);
		}
		//什么都没发生
		
		System.out.println("--------------");
		
		i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
		//输出：1 2 3 4 5 6 7 8 9 10，此时i=11
		
		
		
		
	}
}