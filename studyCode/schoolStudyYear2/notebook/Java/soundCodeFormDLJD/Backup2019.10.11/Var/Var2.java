public class Var2{
	static int a=100;
	
	
	public static void main(String[] args){
		int i;
		i=200;
		System.out.println(i);//去掉此行输出300
		i=300;
		System.out.println(i);
		a=90;
		System.out.println(a);
		//遵循就近原则输出局部变量90
	}
	public static void dosome(String[] args){
		int i=1;
		System.out.println(i);
	}
	
	
}
