package com.bjpowernode.javase.test008;

/**
 * “中国人”类
 *
 */
public class Chinese {

	//身份证号【每一个中国人对象身份证号不一样】
	//实例变量
	String id;
	
	//姓名【每一个对象的姓名不同】
	//实例变量
	String name;
	
	//国籍【每一个中国人对象国籍相同，都是中国】
	//无论通过Chinese类实例化多少个java对象，这些java对象的国籍都是“中国”
	//实例变量【实例变量是一个java对象就有一份，100个对象就有100个country】，分析这种设计方式的缺点。
	//实例变量存在堆内存，构造方法执行时初始化
	String country;
	
	//构造无参数构造方法
	public Chinese() {
		
	}
	
	//构造有参数方法
	public Chinese(String id,String name,String country) {
		this.id=id;
		this.name=name;
		this.country=country;
	}
	
	
}
