
/*
	需求：
	
		定义一个计算机类【电脑/笔记本】，计算机类的属性：
			*品牌
			*型号
			*颜色

		定义一个学生类，学生类的属性：
			*学号
			*姓名
			*学生有一台笔记本电脑

		请编写程序表示以上的类，然后分别将类创建成对象，
		对象数量不限，然后让其中一个学生去使用其中一台笔记本电脑
		
		编译并运行，并且将整个的执行过程采用画图方式描述出来
		
		所有的代码写到这里来。
*/

public class OOTest06{
	
	public static void main(String[] args){
		
		Computer computer1=new Computer();
		
		Computer computer2=new Computer();
		
		computer1.brand="asus";
		computer1.type='A';
		computer1.color="red";
		
		computer2.brand="lenevo";
		computer2.type='B';
		computer2.color="black";
		
		Student student1=new Student();
		
		student1.no=110;
		student1.name="jack";
		student1.c=computer1;
		
		System.out.println(student1.no);
		System.out.println(student1.name);
		System.out.println(student1.c.brand);
		System.out.println(student1.c.type);
		System.out.println(student1.c.color);
		
		//注意，直接访问student1.c它实际上是一个内存地址的。
		
		//当然，也可以直接student1.c=new Computer();这个学生直接换了一台新的电脑
		
	}
}

class Computer{
	
	String brand;
	
	char type;
	
	String color;
}

class Student{
	
	int no;
	
	String name;
	
	Computer c;

}

//关联关系，通过A对象，能够找到B对象。A中含有B的引用

