/*
	����
	�жϵ�ǰ��������
		�������ʱ
			����ɡ��
				�ж��Ա�
					�Ա�Ϊ�У���һ�Ѵ��ɡ
					�Ա�ΪŮ����һ��С��ɡ
		�������ʱ
			�ж������¶ȣ�
				�������¶���30�����ϣ�
					�Ա�Ϊ�У���ī��
					�Ա�ΪŮ������ɹ˪
					
					
*/

public class IfTest03{
	public static void main(String[] args){
	
/*	
		String weather1="����";
		String weather2="����";
		String sex1="��";
		String sex2="Ů";
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("������Ŀǰ���������:");
		String weather=s.next();
		System.out.print("�����������Ա�:");
		String sex=s.next();
		System.out.print("�����뵱ǰ�¶�:");
		int temperture=s.nextInt();
			
		if(weather==weather1){
			if(sex==sex1){
				System.out.println("�����һ�Ѵ��ɡ");
			}else if(sex==sex2){
				System.out.println("�����һ��С��ɡ");
			}else{
				System.out.println("��������Ա𲻺Ϸ���ֻ����\"��\"��\"Ů\"��ѡ��");
			}
		}else if(weather==weather2){
			if(temperture>=30){
				if(sex==sex1){
					System.out.println("�����ī��");
				}else if(sex==sex2){
					System.out.println("�����ɹ˪");
				}else{
					System.out.println("��������Ա𲻺Ϸ���ֻ����\"��\"��\"Ů\"��ѡ��");
				}
			}
		}else{
			System.out.println("��������������Ϸ���ֻ����\"����\"��\"����\"��ѡ��");
		}
		
		
		//Ŀǰ���ڴ����ַ������͵ı���������==��ϵ������������е�����
*/

		
/*			
	��ʦ������ʾ��
	1.һ��Ҫ�õ�Ƕ��
	2.����״�����Ա��¶ȶ���Ҫ�ôӼ�������
	3.�п����ڿ���̨�������¶�
	4.
	����״����1��ʾ���꣬0��ʾ����
	�¶�ֱ��ʹ�����ּ���
	�Ա�1��ʾ�У�0��ʾŮ
	
*/
		
/*		
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("������Ŀǰ���������:");
	    int weather=s.nextInt();
		System.out.print("�����������Ա�:");
		int sex=s.nextInt();
		
			
		if(weather==1){
			if(sex==1){
				System.out.println("�����һ�Ѵ��ɡ");
			}else if(sex==0){
				System.out.println("�����һ��С��ɡ");
			}else{
				System.out.println("��������Ա𲻺Ϸ���ֻ����1��0��ѡ��");
			}
		}else if(weather==0){
			java.util.Scanner a=new java.util.Scanner(System.in);
			System.out.print("�����뵱ǰ�¶�:");
		    int temperture=a.nextInt();
			if(temperture>=30){
				if(sex==1){
					System.out.println("�����ī��");
				}else if(sex==0){
					System.out.println("�����ɹ˪");
				}else{
					System.out.println("��������Ա𲻺Ϸ���ֻ����1��0��ѡ��");
				}
			}
		}else{
			System.out.println("��������������Ϸ���ֻ����1��0��ѡ��");
		}
*/		
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		System.out.println("��ӭʹ�ñ�ϵͳ����ͨ����ϵͳ�������һЩ�򵥵��ж�");
		System.out.println("˵��1��1��ʾ�У�0��ʾŮ");
		System.out.println("˵��2��1��ʾ���꣬0��ʾ����");
		System.out.println("˵��3���¶������ֱ�ʾ");
		
		//�����Ա�
	    System.out.print("�������Ա�");
		int sex=s.nextInt();
		
		//�����������
	    System.out.print("�����뵱ǰ���������");
		int weather=s.nextInt();
		
		//�ж��������
		if(weather==1){
			//������
			if(sex==1){
				System.out.println("��һ�Ѵ��ɡ");
			}else if(sex==0){
				System.out.println("��һ��С��ɡ");
			}else{
				System.out.println("�����Ա�����ô���£�");
			}
		}else if(weather==0){
			//����
			//�����¶�
			System.out.print("�����뵱ǰ�¶ȣ�");
			int tem=s.nextInt();
			if(tem>=30){
				if(sex==1){
				System.out.println("��ī��");
			    }else if(sex==0){
				System.out.println("����ɹ˪");
			    }else{
				System.out.println("�����Ա�����ô���£�");
			    }
			}	
		}else{
			System.out.println("�Բ��������������״�������ڣ�");
		}	
		
		//�����������һ��С���⣬
		//�����벻�Ϸ����Ա�Ͳ��Ϸ���������ֻ����ʾ�������Ϸ�
		//���ڴ�bug�����return�����(����)
		
		
		
	}
}