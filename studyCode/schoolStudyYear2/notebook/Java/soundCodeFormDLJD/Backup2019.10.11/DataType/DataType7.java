/*
对于布尔型数据类型
boolean

java语言中只有两个值，true，false，没有其它值
不像C语言当中，0和1可以表示假和真。

boolean数据类型在底层存储的时候只占用1个字节，
因为实际存储的时候，false底层是0，true底层是1。

布尔类型在实际开发中非常重要，经常使用在逻辑运算和条件控制语句当中。

*/

public class DataType7{
	public static void main(String[] args){
		
		//编译错误，不兼容的类型: int无法转换为boolean
		//boolean flag=1;
		
		boolean loginSuccess=true;
		//boolean loginSuccess=false;或使用这行代码输出else内容
		
		//if控制语句（后话）
		if(loginSuccess){
			System.out.println("恭喜你，登陆成功");
		}else{
			System.out.println("对不起，用户名不存在或密码错误！");
		}
		
		
		
	}
}