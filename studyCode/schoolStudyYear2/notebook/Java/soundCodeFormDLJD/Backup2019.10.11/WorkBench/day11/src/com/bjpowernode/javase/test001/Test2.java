package com.bjpowernode.javase.test001;

public class Test2 {

	public static void main(String[] args) {

		Animal a1=new Cat();
		Animal a2=new Bird();
		
		
		if(a1 instanceof Cat) {
			Cat c1=(Cat)a1;
		}
		
		
		if(a2 instanceof Bird) {
			Bird b2=(Bird)a2;
		}
		
		
		/**
		 * ���ڵ���ģʽ��DeBugģʽ��
		 * 
		 * 1.�ڴ�����ǰ��˫�������ϵ�
		 * 
		 * 2.DeBug as a ...�������ģʽ
		 * 
		 * 3.  F5---���뷽���ڲ�---Step Into
		 * 		F6---��һ��---Step Over
		 * 		F7---������---Step Return
		 * 		F8---���뵽��һ���ϵ�---Resume
		 *      CTRL+F2---�ر�JVM��ǿ����ֹ����---Terminate
		 *      
		 * 4.���javaģʽ�˳�DeBugģʽ 
		 *      
		 * 5.DeBugģʽ�ڿ���ʱ�ǳ����ã��ú������⼸����ݼ�     
		 *      
		 *      
		 */
		
		
	}

}
