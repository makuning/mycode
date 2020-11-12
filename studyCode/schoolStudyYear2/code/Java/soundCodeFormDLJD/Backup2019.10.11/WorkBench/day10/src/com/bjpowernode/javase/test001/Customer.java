package com.bjpowernode.javase.test001;

/**
 * 关于java语言当中this关键字：
 * 		
 * 		1.this是一个关键字，翻译成：这个
 * 		2.this是一个引用，this是一个变量，this变量中保存了内存地址指向自身，this存储在JVM堆内存java对象内部。
 * 		3.创建100个java对象，每一个对象都有this，也就是说有100个不同的this
 * 		4.this可以出现在“实例方法”中，this指向当前正在执行这个动作的对象（this代表这个对象）
 * 		5.this多数情况下可以省略不写
 *		6.this不能使用在带有static的方法当中
 *
 */
public class Customer {

	//姓名【堆内存的对象内部中存储，所以访问该数据的的时候，必须先创建对象，通过引用方式访问】
	String name;//实例变量，必须采用“引用.”方式访问
	
	//构造方法
	public Customer() {
		
	}
	
	//不带static关键字的一个方法
	//顾客购物的行为
	//每一个顾客购物最终的结果都是不一样的
	//所以购物这个行为是属于对象级别的行为
	//由于每一个对象在执行购物的这个动作所产生的最终结果不同，所以“购物”这个动作必须要有对象的参与
	//重点：没有static关键字的方法被称为“实例方法”，实例方法怎么访问？“引用.”
	//重点：没有static关键字的变量被称为“实例变量”
	//注意:当一个行为/动作执行过程中必须要对象参与，那么这个方法一定要定义为“实例方法”，不能带static关键字
	//以下方法定义为实例方法，因为每一个顾客在真正购物的时候，最终的结果是不同的。所以这个动作完成的时候必须要有对象的参与
	
	public void shopping() {
		//当张三购物的时候，输出：张三在购物。
		//当李四购物的时候，输出：李四在购物。
		//System.out.println(xxx在购物);
		
		//由于name是一个实例变量，所以这个name访问的时候一定访问的是当前对象的name
		//所以多数情况下，“this”是可以省略不写的。
		System.out.println(name+"在购物");
		
		//完整写法
		//System.out.println(this.name+"在购物");
		
	}
	
	public static void doSome() {
		
		//带有static的方法在调用的时候，采用“类名.”的方式访问，并没有涉及到对象
		//或者说这个“上下文”中不存在“当前对象”，自然也不存在this（this代表的是当前正在执行这个动作的对象）
		
		//System.out.println(name);//编译报错
		//为什么会编译报错？
		//doSome方法调用不是对象去调用，而是一个类名去调用，执行过程中没有“当前对象”参与。
		//name是一个“实例变量”，以上代码含义是访问当前对象的name，没有当前对象，自然不能访问当前对象的name
		
		//同样的,static方法调用不需要对象，直接使用类名，所以执行过程中没有当前对象，不能使用this
		//System.out.println(this);
		
	}
	
	public static void doOther() {
		
		//如果要访问name这个实例变量怎么访问？
		
		//可以采用以下方案，但是访问的一定不是当前对象的name
		//创建对象
		Customer c=new Customer();
		System.out.println(c.name);
		//注意哦，这里的方法有static，不能使用this
	}
	
	
	
}
