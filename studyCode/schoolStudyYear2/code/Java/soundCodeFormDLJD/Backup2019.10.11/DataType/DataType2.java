
//ת���ַ���\����б��
//ת���ַ�һ���������ַ�ǰ����ܱ�֤�������

public class DataType2{
	public static void main(String[] args){
		char c1='n';
		System.out.println(c1);
		//���Զ��׼��������n������ַ���
		char c2='\n';
		
		/*
		�²¿��������\n������ܲ��ܱ���ͨ��
		���ǿ���ͨ����Ϊʲô�أ�
		\��n���������ַ���Ӧ���ǰ��˫���ŵ��ַ������Ͱ�
		ʵ����������һ���ַ����ǻ��з���
		�����ǿ�����б�ܼ�n�ַ���ʲôЧ��
		ֱ�����в�����������Ч�������¾ٸ����ӡ�
		*/
		
		/*
		System.out.println("Hello");
		System.out.println("World!");
		���Hello���Զ��������World!
		*/
		
		/*
		System.out.print("Hello");
		System.out.println("World!");
		���������һ��ġ�HelloWorld����
		*/
		
		//System.out.println��System.out.print����
		//println��ʾ���֮���У�print��ʾ��������ǲ�����
	    
		System.out.print("A");
		System.out.print(c2);//ע��˴���print������println
		System.out.println("B");
		
		//�ٿ�һ������
		char x='t';
		System.out.println(x);
		//���t�ַ���
		char y='\t';
		
		//������б�ܼ�t��ʲô������
		//���Ʊ����
		//ע���Ʊ��TAB�Ϳո������
		//���ǵ�ASCII�벻һ���������ڼ�����������ͬ�ġ���������
		System.out.print('A');
		System.out.print(y);
		System.out.println('B');
		//�����A������һ�����ټ���B��
		
		//Ҫ���ڿ���̨�����һ����б���ַ���\��
		
		/*
		char i='\';
		System.out.println(i);
		*/
		//��б�ܻὫ����İ�ǵ�����ת���һ������ͨͨ�ģ������κ����⺬��İ�ǵ������ַ�
		//Ȼ��б��ǰ��İ�ǵ����ž��޷��ҵ���һ���������ˡ�
		/*
		DataType2.java:3: ����: δ�������ַ�����
                char i='\';
                       ^
        1 ������
		������룬���������������ô����أ�
		*/
		char i='\\';
		System.out.println(i);
		//ͬ�������ǵ����źͰ��˫����
		char k='\'';
		System.out.println(k);
		//�����ǵ����ţ�\��'ת�����ͨ�İ�ǵ������ַ���
		System.out.println("HelloWorld!");
		//����ͨ�����HelloWorld��
		System.out.println("��HelloWorld!��");
		//���ȫ�������µ�HelloWorld��
		System.out.println("\"HelloWorld!\"");
		//���ֳ�\��ת�幦���ˡ�
		
		//����һ������native2ascii.exe���������
		//����̨����native2ascii���ɡ����ҵ�JDK����û�����exe��
		char n='��';
		System.out.println(n);
		n='\u4e2d';
		System.out.println(n);
		//����������С�����ַ�
		char xx='\u1234';
		System.out.println(xx);
		//������ʺţ����ʺŲ������unicode���룬˵��������벻���ڣ���ע��
		
		char m='\u0000';
		System.out.println(m);
		//���Կ���\��u����������ֵ�unicode���룬����ʮ�����ơ�
		//���ó�Ա������Ĭ�ϸ�ֵҲ���Բ鿴��
		//����ʾһ���հף�ʲô��û�У�ע��Ϳո�'\u0020'��ͬ�������ǲ�ͬ��!
		//ע��õ���DOS���ڵ�����������ᵼ�����a�ַ�������ʵ���ϻ���ʲô��û�У�����a�ַ���
		
		
		
	}
}