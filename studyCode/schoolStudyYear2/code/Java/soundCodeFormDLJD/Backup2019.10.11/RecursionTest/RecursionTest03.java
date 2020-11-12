
/*
使用递归计算1~N的和

举例：1-4之和
	1+2+3+4
	4+3+2+1（推荐使用这种）

*/

public class RecursionTest03{
	
	static int sum=0;
	static int result;
	
	public static void main(String[] args){
		
		int n=4;
		
		System.out.println(sum(n));
		
		
		int x=55;
		System.out.println(sum1(x));
		
	}
	
	public static int sum(int n){
		
		result=n+(n-1);
		
		sum+=result;
		
		if((n-1)==0){
			return sum;
		}
		
		sum((n-1));
		
		return (sum+n)/2;
		
	}
	
	
	//以下为老师代码
	public static int sum1(int n){
		if(n==1){
			return 1;
		}
		
		return n+sum1(n-1);
	}
	
	/*
		首先，使用递归，一定要有结束条件，可以用if条件控制语句，里面肯定有return 值这样的语句
		其次，if条件不满足时，也得有return 值这样的语句。这样让语法没有错误。
	
		if 之外的return 值，这个值填什么，第一次，是从n开始加，然后要把n-1给放进去，放哪儿去，
		放到sum1方法里去，这样一来，就是4+sum1(3),再对sum1(3)分配空间，成了3+sum1(2) 、2+sum1(1)
		此时，n=1了，返回一个1，即sum1(1)=1。这样sum1(2)=2+1 、sum1(3)=3+sum1(2)=3+2+1,返回的
		最终结果为4+3+2+1.一个返回值作为上一个调用方法里的sum1(n-1),这样一来，代码完成。
	
		还是要多看多想
	
	
	*/
	
}