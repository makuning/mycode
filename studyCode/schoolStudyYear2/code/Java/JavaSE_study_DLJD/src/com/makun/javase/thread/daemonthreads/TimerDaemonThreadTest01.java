package com.makun.javase.thread.daemonthreads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

// 用于对守护线程，以及定时器的理解
// 这个程序是，单独开了一个守护线程，然后在这个守护线程又开了一个定时任务线程，来定时备份
public class TimerDaemonThreadTest01 {
    public static void main(String[] args) {
        // 创建线程对象
        Backups backups = new Backups();

        // 创建线程
        Thread thread = new Thread(backups);

        // 将这个线程设为守护线程（必须先设置再启动！！！）
        thread.setDaemon(true);

        // 启动线程
        thread.start();

        // main线程等待
        try {
            Thread.sleep(1000 * 20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "线程结束了！！！");
    }
}


// 定义一个守护线程线程，用来备份的线程（这里并没有备份功能）
class Backups implements Runnable {

    @Override
    public void run() {
        // 创建一个定时器
        Timer timer = new Timer();
        // 创建一个系统当前时间
        Date start = new Date();
        // 使用定时器的方法（为...安排时间），从一个时间开始，每隔多久执行一次TimerTask（定时任务）
        timer.schedule(new BackupsDo(),start,1000 * 2);
    }
}

// 创建一个TimerTask（定时任务）
class BackupsDo extends TimerTask {

    @Override
    public void run() {
        // 更改TimerTask线程的名字
        Thread.currentThread().setName("备份线程：");
        // 获取当前系统时间
        Date date = new Date();
        // 创建一个日期格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss SSSS毫秒");
        String time = sdf1.format(date);

        System.out.println(Thread.currentThread().getName() + "在[" + time + "]备份成功");
    }
}