package com.bjpowernode.javase.test006;

public class ExerciseTest {

	public static void main(String[] args) {

		/**
		 * ���������̨�����Hello World����
		 */

		System.out.println("Hello World!");

		/**
		 * ���󣺼���1~100֮�����������ĺ�
		 */

		// �ж�һ�����Ƿ�������
		// �ǣ�������ۼ�

		/*
		int sum = 0;

		for1: for (int i = 2; i <= 100; i++) {
			for2: for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue for1;
				}
			}

			sum += i;

		}

		System.out.println("�����Ϊ��" + sum);
		*/

		int sum = 0;

		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sum += i;
			}
		}

		System.out.println("�����Ϊ��" + sum);

		/**
		 * ���󣺴�ӡ�žų˷���
		 */

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.print("\n");
		}

		/**
		 * ���1~100�������֣�ÿ8�����ֻ�һ��
		 */

		int count = 0;

		for (int i = 1; i <= 100; i++) {

			System.out.print(i + "\t");
			count++;
			/*
			 * if (count % 8 == 0) { System.out.print("\n"); }
			 */
			if (count == 8) {
				System.out.print("\n");
				count = 0;
			}

		}

	}

}
