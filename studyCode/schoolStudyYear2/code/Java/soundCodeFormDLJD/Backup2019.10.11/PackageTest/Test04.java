package org.apache;

//import com.bjpowernode.javase.day11.Test01;

import com.bjpowernode.javase.day11.*;

/*
	import����������������ĵ��룬ͬһ�������µ��಻��Ҫ���롣
	����ͬһ�������µ�����Ҫ�ֶ�����

	import�﷨��ʽ��
		import ����;
		import ����.*;
		
	import�����Ҫ��д��package���֮�£�class֮�ϡ�

	

*/

import java.lang.String;

import java.util.*;
//import java.util.Date;

public class Test04{
	
	public static void main(String[] args){
		
		com.bjpowernode.javase.day11.Test01 t=new com.bjpowernode.javase.day11.Test01();
		System.out.println(t);
		
		com.bjpowernode.javase.day11.Test01 tt=new com.bjpowernode.javase.day11.Test01();
		System.out.println(tt);
		
		com.bjpowernode.javase.day11.Test01 ttt=new com.bjpowernode.javase.day11.Test01();
		System.out.println(ttt);
		
		//���ϳ����ǿ��ԣ�̫�鷳�ˡ�
		
		//������import�ؼ���
		
		Test01 x=new Test01();
		System.out.println(x);
		
		
		String s="abc";
		System.out.println(s);
		
		java.lang.String str="abc";
		/*
			java.lang.*����Ҫ�ֶ����룬ϵͳ�Զ�����
		
			java.lang.*��java���Եĺ����࣬����Ҫ�ֶ�����
		
		
		*/
		
		//ֱ�ӱ�д������뱨����Ϊ�Ҳ���Date�����
		//Date d=new Date();
		
		//java.util.Date d=new java.util.Date();
		
		//ʹ��import��䵼��java.util.Date;
		Date d=new Date();
		System.out.println(d);
		
	}
}

/*
		���ս��ۣ�
			ʲôʱ����Ҫimport��
				*����java.lang�£����Ҳ���ͬһ�����µ�ʱ����Ҫʹ��import����
		
*/





