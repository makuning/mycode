
/*
	对象的创建和使用
*/

public class OOTest01{
	
	public static void main(String[] args){
		
		int i=10;
		//int是基本数据类型
		//i是变量名
		//10是一个int类型的字面值
		
		
		//通过一个类可以实例化N个对象
		//实例化对象的语法： new 类名();
		//new是java语言中的一个运算符
		//new运算符的作用是创建对象，在JVM中的堆内存开辟新的内存空间
		//方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间中
		//栈内存(局部变量):方法代码片段执行时，会给该方法分配内存空间，在栈内存中压栈
		//堆内存：new的对象在堆内存中存储
		
		//new Student();
		//Student是一个引用数据类型
		//s是变量名，
		//new Student()是一个学生对象
		//s是一个局部变量，【在栈内存中存储】
		//什么是对象？new运算符在堆内存中开辟的内存空间就是对象
		//什么是引用？引用是一个变量，只不过这个变量中保存的是另一个java对象的内存地址
		//对于java语言，程序员不能直接操作堆内存，java中没有指针，不像C语言
		//对于java语言，程序员只能通过“引用”来访问堆内存中对象内部里的实例变量
		
		Student s=new Student();
		
		
		//访问实例变量的语法格式：
		//读取： 引用.变量名
		//修改： 引用.变量名=值
		
		/*
		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
		boolean stuSex=s.sex;
		String stuAddr=s.addr;
		
		System.out.println("学号 ="+stuNo);
		System.out.println("姓名 ="+stuName);
		System.out.println("年龄 ="+stuAge);
		System.out.println("性别 ="+stuSex);
		System.out.println("住址 ="+stuAddr);
		
		输出默认值
		学号 =0
		姓名 =null
		年龄 =0
		性别 =false
		住址 =null
		*/
		
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.addr);
		
		System.out.println("------------------------------------");
		
		s.no=10;
		s.name="jack";
		s.age=20;
		s.sex=true;
		s.addr="北京";
		
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.addr);
		
		//再次实例一个全新的对象，
		//stu是一个引用
		//stu同时也是一个局部变量
		//Student是变量数据类型
		Student stu=new Student();
		
		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.sex);
		System.out.println(stu.addr);
		
		
		//编译报错，no是实例变量，不能直接采用“类名”的方式访问
		//因为no是实例变量，对象级别的变量，变量存储在java对象中，
		//只有先有对象，通过对象才能访问no这个实例变量，不能直接通过“类名”来访问
		//创建对象-用引用来赋值-访问引用
		//System.out.println(Student.no);
	}
	
}

/*
	局部变量在栈中存储，
	成员变量中的实例变量在堆内存的java对象内部存储

	实例变量是一个对象一份，100个对象就有100份
*/





