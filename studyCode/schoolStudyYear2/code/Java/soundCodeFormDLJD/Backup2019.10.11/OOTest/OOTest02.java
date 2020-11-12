
//测试类
public class OOTest02{
	
	public static void main(String[] args){
		
		//创建一个User对象
		//u是一个局部变量
		//u是一个引用
		//u是保存内存地址指向堆内存的User对象
		User u=new User();
		
		//输出User变量内部实例变量的值
		System.out.println(u.no);//0
		System.out.println(u.name);//null
		System.out.println(u.addr);//null
		
		//对User对象内的实例变量值进行修改
		u.no=110;
		u.name="jack";//注意："jack"实际上是一个java对象，是String对象
		
		u.addr=new Address();
		//在此注意：addr它是一个Address类型的变量。不是什么字符串之类的。
		//只能用创建对象的方式来进而访问它。
		//String比较特殊，直接加字符串就行，但是本质上还是在堆内存中创建了一个String对象
		
		//单独对u的addr进行输出。
		//addr这个实例变量会创建一个Address对象，详见图。
		//在main方法中，我只能看见一个引用“u”。
		System.out.println(u.name+"居住的城市是："+u.addr.city);
		System.out.println(u.name+"居住的街道是："+u.addr.street);
		System.out.println(u.name+"邮编："+u.addr.zipcode);
		
		//改变具体的addr内容。
		//只要把整个儿的复制过来修改就行
		u.addr.city="北京";
		u.addr.street="朝阳";
		u.addr.zipcode="111111";
		
		System.out.println("---------------------------------------");
		
		System.out.println(u.name+"居住的城市是："+u.addr.city);
		System.out.println(u.name+"居住的街道是："+u.addr.street);
		System.out.println(u.name+"邮编："+u.addr.zipcode);
		
	}
	
	
}

//引用，它既可以是局部变量，也可以是成员变量。
//引用数据类型后的变量，都能看成引用。
//引用数据类型后都是指向一个对象的内存地址。
//不能直接操作堆内存，只能通过引用，一步一步的进行访问。
//所以，u.addr这个它也是一个引用。u.addr.city



