/*
	whileѭ����䣺
	1.whileѭ�����﷨�ṹ��
		while(�������ʽ){
			ѭ����
		}
	2.whileѭ����ִ��ԭ��
		1.���жϲ������ʽ���
			1.1.���Ϊtrue
				ִ��ѭ����
				�ظ�1����
			1.2.���Ϊfalse
				ѭ������
	3.whileѭ����ѭ��������
		0~N��
		ע�⣺whileѭ����ִ�д�������Ϊ0

*/

public class WhileTest01{
	
	public static void main(String[] args){
		
		//��ѭ��
		//while(true){
		//	System.out.println("��ѭ��");
		//}
		//System.out.println("Hello World��");
		//while��ѭ���󣬱�������⵽��28�д������Զִ�в��������뱨��
		//�޷����ʵ���䡣������ͨ������ΪJDK�汾�ϸߵ��¡�
		
		//int i=10;
		//int j=3;
		//while(i>j){
		//	System.out.println("i>j");
		//}
		//����ͨ��
		
		int i=10;
		int j=3;
		//while(10>3){
		//	System.out.println("i>j");
		//}
		//System.out.println("Hello World��");
		//���뱨����������⵽10>3����������ԣ�44�д����޷���ִ�е�
		//�޷����ʵ���䡣������ͨ������ΪJDK�汾�ϸߵ��¡�
		
		//ͬ���������ʽΪi>3����whileѭ�����дjava����ǿ��Ա���ͨ���ģ���Ϊ
		//������ֻ����﷨������Ϊ����i����<3,����ͨ����
		
		//������JDK�汾�ϸߵ�ԭ���������뼴ʹ����ѭ����д���Ҳ�ǿ���ͨ��......��
		
		//while(false){
		//	System.out.println("1");
		//}
		//53�д����޷����ʵ���䣬��Ϊ���д��뱻�ж�Ϊ�޷�ִ�С�
		
		while(i<3){
			System.out.println("1");
		}
		//���ɹ�ƭ��������......��
	}
}