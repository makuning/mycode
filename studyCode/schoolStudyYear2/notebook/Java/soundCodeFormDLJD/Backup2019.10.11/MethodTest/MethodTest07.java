
/*

	��������
		main begin
		m1 begin
		m2 begin
		m3 begin
		m3 over
		m2 over
		m1 over
		main over

	���ڵ�ǰ������˵��
		*main�������ȱ����ã�main����Ҳ�����һ������
		*m3���������ã�m3����Ҳ�����Ƚ���

	main��������������������������ֽ׶�����

	���������䣬
	�������д������϶��°�˳������ִ�У���һ�д���δִ�н�������һ�д�����Զ����ִ��

*/

public class MethodTest07{
	
	public static void main(String[] args){
		
		System.out.println("main begin");
		m1();
		System.out.println("main over");
		
	}
	
	public static void m1(){
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}
	
	public static void m2(){
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}
	
	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
	
	
}




