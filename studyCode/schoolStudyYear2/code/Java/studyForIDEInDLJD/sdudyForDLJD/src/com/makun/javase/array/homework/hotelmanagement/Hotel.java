package com.makun.javase.array.homework.hotelmanagement;

// 酒店类，由一个Room二维数组组成
public class Hotel {
    // 由二维房间组成
    private Room[][] rooms;

    // 给每个房间编号的方法，由构造方法调用
    public void setFloorAndIndex () {
        // 外循环找到这个酒店的每个楼层（Room二维数组保存的一维数组）
        for (int i = 0 ; i < this.rooms.length ; i++) {
            // 内层循环找到当前楼层的每个房间（Room二维数组保存的一维数组中保存的房间对象）
            for (int j = 0 ; j < this.rooms[i].length ; j++) {
                //已经找到每个房间，设置房间号
                this.rooms[i][j].setFloor(i + 1);
                this.rooms[i][j].setIndex(j + 1);
            }
        }
    }


    // 构造方法
    public Hotel (Room[][] rooms) {
        this.rooms = rooms;
        // 调用给房间编号方法
        this.setFloorAndIndex();
    }

    // set、get方法
    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
}
