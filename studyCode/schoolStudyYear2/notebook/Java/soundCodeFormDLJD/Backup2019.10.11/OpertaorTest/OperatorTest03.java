/*
	�߼������
	&           �߼��롾���ҡ�    �����ߵ����Ӷ���true���������true��
	|           �߼��򡾻��ߡ�    �����ߵ�����ֻҪ��һ����true���������true��
	!           �߼���            ��ȡ����!false����true����true����false������һ����Ŀ�������
	^           �߼����          �����ߵ�����ֻҪ��һ�����������true��


	&&          ��·��
	||          ��·��

1.�߼������Ҫ�����ߵ����Ӷ��ǲ������ͣ������߼���������յ�������Ҳ��һ����������
2.��·����߼�����������������ͬ�ģ�ֻ������·����ڶ�·����
3.��·����߼�����������������ͬ�ģ�ֻ������·����ڶ�·����
4.ʲô����·�����·����
5.ʲôʱ��ѡ��ʹ���߼����������ʲôʱ��ѡ��ʹ�ö�·���������




*/

public class OperatorTest03{
	public static void main(String[] args){
		
		//��������ȼ���ȷ�����Ӹ�С����
		System.out.println(5>3&5>2);//true
		System.out.println(5>3&5>6);//false
		System.out.println(5>3|5>6);//true
		
		System.out.println(true&false);//false
		System.out.println(true&true);//true
		
		System.out.println(true|false);//true
		System.out.println(false|false);//false
		
		System.out.println(!true);//false
		System.out.println(!false);//true
		
		System.out.println(true^false);//true
		System.out.println(true^true);//false
		System.out.println(false^false);//false
		
		/*
		//�߼���Ͷ�·��
		int x=10;
		int y=8;
		//�߼���
		System.out.println(x<y&++x<y);//x<y�Ѿ���false
		System.out.println(x);//11
		*/
		
		
		int x=10;
		int y=8;
		//��·��
		//x<y�����false���������ʽ�Ѿ�ȷ����false
		//���Ժ���ı��ʽû����ִ�У��������󱻳�Ϊ��·����
		//��·��Ż��ж�·�����߼��벻���ж�·����
		System.out.println(x<y&&++x<y);
		System.out.println(x);//10
		
		/*
		��ĳ���Ƕ���˵����·��������ܣ����ں���ı��ʽ���ܲ�ִ�У�
		����ִ��Ч�ʽϸߣ����ַ�ʽ��ʵ�ʿ�����ʹ�ý϶ࡣ��·����߼���
		���ӳ��á�ʹ�õø��ࡣ
		
		���ǣ���ĳЩ�����ҵ���߼����У�Ҫ����������ߵ����Ӷ�����ȫ��ִ�У�
		��ʱ����ʹ���߼��������������ʹ�ö�·�룬ʹ�ö�·����ܻᵼ�º����
		���ʽ��ִ�У��Ӷ�Υ��Ҫ��
		
		ʲô����·�����·������
		    *��һ�����ʽִ�н����false���ᷢ����·�룬���ȷ����false
		
		ʲô����·�����·������
		    *��һ�����ʽִ�н����true���ᷢ����·�򣬽��ȷ����true
		
		
		
		*/
		
		
		
		
		
		
		
		
	}
}