package com.bjpowernode.javase.test012;

/**
 * ����java�����еļ̳У�
 * 
 * 			1.�̳������������������֮һ�����������ֱ��ǣ���װ���̳кͶ�̬��
 * 
 * 			2.�̳С��������������Ǵ��븴�á����Ǽ̳����Ҫ���������ǣ����˼̳в������Ժ�ķ������ǺͶ�̬
 *
 *			3.�̳��﷨��ʽ��
 *				[���η��б�] class ���� extends ������{
 *						����=����+����;
 *				}
 *
 *			4.java���Ե��еļ̳�ֻ֧�ֵ��̳У�һ���಻��ͬʱ�̳ж�����ֻ࣬�ܼ̳�һ���࣬��C++��֧�ֶ�̳�
 *
 *			5.���ڼ̳е�һЩ���
 *				B��̳�A�࣬���У�
 *						A���Ϊ�����ࡢ���ࡢ���ࡢsuperclass
 *						B���Ϊ�����ࡢ�����ࡢsubclass
 *
 *			6.��java���������඼�̳��˸�����Щ�����أ�
 *				-˽�еĲ�֧�ּ̳�
 *				-���췽�����̳�
 *				-���������ݶ��ܼ̳�
 *
 *			7.��Ȼjava��ֻ֧�ֵ��̳У�����һ����Ҳ���Լ�Ӽ̳������࣬���磺
 *					C extends B{
 *					
 *					}
 *
 *  				B extends A{
 *					
 *					}
 *
 * 					A extends T{
 *					
 *					}
 *					
 *					C��ֱ�Ӽ̳�B�࣬����C���Ӽ̳�A�ࡢT��
 *
 *			8.java�����м���һ���ಢû����ʾ�̳��κ��࣬����Ĭ�ϼ̳�javase��⵱���ṩ��java.lang.Object�ࡣ
 *				java����һ���඼��Object���������
 *
 */
public class ExtendsTest {

	public static void main(String[] args) {

		ExtendsTest et=new ExtendsTest();
		String s=et.toString();//�������ͨ����˵��ȷʵ�̳�Object��
		System.out.println(s);//com.bjpowernode.javase.test012.ExtendsTest@1f32e575
		
		CreditAccount act=new CreditAccount();
		act.setActno("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
		
		System.out.println(act.getActno()+","+act.getBalance()+","+act.getCredit());
		
		
		
	}

}
