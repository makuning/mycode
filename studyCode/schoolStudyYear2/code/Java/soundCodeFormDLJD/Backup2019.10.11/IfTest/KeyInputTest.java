/*
	System.out.println();���������̨����������ڴ浽����̨������Ĺ��̣����Ǵ��ڴ��г����ˡ�

	�����û��������룬�ӡ����̡������ڴ桱��������Ĺ��̣����ڴ���ȥ��

	��ס���´���

*/

public class KeyInputTest{
	public static void main(String[] args){
		
		//��һ������������ɨ��������
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		//�ڶ���������Scanner�����next()������ʼ�����û���������
		//����ִ�е������ͣ�������ȴ��û�����
		//���û������ʱ�򣬲��������ûس�����ʱ�򣬼������Ϣ���Զ���ֵ��userInputContent
		//����ִ�е������ʱ���û��������Ϣ�Ѿ����ڴ���ȥ�ˡ�
		//String userInputContent=s.next();//��ʶ�������淶������֪��
		
		//�������֡���������int����ʽ�����ա�
		int num=s.nextInt();
		
		
		//���ڴ��е��������������̨
		//System.out.println("�������ˣ�"+userInputContent);
		
		System.out.println("������������ǣ�"+num);
		System.out.println("������Ϊ"+(num+100));
		
	
	}
}

/*
��ס���룬����ճ�����ƣ�
    1.
	java.util.Scanner s=new java.util.Scanner(System.in);
    
	2.
	String str=s.next();
	����
	int num=s.nextInt();

*/




