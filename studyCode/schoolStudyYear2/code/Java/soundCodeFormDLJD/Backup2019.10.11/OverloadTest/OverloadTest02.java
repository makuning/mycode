
/*

	�����������������ʹ���˷������ػ��Ƶ��ŵ�

		*����Ա�ڵ��÷�����ʱ��ȽϷ��㣬��Ȼ���õ��ǲ�ͬ���������Ǹо������ڵ���һ������һ��
		����Ҫ�������ķ�����

		*��������


	ǰ�᣺�������Ƶ�ʱ�򣬷�����������ͬ
	���ǣ����ܲ�ͬ��ʱ�򣬾����������������ֲ�ͬ


*/

public class OverloadTest02{
	
	public static void main(String[] args){
		
		//���÷���
		
		System.out.println(sum(1,2));
		
		System.out.println(sum(1.0,2.0));
		
		System.out.println(sum(1L,2L));
		
		//���÷�����ʱ��о�������ʹ��һ������һ��
		//���ݵ�ʵ�ʲ������Ͳ�ͬ�����õķ�����ͬ
		//��ʱ���ַ������������������ˣ����ǿ������ĵ���������
		
	}
	
	//�Զ��巽��
	
	public static int sum(int a,int b){
		System.out.println("int,int");
		return a+b;
	}
	
	public static double sum(double a,double b){
		System.out.println("double,double");
		return a+b;
	}
	
	public static long sum(long a,long b){
		System.out.println("long,long");
		return a+b;
	}
}