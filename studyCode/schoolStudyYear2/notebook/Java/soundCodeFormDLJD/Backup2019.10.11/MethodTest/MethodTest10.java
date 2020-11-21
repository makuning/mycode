
/*
	在返回值类型为void的情况下使用 return;语句
    return;语句出现在返回值类型为void的方法中是为了结束当前方法

*/

public class MethodTest10{
	
	public static void main(String[] args){
		
		m();
		
		//return 10;不能这样写，这里是main方法，main方法返回值类型是void类型，只能写return;
		//当然写了return;语句后，下面也不能写代码了，因为访问不到。
		
		for(int i=10;i>0;i--){
			
			if(i==2){
				return;
			}
			System.out.println("i的值-->"+i);
			
		}
		
		System.out.println("Hello Word!");
		
		//retrun;直接终止了整个main方法的运行，所以Hello World！并没有输出
		
		//小结一下，main方法它还是方法，不要将他特殊化，return语句肯定能在main方法里使用
		
	}
	
	//编译报错，对返回值类型为void的方法不能使用 return 值; 这样的语句
	/*
	public static void m(){
		return 10;
	}
	*/
	
	public static void m(){
		
		for(int i=0;i<10;i++){
			if(i==5){
				return;//直接终止整个m方法，Hello World执行不到
				//break;//终止当前for循环
			}
			System.out.println("i -->"+i);
		}
		
		System.out.println("Hello World!");

	}
	
}