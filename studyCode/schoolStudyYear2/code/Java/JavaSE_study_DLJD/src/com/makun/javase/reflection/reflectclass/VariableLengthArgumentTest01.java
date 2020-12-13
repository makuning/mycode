package com.makun.javase.reflection.reflectclass;

// 可变长参数的学习
/*
* 可变长参数：
* 格式
* 修饰符 返回值 方法名(参数类型... 参数名 ) {代码块;}
* 在方法形参中使用 参数类型... 就好
* 注意：
* 1、一定是类型后加三个点
* 2、这个可变长参数必须是形参列表的最后一个，因此，一个方法中只能有一个可变长参数
* 3、可变长参数可以看作是一个数组，传入一个数组也是没有问题的
* */
public class VariableLengthArgumentTest01 {
    public static void main(String[] args) {
        String[] strings = {"我","是","一","个","中","国","人"};
        // 调用第一个方法
        VariableLengthArgumentTest01.m1(strings);
        VariableLengthArgumentTest01.m1("我是","一个","中国","人","，我非常的骄傲");

        // 调用第二个方法
        VariableLengthArgumentTest01.m2(12345,strings);
        VariableLengthArgumentTest01.m2(12345,"我是","一个","中国","人","，我非常的骄傲,","啊哈哈哈哈！");
    }

    // 定义一个只有 可变长参数 的方法
    public static void m1(String... args) {
        for(String arg : args) {
            System.out.println(arg);
        }
    }

    // 定义一个有 其他参数 并且有 可变长参数 的方法
    public static void m2(int flag,String... args) {
        System.out.println("代号：" + flag);
        StringBuilder stringBuilder = new StringBuilder();
        for(String arg : args) {
            stringBuilder.append(arg);
        }
        System.out.println(stringBuilder);
    }
}
