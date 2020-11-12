/*
需求：
    有两家超市，分别叫做“A超市”和“B超市”。
    A超市较近，B超市较远
    正常情况下选择A超市购物，但是B超市会在星期六和星期天做活动打折
	打折的商品如果是鸡蛋，去B超市买，如果是猪肉，仍然选择A超市购买。
	
	
	第一个判断，日期是否是双休日，是双休日去B，不是双休日只考虑A超市
	第二个判断，打折的商品是什么，鸡蛋去B，猪肉去A

*/

public class IfTest03_1{
	
	public static void main(String[] args){
		
		//先对具体条件转化成1和0来表示
		System.out.println("说明1：是双休日用1表示，不是双休日用0表示");
		System.out.println("说明2：打折商品鸡蛋用1表示，猪肉用0表示");
		
		//接受用户键盘输入
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请选择今天是否是双休日：");
		int date=s.nextInt();
		//判定日期
		
		
		if(date==1){
			System.out.print("请输入今天的打折商品：");
		    int goods=s.nextInt();
			if(goods==1){
				System.out.println("去B超市");
			}else if(goods==0){
				System.out.println("去A超市");
			}else{
				System.out.println("不合法的商品！");
			}
		}else if(date==0){
			System.out.println("去A超市");
		}else{
			System.out.println("不合法的日期！");
		}
	}
}