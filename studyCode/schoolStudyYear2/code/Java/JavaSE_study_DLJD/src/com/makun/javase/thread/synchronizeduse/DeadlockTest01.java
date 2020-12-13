package com.makun.javase.thread.synchronizeduse;

// 死锁
/*
* 自我描述1（错误）：
* 在一个类中，有两个方法，
* 线程一先执行第一个方法，再执行第二个方法
* 线程二先执行第二个方法，再执行第一个方法
* 如果线程一执行第一个方法，和线程二执行第二个方法同时进行了
* 线程一想要执行第二个方法，但是被线程二占住了，
* 线程二想要执行第一个方法，但是却被线程一占住了，这就陷入了僵局，变成了死锁
* 如果这两个方法的锁，锁的是同一个共享对象，那么没有问题，但是方法一和方法二锁的不是同一个共享对象，就会出问题
*
* 自我描述2（较好思路）
* 有两个线程，有两个对象，
* 第一个线程是先锁第一个对象，再锁第二个对象
* 第二个线程是先锁第二个对象，再锁第一个对象
* 这样就会出现一种尴尬的情况：
* 如果这两个线程在一起执行的过程中，其中
* 第一个线程将第一个对象锁住了，但是想进入第二个对象的时候却被第二个线程锁住了
* 同样，第二个线程将第二个对象锁住了，想进入第一个对象，但是却被第一个线程锁住了
* 这样就陷入了僵局，两个线程都在锁池中找锁，都找不到，就会形成锁池。
* */
public class DeadlockTest01 {
    public static void main(String[] args) {
        // 创建这两个Object对象
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 创建这两个线程
        MyThread1 myThread1 = new MyThread1(obj1,obj2);
        MyThread2 myThread2 = new MyThread2(obj1,obj2);

        // 设置线程的名字
        myThread1.setName("线程壹");
        myThread2.setName("线程贰");

        // 启动这两个对象
        myThread1.start();
        myThread2.start();
    }
}

// 创建一个线程类
class MyThread1 extends Thread {
    private Object obj1;
    private Object obj2;

    @Override
    public void run() {
        // 先锁obj1，再锁obj2
        synchronized (obj1) {
            System.out.println(this.getName() + "锁住了第一个对象");
            synchronized (obj2) {
                System.out.println(this.getName() + "锁住了第二个对象");
            }
        }
    }

    // 构造方法
    public MyThread1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // set And get

    public Object getObj1() {
        return obj1;
    }

    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    public Object getObj2() {
        return obj2;
    }

    public void setObj2(Object obj2) {
        this.obj2 = obj2;
    }
}

// 创建一个线程类
class MyThread2 extends Thread {
    private Object obj1;
    private Object obj2;

    @Override
    public void run() {
        // 先锁obj2，再锁obj1
        synchronized (obj2) {
            System.out.println(this.getName() + "锁住了第二个对象");
            synchronized (obj1) {
                System.out.println(this.getName() + "锁住了第一个对象");
            }
        }
    }

    // 构造方法
    public MyThread2(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // set And get

    public Object getObj1() {
        return obj1;
    }

    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    public Object getObj2() {
        return obj2;
    }

    public void setObj2(Object obj2) {
        this.obj2 = obj2;
    }
}