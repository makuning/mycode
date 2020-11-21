
/*
方法重载的具体应用

*/

public class OverloadTest04{
	
	public static void main(String[] args){
		
		System.out.println(1);
		
		System.out.println(true);
		
		System.out.println(3.0);
		
		System.out.println("Hello Word!");
		
		//System.out.println();这句话写起来挺麻烦的
		//将8种基本数据类型和String数据类型的数据打印数输出封装成工具打印方法
		
		
		//调用工具的打印方法
		
		工具.打印(55);
		
		工具.打印(false);
		
		工具.打印("我是一个程序员");
		
		
		
		
	}
}

