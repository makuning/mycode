/*
关于java语言种“+”运算符：
	1.“+”运算符在java语言中有两个作用：
		*加法运算，求和
		*字符串的连接运算
	2.当“+”运算符两边的数据都是数字的话，一定是加法运算
	3.当“+”运算符两边的数据只要有一个是字符串类型的话，一定会进行字符串连接运算。
	并且，连接运算之后的结果还是一个字符串类型
		数字+数字-->数字【求和】
		数字+"字符串"-->"字符串"【字符串连接】
	4.在一个表达式当中，可以出现多个“+”运算符，在没有添加小括的前提下，遵循从左到右的顺序依次运算

*/

public class OperatorTest05{
	public static void main(String[] args){
		
		System.out.println(10+20);//输出30 求和
		System.out.println(10+20+"30");//输出"3030"  第一个求和，第二个字符串连接
		
		System.out.println(10+(20+"30"));
		//输出"102030" 先括号，时字符串连接，结果也是字符串连接，和前面的数字一起，也是字符串连接
		
		int a=10;
		int b=20;
		
		//要求在控制台输出"10+20=30"
		System.out.println("10+20=30");
		
		//怎么以动态的方式输出呢？
		//怎么利用到a和b这两个变量呢？
		
		System.out.println("10+20="+a+b);
		//"10+20="字符串，和a变量字符串连接，第一步输出结果：10+20=10，
		//接着，第一步结果仍然是字符串，和b变量连接，输出最终结果："10+20=1020"
		
		System.out.println("10+20="+(a+b));
		//先小括号求和，最终结果"10+20=30"
		
		System.out.println("a+20="+(a+b));
		//这里的a是字符串a了，不是变量了。
		
		
		System.out.println(a+"+"+b+"="+(a+b));
		//这就是输出a+b=a与b之和的程序。
		//仔细看，你看懂了吗？
		
		
		a=100;
		b=200;
		System.out.println(a+"+"+b+"="+(a+b));
		
		//下面看一个小例子。
		//在引入例子前，先讲一个小东西。
		
		//引用数据类型String
		//String是SUN公司在JavaSE中提供的字符串类型
		//对应String.class字节码文件
		
		String s="abc";
		//依照基本数据类型的解释对其进行解释
		//定义一个String类型的变量，名称为s，将"abc"这个字符串赋值给s变量。
		//String是引用数据类型，s是变量名，"abc"是String类型的变量。
		
		//String ss=10;
		//根本就不能这样写，编译错误，类型不兼容
		
		System.out.println("登陆成功，欢迎回来");
		//那么现在我要欢迎张三回来怎么办呢？
		
		System.out.println("登陆成功，欢迎张三回来");
		
		//将这行代码用动态的方式输出呢？
		
		String username="张三";
		//定义一个String类型的变量，名称为username，将"张三"这个字符串赋值给username变量。
		
		System.out.println("登陆成功，欢迎username回来");
		//不对，这是静态的。
		
		System.out.println("登陆成功，欢迎"+username+"回来");
		
		username="李四";
		System.out.println("登陆成功，欢迎"+username+"回来");
		
		//以上就是+字符串连接运算符的一个应用。
		//在要隔开的位置，添加双引号让它隔开
		//将变量插入，最后用"+"运算符进行字符串连接运算。
		
		
		
		
	}
}