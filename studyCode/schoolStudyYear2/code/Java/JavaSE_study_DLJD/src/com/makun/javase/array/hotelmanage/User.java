package com.makun.javase.array.hotelmanage;

// 用户类（抽象类）
public abstract class User {
    // 用户都有名字
    // 用户都有性别
    // 用户都有ID
}

// 酒店管理员用户类（继承用户类）
class HotelManager extends User {
    // 酒店管理员有一个酒店管理系统

}

// 顾客类（继承用户类）
class Customer extends User {
    // 顾客有一个房间
}
