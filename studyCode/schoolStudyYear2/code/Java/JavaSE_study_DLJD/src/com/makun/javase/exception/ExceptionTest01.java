package com.makun.javase.exception;

/*
* 对异常的学习*/
public class ExceptionTest01 {
    public static void main(String[] args) {
        // 定义一个被除数和一个除数
        int num1 = 10;
        int num2 = 0;

        // 用来装结果
        int result = 0;

        // 调用可能会出错的方法（编译时异常）
        // 用try..catch抓住异常
        try {
            result = ExceptionTest01.method(num1,num2);
        } catch (MyException e) {
            // 打印堆栈错误信息（常用，【详细】）
            e.printStackTrace();
            // 打印错误信息
            System.out.println(e.getMessage());
        } finally {
            // 不管try出没出错，都会执行
            System.out.println(result);
        }

        System.out.println(result);

    }

    // 创建一个会发生异常的方法（两int数字相除）
    public static int method (int num1,int num2) throws MyException {
        if (num2 == 0) {
            // 如果除数为零，则创建异常对象，并抛出
            throw new MyException("除数不能为零！");
        } else {
            return num1 / num2;
        }
    }
}

// 自定义一个异常类
// 继承Exception（编译时异常）
class MyException extends Exception {
    // 两个构造方法
    // 无参
    public MyException () {
        super();
    }
    // 有参(调用父类的有参，传入一个错误信息【字符串】)
    public MyException (String massage) {
        super(massage);
    }
}