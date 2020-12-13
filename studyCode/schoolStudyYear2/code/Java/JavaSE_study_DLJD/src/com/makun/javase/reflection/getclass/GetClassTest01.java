package com.makun.javase.reflection.getclass;

import java.util.Date;

// 用于学习使用反射机制，获取一个.class字节码文件
public class GetClassTest01 {
    public static void main(String[] args) throws Exception {
        // 使用Class类的静态方法获取，参数写一个类的全名，返回一个Class引用数据类型
        Class class1 = Class.forName("com.makun.javase.reflection.getclass.User");
        System.out.println(class1);

        // Java中任何一个对象都有的方法
        Class class2 = "我是中国人".getClass();
        Class class3 = "我也是中国人".getClass();
        System.out.println(class2);
        System.out.println(class3);
        System.out.println(class2 == class3);

        // Java语言中任何一种类型，包括基本数据类型 ,它都有.class属性。
        System.out.println(byte.class);
        System.out.println(short.class);
        System.out.println(int.class);
        System.out.println(long.class);
        System.out.println(float.class);
        System.out.println(double.class);
        System.out.println(boolean.class);
        System.out.println(char.class);
        System.out.println(Date.class);
    }
}

// 先创建这个字节码文件的源文件
class User {
    private String name;
    private boolean sex;
}
