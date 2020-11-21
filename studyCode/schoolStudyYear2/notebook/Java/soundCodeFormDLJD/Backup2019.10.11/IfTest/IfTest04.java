/*
   关于if语句中Java代码只有一行可以省略大括的详细探究
*/

public class IfTest04{
	public static void main(String[] args){
		
		boolean sex=true;
		if(sex){
			System.out.println("男");
		}else{
			System.out.println("女");
		}
		
		sex=false;
		
		if(sex) System.out.println("男");else System.out.println("女");
		//一行代码，省略大括号
		
		//看下面的代码是否编译通过
		//如果编译报错，哪一行会报错
		
		if(sex)
			System.out.println("男");//这行实际上是if中的语句
			System.out.println("？");//这行是实际上是独立的，实际上它应该缩进，是一个迷惑点
		//else//这样一看，25行代码把if和else分开了，单独的if编译不报错，但是单独的else可就不行了
			System.out.println("女");
		
		//报错！第26行发生错误!else缺少if。第26行往上，没有语法错误。
		
		
		
		
		
	}
}