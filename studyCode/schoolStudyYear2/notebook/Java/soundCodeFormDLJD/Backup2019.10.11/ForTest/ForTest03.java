
/*
forѭ���ļ������������
�Լ�forѭ���ı���
*/

public class ForTest03{
	
	public static void main(String[] args){
		
		//���1-10֮�������
		for(int i=1;i<=10;i+=2){
			System.out.println(i);
		}
		//1 3 5 7 9,��ʱi=11
		
		//���1-10֮���ż��
		for(int i=2;i<=10;i+=2){
			System.out.println(i);
		}
		//2 4 6 8 10����ʱi=12
		
		for(int i=10;i>0;i--){
			System.out.println(i);
		}
		//10 9 8 7 6 5 4 3 2 1,��ʱi=0
		
		for(int i=100;i>=50;i-=10){
			System.out.println(i);
		}
		//100 90 80 70 60 50����ʱi=40
		
		for(int i=0;i<10;){
			System.out.println("i--->"+i);
			i++;//д�������д�ڸ��±��ʽһ���Ľ��
		}
		//0 1 2 3 4 5 6 7 8 9,��ʱi=10
		
		for(int i=0;i<10;){
			i++;//�����½��
			System.out.println("������--->"+i);//��ʱ�Ѿ�����˸��º�Ľ��
		}
		//1 2 3 4 5 6 7 8 9 10,��ʱi=10
		
		
	}
}