
/*
�������أ�
	1.���������ֱ���Ϊ��overload

	2.ʲô�����ʹ�÷������أ���
		*�������Ƶ�ʱ�򣬾�����������ͬ
		�����ǣ����ܲ�ͬ/�����Ƶ�ʱ�򣬾�����������ͬ��

	3.ʲô��������֮�󣬹����˷������أ�
		*��ͬһ���൱��
		*��������ͬ
		*�����б�ͬ
			-����������ͬ
			-�����������Ͳ�ͬ
			-����˳��ͬ

    4.�������غ�ʲô�й�ϵ����ʲôû��ϵ��
	
		*�������غͷ��������β��б��й�ϵ
		
		*�������غ����η��б��޹�
		*�������غͷ���ֵ�����޹�

*/

public class OverloadTest03{
	
	public static void main(String[] args){
		
		m1();
		m1(10);
		
		m2(1,2.0);
		m2(2.0,1);
		
		//���뱨����m2�����ò���ȷ
		//OverloadTest03 �еķ��� m2(int,double) �� OverloadTest03 �еķ��� m2(double,int) ��ƥ��
		//m2(1,2);
		
		m3(10);
		m3(3.0);
		
		//m4(1,2);
		//m4(2,1);
		
	}
	
	//�������������ɷ�������
	public static void m1(){}
	public static void m1(int a){}
	
	//�������������ɷ�������
	public static void m2(int a,double b){}
	public static void m2(double a,int b){}
	
	//�������������ɷ�������
	public static void m3(int x){}
	public static void m3(double x){}
	
	//���뱨�������� OverloadTest03�ж����˷��� m4(int,int)
	//�������β�����Ҫ�����������Ͷ����Ǳ���������������Ƿ����ظ�
	/*
	public static void m4(int a,int b){}
	public static void m4(int b,int a){}
	*/
	
	//���뱨�������� OverloadTest03�ж����˷��� m5()
	//���������뷵��ֵ�����޹ء�
	/*
	public static void m5(){}
	public static int m5(){
		return 1;
	}
	*/
	
	//���뱨�������� OverloadTest03�ж����˷��� m6()
	//�������������η��б��޹�
	/*
	public static void m6(){}
	void m6(){}
	*/
}






























