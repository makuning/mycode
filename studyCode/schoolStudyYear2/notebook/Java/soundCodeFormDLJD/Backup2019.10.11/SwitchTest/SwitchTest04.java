/*
	ʵ�ּ������е�
	+
	-
	*
	/
	%

	ʵ��˼·��
	1.ѡ���������ݴӼ�������
	2.ʹ��switch�������ж�
	3.��Ҫ�ӿ���̨�������Σ�
	*��һ������
	*�����
	*�ڶ�������

*/

//������С����ô��  ���Ϸ����������ô��  ����int����double���͵ģ���Ҫ�жϣ�

public class SwitchTest04{
	
	public static void main(String[] args){
/*
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("�������һ�����֣�");
		double num1=s.nextDouble();
		System.out.print("����������Ҫ����������������");
		String str=s.next();
		System.out.print("������ڶ������֣�");
		double num2=s.nextDouble();
		
		switch(str){
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case "-":
			    System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case "*":
			    System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case "/":
			    System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
			case "%":
			    System.out.println(num1+"%"+num2+"="+(num1%num2));
				break;
			default :
			    System.out.println("���Ϸ����������");
			//�����кܶ�Ǳ������//������������Լ�д�ģ�����Ϊ0ʱ��ʾinfinity���������
		}
*/
        java.util.Scanner s=new java.util.Scanner(System.in);
		
		System.out.print("�������һ�����֣�");
	    int num1=s.nextInt();
		
		System.out.print("�������������");
		String operator=s.next();
		
		System.out.print("������ڶ������֣�");
		int num2=s.nextInt();
        
		int result=0;
		
		switch(operator){
			case "+":
				result=num1+num2;
				break;
			case "-":
				result=num1-num2;
				break;
			case "*":
				result=num1*num2;
				break;
			case "/":
				result=num1/num2;
				break;
			case "%":
				result=num1%num2;
				break;
			//default��д����Ϊ�������	
		}

        System.out.println("������Ϊ��"+num1+operator+num2+"="+result);
         
        //��������Ϊ0��Ҳ���ܶ�0ȡ��������ÿ��ǽ�ȥ
        //����10.0/0.0�������infinity��10/0�������



		
	}
}