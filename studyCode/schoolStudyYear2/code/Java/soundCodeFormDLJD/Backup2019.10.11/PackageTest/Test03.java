package com.bjpowernode;

public class Test03{
	
	public static void main(String[] args){
		
		//创建Test01对象
		com.bjpowernode.javase.day11.Test01 t=new com.bjpowernode.javase.day11.Test01();
		System.out.println(t);
		
		//Test01 tt=new Test();
		//编译错误，省略包名之后，会在当前目录下找Test01
		//实际上编译器去找com.bjpowernode.Test01了，这个类不存在，编译错误。
		
		
		
		//结论：什么时候包名可以省略，Test03和Test01这两个在同一个目录下就能省
		
	}
}