/*
���������
    +     ���   
    -     ���
    *     �˻�
	/      ��
	%     ��������ȡģ��

	++    �Լ�1
	--    �Լ�1

    ע�⣺
	 һ�����ʽ�����ж�������������������ȼ�����ȷ���ļ�С���ţ����ȼ��õ�����
	 û�б�Ҫר��ȥ��������������ȼ�


*/
public class OperatorTest01{
	public static void main(String[] args){
		
		int i=10;
		int j=3;
		
		System.out.println(i+j);//13
		System.out.println(i-j);//7
		System.out.println(i*j);//30
		System.out.println(i/j);//3
		System.out.println(i%j);//1
		
		//������++Ϊ����--������պ�«��ư
		//����++��������Լ�1��
		
		int k=10;
		
		//++��������Գ����ڱ������棬�Ա��������Լ�1��������Ŀ�������
		k++;
		
		System.out.println(k);//11
		
		int y=10;
		
		//++��������Գ����ڱ���ǰ�棬�Ա��������Լ�1��������Ŀ�������
		++y;
		
		System.out.println(y);//11
		
		//С�᣺
		//++��������Գ����ڱ���ǰ��Ҳ���Գ����ڱ����������Ǳ���ǰ���Ǳ�����
		//ֻҪ++����������ñ����е�ֵһ�����Լ�1.
		
		//�о�++�����ڱ�����
		//����������ֵ���㣬�ٶԱ����б����ֵ�����Լ�1
		int a=100;
		int b=a++;
		System.out.println(a);//101
		System.out.println(b);//100
		
		//�о�++�����ڱ���ǰ
		//�����Ƚ����Լ�1���㣬Ȼ���ٽ��и�ֵ����
		int m=20;
		int n=++m;
		System.out.println(m);//21
		System.out.println(n);//21
		
		
		//���ھ�++������������Ľ���
		//�������ݴ���������⣬����ʦ˵�Ŀ����г��롣
		/*
		int mm=500;
		System.out.println(mm);
		��������ʮ����ͨ��������������͡�
		���ǣ�DOS�����������Щ���֣�ʵ�����ǲ��Ƕ����ַ������ǵġ�
		���ԣ��������̨���mm��ֵǰ���ڲ����˽�intת�����ַ����͵�����ת����
		������java�ײ����⵱�С�
		��һ��int x=...;
		System.out.println(x);
		�Ĵ��롣����һ������++�������������ת��������ĸ�ֵ��
		
		*/
		
		int e=100;
		System.out.println(e++);//�൱��int x=e++;���x��100
		System.out.println(e);//����Ȼ����ȷ����������������101
		
		int s=100;
		System.out.println(++s);//�൱��int x=++s;���x��101
		System.out.println(s);//����Ȼ����ȷ����������������101
		
		//�������������Ƕ�53-63�д����һ�����Σ�ҪŪ���ס�
		
		System.out.println("-------------------------------------");
		System.out.println(--s);//s��ֵ�Ѿ���87�б��101��������������100��
		
		//������������
		//�ڲݸ�ֽ�ϻ�������
		//sĿǰΪ100                    ���             ʵ�ʵ�s
		System.out.println(s++);//       100                101
		System.out.println(s--);//       101                100
		System.out.println(s--);//       100                99
		System.out.println(s--);//       99                 98
		System.out.println(s);  //       98                 98
		//�ú�����
		
		
		
	
    /*
    class A{
		public void m(int x){
			
		}
		
		main{
			int i=10;
			m(i);
		}
	}
    ��ʽ����
    */	
		
		
		
		
	}
}