
/*
	����switch��䣺
	
	1.switch���Ҳ����ѡ��ṹ��Ҳ�Ƿ�֧���

	2.switch�����﷨�ṹ��

	һ���Ƚ�������switch���Ӧ��������д��
	
	switch(int��String���͵�����ֵ�����){
		case int��String���͵�����ֵ�����:
		    java���;
			...
			break;
		case int��String���͵�����ֵ�����:
		    java���;
			...	
		    break;
		...
		defalut:
		    java���;
			...
	}
	
	3.switc����ִ��ԭ��
	    switch�����С���ŵ��еġ����ݡ���case����ġ����ݡ�����һһƥ�䣬ƥ��ɹ��ķ�ִ֧��
		���մ��϶��µ�˳�����ν���ƥ�䡣
	
	4.ƥ��ɹ��ķ�ִ֧�У���֧��������С�break;�����Ļ�������switch�����ֹ
	
	5.ƥ��ɹ��ķ�ִ֧�У���֧����û�С�break;�����Ļ���ֱ�ӽ�����һ����ִ֧�У�������ƥ�䣩��
	�������󱻳�Ϊcase��͸���󡣡��ṩbreak;�����Ա��⴩͸��
	
	6.���еķ�֧��û��ƥ��ɹ�������default���Ļ�����ִ��default��֧���еĳ���

    7.switch��case���涼������int����String���͵����ݣ�������̽��������
	
	*��Ȼbyte��short��charҲ����ֱ��д��switch��case���棬��Ϊ���ǿ��Խ����Զ�����ת��
	 byte��short��char�����Զ�ת����int
	
	*JDK6,switch��caseֻ��̽��int����
	
	*JDK7��7֮��İ汾�����������ԣ�switch��case�ؼ��ֺ������̽��String���͵�����
	
	8.case���Ժϲ���
	int i=10;//i=1,2,3,10,���·�֧������ִ��
	
	switch(i){
		case 1:case 2:case 3:case 10:
		System.out.println("Test Code!");
	}
	
	
	
*/

public class SwitchTest01{
	public static void main(String[] args){
		
		//long a=100L;
		//int b=a;�������ܻ��о�����ʧ
		
		//long x=100L;
		//switch(x){}//��������������һ������������ʧ
		
		long x=100L;
		switch((int)x){}//ǿ������ת���������
		
		byte b=10;
		switch(b){}
		
		short s=10;
		switch(s){}
		
		char c='A';
		switch(c){}
		
		char cc=97;
		switch(cc){}
		
		//switch(true){}
		//���뱨�������ݵ�����: boolean�޷�ת��Ϊint
		
		String username="����";
		switch(username){}
		
		//����switchʾ����ʾ
		
		//�����û��������룺
		//1��ʾ����һ��2��ʾ���ڶ�...
		
		java.util.Scanner ss=new java.util.Scanner(System.in);
		System.out.print("���������֣�");
		int num=ss.nextInt();
		
		switch(num){
			case 1:
			   System.out.println("����һ");
			   break;
			case 2:
			   System.out.println("���ڶ�");
			   break;  
            case 3:
			   System.out.println("������");
			   break;
            case 4:
			   System.out.println("������");
			   break;
            case 5:
			   System.out.println("������");
			   break;
			case 6:
			   System.out.println("������");
			   break;
			case 7:
			   System.out.println("������");
			   break;
			default:
			   System.out.println("���Ϸ������֣�");
		}
		
		System.out.println("������������������������������������������������������������");
		
		//��ʾcase��͸
		switch(num){
			case 1:
			   System.out.println("����һ");
			case 2:
			   System.out.println("���ڶ�");  
            case 3:
			   System.out.println("������");
            case 4:
			   System.out.println("������");
			   break;
            case 5:
			   System.out.println("������");
			   break;
			case 6:
			   System.out.println("������");
			   break;
			case 7:
			   System.out.println("������");
			   break;
			default:
			   System.out.println("���Ϸ������֣�");
		}
		
		System.out.println("������������������������������������������������������������");
		
		switch(num){
			case 1:
			   System.out.println("����һ");
			case 2:
			   System.out.println("���ڶ�");  
            case 3:
			   System.out.println("������");
            case 4:
			   System.out.println("������");
            case 5:
			   System.out.println("������");
			case 6:
			   System.out.println("������");
			case 7:
			   System.out.println("������");
			default:
			   System.out.println("���Ϸ������֣�");
		}//һ������
		
		System.out.println("������������������������������������������������������������");
		
		//��ʾcase�ϲ�
		switch(num){
			case 1:case 0:
			   System.out.println("����һ");
			   break;
			case 2:
			   System.out.println("���ڶ�");
			   break;  
            case 3:
			   System.out.println("������");
			   break;
            case 4:
			   System.out.println("������");
			   break;
            case 5:
			   System.out.println("������");
			   break;
			case 6:
			   System.out.println("������");
			   break;
			case 7:
			   System.out.println("������");
			   break;
			default:
			   System.out.println("���Ϸ������֣�");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}