
public class SwitchTest03{
	
	public static void main(String[] args){
		
		char c='A';
		//c='B';
		//c='C';
	    //c='D';
		c=65;
		c=66;
		c='B';
		
		switch(c){
			case 'A':
				System.out.println("�߼�");
				break;
			//case 'B':	
			case 66:
			    System.out.println("�м�");
				break;
			case 'C':
				System.out.println("����");
				break;	
			default :
			    System.out.println("�����ˣ�");
		}
	}
}