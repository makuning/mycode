
/*
关于java语言中break语句：
	1.break是java语言中的关键字，意思为“中断/折断”
	
	2.break+";"可以成为一个单独的完整的java语句：    break;
	
	3.break语句使用在switch语句中，用来终止switch语句执行
	
	4.break语句同样可以用在循环语句当中，用来终止循环语句
	
	5.break终止那个循环呢？
	
	6.break;语句用在for、while、do...while语句当中用来跳出循环，终止循环的执行
	因为当程序循环到某个条件时候，后续的循环根本没必要继续执行，再执行就是浪费资源，
	所以可以终止循环，以此来程序的效率
	
	7.以下以for循环来break;语句
	
	8.在默认情况下，break语句终止的是离它最近的循环语句。当然也可以指定终止某个循环。
	需要给循环起名，采用这种语法： break 循环名称;

*/

public class BreakTest01{
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			if(i==5){
				break;//终止的是整个循环体，当前for循环
			}         //所以i=5时，底下输出i这句话也不会执行了。
			System.out.println("i-->"+i);
		}
		
		//会输出：0 1 2 3 4
		
		System.out.println("Hello World!");//单独的java语句，和上面的for循环无关
		
		for(int j=0;j<3;j++){
			for(int i=0;i<10;i++){
			    if(i==5){
				    break;//终止的是内层for循环，离它最近
			    }
			    System.out.println("i-->"+i);
			}			//这里的break语句并不会影响到外层for循环
	    }
		//外层循环会循环三次，也就是说
		//会输出3次 0 1 2 3 4
		
		System.out.println("---------------");
		
		//以下语法使用较少。
		//对for循环进行起名
		for1:for(int j=0;j<3;j++){
			for2:for(int i=0;i<10;i++){
			        if(i==5){
				    break for1;//终止的是内层for循环，离它最近
			        }
			        System.out.println("i-->"+i);
			}			//这里的break语句并不会影响到外层for循环
	    }
		
		//分析：j=0,j<3为true,执行for1循环体，
		//对for2开始执行，执行到0 1 2 3 4，i=5的时候，for1循环终止，直接整个儿的for1循环结束了
		//也就是输出 0 1 2 3 4结束了
		
		System.out.println("Hello World!");
		
	}
}
	
	








