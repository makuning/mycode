
/*
���´��벻ʹ�á��������ػ��ơ���������overload������������ڵ�ȱ�㣿

1.sumInt��sumLong��sumDouble������Ȼ���ܲ�ͬ�����ǹ������ƣ�������͡�
�����³����У��������Ƶķ����ֱ�����������ͬ�����֣���Գ���Ա��˵��
���÷�����ʱ�򲻷��㣬����Ա��Ҫ�������ķ�����������ɵ��á��������㡿

2.���벻����


��û��������һ�ֻ��ƣ�
������Ȼ��ͬ�����ǡ��������ơ���ʱ����û������һ�ֻ��ƣ������ó���Աʹ����Щ
������ʱ�������ʹ��һ������һ������������Ա��д���������ǳ����㣬
Ҳ����Ҫ�������ķ�����������Ҳ������ۡ�

���ֻ��ƽ������������ػ���

ֵ��ע����ǣ�




*/

public class OverloadTest01{
	
	public static void main(String[] args){
		
		//���÷���
		int result1=sumInt(1,2);
		System.out.println(result1);
		
		double result2=sumDouble(1.0,2.0);
		System.out.println(result2);
		
		long result3=sumLong(1L,2L);
		System.out.println(result3);
		
	}
	
	//�Զ��巽��
	
	//��������int�������ݺ�
	public static int sumInt(int a,int b){
		return a+b;
	}
	
	//��������double�������ݺ�
	public static double sumDouble(double a,double b){
		return a+b;
	}
	
	//��������long�������ݺ�
	public static long sumLong(long a,long b){
		return a+b;
	}
	
	//����ϣ���ﵽ������Աʹ�������������Ƶķ�����������һ������һ��
	//Java֧�����ֻ��ơ���Щ���Բ�֧�֣������Ժ�ѧϰ��javascript��
}















