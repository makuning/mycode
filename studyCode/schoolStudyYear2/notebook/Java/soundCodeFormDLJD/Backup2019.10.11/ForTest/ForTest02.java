
//��Ҫ˵��forѭ���б���������

public class ForTest02{
	
	public static void main(String[] args){
		
		//���µ�forѭ���С�i�������������ǽ�����forѭ���ڲ�ʹ��
        for(int i=0;i<10;i++){
			System.out.println("i--->"+i);
		}		
		
		for(int i=0;i<=10;i++){
			System.out.println("i--->>"+i);
		}		
		
		//��ô���i����������main�������������з�����
		//System.out.println("i="+i);
		//��������޷�����
		
		//���i��main�����������е�i������ֻҪmain����û�н����������i������
		int i=0;
		
		for(;i<10;i++){
			System.out.println("i="+i);
		}	
		//�����0-9��
		
		System.out.println("i===>"+i);
		//��ô��������forѭ���������ܲ��ܷ������i�أ�i���Ƕ��٣�
		//���ȣ�i��main�����еı������϶����Է��ʡ�
		//��Σ�����������forѭ����forѭ���Ѿ�ִ�й��ˣ�ִ����i++�����Ѿ���i�����10������ѭ���Ż����
		//���Դ�ʱ����i�Ļ���������10
		
		int j;
		
		for(j=1;j<10;j++){
			System.out.println("j-->"+j);
		}	
		
		System.out.println("j="+j);
		//�������һ��������ʱj��ֵΪ10
		
	}
}