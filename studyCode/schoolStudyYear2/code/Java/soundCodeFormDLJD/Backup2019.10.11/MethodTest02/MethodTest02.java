
//��ͼ����
//����ÿ��һ������һ�����ɣ�ע����������Һ���

public class MethodTest02{
	
	public static void main(String[] args){
		
		int i=10;
		method(i);
		System.out.println("main -->"+i);
		
	}
	
	public static void method(int i){
		i++;
		System.out.println("method -->"+i);
	}

}