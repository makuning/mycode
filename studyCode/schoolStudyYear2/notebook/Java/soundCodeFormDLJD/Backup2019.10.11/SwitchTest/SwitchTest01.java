
/*
	关于switch语句：
	
	1.switch语句也属于选择结构，也是分支语句

	2.switch语句的语法结构：

	一个比较完整的switch语句应该这样编写：
	
	switch(int或String类型的字面值或变量){
		case int或String类型的字面值或变量:
		    java语句;
			...
			break;
		case int或String类型的字面值或变量:
		    java语句;
			...	
		    break;
		...
		defalut:
		    java语句;
			...
	}
	
	3.switc语句的执行原理：
	    switch语句后的小括号当中的“数据”和case后面的“数据”进行一一匹配，匹配成功的分支执行
		按照从上而下的顺序依次进行匹配。
	
	4.匹配成功的分支执行，分支当中最后有“break;”语句的话，整个switch语句终止
	
	5.匹配成功的分支执行，分支当中没有“break;”语句的话，直接进入下一个分支执行（不进行匹配），
	这种现象被称为case穿透现象。【提供break;语句可以避免穿透】
	
	6.所有的分支都没有匹配成功，当有default语句的话，会执行default分支当中的程序。

    7.switch和case后面都必须是int或者String类型的数据，不可以探测别的类型
	
	*当然byte、short、char也可以直接写到switch和case后面，因为他们可以进行自动类型转换
	 byte、short、char可以自动转换成int
	
	*JDK6,switch和case只能探测int类型
	
	*JDK7及7之后的版本，引入新特性，switch和case关键字后面可以探测String类型的数据
	
	8.case可以合并：
	int i=10;//i=1,2,3,10,以下分支都可以执行
	
	switch(i){
		case 1:case 2:case 3:case 10:
		System.out.println("Test Code!");
	}
	
	
	
*/

public class SwitchTest01{
	public static void main(String[] args){
		
		//long a=100L;
		//int b=a;报错，可能会有精度损失
		
		//long x=100L;
		//switch(x){}//报错，和上述代码一样报错，精度损失
		
		long x=100L;
		switch((int)x){}//强制类型转换解决错误
		
		byte b=10;
		switch(b){}
		
		short s=10;
		switch(s){}
		
		char c='A';
		switch(c){}
		
		char cc=97;
		switch(cc){}
		
		//switch(true){}
		//编译报错！不兼容的类型: boolean无法转换为int
		
		String username="张三";
		switch(username){}
		
		//进行switch示例演示
		
		//接受用户键盘输入：
		//1表示星期一，2表示星期二...
		
		java.util.Scanner ss=new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int num=ss.nextInt();
		
		switch(num){
			case 1:
			   System.out.println("星期一");
			   break;
			case 2:
			   System.out.println("星期二");
			   break;  
            case 3:
			   System.out.println("星期三");
			   break;
            case 4:
			   System.out.println("星期四");
			   break;
            case 5:
			   System.out.println("星期五");
			   break;
			case 6:
			   System.out.println("星期六");
			   break;
			case 7:
			   System.out.println("星期天");
			   break;
			default:
			   System.out.println("不合法的数字！");
		}
		
		System.out.println("——————————————————————————————");
		
		//演示case穿透
		switch(num){
			case 1:
			   System.out.println("星期一");
			case 2:
			   System.out.println("星期二");  
            case 3:
			   System.out.println("星期三");
            case 4:
			   System.out.println("星期四");
			   break;
            case 5:
			   System.out.println("星期五");
			   break;
			case 6:
			   System.out.println("星期六");
			   break;
			case 7:
			   System.out.println("星期天");
			   break;
			default:
			   System.out.println("不合法的数字！");
		}
		
		System.out.println("——————————————————————————————");
		
		switch(num){
			case 1:
			   System.out.println("星期一");
			case 2:
			   System.out.println("星期二");  
            case 3:
			   System.out.println("星期三");
            case 4:
			   System.out.println("星期四");
            case 5:
			   System.out.println("星期五");
			case 6:
			   System.out.println("星期六");
			case 7:
			   System.out.println("星期天");
			default:
			   System.out.println("不合法的数字！");
		}//一穿到底
		
		System.out.println("——————————————————————————————");
		
		//演示case合并
		switch(num){
			case 1:case 0:
			   System.out.println("星期一");
			   break;
			case 2:
			   System.out.println("星期二");
			   break;  
            case 3:
			   System.out.println("星期三");
			   break;
            case 4:
			   System.out.println("星期四");
			   break;
            case 5:
			   System.out.println("星期五");
			   break;
			case 6:
			   System.out.println("星期六");
			   break;
			case 7:
			   System.out.println("星期天");
			   break;
			default:
			   System.out.println("不合法的数字！");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}