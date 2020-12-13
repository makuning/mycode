package com.makun.javase.thread.threadsafe;

// 线程安全测试程序
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        // 创建一个银行账户
        Account account1 = new Account("马昆",1000D);
        // 创建两个线程，并让这两个线程操作这个银行账户
        Thread thread1 = new Thread(new MyThread(true,account1));
        Thread thread2 = new Thread(new MyThread(true,account1));

        // 设置线程名字
        thread1.setName("取款线程1");
        thread2.setName("取款线程2");

        // 启动线程
        thread1.start();
        thread2.start();
    }
}

// 创建一个类，去实现可运行接口
class MyThread implements Runnable {
    // 标志
    private boolean run = true;
    // 定义一个账户类，能多线程操作同一个账户对象
    private Account account;

    @Override
    public void run() {
        if(run) {
            // 如果标志变量表示能够运行，那么就进行扣款操作
            account.drawMoney(1000);
        } else {
            // 如果标志变量表示不能够运行，那么就结束run方法
            return;
        }
    }

    // 构造方法
    public MyThread(boolean run, Account account) {
        this.run = run;
        this.account = account;
    }

    // set And get

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}