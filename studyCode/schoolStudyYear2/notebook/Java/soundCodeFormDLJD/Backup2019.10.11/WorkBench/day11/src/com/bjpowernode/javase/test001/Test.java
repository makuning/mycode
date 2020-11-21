package com.bjpowernode.javase.test001;

//测试类
/**
 *关于java语言中的多态语法机制：【只是多态的基础语法，具体应用后面说】 
 *		1.Animal、Cat、Bird三个类的关系
 *			Cat继承Animal
 *			Bird继承Animal
 *			Cat和Bird之间没有任何继承关系
 *
 *		2.面向对象三大特征：封装、继承、多态
 *
 *		3.关于多态的几个概念：
 *
 *			*向上转型（upcasting）
 *				子类型-->夫类型
 *				又被称为自动类型转换
 *
 *			 *向下转型（downcasting）
 *				父类型-->子类型
 *				又被称为强制类型转换【强制类型转换符】
 *
 *			*需要记忆：
 *					无论是向上还是向下转型，两种类型之间必须存在继承关系
 *					没有继承关系，程序是无法编译通过的
 *
 *
 *
 *
 */
public class Test {

	public static void main(String[] args) {

		//正常方式
		Animal a1=new Animal();
		a1.move();
		
		Cat c1=new Cat();
		c1.move();
		c1.catchMouse();
		
		Bird b1=new Bird();
		b1.move();
		
		//使用多态这种语法机制
		/**
		 * 1.Animal和Cat存在继承关系，Animal是父类，Cat是子类
		 * 
		 * 2.Cat is a Animal.【合理的】
		 * 
		 * 3.new Cat()创建的对象的类型是Cat，a2这个引用的数据类型是Animal，可见他们进行了类型转换
		 * 子类型转换成父类型，称为向上转型/upcasting,或者说自动类型转换。
		 * 
		 * 4.java中允许这种语法机制：父类型引用指向子类型对象
		 * 
		 * 
		 */
		Animal a2=new Cat();
		
		//Bird b2=new Cat();//不存在继承关系，无法向上还是向上转型
		
		/**
		 * 1.java程序永远分为两个阶段，编译阶段、运行阶段
		 * 
		 * 2.先分析编译阶段，再分析运行阶段，编译无法通过就谈不上运行了
		 * 
		 * 3.编译阶段编译器检查语法，a2这个引用的数据类型为Animal，由于Animal.class
		 * 字节码文件中有move()方法，所以编译通过了。这个过程我们称之为：静态绑定，编译阶段绑定
		 * 只有静态绑定成功后才能有后续运行的事
		 * 
		 * 4.在程序运行阶段，JVM堆内存当中真实创建的对象是Cat对象，那么以下程序在运行阶段
		 * 一定会调用Cat对象中的move()方法，此时发生了运行阶段的绑定，也就是：动态绑定
		 * 
		 * 5.无论是Cat类有没有进行方法覆盖，运行阶段一定调用的是Cat对象的move方法，因为底层的
		 * 真实对象就是Cat对象
		 * 
		 * 6.父类引用指向子类对象这种机制导致程序在编译阶段绑定和运行阶段绑定两种不同的形态/状态，
		 * 这种机制可以称为一种多态语法机制。
		 */
		a2.move();//猫咪在走猫步！
		
		/**
		 * 分析以下程序编译报错的原因
		 * 		因为编译阶段编译器检查到a2的类型是Animal类型，
		 * 		从Animal.class字节码文件当中查找catchMouse()方法查找不到，
		 * 		导致静态绑定失败，没有绑定成功，别谈运行了。
		 * 
		 */
		//a2.cathMouse();
		
		/**
		 * 需求：
		 * 		假设想让上述的对象去调用catchMouse方法，怎么办？
		 * 
		 * 		a2是无法直接调用的，因为a2的类型是Animal，Animal中没有catchMouse方法。
		 * 		我们可以将a2强制类型转换为Cat类型。
		 * 		a2的类型是Animal（父类），转换成Cat类（子类），被称为向下转型/downcasting/强制类型转换
		 * 
		 * 注：向下类型转换也需要两种之间必须有继承关系。不然编译报错。强制类型转换需要加强制类型转换符。
		 * 
		 * 什么时候需要使用强制类型转换呢
		 * 		当调用的方法是子类型中特有的，在父类型中不存在，必须进行向下转型
		 * 
		 */
		
		Cat c2=(Cat)a2;
		c2.catchMouse();
		
		
		
		//父类型引用指向子类对象【多态】
		Animal a3=new Bird();
		
		/**
		 * 1.以下程序编译没有问题，因为编译器检查到a3的类型是Animal，
		 * Animal和Cat之间存在继承关系，并且Animal是父类，Cat是子类，
		 * 父类型向下转型成子类型，语法不存在问题。
		 * 
		 * 2.程序虽然编译通过，但是程序在运行阶段会出异常，因为此时JVM堆内存
		 * 当中真实存在的对象是Bird类，Bird对象和Cat对象之间无法进行类型转换，
		 * 因为二者之间不存在任何继承关系，此时出现著名的异常：
		 *			 java.lang.ClassCastException
		 * 			类型转换异常，这种异常总是在“向下转型”中出现。
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//Cat c3=(Cat)a3; //java.lang.ClassCastException
		
		/**
		 * 1.上述异常只会在“向下转型”时候发生，也就是说“向下转型”存在隐患（编译通过，运行出错了！）
		 * 
		 * 2.向上转型一旦编译通过，运行一定不会出现问题，Animal a=new Cat();
		 * 
		 * 3.向下转型编译通过，运行可能会出错，Animal a3=new Bird();Cat c3=(Cat)a3;
		 * 
		 * 4.如何在向下转型中避免类型转换异常的出现？
		 * 			使用instanceof运算符可以避免。
		 * 
		 * 5.instanceof运算符怎么用？
		 * 
		 * 				5.1.语法格式：
		 * 						(引用 instanceof 数据类型)
		 * 
		 * 				5.2.	以上运算符的执行结果是布尔类型，结果可能是：true/false
		 * 
		 * 				5.3.关于运算符结果true/false：
		 * 							假设(a instanceof Animal)
		 * 							true表示：
		 * 									a引用指向的这个对象是Animal类型
		 * 							false表示：
		 * 									a引用指向的这个对象不是Animal类型
		 * 
		 * 6.java规范：
		 * 			在进行强制类型转换时，建议采用instanceof运算符进行判断，避免类型转换异常的出现，这是一种编程好习惯
		 * 
		 */
		
		//对a3引用指向的对象进行判断，是猫就抓老鼠，是鸟就飞翔。
		//使用if语句和instanceof运算符
		
		if(a3 instanceof Cat) {//a3引用指向的对象时一个Cat类型
			Cat c3=(Cat)a3;
			c3.catchMouse();
		}else if(a3 instanceof Bird) {//a3引用指向的对象时一个Bird类型
			Bird b3=(Bird)a3;
			b3.fly();
		}
		
		
	}

}
