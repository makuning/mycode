
//画图分析
//程序每走一步，画一步即可，注意变量是先右后左

public class MethodTest02{
	
	public static void main(String[] args){
		
		int i=10;
		method(i);
		System.out.println("main -->"+i);
		
	}
	
	public static void method(int i){
		i++;
		System.out.println("method -->"+i);
	}

}