/*
算术运算符
    +     求和   
    -     相减
    *     乘积
	/      商
	%     求余数【取模】

	++    自加1
	--    自减1

    注意：
	 一个表达式当中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升
	 没有必要专门去记忆运算符的优先级


*/
public class OperatorTest01{
	public static void main(String[] args){
		
		int i=10;
		int j=3;
		
		System.out.println(i+j);//13
		System.out.println(i-j);//7
		System.out.println(i*j);//30
		System.out.println(i/j);//3
		System.out.println(i%j);//1
		
		//以下以++为例，--运算符照葫芦画瓢
		//关于++运算符【自加1】
		
		int k=10;
		
		//++运算符可以出现在变量后面，对变量进行自加1操作【单目运算符】
		k++;
		
		System.out.println(k);//11
		
		int y=10;
		
		//++运算符可以出现在变量前面，对变量进行自加1操作【单目运算符】
		++y;
		
		System.out.println(y);//11
		
		//小结：
		//++运算符可以出现在变量前，也可以出现在变量后，无论是变量前还是变量后，
		//只要++运算结束，该变量中的值一定会自加1.
		
		//研究++出现在变量后
		//规则：先做赋值运算，再对变量中保存的值进行自加1
		int a=100;
		int b=a++;
		System.out.println(a);//101
		System.out.println(b);//100
		
		//研究++出现在变量前
		//规则：先进行自加1运算，然后再进行赋值操作
		int m=20;
		int n=++m;
		System.out.println(m);//21
		System.out.println(n);//21
		
		
		//现在就++运算符进行深层的讲解
		//以下内容纯属个人理解，和老师说的可能有出入。
		/*
		int mm=500;
		System.out.println(mm);
		这两代码十分普通，无需作过多解释。
		但是，DOS窗口输出的那些数字，实际上是不是都是字符串？是的。
		所以，在向控制台输出mm的值前，内部作了将int转换成字符串型的类型转换。
		体现在java底层的类库当中。
		有一个int x=...;
		System.out.println(x);
		的代码。这样一来，对++运算符的理解可以转化成上面的赋值。
		
		*/
		
		int e=100;
		System.out.println(e++);//相当于int x=e++;输出x，100
		System.out.println(e);//很显然，先确定下来是这个，输出101
		
		int s=100;
		System.out.println(++s);//相当于int x=++s;输出x，101
		System.out.println(s);//很显然，先确定下来是这个，输出101
		
		//上面两个，就是对53-63行代码的一个变形，要弄明白。
		
		System.out.println("-------------------------------------");
		System.out.println(--s);//s的值已经在87行变成101啦，所以现在是100。
		
		//练下列输出结果
		//在草稿纸上画两竖列
		//s目前为100                    输出             实际的s
		System.out.println(s++);//       100                101
		System.out.println(s--);//       101                100
		System.out.println(s--);//       100                99
		System.out.println(s--);//       99                 98
		System.out.println(s);  //       98                 98
		//好好想想
		
		
		
	
    /*
    class A{
		public void m(int x){
			
		}
		
		main{
			int i=10;
			m(i);
		}
	}
    形式参数
    */	
		
		
		
		
	}
}