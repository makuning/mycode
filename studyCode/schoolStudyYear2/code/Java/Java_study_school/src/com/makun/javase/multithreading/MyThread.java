package com.makun.javase.multithreading;

public class MyThread extends Thread {
    private int count = 10;
    private String name;
    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(count > 0) {
            synchronized (this) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(name + "取了1块钱，还剩[" + (--count) + "]元。");
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
