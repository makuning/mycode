
//��������ʱҪ��ʵ�κ��βθ�����Ӧ��ͬ���������Ͷ�Ӧ��ͬ
//���Ͳ�ͬʱҪ�������Ӧ���Զ�����ת��

public class MethodTest05{
	
	public static void main(String[] args){
		
		//���뱨������������ͬ
		//MethodTest05.sum();		
		
		//���뱨��ʵ�κ��β����Ͳ���ͬ
		//MethodTest05.sum(true,false);
		
		//����
		MethodTest05.sum(10L,20L);
		
		//�����Զ�����ת����intת��long
		MethodTest05.sum(10,20);
		
		//���뱨���������Ͳ��Ƕ�Ӧ��ͬ
		//MethodTest05.sum(3.0,20);
		
		//����
		MethodTest05.sum((long)3.0,20);
	}
	
	public static void sum(long a,long b){
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
}