package com.makun.javase.reflection.doclass;

// 用于研究Class对象的forName方法做了什么
// forName它会返回一个class文件的地址，代表一个类，还会执行这个类的静态代码块中的内容
// 所以：如果只想执行一个类中的静态代码块中的内容就可以使用这个forName
// 之前学过，在new对象的时候也会执行这个类的静态代码块中的内容
// 一个类可以有多个静态代码块，静态代码块中的内容会从上至下依次执行
public class WhatForNameDoTest01 {
    public static void main(String[] args) {
        // 调用Class类的静态方法forName方法，来执行Customer静态代码块中的内容
        try {
            Class.forName("com.makun.javase.reflection.doclass.Customer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// 创建一个Customer对象
class Customer {
    // 属性（成员变量）
    private String name;
    private boolean sex;
    public static final String TYPE = "客户";

    // 静态代码块
    static {
        System.out.println("这是[" + Customer.TYPE + "]静态代码块的第一块");
    }

    static {
        System.out.println("这是[" + Customer.TYPE + "]静态代码块的第二块");
    }

    static {
        System.out.println("这是[" + Customer.TYPE + "]静态代码块的第三块");
    }

    static {
        System.out.println("这是[" + Customer.TYPE + "]静态代码块的第四块");
    }

    static {
        System.out.println("这是[" + Customer.TYPE + "]静态代码块的第五块");
    }

    // 重写同String方法
    @Override
    public String toString() {
        return "这是一个[" + Customer.TYPE + "]，姓名[" + this.getName() + "],性别[" + (this.isSex() ? "男" : "女") + "]";
    }

    // 构造方法
    public Customer() {

    }

    public Customer(String name,boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    // set And get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}