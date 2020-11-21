
/*
整数型字面值        占用空间（字节）         默认值                        取值范围
byte                    1                      0                            [-128~127]
short                   2                      0                           [-32768~32767]
int                     4                      0                          [-2147483648~2147483647]
long                    8                      0L  
*/

/*
1.java语言当中“整数型字面值”被默认当作int类型来处理，要使得这个“整数型字面值”被当成
long类型来处理，需要在“整数型字面值”后加l或L，建议使用L（不容易和数字1混淆）

2.Java语言种对整数型字面值表示的3种形式
第一种：十进制【是一种缺省默认的方式】
第二种：八进制【在编写八进制整数型字面值需要以数字0开始】
第三种：十六进制【在编写十六进制整数型字面值需要以0x开始】



*/
public class DataType3{
	public static void main(String[] args){
		int a=10;
		int b=010;
		int c=0x10;
		System.out.println(a);//输出10
		System.out.println(b);//输出8
		System.out.println(c);//输出16
		System.out.println(a+b+c);//输出10+8+16=34
		//都是以十进制输出的
		
		//123这个整数型字面值是int类型
		//i变量在声明的时候也是int类型
		//int类型的123赋值给int类型的变量i，不存在类型转换
		int i=123;
		System.out.println(i);

        //456这个整数型字面值被当作int类型，占用4个字节
		//x变量在声明的时候是long类型，占用8个字节
		//int类型的456赋值给long类型的变量x，存在类型转换
		//int类型转换成long类型
		//int类型是小容量
		//long类型是大容量
		//小容量可以自动转换成大容量，称为自动类型转换机制
		long x=456;
		System.out.println(x);
		
		//2147483647是int类型，占用4个字节
		//y是long类型，占用8个字节，自动类型转换
		long y=2147483647;
		System.out.println(y);
		
		/*
		long z=2147483648;
		System.out.println(z);
		以上程序编译出现错误。
		错误: 整数太大
		分析：2147483648这个值它一打出来就被默认当成int类型来处理，还没赋值它就出错了
		可是这个数字超出了int类型的最大值，但是它肯定在long类型的取值范围里，
		怎么解决呢，在这个数字后面加上L
		这样一来，2147483648L就是一个long类型整数型字面值。
		那这样z变量也是long类型，不存在类型转换。
		*/
		long z=2147483648L;
		System.out.println(z);
		
		
		
		
		
		
	}
}