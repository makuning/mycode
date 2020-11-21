package com.makun.javase.array.twodimensional;
/*
* 二维数组：
* 二维数组其实就是一个特殊的一维数组，这个一维数组里每个元素放的是一个一维数组
* 二维数组的定义
* int[][] arary = new int[1][1];
* 第一个方框表示二维数组的下标，第二个方框表示一维数组的下标*/
public class TwoDimensionalArrayTest01 {
    public static void main (String[] args) {
        // 静态定义一个二维数组
        int[][] array1 = {
                // 这个二维数组的第一个元素，保存的是一个一维数组
            {1,2,3,4},
                // 这个二维数组的第二个元素，保存的是一个一维数组
            {4,5},
                // 这个二维数组的第三个元素，保存的是一个一维数组
            {6,7,8},
                // 这个二维数组的第四个元素，保存的是一个一维数组
            {9,10,11,12,13,14}
        };

        // 调用自定义的输出二维数组的方法
        ArrayFunc.outputTwoDimensionalArrayForInt(array1);

        // 动态定义一个二维数组
        int[][] array2 = new int[2][2];

        // 调用自定义的输出二维数组的方法
        ArrayFunc.outputTwoDimensionalArrayForInt(array2);
    }
}


// 定义一个数组操作方法类
class ArrayFunc {
    // 遍历输出二维数组每个元素的方法
    public static void outputTwoDimensionalArrayForInt (int[][] ints) {
        // 第一个循环，用来找出二维数组中的每个元素（也就是每个一维数组）
        for (int i = 0 ; i < ints.length ; i++) {
            // 第二个循环，用来找出这个一维数组中的每个元素并输出
            for (int j = 0 ; j < ints[i].length ; j++) {
                // 这里用一个方便理解数组的方法来获取一维数组中的每个元素
                // 定义一个一维数组用来装二维数组中的元素（因为二维数组中的元素是一维数组，相当于一维数组的引用数组）
                int[] a = ints[i];
                // 输出这个一维数组中的元素（加制表符）
                System.out.print(a[j] + "\t");
//                // 这是简写方法，直接合并方括号
//                System.out.println(objArray[i][j]);
            }
            // 每输出一个二维数组中的元素（一维数组），就换一行
            System.out.print("\n");
        }
    }
}
