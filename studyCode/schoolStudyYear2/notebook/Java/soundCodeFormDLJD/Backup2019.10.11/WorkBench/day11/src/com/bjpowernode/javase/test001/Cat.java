package com.bjpowernode.javase.test001;

/**
 * 猫类
 *
 */
public class Cat extends Animal {

	//子类继承父类，也会移动，进行方法重写
	public void move() {
		System.out.println("猫咪在走猫步！");
	}

	//除此之外，猫咪还会抓老鼠！
	public void catchMouse() {
		System.out.println("猫咪抓老鼠！");
	}
	
}
