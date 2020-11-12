
public class OOTest04{
	
	public static void main(String[] args){
		
		//创建一个丈夫对象
		Husband huangxiaoming=new Husband();
		huangxiaoming.name="黄晓明";
		
		//创建一个妻子对象
		Wife baby=new Wife();
		baby.name="baby";
		
		//结婚【能通过丈夫找到妻子，同时通过妻子也能找到丈夫】
		huangxiaoming.w=baby;
		baby.h=huangxiaoming;
		
		//得到以上“黄晓明”的妻子的名字
		
		System.out.println(huangxiaoming.name+"的妻子名字叫："+baby.name);
		//直接把baby的name给访问出来，体现不出来他俩是夫妻关系
		System.out.println(huangxiaoming.name+"的妻子名字叫："+huangxiaoming.w.name);
		
		
		//与内存图结合，一步步来，
		//总之，引用数据存储的都是内存地址，在赋值的时候，都是赋内存地址的。
		//内存地址指向这个对象，实际上，可以直接在堆内存里进行指向。
		
	}
}