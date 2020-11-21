package com.bjpowernode.javase.test001;

public class Test2 {

	public static void main(String[] args) {

		Animal a1=new Cat();
		Animal a2=new Bird();
		
		
		if(a1 instanceof Cat) {
			Cat c1=(Cat)a1;
		}
		
		
		if(a2 instanceof Bird) {
			Bird b2=(Bird)a2;
		}
		
		
		/**
		 * 关于调试模式（DeBug模式）
		 * 
		 * 1.在代码行前端双击产生断点
		 * 
		 * 2.DeBug as a ...进入调试模式
		 * 
		 * 3.  F5---进入方法内部---Step Into
		 * 		F6---下一步---Step Over
		 * 		F7---出方法---Step Return
		 * 		F8---进入到下一个断点---Resume
		 *      CTRL+F2---关闭JVM，强行终止程序---Terminate
		 *      
		 * 4.点击java模式退出DeBug模式 
		 *      
		 * 5.DeBug模式在开发时非常常用，好好掌握这几个快捷键     
		 *      
		 *      
		 */
		
		
	}

}
