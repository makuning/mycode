
/*

注意：在editplus中，字体为红色的表示一个类的名字，并且这个类是JavaSE类库中自带的
我们自定义的MethodTest01类名是黑色显示的
JavaSE类库中自带的类，例如：String.class、System.class,这些类的名字也是标识符
只要是类名，就一定是标识符



//重点：方法调用的时候，在参数传递的时候，实际上传递的是变量保存的那个“值”传过去了


*/

public class MethodTest01{
	
	public static void main(String[] args){
		
		int a=10;
		int b=20;
		int retValue=sumInt(a,b);
		System.out.println("retValue = "+retValue);
		
		
	}
	
	public static int sumInt(int i,int j){
		int result=i+j;
		int num=3;
		int retValue=divide(result,num);
		return retValue;
	}
	
	public static int divide(int x,int y){
		int z=x/y;
		return z;
	}
	
	
}

//画图依据：
//1.只要涉及到参数传递的问题，传递的是变量保存的值
//2.画图的时候，必须遵循“方法自上而下的顺序依次执行”这个原则


