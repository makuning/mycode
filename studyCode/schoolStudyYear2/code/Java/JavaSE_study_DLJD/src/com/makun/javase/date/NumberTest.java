package com.makun.javase.date;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import com.makun.javase.array.arithmetic.ArithmeticForArray;

public class NumberTest {
    public static void main(String[] args) {
        // 创建一个数字格式化类

        /*  数字格式：
                # 代表任意数字
                , 代表千分位
                . 代表小数点
                0 代表位数不够用0补齐
        */
        DecimalFormat df = new DecimalFormat("###,###.00");
        String num1 = df.format(74198748.97189174D);
        System.out.println(num1);


        // 高精度数字，用于商务系统
        BigDecimal v1 = new BigDecimal(100);// 精度极高的100
        BigDecimal v2 = new BigDecimal(200);// 精度极高的200

        // 使用BigDecimal的实例方法来进行运算，运算结果也是一个BigDecimal
        BigDecimal result = v1.add(v2);
        System.out.println(result);

        // 随机产生5个随机数，并且这5个随机数不能相同，如果相同则重新生成，装在一个数组中
        int[] array = new int[5];

        // 动态初始化的数组中的元素的值为0，这里手动初始一下，不然等下出现的随机数0就不能够加入到这个数组中了
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        Random random = new Random();
        // 分析一手，这个不确定循环次数，所以可以不用for循环，用while循环要好一些
        int index = 0;  // 定义一个下标索引，当缩影到达数组的长度-1就可以停止了
        /*
         每次循环从数组中查找这个随机生成的数，如果能够查到就结束本次循环再重新生成
         如果没有查到就将这个随机数传给当前索引的数，然后索引加1，进行下一轮
        */
        int val;    // 在外边儿定义一个变量来装等下循环产生的随机数

        while (index < array.length) {
            // 随机产生一个0~10的int数字
            val = random.nextInt(11);
            // 判断是否已经有了这个数字
            // 这里调用我之前写的一个遍历数组查询的方法，在package com.makun.javase.array.arithmetic;这个包中
            if (!(ArithmeticForArray.seek1(array,val) != -1)) {
                // 如果它找不到就赋值，并且index++;
//                array[index] = val;
//                index++;
                // 上面是两句话，可以合并为一句
                array[index++] = val;
            }

        }

        // 输出数组
        ArithmeticForArray.outputArray(array);

    }
}
