package com.makun.javase.iostream.serialize;

import java.io.Serializable;

// 新建一个可以序列化的User类
public class User implements Serializable {
    // 手动定义一个序列号
    private static final long serialVersionUID = 20010624L;

    // 随便添加的属性，测试序列号是否在发挥作用（发挥了作用）
    /*
    * 自动序列号，如果修改了序列化对象的源代码，那么这个对象序列化文件就读不出来了，Java虚拟机它会认为那两个对象是不同的类
    * 手动序列号，就算修改了序列化对象的源代码，Java虚拟机它也会知道这两个对象是一个类的，所以能够反序列化出来*/
    public String test; public String test2;

    // 姓名
    private String name;
    // 性别
    private boolean sex;
    // 年龄
    private int age;
    // 手机号
    private String phoneNum;
    // 地址
    private String address;
    // 是否喜欢Java
    // transient关键字表示游离的，不参与序列化。
    private transient boolean isLikeJava; // isLikeJava不参序列化操作!

    // 构造方法
    public User() {
    }

    public User(String name, boolean sex, int age, String phoneNum, String address, boolean isLikeJava) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNum = phoneNum;
        this.address = address;
        this.isLikeJava = isLikeJava;
    }

    // 干饭方法
    public void eat() {
        System.out.println("一位 [" + this.getAge() + "] 叫做 [" + this.getName() + "] " +
                "的 [" + (this.isSex() ? "男同志" : "女同志") + "] 正在 [" + this.getAddress() + "] 干饭！！！");
    }

    // 重写父类方法
    // toString

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", isLikeJava=" + isLikeJava +
                '}';
    }


    // set And get

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isLikeJava() {
        return isLikeJava;
    }

    public void setLikeJava(boolean likeJava) {
        isLikeJava = likeJava;
    }
}
