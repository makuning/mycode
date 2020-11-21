/*
	需求：假定系统给定一个人的年龄(这个年龄需要从键盘输入)，
	根据年龄来判断这个人处于生命的哪个阶段，年龄范围[0-150]

	[0-5]      幼儿
	[6-10]     少儿
	[11-18]    青少年
	[19-35]    青年
	[36-55]    中年
	[56-150]   老年



*/

public class IfTest02{
	public static void main(String[] args){
		/*
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		int num=s.nextInt();
		
		int age=num;
		String year="当前年龄为老年阶段";
		
		if(age<0||age>150){
			year="对不起，您输入的年龄不合法";
		}else if(age<=5){
			year="当前年龄为幼儿阶段";
		}else if(age<=10){
			year="当前年龄为少儿阶段";
		}else if(age<=18){
			year="当前年龄为青少年阶段";
		}else if(age<=35){
			year="当前年龄为青年阶段";
		}else if(age<=55){
			year="当前年龄为中年阶段";
		}
		
		System.out.println(year);
		*/
		
		//老师讲述
		
		//1.接收用户键盘输入年龄【输入的时候，必须输入数字】
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入您的年龄:");//输出提示信息，不然用户不知道要干什么！
		//使用print而不用println是把光标闪动放到这后面来，而不是在下一行闪
		int age=s.nextInt();//停下来，等待用户输入，输入后自动接收，赋值给age变量
		
		//2.进行业务逻辑判断
		String str="老年";
		
		if(age<0||age>150){
			str="您提供的的年龄不合法，年龄值需要再0到150之间";
			System.out.println(str);
		}else{
			if(age<=5){
			   str="幼儿";
		   }else if(age<=10){
			   str="少儿";
		   }else if(age<=18){
			   str="青少年";
		   }else if(age<=35){
			   str="青年";
		   }else if(age<=55){
			   str="中年";
		   }
		   System.out.println("您处于生命周期的"+str+"阶段");
		}
			
	
		
	}
	
}