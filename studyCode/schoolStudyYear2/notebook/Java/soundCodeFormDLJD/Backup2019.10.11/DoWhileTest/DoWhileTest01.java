/*
do...whileѭ��
	1.do...whileѭ�����﷨�ṹ��
	    do{
			ѭ����
		}while(�������ʽ);   
	2.do...whileѭ����ִ��ԭ��
	    1.ִ��ѭ����
		2.�жϲ������ʽ���
			2.1���Ϊtrue
				�ظ���1������
			2.2���Ϊfalse
				����
	3.do...whileѭ����ִ�д�����
		1~N�Ρ�ѭ��������ִ��1�Ρ�
	4.ʹ��do...whileѭ����ע������:
        do...whileѭ�����ĩβ��һ�����ֺš������ˡ�
*/

public class DoWhileTest01{
	
	public static void main(String[] args){
		
		int i=10;
		
		do{
			System.out.println(i);
		}while(i>100);
		//���10
		
		System.out.println("--------------");
		
		while(i>100){
			System.out.println("i-->"+i);
		}
		//ʲô��û����
		
		System.out.println("--------------");
		
		i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
		//�����1 2 3 4 5 6 7 8 9 10����ʱi=11
		
		
		
		
	}
}