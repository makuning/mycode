package com.makun.javase.array.hotelmanage;

// 酒店房间类
public class Room {
    // 有房间号
    private int roomNum;
    // 有房间状态（空闲:false，被占:true）
    private boolean status;
    // 有房间类型（单人小床间，单人大床间，双人小床间，三人小床间，单人豪华间，双人豪华间）
    private String type = "未知的类型";
    // 有一个用户
    private User user;

    // 构造方法
    public Room () {

    }

    public Room (int roomNum,boolean status,String type,User user) {
        this.roomNum = roomNum;
        this.status = status;
        this.type = type;
        this.user = user;
    }

    // 重写toString方法


    @Override
    public String toString() {
        // [房间号:roomNum\t房间类型:type\t房间状态:status]
        if (user == null) {
            return "[房间号:" + roomNum + "\t房间类型:" + type + "\t房间状态:" + (status ? "被占" : "空闲") + "\t用户名:无用户]";
        } else {
            return "[房间号:" + roomNum + "\t房间类型:" + type + "\t房间状态:" + (status ? "被占" : "空闲") + "\t用户名:" + user.getName() + "]";
        }
    }

    // set、get方法
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public boolean isStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }
}
