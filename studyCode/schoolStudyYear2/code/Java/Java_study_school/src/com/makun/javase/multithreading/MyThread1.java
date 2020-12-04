package com.makun.javase.multithreading;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            synchronized (this) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(i);
            }
        }
    }
}
