package com.bjpowernode.javase.test009;

public class ChineseTest {

	public static void main(String[] args) {

		//����һ��Chinese����
		Chinese zhangsan=new Chinese("1","����");
		System.out.println(zhangsan.id+","+zhangsan.name+","+Chinese.country);
		
		//����һ��Chinese����
		Chinese lisi=new Chinese("2","����");
		System.out.println(lisi.id+","+lisi.name+","+Chinese.country);
		
		//����һ��Chinese����
		Chinese wangwu=new Chinese("3","����");
		System.out.println(wangwu.id+","+wangwu.name+","+Chinese.country);
		
		System.out.println(Chinese.country);
		
		//���������Ĺ���
		System.out.println(zhangsan.country);//���棬���ǿ��Է��ʡ�
		
		zhangsan=null;
		System.out.println(zhangsan.country);//����ͨ������δ���ֿ�ָ���쳣��˵�����ʱ���ʱ��û�ж���Ĳ��롣
		//��ʹд�ˡ�����.����ʵ���Ϸ��ʵĻ��ǡ�Chinese.country��
		
		//����static�Ķ�����������.Ҳ��������.[���߲��Ƽ�]
		
		//System.out.println(country);//ע��Ŷ�����뱨��country����һ�����еľ�̬����
	}

}
