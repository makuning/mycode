package com.bjpowernode.javase.test008;

public class ChineseTest {

	public static void main(String[] args) {

		//����һ��Chinese����
		Chinese zhangsan=new Chinese("1","����","�й�");
		System.out.println(zhangsan.id+","+zhangsan.name+","+zhangsan.country);
		
		//����һ��Chinese����
		Chinese lisi=new Chinese("2","����","�й�");
		System.out.println(lisi.id+","+lisi.name+","+lisi.country);
		
		//����һ��Chinese����
		Chinese wangwu=new Chinese("3","����","�й�");
		System.out.println(wangwu.id+","+wangwu.name+","+wangwu.country);
		
	}

}
