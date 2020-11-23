package com.makun.javase.exception.userregistered;

import java.util.Scanner;

// 用户注册测试程序
public class UserServiceTest01 {
    public static void main(String[] args) {
        // new一个输入捕获对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        // 打印提示信息
        System.out.println("*********************************欢迎进入用户注册系统*********************************");

        // 用来装用户信息的变量
        String userName;
        String passWord;

        System.out.print("请输入用户名:");
        // 捕获
        userName = s.next();

        System.out.print("请输入密码:");
        // 捕获
        passWord = s.next();

        // 调用用户注册方法 并 try..catch 进行捕捉
        try {
            UserService.register(userName,passWord);
        } catch (MyRegisterException e) {
            // 打印堆栈错误信息
            e.printStackTrace();
        }
    }

}
