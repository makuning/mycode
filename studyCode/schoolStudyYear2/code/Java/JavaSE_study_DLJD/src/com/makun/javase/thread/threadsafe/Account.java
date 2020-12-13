package com.makun.javase.thread.threadsafe;

public class Account {
    // 账号
    private  String identification;
    // 余额
    private double balance;

    // 线程安全的取款方法，使用线程同步
    public void drawMoney(double money) {
        // 这里写需要同步的代码块
        synchronized (this) {
            // 判断余额是否充足
            double result = this.getBalance() - money;
            if(result < 0) {
                System.out.println("余额不足，无法取出！余额还剩：" + this.getBalance());
            } else {
                try {
                    Thread.sleep(1000 * 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.setBalance(result);
                System.out.println(this.getIdentification() + "取款成功！余额还剩：" + this.getBalance());
            }
        }
    }

    // 重写父类方法

    @Override
    public String toString() {
        return "用户名[" + identification + "]，余额[" + balance + "]";
    }


    // 构造方法

    public Account() {
    }

    public Account(String identification, double balance) {
        this.identification = identification;
        this.balance = balance;
    }

    // set And get

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
