
/*
	针对第一个例使用方法来效果
	
	以下直接使用方法【不讲语法】，分析优点？
		*代码得到重复利
	
	方法的本质是什么？
		*方法实际上就是一段代码片段，并且这段代码片段
		可以完成某个特定功能，并且可以被重复使用
	
	方法：Method|调用：invoke
	方法在C语言中叫做函数：Function
   
    方法定义在类体中，在一个类当中可以定义多个方法，方法编写的位置没有先后顺序，可以随意
	
	方法体中不能再定义方法！！！！！！！！！！！！！！！！！！！！！！！！！

    方法体由java语句够成，方法体中代码遵守由上而下的顺序依次执行
*/

public class MethodTest02{
	
	public static void main(String[] args){
		
		//计算两个int类型数据和
		MethodTest02.sumInt(10,20);
		
		MethodTest02.sumInt(666,888);
		
		MethodTest02.sumInt(111,222);
		
		
	}
	
	//定义一个方法
	//该方法完成计算两个int类型数据的和，并且将结果输出
	public static void sumInt(int a,int b){
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}

}