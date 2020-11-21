package com.makun.javase.innerclass;

/*
    MyMath类里有很多运算方法，里面的方法是通过传参数然后得出结果，其中，计算部分通过Computer接口
    连接其他类来实现这个运算过程然后的到一个答案，等于说，，MyMath是一个得到答案的类，怎么得到答案
    的他不管，他只要得到答案，计算答案的过程由Computer的实现类来完成
    匿名内部类算是掌握了
*/

public class InnerClassTest01 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        Computer c1 = new ComputerFunc1();
        Computer c2 = new ComputerFunc2();
        // 使用实现方法1
        mm.sum(c1,10,20);
        // 使用实现方法2
        mm.sum(c2,10,30);
        // 使用局部内部类中的匿名类（不建议）
        mm.sum(new Computer() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },50,66);
    }
}

class MyMath {
    public void sum (Computer com,int a,int b) {
        int result = com.sum(a,b);
        String str = a + "+" + b + "=" + result;
        System.out.println(str);
    }
}

interface Computer {
    public int sum (int a,int b);
}

class ComputerFunc1 implements Computer{

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

class ComputerFunc2 implements Computer{

    @Override
    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}