
/*
	��������ֵ���Ͳ���void��ʱ��

		1.��������ٷְٱ�ִ֤�С�return ֵ;�������ֵ�ķ��ء�û�м�����

		2.һ�������з���ֵʱ�����ǵ����������������������һ��ֵ��
		���ڵ�������˵������ѡ����գ�Ҳ����ѡ�񲻽���
		���Ǵ󲿷������ʱҪ���յ�
		
*/

public class MethodTest08{
	
	public static void main(String[] args){
		
		//���÷���
		divide(10,3);
		//��ʲô��û��������Ϊ���ﲢû��ѡ����շ���ֵ�����Ƿ��������ˡ�
		
		//���շ���ֵ
		//���ñ�������
		//�����������ͱ���ͷ���ֵ���ͱ���һ�£����߿����Զ�����ת��
		//boolean b=divide(10,3);//���뱨�����Ͳ�����
		
		//��ֵ������ұ���ִ�У���ִ�н����ֵ����ߵı���
		int i=divide(10,3);
		System.out.println(i);
		
		long x=divide(10,3);
		System.out.println(x);
		
		System.out.println(divide(10,3));//Ҳ����ֱ�ӽ�����ֵ��ӡ�������
		
	}
	
	//���뱨��ȱ�ٷ������
	/*
	public static int divide(int a,int b){
		
	}
	*/
	
	//���뱨��ȱ�ٷ���ֵ
	/*
	public static int divide(int a,int b){
		return;
	}
	*/
	
	//���뱨�����������ʱ��Ҫ�󷵻�int���ͣ���ʱ���ز������ͣ����Ͳ�����
	/*
	public static int divide(int a,int b){
		return true;
	}
	*/
	
	//���ԣ�����û����������
	/*
	public static int divide(int a,int b){
		return 1;
	}
	*/
	
	/*
	public static int divide(int a,int b){
		int c=a/b;
		return c;
	}
	*/
	
	public static int divide(int a,int b){
		return a/b;
	}
	
}