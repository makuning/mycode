
/*
ʹ�õݹ����1~N�ĺ�

������1-4֮��
	1+2+3+4
	4+3+2+1���Ƽ�ʹ�����֣�

*/

public class RecursionTest03{
	
	static int sum=0;
	static int result;
	
	public static void main(String[] args){
		
		int n=4;
		
		System.out.println(sum(n));
		
		
		int x=55;
		System.out.println(sum1(x));
		
	}
	
	public static int sum(int n){
		
		result=n+(n-1);
		
		sum+=result;
		
		if((n-1)==0){
			return sum;
		}
		
		sum((n-1));
		
		return (sum+n)/2;
		
	}
	
	
	//����Ϊ��ʦ����
	public static int sum1(int n){
		if(n==1){
			return 1;
		}
		
		return n+sum1(n-1);
	}
	
	/*
		���ȣ�ʹ�õݹ飬һ��Ҫ�н���������������if����������䣬����϶���return ֵ���������
		��Σ�if����������ʱ��Ҳ����return ֵ��������䡣�������﷨û�д���
	
		if ֮���return ֵ�����ֵ��ʲô����һ�Σ��Ǵ�n��ʼ�ӣ�Ȼ��Ҫ��n-1���Ž�ȥ�����Ķ�ȥ��
		�ŵ�sum1������ȥ������һ��������4+sum1(3),�ٶ�sum1(3)����ռ䣬����3+sum1(2) ��2+sum1(1)
		��ʱ��n=1�ˣ�����һ��1����sum1(1)=1������sum1(2)=2+1 ��sum1(3)=3+sum1(2)=3+2+1,���ص�
		���ս��Ϊ4+3+2+1.һ������ֵ��Ϊ��һ�����÷������sum1(n-1),����һ����������ɡ�
	
		����Ҫ�࿴����
	
	
	*/
	
}