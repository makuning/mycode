
public class OOTest03{
	
	public static void main(String[] args){
		
		//u������
		//u�Ǿֲ�����
		User u=new User();
		
		//��OOTest02.java�б�д�Ĵ���
		//u.addr=new Address();
		
		//��һ��д��
		
		//a������
		//a�Ǿֲ�����
		Address a=new Address();
		u.addr=a;
		
		System.out.println(u.addr.city);//null
		
		a.city="���";
		
		System.out.println(u.addr.city);//���
		
		
		//��ͼ��һ��������˳������һ������Ū��ԭ��
		
		
	}
}