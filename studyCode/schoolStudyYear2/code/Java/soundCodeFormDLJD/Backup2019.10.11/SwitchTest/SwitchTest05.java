/*
����
	ϵͳ����һ�������ĳɼ������жϸÿ����ĳɼ��ȼ�
	1.��Ч�ɼ���Χ[0,100]
	2.���Գɼ�������С��
	3.���Գɼ���ȼ����չ�ϵ��
	[90-100] A
	[80-90)  B
	[70-80)  C
	[60-70)  D
	[0-60)   E
    4.��������������switch�����ɣ�����ʹ��if
*/

/*
�뷨������90��100��99.9��95.5��95.6��Щ����A����Ҫ�Ǽ򵥵���case�ϲ�����һ�еð������������ٳ���

ת��˼·��5���ȼ���Ӧ�Ĵ������ǲ���9��10��8��7��6��5��4��3��2��1��0
���óɼ�����10������intȡ����ȡ��ǰ������������������жϲ���������
*/

public class SwitchTest05{
	
	public static void main(String[] args){
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("�����뿼���ɼ���");
		double grade=s.nextDouble();
        
		int score=(int)(grade/10);
		
		switch(score){
			case 9:case 10:
				System.out.println("A");
				break;
			case 8:
			    System.out.println("B");
				break;
			case 7:
			    System.out.println("C");
				break;
			case 6:
			    System.out.println("D");
				break;
			default :
			    System.out.println("E");
		}
		
	//Ǳ�����⣺���Ϸ���������ô��
    //100-110֮��ᱻֱ��ȷ��ΪA�ȼ���110���Ϻ�0���µ����ֶ��ᱻȷ��ΪE�ȼ������Ի��ǵ��õ�if��������	
	}
} 