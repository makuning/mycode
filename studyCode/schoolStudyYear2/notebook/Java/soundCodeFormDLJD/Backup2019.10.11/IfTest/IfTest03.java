/*
	需求：
	判断当前的天气：
		外边下雨时
			带雨伞，
				判断性别
					性别为男，带一把大黑伞
					性别为女，带一把小花伞
		外边晴天时
			判断天气温度：
				当天气温度在30度以上：
					性别为男，戴墨镜
					性别为女，擦防晒霜
					
					
*/

public class IfTest03{
	public static void main(String[] args){
	
/*	
		String weather1="下雨";
		String weather2="晴天";
		String sex1="男";
		String sex2="女";
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入目前的天气情况:");
		String weather=s.next();
		System.out.print("请输入您的性别:");
		String sex=s.next();
		System.out.print("请输入当前温度:");
		int temperture=s.nextInt();
			
		if(weather==weather1){
			if(sex==sex1){
				System.out.println("请带上一把大黑伞");
			}else if(sex==sex2){
				System.out.println("请带上一把小花伞");
			}else{
				System.out.println("您输入的性别不合法，只能在\"男\"和\"女\"中选择");
			}
		}else if(weather==weather2){
			if(temperture>=30){
				if(sex==sex1){
					System.out.println("请戴上墨镜");
				}else if(sex==sex2){
					System.out.println("请擦防晒霜");
				}else{
					System.out.println("您输入的性别不合法，只能在\"男\"和\"女\"中选择");
				}
			}
		}else{
			System.out.println("您输入的天气不合法，只能在\"下雨\"和\"晴天\"中选择");
		}
		
		
		//目前存在错误，字符串类型的变量不能用==关系运算符来变量中的内容
*/

		
/*			
	老师给的提示：
	1.一定要用到嵌套
	2.天气状况、性别、温度都需要用从键盘输入
	3.有可能在控制台不输入温度
	4.
	天气状况：1表示下雨，0表示晴天
	温度直接使用数字即可
	性别：1表示男，0表示女
	
*/
		
/*		
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入目前的天气情况:");
	    int weather=s.nextInt();
		System.out.print("请输入您的性别:");
		int sex=s.nextInt();
		
			
		if(weather==1){
			if(sex==1){
				System.out.println("请带上一把大黑伞");
			}else if(sex==0){
				System.out.println("请带上一把小花伞");
			}else{
				System.out.println("您输入的性别不合法，只能在1和0中选择");
			}
		}else if(weather==0){
			java.util.Scanner a=new java.util.Scanner(System.in);
			System.out.print("请输入当前温度:");
		    int temperture=a.nextInt();
			if(temperture>=30){
				if(sex==1){
					System.out.println("请戴上墨镜");
				}else if(sex==0){
					System.out.println("请擦防晒霜");
				}else{
					System.out.println("您输入的性别不合法，只能在1和0中选择");
				}
			}
		}else{
			System.out.println("您输入的天气不合法，只能在1和0中选择");
		}
*/		
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		System.out.println("欢迎使用本系统，您通过本系统可以完成一些简单的判断");
		System.out.println("说明1：1表示男，0表示女");
		System.out.println("说明2：1表示下雨，0表示晴天");
		System.out.println("说明3：温度用数字表示");
		
		//接收性别
	    System.out.print("请输入性别：");
		int sex=s.nextInt();
		
		//接收天气情况
	    System.out.print("请输入当前天气情况：");
		int weather=s.nextInt();
		
		//判断天气情况
		if(weather==1){
			//下雨天
			if(sex==1){
				System.out.println("带一把大黑伞");
			}else if(sex==0){
				System.out.println("带一把小花伞");
			}else{
				System.out.println("您的性别是怎么回事？");
			}
		}else if(weather==0){
			//晴天
			//接收温度
			System.out.print("请输入当前温度：");
			int tem=s.nextInt();
			if(tem>=30){
				if(sex==1){
				System.out.println("戴墨镜");
			    }else if(sex==0){
				System.out.println("擦防晒霜");
			    }else{
				System.out.println("您的性别是怎么回事？");
			    }
			}	
		}else{
			System.out.println("对不起，您输入的天气状况不存在！");
		}	
		
		//上述代码存在一个小问题，
		//在输入不合法的性别和不合法的天气，只会提示天气不合法
		//对于此bug解决用return来解决(后面)
		
		
		
	}
}