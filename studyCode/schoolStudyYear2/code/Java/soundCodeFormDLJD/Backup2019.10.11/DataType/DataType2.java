
//转义字符“\”反斜杠
//转义字符一定在特殊字符前面才能保证输出正常

public class DataType2{
	public static void main(String[] args){
		char c1='n';
		System.out.println(c1);
		//很显而易见的输出“n”这个字符。
		char c2='\n';
		
		/*
		猜猜看，这个“\n”这个能不能编译通过
		答案是可以通过，为什么呢？
		\和n不是两个字符吗，应该是半角双引号的字符串类型啊
		实际上它就是一个字符。是换行符。
		让我们看看反斜杠加n字符是什么效果
		直接运行不能体现它的效果，往下举个例子。
		*/
		
		/*
		System.out.println("Hello");
		System.out.println("World!");
		输出Hello后自动换行输出World!
		*/
		
		/*
		System.out.print("Hello");
		System.out.println("World!");
		会输出连在一起的“HelloWorld！”
		*/
		
		//System.out.println和System.out.print区别
		//println表示输出之后换行，print表示输出，但是不换行
	    
		System.out.print("A");
		System.out.print(c2);//注意此处用print而不是println
		System.out.println("B");
		
		//再看一个例子
		char x='t';
		System.out.println(x);
		//输出t字符。
		char y='\t';
		
		//看看反斜杠加t是什么东西。
		//是制表符。
		//注意制表符TAB和空格的区别！
		//他们的ASCII码不一样，体现在键盘上两个不同的“按键”！
		System.out.print('A');
		System.out.print(y);
		System.out.println('B');
		//会输出A长长的一串空再加上B。
		
		//要求在控制台上输出一个反斜杠字符“\”
		
		/*
		char i='\';
		System.out.println(i);
		*/
		//反斜杠会将后面的半角单引号转义成一个普普通通的，不带任何特殊含义的半角单引号字符
		//然后反斜杠前面的半角单引号就无法找到另一半和它配对了。
		/*
		DataType2.java:3: 错误: 未结束的字符文字
                char i='\';
                       ^
        1 个错误
		如果编译，会出现上述错误，怎么解决呢？
		*/
		char i='\\';
		System.out.println(i);
		//同理输出半角单引号和半角双引号
		char k='\'';
		System.out.println(k);
		//输出半角单引号，\将'转义成普通的半角单引号字符。
		System.out.println("HelloWorld!");
		//很普通的输出HelloWorld！
		System.out.println("“HelloWorld!”");
		//输出全角引号下的HelloWorld！
		System.out.println("\"HelloWorld!\"");
		//体现出\的转义功能了。
		
		//还提一个关于native2ascii.exe命令的运用
		//控制台输入native2ascii即可。（我的JDK里面没有这个exe）
		char n='中';
		System.out.println(n);
		n='\u4e2d';
		System.out.println(n);
		//都是输出“中”这个字符
		char xx='\u1234';
		System.out.println(xx);
		//会输出问号，但问号不是这个unicode编码，说明这个编码不存在，得注意
		
		char m='\u0000';
		System.out.println(m);
		//可以看出\加u后跟的是文字的unicode编码，采用十六进制。
		//利用成员变量的默认赋值也可以查看。
		//会显示一个空白，什么都没有，注意和空格'\u0020'不同，他俩是不同的!
		//注意得调整DOS窗口的命令，字体过大会导致输出a字符。但它实际上还是什么都没有，不是a字符。
		
		
		
	}
}