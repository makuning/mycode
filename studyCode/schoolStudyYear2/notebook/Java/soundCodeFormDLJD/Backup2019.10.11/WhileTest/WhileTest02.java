/*
使用while循环输出1-10
*/

public class WhileTest02{
	
	public static void main(String[] args){
		
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		System.out.println("end--->"+i);//i=11
		
		System.out.println("-------------------");
		
		int j=10;
		while(j>0){
			System.out.println(j--);//注意这里的j--，是先进行输出操作，再进行自减1的，注意顺序！
			System.out.println("--->"+j);
		}
		System.out.println("end j--->"+j);
		
		//所以最终结果是怎么样的？
		//输出10，之后j--使得j变为9，
		//第20行输出10 9 8 7 6 5 4 3 2 1
		//最终j的值为0
		
		int k=10;
		while(k>=0){
			System.out.println(--k);
		}
		System.out.println("end k--->"+k);
		
		//第32行输出：9 8 7 6 5 4 3 2 1 0 -1
		//end k=-1
		
		//其实这个知识点在++和--运算符那里讲过了，也就是先自加/减1和赋值的顺序问题。
		
	}
}