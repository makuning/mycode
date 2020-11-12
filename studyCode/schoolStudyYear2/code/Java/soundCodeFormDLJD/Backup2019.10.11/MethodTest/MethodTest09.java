
/*
	深入探究return语句
		*return语句一旦执行，所在方法执行结束
		
		*在“同一个作用域”中，return语句下面不能编写任何代码，
		因为这些代码会永远执行不到，编译报错

*/

public class MethodTest09{
	
	public static void main(String[] args){
		
		/*
		int retValue=m();
		System.out.println(retValue);
		*/
		
		//编译错误，调用m方法并没有传递实参，即没有括号，编译器会认为这个m是某个变量。
		//System.out.println(m);
		
		//编译通过，正确地调用m方法。即使形参没有，但是(形参)这个格式一定要有。
		System.out.println(m());
		
		
		
	}
	
	//编译报错，缺少返回语句，编译器认为 return 1;这条语句并不能完全保证执行到。
	/*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
		}
		
	}
	*/
	
	//编译通过，带有else的控制语句一定会保证有一个分支执行，return 1; 或者 return 0;这两个肯定会执行一个
	/*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
		}else{
			return 0;
		}
		
	}
	*/
	
	//在这里，需要说明的是下面的代码和上面的完全一样。
	//首先if语句里a>3可能为真也可能为假
	//真-有return 1执行，整个方法执行结束
	//假-有return 0执行，整个方法执行结束
	//不管怎么样，都会有 return 值 语句执行
    /*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
		}
		return 0;
		
		
	}
	*/
	
	/*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
			//System.out.println("Hello World!");//此行代码永远执行不到，无法访问的语句，编译报错
		}
		System.out.println("Hello World!");//现在你应该明白在同一个作用域中return语句下面不能加java语句了吧
		return 0;
		
		
	}
	*/
	
	//另外，还可以使用三元运算符达到最简代码的目的
	public static int m(){
		return 10>3?1:0;//后面的10>3?1:0是三元运算符，真输出1，假输出0
	}

}