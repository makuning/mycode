package com.makun.javase.array.homework.hotelmanagement;


// 负责测试酒店管理系统程序
public class Test01 {
    public static void main(String[] args) {
        // 新建一个酒店管理员，名字叫马昆，其他的先为空
        HotelReceptionist hotelReceptionist1 = new HotelReceptionist("马昆",null);
        // 新建一个房间二维数组，用来装房间，以建造酒店
        Room[][] rooms = new Room[5][10];

        // 因为这时候酒店是空的，房间是空的，所以要让酒店不是空的，给这个二维数组new房间（这里出错了，找了好久）
        for (int i = 0 ; i < rooms.length ; i++) {
            for (int j = 0 ; j < rooms[i].length ; j++) {
                rooms[i][j] = new Room();
            }
        }

        // 新建一个酒店
        Hotel hotel1 = new Hotel(rooms);
        // 新建一个酒店管理系统，并连接上酒店
        HotelManage01 hotelManage011 = new HotelManage01(hotel1);
        // 把酒店管理系统给管理员
        hotelReceptionist1.setManagement(hotelManage011);


        // 查看酒店房间情况
        hotelReceptionist1.getManagement().lookOverStatus();

        // 自定义分割线
        MyTool.outputDivide();
        // 订房（1楼的2号房间）
        hotelReceptionist1.getManagement().roomReservation(1,2);
        // 订房（2楼的3号房间）
        hotelReceptionist1.getManagement().roomReservation(2,3);
        // 订房（3楼的10号房间）
        hotelReceptionist1.getManagement().roomReservation(3,10);
        // 订房（3楼的4号房间）
        hotelReceptionist1.getManagement().roomReservation(3,4);
        // 订房（3楼的4号房间，已被订的情况）
        hotelReceptionist1.getManagement().roomReservation(3,4);
        // 自定义分割线
        MyTool.outputDivide();

        // 查看酒店房间情况
        hotelReceptionist1.getManagement().lookOverStatus();

        // 自定义分割线
        MyTool.outputDivide();
        // 退房（1楼的3号房间，已被退房的情况）
        hotelReceptionist1.getManagement().checkOut(1,3);
        // 退房（1楼的2号房间）
        hotelReceptionist1.getManagement().checkOut(1,2);
        // 退房（2楼的3号房间）
        hotelReceptionist1.getManagement().checkOut(2,3);
        // 退房（3楼的10号房间）
        hotelReceptionist1.getManagement().checkOut(3,10);
        // 退房（3楼的4号房间）
        hotelReceptionist1.getManagement().checkOut(3,4);
        // 退房（3楼的4号房间，已被退的情况）
        hotelReceptionist1.getManagement().checkOut(3,4);
        // 自定义分割线
        MyTool.outputDivide();

        // 查看酒店房间情况
        hotelReceptionist1.getManagement().lookOverStatus();
    }
}

class MyTool {
    public static void outputDivide () {
        System.out.println("****************************************************************");
    }
}