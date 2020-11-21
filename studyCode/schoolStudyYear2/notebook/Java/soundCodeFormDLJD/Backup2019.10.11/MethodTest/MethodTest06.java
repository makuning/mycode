
/*
方法的调用：
	1.方法的修饰符列表有static关键字的，完整的调用方式：类名.方法名(实参列表);
	
	2.有的时候，可以省略不写“类名.”在什么情况下可以省略？
	m1(){
		m2();
	}
	m1方法和m2方法在同一个类体当中，“类名.”可以省略不写
    调用的方法和被调用的方法在同一个类体当中
	
	3.建议在一个java源文件中只定义一个class，比较清晰，这里是为了教学的目的
	在一个java源文件中定义多个class，不要模仿
*/

public class MethodTest06{
	
	public static void main(String[] args){
		
		//完整调用
		MethodTest06.m();
		
		m();//编译通过
		
		//调用其他类的方法【不是本类】
		A.doOther();
		
		//编译报错，省略“类名.”后，默认从MethodTest06，即当前类中找“doOther”方法，但是该方法不存在
		//doOther();

	}
	
	public static void m(){
		System.out.println("m方法被调用！");
		
		//完整调用
		MethodTest06.m2();
		
		//省略的方式
		m2();
		
		A.m2();
	}
	
	public static void m2(){
		System.out.println("m2方法被调用！");
	}
	

}

class A{
	
	public static void doOther(){
		System.out.println("A的doOther方法被调用！");
	}
	
	public static void m2(){
		System.out.println("A的m2方法被调用！");
	}
	
}