
/*
	����
	
		����һ��������ࡾ����/�ʼǱ����������������ԣ�
			*Ʒ��
			*�ͺ�
			*��ɫ

		����һ��ѧ���࣬ѧ��������ԣ�
			*ѧ��
			*����
			*ѧ����һ̨�ʼǱ�����

		���д�����ʾ���ϵ��࣬Ȼ��ֱ��ഴ���ɶ���
		�����������ޣ�Ȼ��������һ��ѧ��ȥʹ������һ̨�ʼǱ�����
		
		���벢���У����ҽ�������ִ�й��̲��û�ͼ��ʽ��������
		
		���еĴ���д����������
*/

public class OOTest06{
	
	public static void main(String[] args){
		
		Computer computer1=new Computer();
		
		Computer computer2=new Computer();
		
		computer1.brand="asus";
		computer1.type='A';
		computer1.color="red";
		
		computer2.brand="lenevo";
		computer2.type='B';
		computer2.color="black";
		
		Student student1=new Student();
		
		student1.no=110;
		student1.name="jack";
		student1.c=computer1;
		
		System.out.println(student1.no);
		System.out.println(student1.name);
		System.out.println(student1.c.brand);
		System.out.println(student1.c.type);
		System.out.println(student1.c.color);
		
		//ע�⣬ֱ�ӷ���student1.c��ʵ������һ���ڴ��ַ�ġ�
		
		//��Ȼ��Ҳ����ֱ��student1.c=new Computer();���ѧ��ֱ�ӻ���һ̨�µĵ���
		
	}
}

class Computer{
	
	String brand;
	
	char type;
	
	String color;
}

class Student{
	
	int no;
	
	String name;
	
	Computer c;

}

//������ϵ��ͨ��A�����ܹ��ҵ�B����A�к���B������

