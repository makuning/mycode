package com.makun.javase.exception.userregistered;


// 注册异常
public class MyRegisterException extends Exception {
    // 两个构造方法
    public MyRegisterException () {
        super();
    }
    public MyRegisterException (String massage) {
        super(massage);
    }
}
