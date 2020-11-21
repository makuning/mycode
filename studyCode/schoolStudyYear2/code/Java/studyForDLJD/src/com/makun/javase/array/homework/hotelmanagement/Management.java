package com.makun.javase.array.homework.hotelmanagement;
/*
    5、系统应该对外提供的功能:
    可以预定房间:用户输入房间编号，订房。
    可以退房:用户输入房间编号，退房。
    可以查看所有房间的状态:用户输入某个指令应该可以查看所有房间状态。
*/

// 接口，负责定义管理系统需要的方法
public interface Management {
    // 预定房间编号，订房
    public abstract void roomReservation (int floor,int index);
    // 输入房间编号退房
    public abstract void checkOut (int floor,int index);
    // 查看所有房间的状态
    public abstract void lookOverStatus ();
}
