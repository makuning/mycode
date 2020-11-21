package com.bjpowernode.javase.test011;

public class MainTest {

	public static void main(String[] args) {

		//构成方法重载
		System.out.println("Hello!");
		
		main(10);
		
		main("Hello World!");
		
		
	}

	public static void main(int i) {
		System.out.println(i);
	}
	
	public static void main(String args) {
		System.out.println(args);
	}

}
