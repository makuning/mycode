
/*
	����̽��return���
		*return���һ��ִ�У����ڷ���ִ�н���
		
		*�ڡ�ͬһ���������У�return������治�ܱ�д�κδ��룬
		��Ϊ��Щ�������Զִ�в��������뱨��

*/

public class MethodTest09{
	
	public static void main(String[] args){
		
		/*
		int retValue=m();
		System.out.println(retValue);
		*/
		
		//������󣬵���m������û�д���ʵ�Σ���û�����ţ�����������Ϊ���m��ĳ��������
		//System.out.println(m);
		
		//����ͨ������ȷ�ص���m��������ʹ�β�û�У�����(�β�)�����ʽһ��Ҫ�С�
		System.out.println(m());
		
		
		
	}
	
	//���뱨��ȱ�ٷ�����䣬��������Ϊ return 1;������䲢������ȫ��ִ֤�е���
	/*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
		}
		
	}
	*/
	
	//����ͨ��������else�Ŀ������һ���ᱣ֤��һ����ִ֧�У�return 1; ���� return 0;�������϶���ִ��һ��
	/*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
		}else{
			return 0;
		}
		
	}
	*/
	
	//�������Ҫ˵����������Ĵ�����������ȫһ����
	//����if�����a>3����Ϊ��Ҳ����Ϊ��
	//��-��return 1ִ�У���������ִ�н���
	//��-��return 0ִ�У���������ִ�н���
	//������ô���������� return ֵ ���ִ��
    /*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
		}
		return 0;
		
		
	}
	*/
	
	/*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
			//System.out.println("Hello World!");//���д�����Զִ�в������޷����ʵ���䣬���뱨��
		}
		System.out.println("Hello World!");//������Ӧ��������ͬһ����������return������治�ܼ�java����˰�
		return 0;
		
		
	}
	*/
	
	//���⣬������ʹ����Ԫ������ﵽ�������Ŀ��
	public static int m(){
		return 10>3?1:0;//�����10>3?1:0����Ԫ������������1�������0
	}

}