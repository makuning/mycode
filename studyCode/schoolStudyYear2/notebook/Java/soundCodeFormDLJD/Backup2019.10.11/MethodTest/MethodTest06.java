
/*
�����ĵ��ã�
	1.���������η��б���static�ؼ��ֵģ������ĵ��÷�ʽ������.������(ʵ���б�);
	
	2.�е�ʱ�򣬿���ʡ�Բ�д������.����ʲô����¿���ʡ�ԣ�
	m1(){
		m2();
	}
	m1������m2������ͬһ�����嵱�У�������.������ʡ�Բ�д
    ���õķ����ͱ����õķ�����ͬһ�����嵱��
	
	3.������һ��javaԴ�ļ���ֻ����һ��class���Ƚ�������������Ϊ�˽�ѧ��Ŀ��
	��һ��javaԴ�ļ��ж�����class����Ҫģ��
*/

public class MethodTest06{
	
	public static void main(String[] args){
		
		//��������
		MethodTest06.m();
		
		m();//����ͨ��
		
		//����������ķ��������Ǳ��ࡿ
		A.doOther();
		
		//���뱨��ʡ�ԡ�����.����Ĭ�ϴ�MethodTest06������ǰ�����ҡ�doOther�����������Ǹ÷���������
		//doOther();

	}
	
	public static void m(){
		System.out.println("m���������ã�");
		
		//��������
		MethodTest06.m2();
		
		//ʡ�Եķ�ʽ
		m2();
		
		A.m2();
	}
	
	public static void m2(){
		System.out.println("m2���������ã�");
	}
	

}

class A{
	
	public static void doOther(){
		System.out.println("A��doOther���������ã�");
	}
	
	public static void m2(){
		System.out.println("A��m2���������ã�");
	}
	
}