/*
三元运算符/三目运算符/条件运算符

1.语法规则
    布尔表达式?表达式1:表达式2

2.三元运算符的执行原理？
	当布尔表达式结果是true的时候，选择表达式1作为整个表达式的结果
	当布尔表达式结果是false的时候，选择表达式2作为整个表达式的结果
	
*/

public class OperatorTest06{
	public static void main(String[] args){
		
		//10;
		//编译错误，不是一个完整的java语句
		
		//'男';
		//编译错误，不是一个完整的java语句
		
		//定义一个布尔类型的变量
		boolean sex=false;
		
		//分析以下程序是否可以编译通过？
		//sex?'男':'女';
		//编译报错，因为它不是一个完整的java语句，它运算结果是个值
		
		char c=sex?'男':'女';
		System.out.println(c);
		
		sex=true;
		c=(sex?'男':'女');//不确定运算优先级，加个小括号
		System.out.println(c);
		
		//语法错误，编译报错，结果可能是String，也可能是char，但是前边不能用char来接收数据。
		//类型不兼容
		//char c1=sex?"男":'女';
	
		//sex=false;
		//char c1=sex?"男":'女';//前面用String字符串类型也不可以！
		//这样就对了吗？
		//仍然不对！是语法错误！类型不兼容！
		
		//解决方法，找一种兼容字符和字符串的类型。
		//利用一个方法就行。
		
		System.out.println(10);
		System.out.println("10");
		System.out.println('1');//注意不能拿10举例，会被视为两个字符，编译不通过。
		//这个方法是不是特别厉害？
		
		System.out.println(sex?"男":'女');//sex是true。
		
	}
}