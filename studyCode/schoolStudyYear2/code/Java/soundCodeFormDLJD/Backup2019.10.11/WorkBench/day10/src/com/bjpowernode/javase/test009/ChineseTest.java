package com.bjpowernode.javase.test009;

public class ChineseTest {

	public static void main(String[] args) {

		//创建一个Chinese对象
		Chinese zhangsan=new Chinese("1","张三");
		System.out.println(zhangsan.id+","+zhangsan.name+","+Chinese.country);
		
		//创建一个Chinese对象
		Chinese lisi=new Chinese("2","李四");
		System.out.println(lisi.id+","+lisi.name+","+Chinese.country);
		
		//创建一个Chinese对象
		Chinese wangwu=new Chinese("3","王五");
		System.out.println(wangwu.id+","+wangwu.name+","+Chinese.country);
		
		System.out.println(Chinese.country);
		
		//访问张三的国籍
		System.out.println(zhangsan.country);//警告，但是可以访问。
		
		zhangsan=null;
		System.out.println(zhangsan.country);//编译通过，并未出现空指针异常，说明访问变量时并没有对象的参与。
		//即使写了“引用.”，实际上访问的还是“Chinese.country”
		
		//所有static的都可以用类名.也能用引用.[后者不推荐]
		
		//System.out.println(country);//注意哦，编译报错，country是另一个类中的静态变量
	}

}
