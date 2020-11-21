package com.makun.javase.array.homework.hotelmanagement;
/*
* 为某个酒店编写程序:酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
* 5、系统应该对外提供的功能:
* 可以预定房间:用户输入房间编号，订房。
* 可以退房:用户输入房间编号，退房。
* 可以查看所有房间的状态:用户输入某个指令应该可以查看所有房间状态。*/

// 实现管理接口Management的第一个系统
public class HotelManage01 implements Management {
    // 这个管理系统，管理一个酒店
    private Hotel hotel;

    // 构造方法
    public HotelManage01 (Hotel hotel) {
        this.hotel = hotel;
    }

    // 实现订房功能
    @Override
    public void roomReservation(int floor, int index) {
        // 如果房间已经被订了就提示已经定了，未定则定
        if (this.hotel.getRooms()[floor - 1][index - 1].getIsLeisure()) {
            this.hotel.getRooms()[floor - 1][index - 1].setIsLeisure(false);
            System.out.println("订房成功！[楼层：" + floor + "，房间号：" + index + "]");
        } else {
            System.out.println("订房失败！[您选择的房间已经被别人订了]");
        }
    }

    // 实现退房功能
    @Override
    public void checkOut(int floor, int index) {
        // 如果房间已经是空闲的就提示已经退房成功，未退则退
        if (this.hotel.getRooms()[floor - 1][index - 1].getIsLeisure()) {
            System.out.println("已经退房成功了！[楼层：" + floor + "，房间号：" + index + "]");
        } else {
            // 退房后将是否空闲变为true
            this.hotel.getRooms()[floor - 1][index - 1].setIsLeisure(true);
            System.out.println("退房成功！[楼层：" + floor + "，房间号：" + index + "]");
        }
    }

    // 实现查看房间状态功能
    @Override
    public void lookOverStatus() {
        // 使用二维数组遍历，输出每个房间的楼层、索引号，房间类型以及房间是否被订
        // 定义一个字符串对象，方便输出房间的状态，默认值为未知。
        String status = "未知";

        // 遍历找到每个房间，并输出信息
        // 外循环找到这个酒店的每个楼层（Room二维数组保存的一维数组）
        for (int i = 0 ; i < this.hotel.getRooms().length ; i++) {
            // 每要输出一楼就输入提示信息
            System.out.println("-------------------------------------------这是第[" + (i+1) + "]楼的信息------------------------------------------");

            // 内层循环找到当前楼层的每个房间（Room二维数组保存的一维数组中保存的房间对象）
            for (int j = 0 ; j < this.hotel.getRooms()[i].length ; j++) {
                //已经找到每个房间，输出房间信息
                if (this.hotel.getRooms()[i][j].getIsLeisure()) {
                    // 如果当前房间的空闲状态为true就将status改为空闲
                    status = "空闲";
                } else {
                    // 如果当前房间的空闲状态为false就将status改为被订
                    status = "被订";
                }

                // 输出信息
                System.out.println("[楼层：" + this.hotel.getRooms()[i][j].getFloor() +
                        "，房间号：" + this.hotel.getRooms()[i][j].getIndex() + "] 房间类型：" +
                        this.hotel.getRooms()[i][j].getType() + " 当前状态：" + status + "。\t");
            }


        }
    }

    // set、get方法

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
