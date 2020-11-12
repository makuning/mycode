
/*
for循环的几个好玩的例子
以及for循环的变形
*/

public class ForTest03{
	
	public static void main(String[] args){
		
		//输出1-10之间的奇数
		for(int i=1;i<=10;i+=2){
			System.out.println(i);
		}
		//1 3 5 7 9,此时i=11
		
		//输出1-10之间的偶数
		for(int i=2;i<=10;i+=2){
			System.out.println(i);
		}
		//2 4 6 8 10，此时i=12
		
		for(int i=10;i>0;i--){
			System.out.println(i);
		}
		//10 9 8 7 6 5 4 3 2 1,此时i=0
		
		for(int i=100;i>=50;i-=10){
			System.out.println(i);
		}
		//100 90 80 70 60 50，此时i=40
		
		for(int i=0;i<10;){
			System.out.println("i--->"+i);
			i++;//写在这里和写在更新表达式一样的结果
		}
		//0 1 2 3 4 5 6 7 8 9,此时i=10
		
		for(int i=0;i<10;){
			i++;//立更新结果
			System.out.println("计数器--->"+i);//这时已经输出了更新后的结果
		}
		//1 2 3 4 5 6 7 8 9 10,此时i=10
		
		
	}
}