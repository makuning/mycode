package com.makun.javase.array.hotelmanage;

// 用户类（抽象类）
public abstract class User {
    // 用户都有名字
    private String name;
    // 用户都有性别（男为true，女为false）
    private boolean sex;
    // 用户都有ID
    private String id;

    // 构造方法
    public User () {
        this.name = "匿名";
        this.id = "未知";
    }

    public User (String name,boolean sex,String id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    // set、get方法、

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 酒店管理员用户类（继承用户类）
class HotelManager extends User {
    // 酒店管理员有一个酒店管理系统
    private Management management;


    // 构造方法
    public HotelManager () {
        super();
    }

    public HotelManager (String name,boolean sex,String id,Management management) {
        super(name,sex,id);
        this.management = management;
    }

    // set、get方法

    public void setManagement(Management management) {
        this.management = management;
    }

    public Management getManagement() {
        return management;
    }
}

// 顾客类（继承用户类）
class Customer extends User {
    // 顾客有一个房间
    private Room room;

    // 构造方法
    public Customer () {
        super();
    }

    public Customer (String name,boolean sex,String id,Room room) {
        super(name,sex,id);
        this.room = room;
    }

    // 重写toString方法

    @Override
    public String toString() {
        return "[姓名:" + this.getName() + "\t性别:" + (this.isSex() ? "男" : "女") + "\tID:" + this.getId() + "]";
    }


    // set、get方法

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }
}
