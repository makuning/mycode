/*
   ����if�����Java����ֻ��һ�п���ʡ�Դ�������ϸ̽��
*/

public class IfTest04{
	public static void main(String[] args){
		
		boolean sex=true;
		if(sex){
			System.out.println("��");
		}else{
			System.out.println("Ů");
		}
		
		sex=false;
		
		if(sex) System.out.println("��");else System.out.println("Ů");
		//һ�д��룬ʡ�Դ�����
		
		//������Ĵ����Ƿ����ͨ��
		//������뱨����һ�лᱨ��
		
		if(sex)
			System.out.println("��");//����ʵ������if�е����
			System.out.println("��");//������ʵ�����Ƕ����ģ�ʵ������Ӧ����������һ���Ի��
		//else//����һ����25�д����if��else�ֿ��ˣ�������if���벻�������ǵ�����else�ɾͲ�����
			System.out.println("Ů");
		
		//������26�з�������!elseȱ��if����26�����ϣ�û���﷨����
		
		
		
		
		
	}
}