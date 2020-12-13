package com.makun.javase.thread.daemonthreads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

// 纯定时任务线程
public class TimerThreadTest01 {
    public static void main(String[] args) {
        // 获取系统当前时间
        Date date = new Date();
        // 创建一个定时器
        Timer timer = new Timer();
        // 创建定时器任务（匿名内部类的方式，从系统当前时间开始，每隔5秒执行一次任务），main线程结束了也会在后台备份！
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // 更改当前线程名字
                Thread.currentThread().setName("备份任务：");
                // 获取系统当前时间
                Date date1 = new Date();
                // 创建一个格式
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS毫秒");
                // 将当前时间转化为这个格式
                String time = sdf1.format(date1);
                // 输出
                System.out.println(Thread.currentThread().getName() + "在" + time + "进行了备份。[备份成功！]");
            }
        },date,1000 * 5);

        System.out.println(Thread.currentThread().getName() + "线程结束了。");
    }
}


