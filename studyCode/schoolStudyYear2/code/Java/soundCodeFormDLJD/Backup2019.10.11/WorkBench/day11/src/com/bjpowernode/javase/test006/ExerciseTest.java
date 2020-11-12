package com.bjpowernode.javase.test006;

public class ExerciseTest {

	public static void main(String[] args) {

		/**
		 * 需求：向控制台输出“Hello World！”
		 */

		System.out.println("Hello World!");

		/**
		 * 需求：计算1~100之间所有素数的和
		 */

		// 判断一个数是否是素数
		// 是，输出，累加

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

		System.out.println("最后结果为：" + sum);
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

		System.out.println("最后结果为：" + sum);

		/**
		 * 需求：打印九九乘法表
		 */

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.print("\n");
		}

		/**
		 * 输出1~100所有数字，每8个数字换一行
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
