
//���Գ���
public class OOTest05{
	
	public static void main(String[] args){
		
		Customer c=new Customer();
		System.out.println(c.id);//0
		
		c=null;
		
		//���³������ͨ�������г���
		//���ִ���java.lang.NullPointerException
		//��ָ���쳣
		//��������������÷��ʡ�ʵ������ص�����
		System.out.println(c.id);
		
	
		
	}
}

//��ʵ������ص����ݱ�ʾ��������ݷ��ʵ�ʱ�����Ҫ�ж���Ĳ��롣�����ʵ����ص�����