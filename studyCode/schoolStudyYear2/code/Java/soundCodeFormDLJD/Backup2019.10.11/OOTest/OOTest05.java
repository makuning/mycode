
//测试程序
public class OOTest05{
	
	public static void main(String[] args){
		
		Customer c=new Customer();
		System.out.println(c.id);//0
		
		c=null;
		
		//以下程序编译通过，运行出错
		//出现错误：java.lang.NullPointerException
		//空指针异常
		//出现情况：空引用访问“实例”相关的数据
		System.out.println(c.id);
		
	
		
	}
}

//“实例”相关的数据表示：这个数据访问的时候必须要有对象的参与。这就是实例相关的数据