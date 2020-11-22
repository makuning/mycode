package com.makun.javase.array.hotelmanage;

// 管理系统（设置为一个接口，需要去实现）
public interface Management {
    // 订房
    public abstract void reservation (int roomNum,User user);

    // 退房
    public abstract void checkOut (int roomNum,User user);

    // 查房
    public abstract void checkRooms ();

}

// 酒店管理系统0.1（实现管理系统接口）
class HotelManagement implements Management {
    // 管理一个酒店
    private Hotel hotel;


    @Override
    public void reservation(int roomNum,User user) {
        // 房间的楼层
        int floorNum = roomNum / 100 - 1;
        // 房间在当前楼层的索引号
        int floorRoomNum = roomNum % 100 - 1;

        // 找到房间号，如果没被占，则改变房间状态，然后和用户进行绑定
        if (!(this.hotel.getRooms()[floorNum][floorRoomNum].isStatus())) {
            // 改变房间状态
            this.hotel.getRooms()[floorNum][floorRoomNum].setStatus(true);
            // 绑定用户
            this.hotel.getRooms()[floorNum][floorRoomNum].setUser(user);
            System.out.println(this.hotel.getRooms()[floorNum][floorRoomNum] + "：订房成功！");
        } else {
            System.out.println("房间已经被占了！");
        }
    }

    @Override
    public void checkOut(int roomNum,User user) {
        // 房间的楼层
        int floorNum = roomNum / 100 - 1;
        // 房间在当前楼层的索引号
        int floorRoomNum = roomNum % 100 - 1;

        // 先判断房间是否被占，再判断是不是这个用户的房间
        if (this.hotel.getRooms()[floorNum][floorRoomNum].isStatus()) {
            if (user.getId().equals(this.hotel.getRooms()[floorNum][floorRoomNum].getUser().getId())) {
                // 将房间状态改为空闲
                this.hotel.getRooms()[floorNum][floorRoomNum].setStatus(false);
                // 与用户解除绑定
                this.hotel.getRooms()[floorNum][floorRoomNum].setUser(null);
                System.out.println(this.hotel.getRooms()[floorNum][floorRoomNum] + "：退房成功！");
            } else {
                System.out.println("这不是您的房间！");
            }
        } else {
            System.out.println("房间已经退房了！");
        }
    }

    @Override
    public void checkRooms() {

        // 遍历在控制台打印房间信息
        for (int i = 0; i < this.hotel.getRooms().length; i++) {
            for (int j = 0; j < this.hotel.getRooms()[i].length; j++) {
                // 输出当前房间，并用制表符
                System.out.print(this.hotel.getRooms()[i][j] + "\t");
            }
            // 每输出一层换个行
            System.out.print("\n");
        }
    }


    // set、get方法
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}