package com.bjpowernode.javase.test002;

/**
 * 主人类
 *
 */

/**
 * 这种方式没有使用java中的多态机制，存在的缺点：Master的扩展力很差，因为只要新添加一个宠物，Master就需要添加一个新的方法
 *
 */

/*
public class Master {

	//主人喂养猫
	public void feed(Cat c) {
		c.eat();
	}
	
	//主人喂养狗
	public void feed(Dog d) {
		d.eat();
	}
	
}
*/

//Master和Cat、Dog耦合度高，扩展力弱


/**
 * 降低程序的耦合度（解耦合），提高程序的扩展力【软件开发的一个很重要的目标】
 */
public class Master{
	
	public void feed(Pet pet) {
		pet.eat();
	}
	
	//根据实际传递的对象，pet是一个父类型引用，传递的都是Cat、Dog、Snake这些子类对象。
	//父类型引用指向子类型对象【多态】
	
	
	//现如今，Master已经面向一个抽象的宠物pet类，而不是哪些具体的宠物猫、狗之类
	//提倡：面向抽象编程，不要面向具体编程
	//面向抽象编程的好处是：耦合度低，扩展性强，程序健壮
	
}















