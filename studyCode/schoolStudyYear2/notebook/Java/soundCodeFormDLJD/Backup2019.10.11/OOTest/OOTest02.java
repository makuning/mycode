
//������
public class OOTest02{
	
	public static void main(String[] args){
		
		//����һ��User����
		//u��һ���ֲ�����
		//u��һ������
		//u�Ǳ����ڴ��ַָ����ڴ��User����
		User u=new User();
		
		//���User�����ڲ�ʵ��������ֵ
		System.out.println(u.no);//0
		System.out.println(u.name);//null
		System.out.println(u.addr);//null
		
		//��User�����ڵ�ʵ������ֵ�����޸�
		u.no=110;
		u.name="jack";//ע�⣺"jack"ʵ������һ��java������String����
		
		u.addr=new Address();
		//�ڴ�ע�⣺addr����һ��Address���͵ı���������ʲô�ַ���֮��ġ�
		//ֻ���ô�������ķ�ʽ��������������
		//String�Ƚ����⣬ֱ�Ӽ��ַ������У����Ǳ����ϻ����ڶ��ڴ��д�����һ��String����
		
		//������u��addr���������
		//addr���ʵ�������ᴴ��һ��Address�������ͼ��
		//��main�����У���ֻ�ܿ���һ�����á�u����
		System.out.println(u.name+"��ס�ĳ����ǣ�"+u.addr.city);
		System.out.println(u.name+"��ס�Ľֵ��ǣ�"+u.addr.street);
		System.out.println(u.name+"�ʱࣺ"+u.addr.zipcode);
		
		//�ı�����addr���ݡ�
		//ֻҪ���������ĸ��ƹ����޸ľ���
		u.addr.city="����";
		u.addr.street="����";
		u.addr.zipcode="111111";
		
		System.out.println("---------------------------------------");
		
		System.out.println(u.name+"��ס�ĳ����ǣ�"+u.addr.city);
		System.out.println(u.name+"��ס�Ľֵ��ǣ�"+u.addr.street);
		System.out.println(u.name+"�ʱࣺ"+u.addr.zipcode);
		
	}
	
	
}

//���ã����ȿ����Ǿֲ�������Ҳ�����ǳ�Ա������
//�����������ͺ�ı��������ܿ������á�
//�����������ͺ���ָ��һ��������ڴ��ַ��
//����ֱ�Ӳ������ڴ棬ֻ��ͨ�����ã�һ��һ���Ľ��з��ʡ�
//���ԣ�u.addr�����Ҳ��һ�����á�u.addr.city



