
/*
	编写for循环找出1-100之间的素数
	
	素数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。又被称为质数
    
	该题主要掌握的知识点：
		*for循环的使用
		*for循环嵌套
		*标记
		*break
		*统计
*/

public class ForTest09_2{
	
	public static void main(String[] args){
		
		/*
		思路：先自己定一个数字【定义i】，判断它是不是素数
		判断方法很重要。
		
		根据素数的定义，我们需要把1和这个数字之间的所有整数都拿来给它除，全部不能整除，它就是素数
		换句话说，只要这之间的这些数字，有一个数字能被整除，它就是非素数。
		1和这个数字之间的所有整数【定义j】都拿来给它除，这用到for循环，范围很好判定
		
		但是有个小问题，必须全部不能整除，才能是素数，即【i%j!=0都符合才能输出】
		比较麻烦，所以，逆向思维，只要找出非素数，能被整除的【i%j==0】给它排除掉
		
		现在，把j的值一个人一个放进去让i除，有先后顺序，那只要碰到了能整除的情况，那就已经可以
		说明它是非素数了，剩下来j的值我就不需要放进去让它试了。利break语句打断，从而提高效率。
		
		那么，标记的用法？
		标记在前面的例讲了很多，用通俗的话来，就是规定赋个默认值给某个变量，当满足某种条件时，
		我对这个变量进行重新赋值，最后输出这个变量，以此达到简化代码的目的。

		*/
		
		//先试水，举个i=11的例子
		
		/*
		int i=11;
		
		boolean isSuShu=true;//标记，默认i是素数。【在实际开发中非常实用】
		//当然，也可以默认i不是素数，还可以用byte类型变量等赋一个数字，拿这个数字作为是素数
		
		for(int j=2;j<i;j++){
			
			if(i%j==0){
				isSuShu=false;
				//能整除，不是素数，对标记重新赋值。那么这个j已经足够说明i不是素数，剩下来的j不需要试了
				break;
				//利break语句打断，整个循环结束，我已经得出它不是素数的结果
			}
			
		}
		
		System.out.println(isSuShu?i+"是素数":i+"不是素数");
		//三元运算符。如果默认值为false，则要把这两个对调。
		
		//这个例子，它可以实现：给定一个数字，判断它是不是素数。
	    */
		
		//对i的值进行范围上的限制，即给定范围让程序跑起来，以1-100为例
		//相当于对上面的例外面套上一个大的for循环，不断地输入i的值，然后让循环去跑
		
		
		//boolean isSuShu=true;//不能将这行标记写到外面来。
		//将其写到外面，当i=4时，不输出，之后i=5，以及后面数字的时候，标记的值都给搞成false了
		//所以，每次进行内层循环时，都应该重新设定标记，使其初始化
		for(int i=2;i<=100;i++){//外层循环负责取出每一个数字i。另外注意i从2开始。
            //内层for循环负责判断是否是素数
		    boolean isSuShu=true;//这行代码得写到这儿来，得特别注意。
			for(int j=2;j<i;j++){
			    if(i%j==0){
				isSuShu=false;
				break;//打断内部这个循环
			    }
		    }
            //判断是素数，我就输出
			if(isSuShu){//写成isSuShu==true当然也行了
				System.out.println(i);
			}
		}
		
		System.out.println("--------------------");
		
		//对于换行【统计的运用】
		//在前面的例子当中，我已经独立想出来思路
		//首先，必须引入一个计数器count，当满足条件的i值收集起来，到了
		//8 16 32 40这些数字，我就明白要输出换行符了，也就是说i的个数达到8的倍数
		//我就可以换行，即计数器count%8==0成立，输出换行符
		
		/*
		int count=0;//设立计数器，初始化0
		
		for(int i=2;i<=10000;i++){
		    boolean isSuShu=true;
			for(int j=2;j<i;j++){
			    if(i%j==0){
				isSuShu=false;
				break;
			    }
		    }
			if(isSuShu){
				//既然要求换行，那就用print而不用println
				System.out.print(i+"\t");
				//要设立一个计数器，计数器放哪里？放外面，不然每次进行到这步时都归0了没有意义
				count++;//i每找出一个，我就加1
				//对计数器的值进行判断
				if(count%8==0){
					System.out.print("\n");//输出换行符
				}
				
			}
		}
		*/
		
		//或者说，只针对计数器，我还可以换一种思路，不是说每8个数据一换行嘛
		//那我，只要计数器count等于8了，我就换行，然后我在把count归零，让它重新开始计数，
		//到了下一个8之后再一次归零
		
		int count=0;//设立计数器，初始化0
		
		for(int i=2;i<=10000;i++){
		    boolean isSuShu=true;
			for(int j=2;j<i;j++){
			    if(i%j==0){
				isSuShu=false;
				break;
			    }
		    }
			if(isSuShu){
				//既然要求换行，那就用print而不用println
				System.out.print(i+"\t");
				//要设立一个计数器，计数器放哪里？放外面，不然每次进行到这步时都归0了没有意义
				count++;//i每找出一个，我就加1
				//对计数器的值进行判断
				if(count==8){
					System.out.print("\n");
					count=0;//满足count==8时，记得对计数器归0哟！
				}
			}
		}
		
		System.out.println("--------------------");
		
		//自己探究发现，这道题应该也可以使用continue。
		
		
		int count1=0;
		
   for1:for(int i=2;i<=100;i++){
    for2:   for(int j=2;j<i;j++){
				if(i%j==0){
					continue for1;//这样写，表示能够执行到下面的语句，他就一定是质数了
				}	
			}
			System.out.print(i+"\t");
            count1++;
			if(count1%8==0){
				System.out.print("\n");
			}
			
		}
		
		
		//对于2来说，应该是拎出来直接输出的，可是因为上面代码输出了2，默认2是质数，所以可不添加
		
	
	}
}