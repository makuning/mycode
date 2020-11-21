package com.bjpowernode.javase.test004;

import java.util.Date;

import com.bjpowernode.javase.test002.Cat;
/**
 * eclipse导入类的快捷键
 * 		ctrl + shift + o
 *
 */

public class Test {

	public static void main(String[] args) {

		//编译报错
		//Cat c=new Cat();
		
		/*
		com.bjpowernode.javase.test002.Cat c=new com.bjpowernode.javase.test002.Cat();
		*/
		
		Cat c=new Cat();
		
		
		Date d=new Date();
		System.out.println(d);
		
		
	}

}
