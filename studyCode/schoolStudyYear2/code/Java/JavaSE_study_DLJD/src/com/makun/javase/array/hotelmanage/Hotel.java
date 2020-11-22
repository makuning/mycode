package com.makun.javase.array.hotelmanage;

// 酒店类（由多个Room组成）
public class Hotel {
    // 楼层数
    private int floorNum;
    // 每层的房间数
    private int floorRoomNum;
    // 有一个Room二维数组
    private Room[][] rooms = new Room[floorNum][floorRoomNum];
    // 有一个酒店管理员
    private HotelManager hotelManager;
    // 有很多用户（用户数与Room数对应）
    private User[][] users = new User[floorNum][floorRoomNum];

    // 构造方法
    public Hotel () {
        // 默认新建一个 5 楼，每层有 10 个房间的酒店
        this.floorNum = 5;
        this.floorRoomNum = 10;


        // 新建房间框架
        this.setRooms(this.floorNum,this.floorRoomNum);
        // 给房间值（避免空的引用）
        for (int i = 0; i < this.rooms.length; i++) {
            for (int j = 0; j < this.rooms[i].length; j++) {
                // 房间号就等于楼层号乘以100加房间当前楼层的子房间号
                int roomNum = (i + 1) * 100 + (j + 1);
                // 以六层为单位，这六层中的第一层是单人小床间，
                // 然后依次单人大床间，双人小床间，三人小床间，单人豪华间，双人豪华间
                if ((i % 6) == 0) {
                    this.rooms[i][j] = new Room(roomNum,false,"单人小床间",null);
                } else if ((i % 6) == 1) {
                    this.rooms[i][j] = new Room(roomNum,false,"单人大床间",null);
                } else if ((i % 6) == 2) {
                    this.rooms[i][j] = new Room(roomNum,false,"双人小床间",null);
                } else if ((i % 6) == 3) {
                    this.rooms[i][j] = new Room(roomNum,false,"三人小床间",null);
                } else if ((i % 6) == 4) {
                    this.rooms[i][j] = new Room(roomNum,false,"单人豪华间",null);
                } else {
                    this.rooms[i][j] = new Room(roomNum,false,"双人豪华间",null);
                }
            }
        }
    }

    public Hotel (int floorNum,int floorRoomNum) {
        this.floorNum = floorNum;
        this.floorRoomNum = floorRoomNum;

        this.setRooms(this.floorNum,this.floorRoomNum);

        for (int i = 0; i < this.rooms.length; i++) {
            for (int j = 0; j < this.rooms[i].length; j++) {
                // 房间号就等于楼层号乘以100加房间当前楼层的子房间号
                int roomNum = (i + 1) * 100 + (j + 1);
                // 以六层为单位，这六层中的第一层是单人小床间，
                // 然后依次单人大床间，双人小床间，三人小床间，单人豪华间，双人豪华间
                if ((i % 6) == 0) {
                    this.rooms[i][j] = new Room(roomNum,false,"单人小床间",null);
                } else if ((i % 6) == 1) {
                    this.rooms[i][j] = new Room(roomNum,false,"单人大床间",null);
                } else if ((i % 6) == 2) {
                    this.rooms[i][j] = new Room(roomNum,false,"双人小床间",null);
                } else if ((i % 6) == 3) {
                    this.rooms[i][j] = new Room(roomNum,false,"三人小床间",null);
                } else if ((i % 6) == 4) {
                    this.rooms[i][j] = new Room(roomNum,false,"单人豪华间",null);
                } else {
                    this.rooms[i][j] = new Room(roomNum,false,"双人豪华间",null);
                }
            }
        }
    }

    // 重写toString方法

    @Override
    public String toString() {
        return "这是一栋[" + this.floorNum + "]层，并且每层有[" + this.floorRoomNum + "]个房间的酒店。";
    }


    // set、get方法

    public int getFloorNum() {
        return floorNum;
    }

    public int getFloorRoomNum() {
        return floorRoomNum;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public HotelManager getHotelManager() {
        return hotelManager;
    }

    public User[][] getUsers() {
        return users;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public void setFloorRoomNum(int floorRoomNum) {
        this.floorRoomNum = floorRoomNum;
    }

    // 重建房间
    public void setRooms(int floorNum,int floorRoomNum) {
        // 设置一个变量，表示酒店是否为空（假设为空）
        boolean isHotelNull = true;
        // 确认房间是否都为空
        for (int i = 0; i < this.rooms.length; i++) {
            for (int j = 0; j < this.rooms[i].length; j++) {
                if (this.rooms[i][j].isStatus()) {
                    // 当房间状态为空，即表示房间被占，那么酒店就不为空
                    isHotelNull = false;
                }
            }
        }

        if (isHotelNull) {
            // 如果酒店为空，就重建酒店
            this.rooms = new Room[floorNum][floorRoomNum];
            this.users = new User[floorNum][floorRoomNum];
        } else {
            // 如果酒店不为空，就输出提示信息
            System.out.println("酒店的房间还有人在使用！");
        }


    }

    public void setHotelManager(HotelManager hotelManager) {
        this.hotelManager = hotelManager;
    }

}
