
/*
	����Ĵ�����ʹ��
*/

public class OOTest01{
	
	public static void main(String[] args){
		
		int i=10;
		//int�ǻ�����������
		//i�Ǳ�����
		//10��һ��int���͵�����ֵ
		
		
		//ͨ��һ�������ʵ����N������
		//ʵ����������﷨�� new ����();
		//new��java�����е�һ�������
		//new������������Ǵ���������JVM�еĶ��ڴ濪���µ��ڴ�ռ�
		//�������ڴ棺������ص�ʱ��class�ֽ������Ƭ�α����ص����ڴ�ռ���
		//ջ�ڴ�(�ֲ�����):��������Ƭ��ִ��ʱ������÷��������ڴ�ռ䣬��ջ�ڴ���ѹջ
		//���ڴ棺new�Ķ����ڶ��ڴ��д洢
		
		//new Student();
		//Student��һ��������������
		//s�Ǳ�������
		//new Student()��һ��ѧ������
		//s��һ���ֲ�����������ջ�ڴ��д洢��
		//ʲô�Ƕ���new������ڶ��ڴ��п��ٵ��ڴ�ռ���Ƕ���
		//ʲô�����ã�������һ��������ֻ������������б��������һ��java������ڴ��ַ
		//����java���ԣ�����Ա����ֱ�Ӳ������ڴ棬java��û��ָ�룬����C����
		//����java���ԣ�����Աֻ��ͨ�������á������ʶ��ڴ��ж����ڲ����ʵ������
		
		Student s=new Student();
		
		
		//����ʵ���������﷨��ʽ��
		//��ȡ�� ����.������
		//�޸ģ� ����.������=ֵ
		
		/*
		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
		boolean stuSex=s.sex;
		String stuAddr=s.addr;
		
		System.out.println("ѧ�� ="+stuNo);
		System.out.println("���� ="+stuName);
		System.out.println("���� ="+stuAge);
		System.out.println("�Ա� ="+stuSex);
		System.out.println("סַ ="+stuAddr);
		
		���Ĭ��ֵ
		ѧ�� =0
		���� =null
		���� =0
		�Ա� =false
		סַ =null
		*/
		
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.addr);
		
		System.out.println("------------------------------------");
		
		s.no=10;
		s.name="jack";
		s.age=20;
		s.sex=true;
		s.addr="����";
		
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.addr);
		
		//�ٴ�ʵ��һ��ȫ�µĶ���
		//stu��һ������
		//stuͬʱҲ��һ���ֲ�����
		//Student�Ǳ�����������
		Student stu=new Student();
		
		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.sex);
		System.out.println(stu.addr);
		
		
		//���뱨��no��ʵ������������ֱ�Ӳ��á��������ķ�ʽ����
		//��Ϊno��ʵ�����������󼶱�ı����������洢��java�����У�
		//ֻ�����ж���ͨ��������ܷ���no���ʵ������������ֱ��ͨ����������������
		//��������-����������ֵ-��������
		//System.out.println(Student.no);
	}
	
}

/*
	�ֲ�������ջ�д洢��
	��Ա�����е�ʵ�������ڶ��ڴ��java�����ڲ��洢

	ʵ��������һ������һ�ݣ�100���������100��
*/





