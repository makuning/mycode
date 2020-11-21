package com.makun.javase.array.arithmetic;

public class ArithmeticForArray {
    /*
     * 冒泡排升序（自己理解来写的，代码比较垃圾）：
     * 两个相邻的数进行比较，前一个数字比后一个数字大就进行交换
     * 第一轮比较，最大的数会被排到数组最后一个位置
     * 第二轮比较，第二大的数会被排到数组的倒数第二个位置，这轮就不用再和最后一个数进行比较然后交换了
     * 。
     * 。
     * 。
     * 倒数第二轮比较，倒数第二大的数被排到了数组的第二个位置，这轮就不用再和倒数第四大的数（位置在第四个的数已经确定位置）进行比较然后交换了
     * 最后一轮比较，倒数第一大的数（最小的数），位置不变，就在第一个位置（这轮没必要比较）
     * */
    public static void ascending1 (int[] array) {
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

    public static void descending1 (int[] array) {
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


    /**
     * 重新写一个比较简洁的冒泡排序
     * @param array 一个int一维数组元素
     */
    // 冒泡升序
    public static void ascending2 (int[] array) {
        // 定义大循环，这里定义的大循环与之前的不同，同样是length-1的次数，但是为了小循环能够方便使用
        // 进行一些精简
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (array[j] > array[j+1]) {
                    // 如果前面的数比后面的数大，就交换
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    // 冒泡降序
    public static void descending2 (int[] array) {
        // 定义大循环，这里定义的大循环与之前的不同，同样是length-1的次数，但是为了小循环能够方便使用
        // 进行一些精简
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (array[j] < array[j+1]) {
                    // 如果前面的数比后面的数大，就交换
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序：
     * 每轮从需要比较的数字块中找出最大的或者最小的数，然后与当前比较的数字块的最前面的数进行交换
     * （注：此思路是找到最大数的下标，而不是值，然后与）
     * 例如：
     * 第一轮：从所有数组中找出最大的数，然后和下标为0的数的值进行交换。
     * 第二轮：下标为0的数已经确定，从剩下的数中找出最大的数然后和下标为1的数进行交换
     * 。
     * 。
     * 。
     * 最后一轮：下标为【0~n-3】的数已经确定，只需要比较下标【n-2】和【n-1】的两个数（倒数两个数）
     * @param array 一个int一维数组元素
     */
    public static void ascending3 (int[] array) {


        // 定义一个循环嵌套，外面一层是循环需要找最小数的次数，需要找【length-1】次，即需要循环【length-1次】
        // 里面一层是需要找到最小的数，并且要确定数字块的范围，应该是循环当前数字块长度-1次
        // 当前数字块应该是大循环次数（从循环0开始）+1次开始往后比较，找出最小的数，然后和下标等于当前循环次数（循环从0开始）的数进行交换
        for (int i = 0; i < array.length - 1; i++) {
            // 定义一个当前大循环最小数的下标(假设第一个数是最小的)
            int min = i;

            for (int j = min; j < array.length - 1; j++) {
                /*
                    这里的if条件之前写成了(array[j] > array[j+1])
                    如果写成这样表示的是如果前面的一个数大于后面的数，就将最小值下标换为后面一个较小的数的下标
                    这样就造成了mih的值是最后比较的两个数中的较小的那个数的下标

                    现在改成(array[min] > array[j+1])
                    表示用目前知道的最小的那个数去和后面的数进行比较，然后遇到更小的就更换下标
                    这样逻辑更为清晰
                */
                if (array[min] > array[j+1]) {
                    //
                    min = j+1;
                }
            }
            // 小循环结束后，将当前比较区域内获取到的最大的数的下标对应的数与当前循环区域最前面的数进行交换

            // 交换
            if (!(min == i)) {
                // 定义一个中间变量
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void descending3 (int[] array) {
        

        // 定义一个循环嵌套，外面一层是循环需要找最大数的次数，需要找【length-1】次，即需要循环【length-1次】
        // 里面一层是需要找到最大的数，并且要确定数字块的范围，应该是循环当前数字块长度-1次
        // 当前数字块应该是大循环次数（从循环0开始）+1次开始往后比较，找出最大的数，然后和下标等于当前循环次数（循环从0开始）的数进行交换
        for (int i = 0; i < array.length - 1; i++) {
            // 定义一个当前大循环最大数的下标(假设第一个数是最大的)
            int max = i;
            
            for (int j = max; j < array.length - 1; j++) {
                if (array[max] < array[j+1]) {
                    max = j+1;
                }
            }
            // 小循环结束后，将当前比较区域内获取到的最大的数的下标对应的数与当前循环区域最前面的数进行交换

            // 交换
            if (!(max == i)) {
                // 定义一个中间变量
                int temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }
    }

    /**
     * 普通查找，遍历查找
     * @param array 一个int一维数组
     * @param num 需要查找的int类型的数
     * @return 如果找到了就返回一个索引下标，如果没有找到就返回-1
     */
    public static int seek1 (int[] array,int num) {
        // 循环找出每个数，然后进行比较，如果找到了就返回索引号，没有就返回-1
        // 数组不需要排序
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分法查找：
     * 循环查找，找到需要查找的数组的中间的元素的下标，如果刚好是那个数就返回下标，如果不是的话
     * 就比较需要查找的数和这个中间元素的大小，如果需要查找的数比这个中间元素大，那个这个数就在这个中间元素的右边，如果小则反之
     * 每次查找都有一个起始坐标和结束坐标，代表查找的范围
     * 如果需要查找的数在中间元素的右边，那么开始坐标就是中间元素的坐标+1
     * 如果需要查找的数在中间元素的左边，那么终点坐标就是中间元素的坐标-1
     * 如果需要查找的数就是中间元素，那么就直接返回这个数的下标，表示已经找到
     * 循环查找的结束条件就是【开始坐标 >= 结束坐标】
     * 即运行条件是【开始坐标 < 结束坐标】
     * @param array 一个按升序排好序的int一维数组
     * @param num 需要查找的int类型的数
     * @return 如果找到了就返回一个索引下标，如果没有找到就返回-1
     */
    public static int seek2 (int[] array,int num) {
        // 这个循环不知道循环的具体次数就，就使用while循环
        // 在外面定义开始坐标和结束坐标
        int start = 0;                  // 第一次开始是从数组的最开头开始
        int end = array.length - 1;     // 第一次开始是从数组的最末尾结束

        while (start <  end) {
            // 找到中间元素
            int centre = (start + end) / 2;

            // 开始判断
            // 如果中间元素刚好等于需要查找的数就返回下标
            if (array[centre] == num) {
                return centre;
            // 如果中间元素比需要查找的元素大，表示需要查找的数在它的左边
            } else if (array[centre] > num) {
                // 更改查找范围的结束坐标
                end = centre - 1;
            // 如果中间元素比需要查找的元素小，表示需要查找的数在它的又边
            } else {
                // 更改查找范围的开始坐标
                start = centre + 1;
            }
        }

        // 如果循环结束都没有返回下标，表示没有找到，就返回-1
        return -1;
    }


    // 遍历输出一个数组
    public static void outputArray (int[] array) {
        System.out.print("\n****************************************************数组输出开头**************************************************");
        for (int i = 0; i < array.length; i++) {

            // 输出一百个数就换个行
            if (i % 25 == 0) {
                System.out.print("\n第[" + (i / 25 + 1) + "]行数:");
            }
            System.out.print("\t" + array[i]);

        }
        System.out.print("\n****************************************************数组输出结尾**************************************************\n");
    }
}
