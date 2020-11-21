package com.bjpowernode.javase.test003;

public class FinalTest03 {

	public static void main(String[] args) {

		//创建用户对象
		User u=new User(100);//User u=0x1234;
		
		//又创建了一个新的对象
		//程序执行到这里，表示上面的对象已变成垃圾数据，等待垃圾回收器回收
		u=new User(200);//u=0x2589;
		
		
		//创建用户对象
		final User user=new User(30);
		//user=new User(50);//final修饰的引用一旦指向某个对象之后，不能让它去指向其他对象，那么被指向的对象永远不能被垃圾回收器回收
		//user=null;
		System.out.println(user.id);
		
		user.id=50;//final修饰的引用虽然指向某个对象后不能指向其他对象，但是所指向的对象内部的内存是可以更改的
		
		System.out.println(user.id);
		
	}

}
