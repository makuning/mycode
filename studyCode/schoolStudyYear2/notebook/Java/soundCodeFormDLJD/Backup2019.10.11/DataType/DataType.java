public class DataType{
	static int i;
	//虽然只声明并未赋值，但系统会赋值默认值，变量先声明后赋值原则依然正确。
	public static void main(String[] args){
		System.out.println(i);
		//此时会输出成员变量默认值0
		
		
	}
}