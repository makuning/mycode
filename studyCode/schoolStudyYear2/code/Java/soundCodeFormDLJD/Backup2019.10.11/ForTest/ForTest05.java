
/*
	在前一个例子的基础之上，完成对1-100之间所有奇数的求和
	也就是算出1+3+5+...+99的和
	要用到+=
*/

public class ForTest05{
	
	public static void main(String[] args){
		
		//定义一个变量【盒子】，初始值为0
		int sum=0;
		
		for(int i=1;i<=100;i+=2){
			//i是奇数
			//累加求和
			//System.out.println(i);
			
			//sum储存的是最终求和的结果
			//不能每一次都执行到这里，都把求和结果归零
			//定义sum变量不能放到这里，因为这里是循环体
			//int sum=0;
			
			sum+=i;
			
			//输出语句放到这里来表示每进行一次累加，都来输入累加结果
			//System.out.println("sum="+sum);
		}
		
		//以上for循环结束后，最终输出求和结果
		System.out.println("sum="+sum);
		
		//我自己总结一下：
		/*
		首先，1-100之间的奇数我都能找到，现在要对其进行求和，那必然是一个一个加，也就是上一个求和
		后，把下一个奇数加上去，或者说这就是累加操作
		那么，怎么实现把这些i累加起来呢？
		我必须先得把这些i收集起来【地上的苹果】，拿东西装起来【容器】。
		体现在，定义一个sum变量，表示累加值。用代码形式表现出来就是sum+=i【sum=sum+i】。
		这样，sum的值不断变化，因为有新的i参与进来累加嘛。
		然后，这个sum应该放哪里，放循环体？
		循环体每次都会执行对吧，那每次执行到循环体中代码内容，都会进行int sum=0的操作，把每次
		求出来的sum值都给我重新赋值成0了，这当然不行啊。除此之外，我把sum定义在循环体内，这表示
		sum变量作用域仅限于for循环里，在main方法里，我无法访问它。
		所以，sum变量必须放到for循环之外。
		紧接着，我要输出最终的sum值对吧，用System.out.println("sum="+sum);这句话，放哪去呢？
		放到循环体？
		放到循环体里，那就意味着，每次执行循环体，都会输出一个sum，把每次累加值都给输出来，
		我不需要这样输出，我只要输出最后最后的结果就行，不需要每加一次就输出一次，所以
		这句话得放到for循环之外。
		
		*/

        sum=0;
		//对sum归零，因为上面sum经过运算已经变成2500了
		
		for(int i=1;i<=100;i++){
			if(i%2!=0){//是奇数
				sum+=i;//则进行累加操作
			}
		}
        
		System.out.println(sum);



	}
}