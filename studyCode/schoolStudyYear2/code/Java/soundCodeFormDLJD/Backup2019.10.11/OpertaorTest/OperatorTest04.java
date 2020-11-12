/*
赋值类运算符

基本的赋值运算符
=

扩展的赋值运算符
+=
-=
*=
/=
&=

1.赋值类运算符优先级：先执行等号右边的表达式，将执行结果赋值给左边的变量。
2.注意以下代码：
      byte i=10;
	  i+=5;//等同于i=(byte)(i+5);
	  
	  int k=10;
	  k+=5;//等同于k=(int)(k+5);
	  
	  long x=10L;
	  int y=20;
	  y+=x;//等同于y=(int)(y+x);
3.得出重要结论：
    扩展类的赋值运算符，不改变运算结果类型。假设最初是byte类型，无论怎么追加，追减，
	最后结果它都是byte类型。涉及到了底层强制类型转换，所以可能会损失精度。
*/

public class OperatorTest04{
	public static void main(String[] args){
		
		//基本的赋值运算符
		int i=10;
		System.out.println(i);//10
		i=i+5;
		System.out.println(i);//15
		
		//扩展的赋值运算符【+=运算符可以翻译成“追加/累加”】
		i+=5;//等同于：i=i+5;
		System.out.println(i);//20
		
		i-=5;//等同于：i=i-5;
		System.out.println(i);//15
		
		i*=2;//等同于i=i*2;
		System.out.println(i);//30
		
		i/=4;//等同于i=i/4;
		System.out.println(i);//7
		
		i%=2;//等同于i=i%2;
		System.out.println(i);//1
		
		//你以为这就结束了吗？
		System.out.println("----------------------");
		
		//重头戏来了！
		
		byte b=10;//很正常的代码，10没超范围。
		b=15;//15没超范围，正常
	    //b=b+5;//编译报错！b+5是int类型，赋值给byte类型的b会报错！
		//如同前面的代码中提到，编译器检查语法，发现=号后的表达式是int类型，
		//未加强制转换符，所以以上代码报错。
		
		//解决问题
		b=(byte)(b+5);//强制转换。
		System.out.println(b);//20
		
		byte x=10;
		x+=5;//等同于x=x+5,编译应该也和上面一样会报错，但是实际通过。
		System.out.println(x);//15
		//这几行代码说明x+=5;并不是真正的等同于x=x+5;而是等同于x=(byte)(x+5);
		
		byte z=0;
		z+=128;//等同于z=(byte)(z+128);
		System.out.println(z);//-128【损失精度】
		
		z+=10000;
		System.out.println(z);//-112
		
		
		
		
		
	}
}