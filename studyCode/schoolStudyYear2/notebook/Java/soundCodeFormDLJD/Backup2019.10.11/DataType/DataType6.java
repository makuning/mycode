/*
关于浮点型数据类型
float【4个字节】
double【8个字节，精度较高】

double的精度就财务软件方面来，还是较低，
SUN公司在基础SE类库当中为程序员准备了精度更高的数据类型，
只不过该类型是引用数据类型，不属于基本数据类型，它是：
java.math.BigDecimal

java类库的字节码和源码

例如String.java和String.class
我们的(String[] args)中的String使用的就是String.class字节码文件

在java语言种所有的浮点型字面值默认被当成double类型来处理，要想使其作为
float类型来，需要在字面值后加F或f。

注意：
    double和float在计算机内部二进制存储的时候存储的都是近似值。
	在现实中有些数字是无限循环的，比如：3.33333333......
	计算机的资源是有限的，用有限的资源去存储无限的数据只能存储近似值。


*/
public class DataType6{
	public static void main(String[] args){
		
		double d=3.0;
		System.out.println(d);
		//3.0是double型字面值，d是double型变量，不存在类型转换
		//正确的声明和赋值
		
		//解决以下程序报错的问题。
		//float f=5.1; 不兼容的类型: 从double转换到float可能会有损失
		
		//第一种
		//float f=(float)5.1;
		//以上涉及到强制类型转换
		
		//第二种
		float f=5.1F;
		//以上不存在类型转换
		
	}
}