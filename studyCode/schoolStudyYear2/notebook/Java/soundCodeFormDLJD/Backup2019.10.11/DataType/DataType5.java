/*
关于精度损失






*/
public class DataType5{
	public static void main(String[] args){
		byte a=100;
		System.out.println(a);
		//编译和运行正常
		
		byte a1=(byte)198;
		System.out.println(a1);
		//损失精度，结果是-58.

		
		
		short b=100;
		//short b1=32768;报错
		
		//65535是int类型，4个字节
		//c变量是char类型，2个字节
		//但是以下程序仍然通过
		char c=65535;
		//c=65536;这行代码报错
		
		
		/*
		综合DataType4文件，可以得出以下结论：
		当一个整数型字面值没有超出byte、short、char的取值范围，这个字面值
		可以直接赋值给byte、short、char类型的变量。SUN公司允许这种机制，目的
		是为了方便程序员编写程序。
		如果超出取值范围，就要手动强转，精度损失自己承担
		*/
		
		
		
		
	}
}