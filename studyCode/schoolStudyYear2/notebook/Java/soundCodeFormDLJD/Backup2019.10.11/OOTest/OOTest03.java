
public class OOTest03{
	
	public static void main(String[] args){
		
		//u是引用
		//u是局部变量
		User u=new User();
		
		//在OOTest02.java中编写的代码
		//u.addr=new Address();
		
		//换一种写法
		
		//a是引用
		//a是局部变量
		Address a=new Address();
		u.addr=a;
		
		System.out.println(u.addr.city);//null
		
		a.city="天津";
		
		System.out.println(u.addr.city);//天津
		
		
		//画图，一步步按照顺序来，一定可以弄懂原理。
		
		
	}
}