
/*
�����ݹ飺
	
	1.ʲô�ǵݹ�
	
	���������������
	a(){
		a();
	}

	2.�ݹ�ʽ�ܺķ�ջ�ڴ�ģ��ݹ��㷨�ܲ��õ�ʱ��������
	
	3.���³��������е�ʱ������һ�����󡾲����쳣���Ǵ���Error��
		java.lang.StackOverflowError
		ջ�ڴ��������
		�������޷���أ�ֻ��һ�����������JVMֹͣ����
		
	4.�ݹ�����н���������û�н���������һ���ᷢ��ջ�ڴ��������
	
	5.�ݹ鼴ʹ���˽�����������ʹ����������ȷ��Ҳ���ܻᷢ��ջ�ڴ��������
	���ֵݹ�̫���ˡ�
	
	ע�⣺�ݹ��ܲ��þ������ã�
		  ������Щ����±��������ݹ鷽ʽ��[Ŀ¼����]
	
*/

public class RecursionTest01{
	
	//������
	public static void main(String[] args){
		
		System.out.println("main begin");
		
		//����doSome����
		doSome();
		
		System.out.println("main over");
		
	}
	
	//���´���Ƭ����Ȼֻ��һ��
	//���ǿ��Ա��ظ����ã�����ֻҪ����doSome������һ������ջ�ڴ����·���һ���������ڴ�ռ�
	public static void doSome(){
		
		System.out.println("doSome begin");
		
		doSome();//���д���δִ�н�������һ�д�����Զ���ܱ�ִ��
			
		System.out.println("doSome over");
	}
	
	
}