package com.makun.javase.thread.waitandnotify;

import java.util.ArrayList;

// 用于对Object类中wait方法和notify方法的学习
/*
* 自我描述：
* wait()方法和notify()方法都是Object类中的方法，所以每个Java对象都有这两个方法
* wait方法会让正在当前对象上活跃的线程处于等待状态，并打开当前对象的对象锁
* notify方法会唤醒正在当前对象上等待的线程，不会管当前对象的对象锁，如果有线程被唤醒进入了这个对象，会自己锁上这个对象的对象锁
* 除此之外还有一个notifyAll()方法，表示唤醒当前对象上所有处于等待的线程
* 注意：因为它需要使用锁机制，所以配合 synchronized 使用
*
* 有了这两个机制，那么我们就可以制作一个生产者、消费者的程序，
* 有两个线程，一个仓库，
* 一个线程是消费仓库中的东西的，将仓库消费空后，就不再消费，进入等待状态，告诉生产线程可以生产了
* 一个线程是生产仓库中的东西的，将仓库装满后，就不再生产，进入等待状态，告诉生产线程可以生产了
* 这个仓库可以看作是一个集合
* 消费可以看作是：取得集合中的元素，然后再删除集合中的这个元素
* 生产可以看作是：向集合中添加元素
* */
public class WaitAndNotifyTest01 {
    public static void main(String[] args) {
        // 创建一个集合仓库
        ArrayList<Object> arrayList = new ArrayList<>();
        // 创建生产线程和消费线程
        Produce produce = new Produce(arrayList);
        Consume consume = new Consume(arrayList);
        Thread thread1 = new Thread(produce);
        Thread thread2 = new Thread(consume);

        // 设置线程为守护线程
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        // 启动线程
        thread1.start();
        thread2.start();

        // 主线程休息一会儿
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// 定义一个线程（生产线程）
class Produce implements Runnable {
    // 传入仓库（集合）
    private ArrayList<Object> hub;

    @Override
    public void run() {
        // 一直生产
        while(true) {
            // 往仓库中塞元素（塞元素的时候别的线程不能操作这个仓库）
            synchronized (hub) {
                // 如果仓库中的元素是10个，那么就不装了
                if(hub.size() == 10) {
                    // 线程进入等待状态
                    try {
                        hub.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 如果仓库没有满那么就可以塞元素
                Object obj = new Object();
                hub.add(obj);
                // 更改当前线程名
                Thread.currentThread().setName("生产线程");
                // 输出提示信息
                System.out.println(Thread.currentThread().getName() + "生产了一个数据：" + obj);
                // 每次更新了数据就唤醒这个仓库的线程
                hub.notify();
            }
        }

    }

    // 构造方法

    public Produce(ArrayList<Object> arrayList) {
        this.hub = arrayList;
    }

    // set And get

    public ArrayList<Object> getArrayList() {
        return hub;
    }

    public void setArrayList(ArrayList<Object> arrayList) {
        this.hub = arrayList;
    }
}

// 定义一个线程（消费线程）
class Consume implements Runnable {
    // 传入仓库（集合）
    private ArrayList<Object> hub;

    @Override
    public void run() {
        // 一直消费
        while(true) {
            // 从仓库中拿元素（拿元素的时候别的线程不能操作这个仓库）
            synchronized (hub) {
                // 如果仓库中的元素是0个，那么就不拿了
                if (hub.size() == 0) {
                    // 线程进入等待状态
                    try {
                        hub.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 如果仓库没有空那么就可以拿元素（拿最末尾的元素）
                Object obj =  hub.get(hub.size() - 1);
                // 删除这个最末尾的元素
                hub.remove(hub.size() - 1);
                // 更改当前线程名
                Thread.currentThread().setName("消费线程");
                // 输出提示信息
                System.out.println(Thread.currentThread().getName() + "消费了一个数据：" + obj);
                // 每次更新了数据就唤醒这个仓库的线程
                hub.notify();
            }
        }

    }

    // 构造方法

    public Consume(ArrayList<Object> arrayList) {
        this.hub = arrayList;
    }

    // set And get

    public ArrayList<Object> getArrayList() {
        return hub;
    }

    public void setArrayList(ArrayList<Object> arrayList) {
        this.hub = arrayList;
    }
}