
/*

ע�⣺��editplus�У�����Ϊ��ɫ�ı�ʾһ��������֣������������JavaSE������Դ���
�����Զ����MethodTest01�����Ǻ�ɫ��ʾ��
JavaSE������Դ����࣬���磺String.class��System.class,��Щ�������Ҳ�Ǳ�ʶ��
ֻҪ����������һ���Ǳ�ʶ��



//�ص㣺�������õ�ʱ���ڲ������ݵ�ʱ��ʵ���ϴ��ݵ��Ǳ���������Ǹ���ֵ������ȥ��


*/

public class MethodTest01{
	
	public static void main(String[] args){
		
		int a=10;
		int b=20;
		int retValue=sumInt(a,b);
		System.out.println("retValue = "+retValue);
		
		
	}
	
	public static int sumInt(int i,int j){
		int result=i+j;
		int num=3;
		int retValue=divide(result,num);
		return retValue;
	}
	
	public static int divide(int x,int y){
		int z=x/y;
		return z;
	}
	
	
}

//��ͼ���ݣ�
//1.ֻҪ�漰���������ݵ����⣬���ݵ��Ǳ��������ֵ
//2.��ͼ��ʱ�򣬱�����ѭ���������϶��µ�˳������ִ�С����ԭ��


