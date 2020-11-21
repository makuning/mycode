package com.makun.javase.array;

public class ArrayTest01 {
    public static void main (String[] args) {
        int[] array1 = new int[10];
        int[] array2 = {1515,178,2784,236,908,37,98,77,1,34,56,7,8,8,435,877,43,45,66,77,34,66,22,567,234,834,99,2476,466,12,6,9,10,19,35,88};

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0 ; i < 10 ; i++) {
            array1[i] = i + 1;
            System.out.println(array1[i]);
        }

        Rank.ascending(array2);
        Rank.outputArray(array2);
        System.out.println("\n----------------------------------------------------------------------------");
        Rank.descending(array2);
        Rank.outputArray(array2);
    }
}

class Rank {
    /*
    * 冒泡排升序：
    * 两个相邻的数进行比较，前一个数字比后一个数字大就进行交换
    * 第一轮比较，最大的数会被排到数组最后一个位置
    * 第二轮比较，第二大的数会被排到数组的倒数第二个位置，这轮就不用再和最后一个数进行比较然后交换了
    * 。
    * 。
    * 。
    * 倒数第二轮比较，倒数第二大的数被排到了数组的第二个位置，这轮就不用再和倒数第四大的数（位置在第四个的数已经确定位置）进行比较然后交换了
    * 最后一轮比较，倒数第一大的数（最小的数），位置不变，就在第一个位置（这轮没必要比较）
    * */
    public static void ascending (int[] array) {
        // 定义一个中间量，方便交换
        int temp;
        /*根据规律：
          每一轮比较过后，最后那个数就确定位置了，不用进行比较，然后最后一轮不用进行比较（第二小的数确定了，最小的数也就确定了，不用再比较）
          所以大轮（要确定几个数的位置）要轮length - 1 次，小轮（这个要确定位置的数要和几个数作比较）要轮length - 已确定位置的数（即大轮次数）
          小轮循环次数分析：如一共有五个数，有三个数确定了位置（大轮轮了三次），那么就只需要数1和数2进行比较就行，就只需要比较一次
          那么推算出，小轮轮的次数就是数字总数减去已确定的数字数量再减1，即数组长度减去大轮次数再减1
        */
        for (int i = 0 ; i < array.length - 1; i++) {  // 大轮
            for (int j = 0 ; j < array.length - i - 1; j++) {   // 小轮
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void descending (int[] array) {
        // 定义一个中间量，方便交换
        int temp;
        // 与升序相反
        for (int i = 0 ; i < array.length - 1; i++) {  // 大轮
            for (int j = 0 ; j < array.length - i - 1; j++) {   // 小轮
                if (array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void outputArray (int[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
