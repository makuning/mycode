/*
	���󣺼ٶ�ϵͳ����һ���˵�����(���������Ҫ�Ӽ�������)��
	�����������ж�����˴����������ĸ��׶Σ����䷶Χ[0-150]

	[0-5]      �׶�
	[6-10]     �ٶ�
	[11-18]    ������
	[19-35]    ����
	[36-55]    ����
	[56-150]   ����



*/

public class IfTest02{
	public static void main(String[] args){
		/*
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		int num=s.nextInt();
		
		int age=num;
		String year="��ǰ����Ϊ����׶�";
		
		if(age<0||age>150){
			year="�Բ�������������䲻�Ϸ�";
		}else if(age<=5){
			year="��ǰ����Ϊ�׶��׶�";
		}else if(age<=10){
			year="��ǰ����Ϊ�ٶ��׶�";
		}else if(age<=18){
			year="��ǰ����Ϊ������׶�";
		}else if(age<=35){
			year="��ǰ����Ϊ����׶�";
		}else if(age<=55){
			year="��ǰ����Ϊ����׶�";
		}
		
		System.out.println(year);
		*/
		
		//��ʦ����
		
		//1.�����û������������䡾�����ʱ�򣬱����������֡�
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("��������������:");//�����ʾ��Ϣ����Ȼ�û���֪��Ҫ��ʲô��
		//ʹ��print������println�ǰѹ�������ŵ��������������������һ����
		int age=s.nextInt();//ͣ�������ȴ��û����룬������Զ����գ���ֵ��age����
		
		//2.����ҵ���߼��ж�
		String str="����";
		
		if(age<0||age>150){
			str="���ṩ�ĵ����䲻�Ϸ�������ֵ��Ҫ��0��150֮��";
			System.out.println(str);
		}else{
			if(age<=5){
			   str="�׶�";
		   }else if(age<=10){
			   str="�ٶ�";
		   }else if(age<=18){
			   str="������";
		   }else if(age<=35){
			   str="����";
		   }else if(age<=55){
			   str="����";
		   }
		   System.out.println("�������������ڵ�"+str+"�׶�");
		}
			
	
		
	}
	
}