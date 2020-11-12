/*
需求：
	系统给定一个考生的成绩，请判断该考生的成绩等级
	1.有效成绩范围[0,100]
	2.考试成绩可能是小数
	3.考试成绩与等级对照关系：
	[90-100] A
	[80-90)  B
	[70-80)  C
	[60-70)  D
	[0-60)   E
    4.以上需求必须采用switch语句完成，不能使用if
*/

/*
想法：类似90、100、99.9、95.5、95.6这些都是A级别，要是简单的用case合并，那一行得把所有情况给穷举出来

转换思路：5个等级对应的大数字是不是9和10、8、7、6、5、4、3、2、1、0
那用成绩除以10，在用int取整，取出前面的整数，这样进行判断不就行了吗
*/

public class SwitchTest05{
	
	public static void main(String[] args){
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入考生成绩：");
		double grade=s.nextDouble();
        
		int score=(int)(grade/10);
		
		switch(score){
			case 9:case 10:
				System.out.println("A");
				break;
			case 8:
			    System.out.println("B");
				break;
			case 7:
			    System.out.println("C");
				break;
			case 6:
			    System.out.println("D");
				break;
			default :
			    System.out.println("E");
		}
		
	//潜在问题：不合法的数据怎么办
    //100-110之间会被直接确认为A等级，110以上和0以下的数字都会被确认为E等级，所以还是得用到if才能完善	
	}
} 