
//对SwitchTest01.java进行反向操作。
//通过此例，确实可以看出switch后可以添加String类型数据

public class SwitchTest02{
	public static void main(String[] args){	
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入星期几：");
		String DayOfWeek=s.next();
		switch(DayOfWeek){
			case "星期一":
			System.out.println(1);
			break;
			case "星期二":
			System.out.println(2);
			break;
			case "星期三":
			System.out.println(3);
			break;
			default:
			System.out.println("不合法的数据！");
		}
	}
	
}