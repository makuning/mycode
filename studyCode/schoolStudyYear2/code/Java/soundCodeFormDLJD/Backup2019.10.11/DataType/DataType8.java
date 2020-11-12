/*
关于八种基本数据类型的相互转换，转换规则：
1.八种基本数据类型除布尔型之外剩下七种都可以相互转换

2.小容量向大容量转换，称为自动类型转换，容量从小到大：
  byte<short<int<long<float<double
       char <
    注意：
	任何浮点型不管占用多少个字节，都比整数型容量。
	char和short表示种类相同，但是char可以取更大的正整数。

3.大容量向小容量转换，称为强制类型转换，需要加强制类型转换符，程序才能编译通过，
但是在运行阶段可能会损失精度，所以谨慎使用

4.当整数字面值没有超出byte、short、char的取值范围，可以直接赋值给byte、short、char类型的变量

5.byte、short、char混合运算，各自先转换成int类型再做运算

6.多种数据类型混合运算，先转换成容量最大的那种类型再做运算

注意：
    byte b=3;可以编译通过，3未超范围
	 
	int i=10;
	byte b=i/3;编译报错，编译器只检查语法，不会”运算“i/3，
	
	此时可以把运算结果打一个小括号，再在前面加强制转换符。
	编译不要做运行时的工作。
	
*/

//具体实例

public class DataType8{
	public static void main(String[] args){
		//出现错误，1000超出了byte的取值范围
		//byte a=1000;
		//正确，因为20没有超出byte取值范围
		//所以赋值
		byte a=20;
		//变量不能重名
		//short a=1000;
		//正确，因为1000没有超出short取值范围
		//所以赋值正确
		short b=1000;
		//正确，因为默认就是int类型，并且没有超出int范围
		int c=1000;
		//正确，可以自动转换
		long d=c;
		//int e=d;
		//将long强制转换成int类型
		//因为值1000，没有超出int范围，所以转换正确
		int e=(int)d;
		//因为java语言中的运算会转换成最大类型
		//而10和3默认为int，所以运算后的最大类型也是int
		//所以正确
		
		int f=10/3;//10和3都是int，运算结果也会是int，结果是3
		
		double dd=10/3;
		System.out.println(dd);//先算出3，再转换成3.0，输出结果为3.0，int转double，自动转
		dd=10.0/3;
		System.out.println(dd);//输出结果为3.3333333333333335
		//10.0是double型，3是int型，都转换成double型再运算，结果不足为怪。
		
		//声明10为long类型
		long g=10;
		//出现错误，多个数值在运算过程中，会转换成容量最大的类型
		//以下示例最大的类型为double，而h为int，所以就会出现大类型（long）到小类型（int）
		//的转换，将会出现精度丢失问题
		//int h=g/3;
		//可以强制转换，因为运算结果没有超出int范围
		//int h=(int)g/3;
		//可以采用long类型来接收运算结果
		//long h=g/3 ;
		//出现精度损失问题，以下问题主要是优先级的问题
		//将g转换成int，然后又将int类型的g转换成byte，最后出现byte类型的g和3运算，那么
		//它的运算结果类型就是int，所以int赋值给byte就出现了精度损失问题
		
		//byte h=(byte)(int)g/3;请注意此条代码，此条报错。
		
		//正确
		//byte h=(byte)(int)(g/3);
		//不能转换，还有因为优先级的问题
		//byte h=(byte)g/3;
		//可以转换，因为运算结果没有超出byte范围
		//byte h=(byte)(g/3);
		//可以转换，因为运算结果没有超出short范围
		short h=(short)(g/3);
		short i=10;
		byte j=5;
		//错误，short和byte运算，首先会转换成int再运算
		//所以运算结果为int，int赋值给short就会出现精度丢失问题
		//short k=i+j;
		//可以将运算结果强制转换成short
		//short k=(short)(i+j);
		//因为运算结果为int，所以可以采用int类型接收
		int k=i+j;
		char l='a';
		System.out.println(l);//输出a字符
		//输出结果为97，也就是a的ascii值
		System.out.println((byte)l);//输出97
		int m=l+100;
		//输出结果为197，取得a的ascii码值，然后与100进行相加运算
		System.out.println(m);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}