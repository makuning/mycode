
/*
	�ڷ���ֵ����Ϊvoid�������ʹ�� return;���
    return;�������ڷ���ֵ����Ϊvoid�ķ�������Ϊ�˽�����ǰ����

*/

public class MethodTest10{
	
	public static void main(String[] args){
		
		m();
		
		//return 10;��������д��������main������main��������ֵ������void���ͣ�ֻ��дreturn;
		//��Ȼд��return;��������Ҳ����д�����ˣ���Ϊ���ʲ�����
		
		for(int i=10;i>0;i--){
			
			if(i==2){
				return;
			}
			System.out.println("i��ֵ-->"+i);
			
		}
		
		System.out.println("Hello Word!");
		
		//retrun;ֱ����ֹ������main���������У�����Hello World����û�����
		
		//С��һ�£�main���������Ƿ�������Ҫ�������⻯��return���϶�����main������ʹ��
		
	}
	
	//���뱨���Է���ֵ����Ϊvoid�ķ�������ʹ�� return ֵ; ���������
	/*
	public static void m(){
		return 10;
	}
	*/
	
	public static void m(){
		
		for(int i=0;i<10;i++){
			if(i==5){
				return;//ֱ����ֹ����m������Hello Worldִ�в���
				//break;//��ֹ��ǰforѭ��
			}
			System.out.println("i -->"+i);
		}
		
		System.out.println("Hello World!");

	}
	
}