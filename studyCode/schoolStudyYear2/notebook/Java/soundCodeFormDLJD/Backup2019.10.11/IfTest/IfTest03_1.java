/*
����
    �����ҳ��У��ֱ������A���С��͡�B���С���
    A���нϽ���B���н�Զ
    ���������ѡ��A���й������B���л������������������������
	���۵���Ʒ����Ǽ�����ȥB��������������⣬��Ȼѡ��A���й���
	
	
	��һ���жϣ������Ƿ���˫���գ���˫����ȥB������˫����ֻ����A����
	�ڶ����жϣ����۵���Ʒ��ʲô������ȥB������ȥA

*/

public class IfTest03_1{
	
	public static void main(String[] args){
		
		//�ȶԾ�������ת����1��0����ʾ
		System.out.println("˵��1����˫������1��ʾ������˫������0��ʾ");
		System.out.println("˵��2��������Ʒ������1��ʾ��������0��ʾ");
		
		//�����û���������
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("��ѡ������Ƿ���˫���գ�");
		int date=s.nextInt();
		//�ж�����
		
		
		if(date==1){
			System.out.print("���������Ĵ�����Ʒ��");
		    int goods=s.nextInt();
			if(goods==1){
				System.out.println("ȥB����");
			}else if(goods==0){
				System.out.println("ȥA����");
			}else{
				System.out.println("���Ϸ�����Ʒ��");
			}
		}else if(date==0){
			System.out.println("ȥA����");
		}else{
			System.out.println("���Ϸ������ڣ�");
		}
	}
}