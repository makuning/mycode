
/*
	����java�����еİ����ƣ�
		
		1.���ֱ���Ϊpackage��java������package�����﷨������Ҫ��Ϊ�˷������Ĺ���
		��ͬ���ܵ��౻���ű���ŵ���ͬ��������У����ұȽϷ��㣬����ȽϷ��㣬��ά��
	
		2.��ô����package�أ�
			-��javaԴ����ĵ�һ�б�дpackage���
			-packageֻ�ܱ�дһ�����
			-�﷨�ṹ��
				package ����;

		3.�����������淶��
			��˾�������� + ��Ŀ�� + ģ���� + ������;
			
			�������ַ�ʽ�����ļ��ʽϵͣ���Ϊ��˾��������ȫ��Ψһ��

			���磺
				com.bjpowernode.oa.user.service;
				org.apache.tomcat.core;

		4.����Ҫ��ȫ��Сд������Ҳ�Ǳ�ʶ�����������ر�ʶ����������
		
		5.һ������Ӧһ��Ŀ¼

		6.ʹ��package���ƺ���α�������У�
		
			-ʹ����package���ƺ�����������Test01�ˣ������� com.bjpowernode.javase.day11.Test01

			-���룺javac javaԴ�ļ�·������Ӳ����������һ��class�ļ���Test01.class��

			-�ֶ�����Ŀ¼����Test01.class�ļ��Ž�ȥ�����������Ǵ�����4��Ŀ¼��
			
			-���У�java com.bjpowernode.javase.day11.Test01

			-����һ�ַ�ʽ������������У�
				*����
					javac -d ����֮���ŵ�·�� javaԴ�ļ���·��
				*���磺��F:\Hello.java�ļ�����֮��ŵ�C:\Ŀ¼��
					javac -d C:\ F:\Hello.java
			
				*javac -d . *.java	
					����ǰ·��������javaԴ�ļ����룬����֮����ļ�Ҳ�ŵ���ǰ·���¡�
			
				*���У�JVM���������ClassLoaderĬ�ϴӵ�ǰ·���¼���
					��֤DOS���ڵ�·�����л���com���ڵ�·���£�ִ��
						java com.bjpowernode.javase.day11.Test01
				
				
				
				
				
				
			

*/

package com.bjpowernode.javase.day11;//4��Ŀ¼��Ŀ¼֮����.������

public class Test01{
	
	public static void main(String[] args){
		
		System.out.println("Test01's main method execute!");
	}
}
	










