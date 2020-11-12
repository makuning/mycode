package com.bjpowernode.javase.test002;

/**
 * 多态在实际开发中的作用，以主人喂养宠物为例
 *
 *1.分析：主人喂养宠物这个场景实现需要进行类型的抽象：
 *				-主人【类】
 *				-主人可以喂养宠物，所以主人有这个喂养的动作
 *				-宠物【类】
 *				-宠物可以吃东西，所以宠物具有吃东西这个动作
 *
 *2.面向对象编程的核心：定义好类，然后将类实例化为对象，给一个环境驱使一下，让各个对象之间协作起来形成一个系统。
 *
 *3.多态的作用：
 *			降低程序的耦合度，提高程序的扩展力
 *			能使用多态尽量使用多态
 *			夫类型引用指向子类型对象
 *
 *核心：面向抽象编程，尽量不要面向具体编程
 */
public class Test {

	public static void main(String[] args) {

		
		//创建主人对象
		Master zhangsan=new Master();
		//创建猫对象
		Cat tom=new Cat();
		//让主人喂养猫
		zhangsan.feed(tom);//父类型引用指向子类型对象
		
		
		zhangsan.feed(new Cat());
		
		
		/**
		 * 需求：让主人去喂养狗，让狗去啃骨头。
		 */
		
		
		//创建狗对象
	    Dog erHa=new Dog();
		//让主人喂养狗
		zhangsan.feed(erHa);//父类型引用指向子类型对象
		
		
		//创建蛇对象
		Snake mangShe=new Snake();
		//让主人喂养蛇
		zhangsan.feed(mangShe);//父类型引用指向子类型对象
		
	}

}
