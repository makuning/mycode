package com.bjpowernode.javase.test003;

public class FinalTest04 {

	public static final double PI=3.1415926535;
	
	public static void main(String[] args) {
		
		System.out.println(Chinese.GUO_JI);
		
		System.out.println(PI);
		
		
	}
}


class Chinese{
	//国籍：中国
	
	//需求：每一个中国人都是中国，恒定不变，防止国际被修改，加final关键字
	//final修饰的实例变量不可变的，这种变量一般和static联合使用，成为“常量”。
	//常量定义的语法格式
	//                              public static final 类型 变量名 =值;
	//java规范中，常量名全部大写，单词之间用下划线链接
	//static final String country="中国";
	
	public static final String GUO_JI="中国";
	
	
}