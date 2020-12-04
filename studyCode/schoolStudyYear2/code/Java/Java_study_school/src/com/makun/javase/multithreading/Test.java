package com.makun.javase.multithreading;

public class Test {
    public static void main(String[] args) {
        MyThread p1 = new MyThread("张三");
        MyThread p2 = new MyThread("里斯");
        MyThread p3 = new MyThread("王五");
        MyThread p4 = new MyThread("李六");
        MyThread p5 = new MyThread("大顺");
        MyThread p6 = new MyThread("狗子");

        MyThread1 m = new MyThread1();


        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        Thread t6 = new Thread(p6);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        t1.setPriority(10);
        t5.setPriority(1);





        m.start();
        try {
            m.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
