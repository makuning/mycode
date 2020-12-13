package com.makun.javase.thread.synchronizeduse;

// 用于对synchronized的三种使用方法的理解
public class SynchronizedUseTest01 {
    public static void main(String[] args) {

    }
}

// 创建一个User类
class User {
    // 定义一个共享类
    private static Object obj = new Object();
    // 有一个名字
    private String name;
    // 有一个实例方法：干饭（给实例方法使用同步，锁的是当前对象）
    public synchronized void eat() {
        System.out.println(this.getName() + "正在干饭！");
    }
    // 有一个静态方法，用户的描述（给静态方法使用同步，锁的是这个类）
    public synchronized static void introduce() {
        System.out.println("用户都有一双眼睛，一对耳朵，一个嘴巴，一双手，一双脚，一个鼻子。");
    }
    // 有一个静态方法：学习（给代码块使用同步，锁的是obj对象）
    public static void study() {
        synchronized (obj) {
            System.out.println("用户会学习。");
        }

    }

    // 构造方法

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    // set and get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
