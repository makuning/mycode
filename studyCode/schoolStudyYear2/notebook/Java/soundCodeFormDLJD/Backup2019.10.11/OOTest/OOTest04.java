
public class OOTest04{
	
	public static void main(String[] args){
		
		//����һ���ɷ����
		Husband huangxiaoming=new Husband();
		huangxiaoming.name="������";
		
		//����һ�����Ӷ���
		Wife baby=new Wife();
		baby.name="baby";
		
		//��顾��ͨ���ɷ��ҵ����ӣ�ͬʱͨ������Ҳ���ҵ��ɷ�
		huangxiaoming.w=baby;
		baby.h=huangxiaoming;
		
		//�õ����ϡ��������������ӵ�����
		
		System.out.println(huangxiaoming.name+"���������ֽУ�"+baby.name);
		//ֱ�Ӱ�baby��name�����ʳ��������ֲ����������Ƿ��޹�ϵ
		System.out.println(huangxiaoming.name+"���������ֽУ�"+huangxiaoming.w.name);
		
		
		//���ڴ�ͼ��ϣ�һ��������
		//��֮���������ݴ洢�Ķ����ڴ��ַ���ڸ�ֵ��ʱ�򣬶��Ǹ��ڴ��ַ�ġ�
		//�ڴ��ַָ���������ʵ���ϣ�����ֱ���ڶ��ڴ������ָ��
		
	}
}