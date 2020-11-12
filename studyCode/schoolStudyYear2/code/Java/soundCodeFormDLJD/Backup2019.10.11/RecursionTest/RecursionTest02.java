
/*
不使用递归，计算1~N的和
*/

public class RecursionTest02{
	
	public static void main(String[] args){
		
		/*
		int n=4;
		
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("sum ="+sum);
		*/
		
		int retValue=sum(10);
		System.out.println(retValue);
		
		
	}
	
	public static int sum(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	
	
	
	
}