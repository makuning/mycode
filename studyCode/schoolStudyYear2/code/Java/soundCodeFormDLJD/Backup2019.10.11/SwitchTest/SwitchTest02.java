
//��SwitchTest01.java���з��������
//ͨ��������ȷʵ���Կ���switch��������String��������

public class SwitchTest02{
	public static void main(String[] args){	
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("���������ڼ���");
		String DayOfWeek=s.next();
		switch(DayOfWeek){
			case "����һ":
			System.out.println(1);
			break;
			case "���ڶ�":
			System.out.println(2);
			break;
			case "������":
			System.out.println(3);
			break;
			default:
			System.out.println("���Ϸ������ݣ�");
		}
	}
	
}