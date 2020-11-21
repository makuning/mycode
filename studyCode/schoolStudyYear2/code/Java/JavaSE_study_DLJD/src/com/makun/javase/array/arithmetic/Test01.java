package com.makun.javase.array.arithmetic;


import java.util.Random;

// 用来测试我的数组算法
public class Test01 {
    public static void main(String[] args) {
        // 先新建一个1长度为200的int类型数组
        int[] ints1 = new int[200];

        // new一个Random类来产生随机数
        Random random = new Random();

        // 用一个for循环来让Random的对象来创建200个int随机数(范围【0-1000】)装再数组中
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = random.nextInt(1001);
        }

        // 调用自定义输出方法输出一下数组
        ArithmeticForArray.outputArray(ints1);

        // 使用冒泡排序1进行升序排序
        ArithmeticForArray.ascending1(ints1);

        // 调用自定义输出方法输出一下数组
        ArithmeticForArray.outputArray(ints1);

        // 使用冒泡排序2进行降序排序
        ArithmeticForArray.descending2(ints1);

        // 调用自定义输出方法输出一下数组
        ArithmeticForArray.outputArray(ints1);

        // 使用选择排序进行升序排序
        ArithmeticForArray.ascending3(ints1);

        // 调用自定义输出方法输出一下数组
        ArithmeticForArray.outputArray(ints1);

        // 使用遍历查找一个数，并输出索引
        int index = ArithmeticForArray.seek1(ints1,44);
        System.out.println(index);

        // 使用二分法查找一个数，并输出索引
        index = ArithmeticForArray.seek2(ints1,44);
        System.out.println(index);
    }
}
