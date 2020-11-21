package com.makun.javase.packagegroup;

public class PackageGroupTest01 {
    public static void main(String[] args) {
        // 手动装箱、拆箱（过时）
        Integer integer = new Integer(100);
        Boolean boolean1 = new Boolean(true);
        Double double1 = new Double(11.11D);

        int int1 = integer.intValue();
        float float1 = integer.floatValue();
        System.out.println(int1 + "\t" + float1);
        System.out.println(boolean1.booleanValue());
        System.out.println(double1.doubleValue());

        // 自动装箱、拆箱
        Integer integer1 = 200;
        int sum = 2 + integer1;
        System.out.println(sum);

        // 比较一下包装类的数值范围为 [byte类型包含的数范围内(-128~127)] 与 [byte类型包含的数范围外(-128~127)] 用 == 来进行比较
        // == 如果不是基本数据类型，表示比较保存的内存地址
        Integer integer2 = 128;
        Integer integer3 = 128;
        Integer integer4 = 127;
        Integer integer5 = 127;
        System.out.println(integer2 == integer3);   // 结果为false
        System.out.println(integer4 == integer5);   // 结果为true

        // 因为在方法区中有（-128~127）这些数字的缓存，存放在数字静态池中，如果在代码中使用到了这些数字，是去指向这个静态池中的地址，所以地址是一样的
    }
}
