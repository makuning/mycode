package org.apache;

//import com.bjpowernode.javase.day11.Test01;

import com.bjpowernode.javase.day11.*;

/*
	import语句用于完成其他类的导入，同一个包名下的类不需要导入。
	不在同一个包名下的类需要手动导入

	import语法格式：
		import 类名;
		import 包名.*;
		
	import语句需要编写在package语句之下，class之上。

	

*/

import java.lang.String;

import java.util.*;
//import java.util.Date;

public class Test04{
	
	public static void main(String[] args){
		
		com.bjpowernode.javase.day11.Test01 t=new com.bjpowernode.javase.day11.Test01();
		System.out.println(t);
		
		com.bjpowernode.javase.day11.Test01 tt=new com.bjpowernode.javase.day11.Test01();
		System.out.println(tt);
		
		com.bjpowernode.javase.day11.Test01 ttt=new com.bjpowernode.javase.day11.Test01();
		System.out.println(ttt);
		
		//以上程序倒是可以，太麻烦了。
		
		//引入概念：import关键字
		
		Test01 x=new Test01();
		System.out.println(x);
		
		
		String s="abc";
		System.out.println(s);
		
		java.lang.String str="abc";
		/*
			java.lang.*不需要手动引入，系统自动引入
		
			java.lang.*是java语言的核心类，不需要手动引入
		
		
		*/
		
		//直接编写下面代码报错，因为找不到Date这个类
		//Date d=new Date();
		
		//java.util.Date d=new java.util.Date();
		
		//使用import语句导入java.util.Date;
		Date d=new Date();
		System.out.println(d);
		
	}
}

/*
		最终结论：
			什么时候需要import？
				*不是java.lang下，并且不在同一个包下的时候，需要使用import导入
		
*/





