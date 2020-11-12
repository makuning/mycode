/*
关于java语言当中的if语句，属于选择结构，if语句又被称为分支语句/条件控制语句

1.if语句的语法结构：四种编写方式

第一种：
	if(布尔表达式){
		java语句;
		java语句;
		...
	}

第二种：
	if(布尔表达式){
		java语句;
		java语句;
		...
	}else{
		java语句;
		java语句;
		...
	}

第三种：
    if(布尔表达式){
		java语句;
		java语句;
		...
	}else if(布尔表达式){
		java语句;
		java语句;
		...
	}else if(布尔表达式){
		java语句;
		java语句;
		...
	}else if(布尔表达式){
		java语句;
		java语句;
		...
	}...

第四种：
    if(布尔表达式){
		java语句;
		java语句;
		...
	}else if(布尔表达式){
		java语句;
		java语句;
		...
	}else if(布尔表达式){
		java语句;
		java语句;
		...
	}else if(布尔表达式){
		java语句;
		java语句;
		...
	}else{
		java语句;
		java语句;
		...
	}




2.重点：if语句只要有一个分支执行了，整个if语句全部结束。

3.注意：以上的第二和第四种编写方式都带有else分支，这两种方式可以绝对保证会有分支执行

4.“所有的控制语句”都是可以嵌套使用的，只要嵌套合理。
	if(){
		if(){
			
		}
	}else{
		if(){
			
		}else{
			if(){
				if(){
					
				}
			}
		}
		
	}
注意：嵌套使用的时候，代码格式要保证完美。【该缩进的时候必须要缩进，大部分情况下使用大括号的语句要缩进】

5.if语句中只有一条java语句，大括号可以省略不写

	if(true/false){
		一条java语句;
	}

	if(true/false) 一条java语句;

这种方式不推荐使用，别人写，你得看懂。



*/

public class IfTest01{
	public static void main(String[] args){
		
		//需求：所在位置的五公里范围内有肯德基的话，去KFC吃午饭
		
		//公里数
		//double distance=6.0;//单位；KM
		double distance=1.0;
		
		
		//判断语句
		if(distance<5){
			System.out.println("去KFC吃开封菜！");
		}
		
		/*
		需求：
		    假设系统给定一个考生的成绩，成绩可能带有小数点,范围为[0-100]
			根据学生的成绩判断该学生的成绩等级：
			[90-100] A
		    [80-90)  B
			[70-80)  C
			[60-70)  D
			[0-60)   E
		利if语句来完成上述的需求，该怎么写？	
		
		*/
		
		/*
		double score=59.5;
		
		if((score>=90)&(score<=100)){
			System.out.println("您的成绩等级为A");
		}else if((score>=80)&(score<90)){
			System.out.println("您的成绩等级为B");
		}else if((score>=70)&(score<80)){
			System.out.println("您的成绩等级为C");
		}else if((score>=60)&(score<70)){
			System.out.println("您的成绩等级为D");
		}else if((score>=0)&(score<60)){
			System.out.println("您的成绩等级为E");
		}
		*/
		//上述135-147行代码我自己写的。
		//考虑一个问题，成绩超出[0-100]会怎样？
		
		//这样写的代码可以完成需求，但是这种方式执行效率较低，每一个if都是不相关的，都是独立的
		//每一个if都要进行判断一次。
		/*
		if(){
			
		}
		
		if(){
			
		}
		
		if(){
			
		}
		*/
		
		//注意！以下为老师讲解。
		//根据需求，选择第四种编写方式完成需求。
		double score=59.5;
		
		/*
		if(score<0||score>100){
			System.out.println("对不起，您提供的考生成绩不合法");
		}else if(score>=90&&score<=100){//没必要判断是否小于等于100，能执行到这步，一定<=100
			
		}
		*/
		
		
		score=60.0;
		score=110;
		score=-100;
		score=100;
		score=0;
		
		if(score<0||score>100){
			System.out.println("对不起，您提供的考生成绩不合法");
		}else if(score>=90){//能判断到这里说明成绩一定在[0,100]区间内
			System.out.println("该考生的成绩等级是：A等级");
		}else if(score>=80){//能判断到这里说明成绩一定<90
			System.out.println("该考生的成绩等级是：B等级");
		}else if(score>=70){//能判断到这里说明成绩一定<80
			System.out.println("该考生的成绩等级是：C等级");
		}else if(score>=60){//能判断到这里说明成绩一定<70
			System.out.println("该考生的成绩等级是：D等级");
		}else{
			System.out.println("该考生的成绩等级是：E等级");
		}
		
		//再次进行优化！
		String grade="该考生的成绩等级是：E等级";
		
		score=-100;
		
		if(score<0||score>100){
			grade="对不起，您提供的考生成绩不合法";
		}else if(score>=90){
			grade="该考生的成绩等级是：A等级";
		}else if(score>=80){
			grade="该考生的成绩等级是：B等级";
		}else if(score>=70){
			grade="该考生的成绩等级是：C等级";
		}else if(score>=60){
			grade="该考生的成绩等级是：D等级";
		}
		System.out.println(grade);
		
		
		
		//再再再进行我的优化！
		
		String a="该考生的成绩等级是";
		String b="等级";
		String c="E";//要试试char类型吗？？？
		String grade1=a+c+b;//grade1默认值为"该考生的成绩等级是E等级"
		score=55;
		
		//if(score<0||score>100){
		//	grade1="对不起，您提供的考生成绩不合法";	
		//}else if(score>=90){
		//	c="A";
		//}else if(score>=80){
		//	c="B";
		//}else if(score>=70){
		//	c="C";
		//}else if(score>=60){
		//	c="D";
		//}
	    //grade1=a+c+b;
		//System.out.println(grade1);
		
		//第240行代码非常重要。
		//合法数据前提下，在满足一个分支后，都会对c变量进行重新赋值，但是在前面代码中grade1变量已经运算结束，
		//已经默认E等级，单纯地对c变量重新赋值，不会影响grade1=a+b+c的结果，只有再次对grade1变量重新赋值，
		//赋值为a+b+c，此时c变量已经被重新赋值了，所以grade1变量也会因此重新赋值。从而达到动态的结果。
		
		//但是有个问题，对输入非法数据，if语句判断，在执行完230行代码后就会结束，此时grade1变量第一次被重新赋值，
		//紧接着，第240行代码又一次对grade1变量进行重新赋值，赋值为a+b+c，即一开始的默认值E等级，然后会执行输出grade1
		//变量结果，即E等级。
		
		//解决思路：在已经判断是非法数据，执行230行代码后，立输出grade1变量的结果，然后使得240和241行代码不执行
		//但是又不能删除这两代码
		
		//方法：将第240和第241行代码合并复制到合法数据的每一个分支后，在非法数据那一个分支添加输出grade1就行了。
		//但是这好像进行了负优化。
		
		//用嵌套的方法和子函数return方法（还没学）进行最终的修改
		
	    if(score<0||score>100){
			grade1="对不起，您提供的考生成绩不合法";	
			System.out.println(grade1);
		}else{
			if(score>=90){
				c="A";
			}else if(score>=80){
				c="B";
			}else if(score>=70){
				c="C";
			}else if(score>=60){
				c="D";
			}
			grade1=a+c+b;
		    System.out.println(grade1);
		}
		
		//第3点，上述代码存在else，所以一定会执行某个分支，不用担心60分下的数据，一定会重新赋值再输出的
		//把System.out.println(grade1);这行代码给放进else分支内！
		
		//感谢豆面的讲解。
		//还是得深入学习
		
		
	}
}





























































