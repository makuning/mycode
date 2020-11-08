package com.makun.computer.test;

import com.makun.computer.link.InsertDrawable;
import com.makun.computer.computer.Computer;
import com.makun.computer.module.*;

public class Test01 {
    public static void main(String[] args){
        // 新建一个有两个接口的电脑对象
        Computer computer1 = new Computer(2);
        // 新建一个鼠标对象
        InsertDrawable mouse1 = new Mouse();
        // 新建一个键盘对象
        InsertDrawable keyboard1 = new Keyboard();
        // 新建一个显示器对象
        InsertDrawable display1 = new Display();
        // 新建一个打印机对象
        InsertDrawable printer1 = new Printer();


        // 更改电脑接口数量
        computer1.modLink();
        // 拔掉所有的接口
        computer1.outLint();
        // 将鼠标连接在电脑上
        computer1.link(mouse1);
        // 将鼠标拔掉
        computer1.outLint(mouse1);
        // 将键盘连接在电脑上
        computer1.link(keyboard1);
        // 更改接口数量
        computer1.modLink();
        // 断开所有接口
        computer1.outLint();
        // 更改接口数量
        computer1.modLink();
        // 连接鼠标
        computer1.link(mouse1);
        // 连接键盘
        computer1.link(keyboard1);
        // 连接显示器
        computer1.link(display1);
        // 连接打印机
        computer1.link(printer1);
        // 断开鼠标
        computer1.outLint(mouse1);
        // 断开键盘
        computer1.outLint(keyboard1);
        // 断开显示器
        computer1.outLint(display1);
        // 断开打印机
        computer1.outLint(printer1);
        // 输出计算机有几个接口
        System.out.println("宁的计算机有" + computer1.getInser().length + "个接口。");

    }
}
