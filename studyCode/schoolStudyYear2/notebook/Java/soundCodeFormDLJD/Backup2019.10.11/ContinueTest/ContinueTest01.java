/*
    continue��䣺
		1.continue��ʾ������/go on/��һ��
		
		2.continue��break���һ����������Ϊһ����������java��䣬�� continue;
		
		3.break��continue����
		*break��ʾ����ѭ����ִ���ˣ�����ѭ������ֹѭ��
		*continue��ʾ��ֹ��ǰ�����Ρ�ѭ����ֱ�ӽ�����һ��ѭ������ִ��

        4.continueҲ��breakһ����Ҳ���������﷨�����˽����ݡ�
		continue ѭ�����ơ�����ָ��continueĳ��ѭ����
		
*/

public class ContinueTest01{
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println("i = "+i);
		}
		//����� 0 1 2 3 4
		
		System.out.println("-------------");
		
		for(int i=0;i<10;i++){
			if(i==5){
				continue;//������ִ�У���ֱ��ִ�и��±��ʽ��������һ��ѭ����ѭ��������
			}            //���������ҿ���������ֱ��i++
			System.out.println("i = "+i);
		}
		//����� 0 1 2 3 4 6 7 8 9 
		
		System.out.println("-------------");
		
		myFor:for(int i=0;i<10;i++){
			if(i==5){
				continue myFor;
			}
			System.out.println("i = "+i);
		}
		
		//��������30-35�д�����һ��
		
		
		
	}
}