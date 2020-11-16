package com.makun.javase.array.homework.hotelmanagement;
/*
* 3、酒店中的每一一个房间应该是-一个java对象: Room
* 4、每一个房间Room应该有房间编号、房间类型、房间是否空闲.*/

// 房间类
public class Room {
    // 房间编号，编号是楼层和索引
    private int floor;
    private int index;
    // 房间类型：用字符串表示，分为三种，豪华，中等，普通
    private String type;
    // 房间是否空闲
    private boolean isLeisure;

    // 构造方法
    public Room () {
        this.type = "普通";
        // 房间是空闲的
        this.isLeisure = true;
    }

    public Room (int floor,int index,String type,boolean isLeisure) {
        this.floor = floor;
        this.index = index;
        this.type = type;
        this.isLeisure = isLeisure;
    }

    // set、get方法
    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIsLeisure(boolean isLeisure) {
        this.isLeisure = isLeisure;
    }

    public boolean getIsLeisure() {
        return isLeisure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
