/*
ʹ��whileѭ�����1-10
*/

public class WhileTest02{
	
	public static void main(String[] args){
		
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		System.out.println("end--->"+i);//i=11
		
		System.out.println("-------------------");
		
		int j=10;
		while(j>0){
			System.out.println(j--);//ע�������j--�����Ƚ�������������ٽ����Լ�1�ģ�ע��˳��
			System.out.println("--->"+j);
		}
		System.out.println("end j--->"+j);
		
		//�������ս������ô���ģ�
		//���10��֮��j--ʹ��j��Ϊ9��
		//��20�����10 9 8 7 6 5 4 3 2 1
		//����j��ֵΪ0
		
		int k=10;
		while(k>=0){
			System.out.println(--k);
		}
		System.out.println("end k--->"+k);
		
		//��32�������9 8 7 6 5 4 3 2 1 0 -1
		//end k=-1
		
		//��ʵ���֪ʶ����++��--��������ｲ���ˣ�Ҳ�������Լ�/��1�͸�ֵ��˳�����⡣
		
	}
}