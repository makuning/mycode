/*
    continue语句：
		1.continue表示：继续/go on/下一个
		
		2.continue和break语句一样，独立成为一条单独完整java语句，即 continue;
		
		3.break和continue区别
		*break表示整个循环不执行了，跳出循环，终止循环
		*continue表示终止当前“本次”循环，直接进入下一次循环继续执行

        4.continue也和break一样，也有这样的语法：【了解内容】
		continue 循环名称【用来指定continue某个循环】
		
*/

public class ContinueTest01{
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println("i = "+i);
		}
		//会输出 0 1 2 3 4
		
		System.out.println("-------------");
		
		for(int i=0;i<10;i++){
			if(i==5){
				continue;//如果这句执行，则直接执行更新表达式，进行下一次循环，循环体下面
			}            //的这句代码我看都不看，直接i++
			System.out.println("i = "+i);
		}
		//会输出 0 1 2 3 4 6 7 8 9 
		
		System.out.println("-------------");
		
		myFor:for(int i=0;i<10;i++){
			if(i==5){
				continue myFor;
			}
			System.out.println("i = "+i);
		}
		
		//输出结果和30-35行代码结果一致
		
		
		
	}
}