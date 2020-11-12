
//主要说明for循环中变量作用域

public class ForTest02{
	
	public static void main(String[] args){
		
		//以下的for循环中“i”变量作用域是仅限于for循环内部使用
        for(int i=0;i<10;i++){
			System.out.println("i--->"+i);
		}		
		
		for(int i=0;i<=10;i++){
			System.out.println("i--->>"+i);
		}		
		
		//那么这个i变量可以在main方法的作用域中访问吗？
		//System.out.println("i="+i);
		//编译错误，无法访问
		
		//这个i是main方法作用域中的i变量，只要main方法没有结束，这里的i就能用
		int i=0;
		
		for(;i<10;i++){
			System.out.println("i="+i);
		}	
		//会输出0-9。
		
		System.out.println("i===>"+i);
		//那么，在上述for循环结束后，能不能访问这个i呢？i又是多少？
		//首先，i是main方法中的变量，肯定可以访问。
		//其次，这条代码在for循环后，for循环已经执行过了，执行了i++，它已经把i变成了10，所以循环才会结束
		//所以此时访问i的话，它就是10
		
		int j;
		
		for(j=1;j<10;j++){
			System.out.println("j-->"+j);
		}	
		
		System.out.println("j="+j);
		//和上面的一样道理，此时j的值为10
		
	}
}