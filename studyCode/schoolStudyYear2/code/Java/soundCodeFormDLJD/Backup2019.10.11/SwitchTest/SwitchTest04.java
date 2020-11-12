/*
	实现计算器中的
	+
	-
	*
	/
	%

	实现思路：
	1.选择所有数据从键盘输入
	2.使用switch语句进行判断
	3.需要从控制台输入三次：
	*第一个数字
	*运算符
	*第二个数字

*/

//数字是小数怎么办  不合法的运算符怎么办  输入int还是double类型的，还要判断？

public class SwitchTest04{
	
	public static void main(String[] args){
/*
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入第一个数字：");
		double num1=s.nextDouble();
		System.out.print("请输入你想要进行运算的运算符：");
		String str=s.next();
		System.out.print("请输入第二个数字：");
		double num2=s.nextDouble();
		
		switch(str){
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case "-":
			    System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case "*":
			    System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case "/":
			    System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
			case "%":
			    System.out.println(num1+"%"+num2+"="+(num1%num2));
				break;
			default :
			    System.out.println("不合法的运算符！");
			//运行有很多潜在问题//这上面代码我自己写的，除数为0时显示infinity，有问题的
		}
*/
        java.util.Scanner s=new java.util.Scanner(System.in);
		
		System.out.print("请输入第一个数字：");
	    int num1=s.nextInt();
		
		System.out.print("请输入运算符：");
		String operator=s.next();
		
		System.out.print("请输入第二个数字：");
		int num2=s.nextInt();
        
		int result=0;
		
		switch(operator){
			case "+":
				result=num1+num2;
				break;
			case "-":
				result=num1-num2;
				break;
			case "*":
				result=num1*num2;
				break;
			case "/":
				result=num1/num2;
				break;
			case "%":
				result=num1%num2;
				break;
			//default不写，因为会出问题	
		}

        System.out.println("运算结果为："+num1+operator+num2+"="+result);
         
        //除数不能为0，也不能对0取余数，这得考虑进去
        //但是10.0/0.0结果就是infinity，10/0结果报错



		
	}
}