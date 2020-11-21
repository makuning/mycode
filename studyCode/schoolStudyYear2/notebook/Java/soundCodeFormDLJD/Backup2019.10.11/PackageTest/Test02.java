package com.bjpowernode.javase.day11;

public class Test02{
	
	public static void main(String[] args){
		
		//完整类名：com.bjpowernode.javase.day11.Test01
		com.bjpowernode.javase.day11.Test01 t=new com.bjpowernode.javase.day11.Test01();
		System.out.println(t);//com.bjpowernode.javase.day11.Test01@2ff4acd0
		
		//可以省略不写包名，因为Test01和Test02在同一个目录下
		Test01 tt=new Test01();
		System.out.println(tt);//com.bjpowernode.javase.day11.Test01@54bedef2
		
		
		//com.bjpowernode.javase.day11这个存储着class文件，编译器能找到。
		
		
	}
}