package com.bjpowernode.javase.day09.test004;

/**
 * ��װ�Ĳ��裺
 * 
 * 	1.��������˽�л���ʹ��private�ؼ��ֽ������Σ�private��ʾ˽�еĵģ����ε���������ֻ���ڱ����з���
 * 
 * 	2.�����ṩ�򵥵Ĳ�����ڣ�Ҳ����˵�ⲿ�����Ժ������age���ԣ�����ͨ����Щ�򵥵���ڽ��з��ʣ� -�����ṩ�����������ֱ���set������get����
 * 		-�޸�age���ԣ�����set����
 * 	 	-��ȡage���ԣ�����get����
 * 
 * 	3.set�����������淶��
 *  	public void setAge(int a){
 * 			age=a;
 * 		}
 * 
 * 	4.get�����������淶��
 * 		public int getAge(){
 * 			return age;
 * 		}
 *
 *����һ�£�һ�����Ե�ͨ�����ʵ�ʱ������ļ��ַ��ʷ�ʽ��
 *	-��һ�ַ�ʽ�����ȡ������Ե�ֵ����ȡget
 *	-�ڶ��ַ�ʽ�����޸�������Ե�ֵ���޸�set
 *
 *��Ҫ���᣺
 *
 *	-setter & getter ����û��static�ؼ���
 *	-��static�ؼ��ֵ��ã�����.������(ʵ��);
 *	-û��static�ؼ��ֵ��ã�����.������(ʵ��);
 *
 * @author ASUS
 *
 */
public class User {

	//����˽�л�
	private int age;
	
	//set����û�з���ֵ����Ϊset����ֻ�����޸�����
	/*
	public void setAge(int age) {
		age=age;//java���оͽ�ԭ��������ʵ��û�и�age���Ը�ֵ�������age���Ǿֲ�����age
	}
	*/
	
	//setter	
	public void setAge(int a) {
		//��дҵ���߼�������а�ȫ����
		//age=a;
		
		if(a<0||a>150) {
			System.out.println("�Բ������ṩ�����䲻�Ϸ�");
			return;
		}
		
		//����ִ�е����˵��returnû��ִ�У�����Ϸ�
		//���и�ֵ����
		age=a;
	}	
	
	//getter
	public int getAge() {
		return age;
	}
	
}
