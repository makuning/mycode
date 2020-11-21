package com.makun.javase.array.homework.hotelmanagement;
/*
* 前台接待员类，负责使用管理系统*/
public class HotelReceptionist {
    // 有一个名字
    private String name;
    // 有一个管理系统
    private Management management;

    // 构造方法
    public HotelReceptionist () {
        this.name = "匿名";
    }
    public HotelReceptionist (String name,Management management) {
        this.name = name;
        this.management = management;
    }

    // set、get方法

    public void setManagement(Management management) {
        this.management = management;
    }

    public Management getManagement() {
        return management;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
