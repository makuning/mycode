package com.makun.javase.array.hotelmanage;

import java.util.Scanner;

// 管理系统测试程序
public class ManagementSystemTest01 {
    // 程序入口（main方法）
    public static void main(String[] args) {
        /*
        系统初始化...
         */

        // 新建一个默认的酒店
        Hotel hotel = new Hotel();
        // 新建一个酒店管理系统
        HotelManagement hotelManagement = new HotelManagement();
        // 绑定系统管理的酒店
        hotelManagement.setHotel(hotel);
        // 新建一个酒店管理员
        HotelManager hotelManager = new HotelManager("马昆",true,"20010624",null);
        // 将酒店管理系统绑定到酒店管理员名下
        hotelManager.setManagement(hotelManagement);
        // 将酒店管理员绑定到酒店名下
        hotel.setHotelManager(hotelManager);



        /*
        系统开始执行
        业务提示信息：
            0：退出程序
            1：订房
            2：退房
            3：查房
            4：输入用户
         */
        // 全局用户，每次服务都只服务一个用户
        Customer customer = null;
        // 打印欢迎信息
        System.out.println("欢迎[" + hotel.getHotelManager().getName() + "]使用酒店管理系统！");
        // 业务循环，循环开头需要打印业务提示信息（循环次数不确定，使用while循环）
        Scanner s1 = new Scanner(System.in);
        while (true) {
            if (customer == null) {
                System.out.println("\n\n*****************************当前业务用户：[未选择用户]*****************************");
            } else {
                System.out.println("\n\n*****************************当前业务用户：" + customer + "*****************************");
            }
            // 打印业务提示信息
            System.out.println("业务关键字:\n" + "1、订房\t2、退房\t3、查房\t4、选择用户\t0、退出系统");
            System.out.print("请选择相关业务：");
            // 捕获管理员输入的信息
            int choose = s1.nextInt();

            // 判断输入的关键字是否符合，符合则执行相关业务
            int roomNum;
            if (choose == 1) {
                // 订房业务
                System.out.println("-------订房业务-------");
                while (true) {
                    // 输入房间号
                    System.out.print("请输入房间号：");
                    roomNum = s1.nextInt();

                    // 房间号转酒店楼层数
                    int floorNum = roomNum / 100;
                    int floorRoomNum = roomNum % 100;

                    // 判断房间号
                    if (roomNum < 101) {
                        System.out.println("房间号为一个101以上的正整数。");
                    } else if (floorNum > hotel.getFloorNum() || floorRoomNum > hotel.getFloorRoomNum()) {
                        System.out.println("您输入的房间号不存在！请重新输入");
                    } else if (((roomNum / 100) >= 1) && ((roomNum % 100) >= 1)) {
                        // 判断全局用户是否为空
                        if (customer == null) {
                            System.out.println("您还没有确定用户，请先输入一个用户。");
                            // 结束循环
                            break;
                        } else {
                            // 调用酒店的酒店管理员的管理系统的订房方法
                            hotel.getHotelManager().getManagement().reservation(roomNum,customer);
                            // 结束循环
                            break;
                        }
                    } else {
                        System.out.println("您输入的房间号不存在！请重新输入");
                    }
                }



            } else if (choose == 2) {
                // 退房业务
                System.out.println("-------退房业务-------");
                while (true) {
                    // 输入房间号
                    System.out.print("请输入房间号：");
                    roomNum = s1.nextInt();

                    // 房间号转酒店楼层数
                    int floorNum = roomNum / 100;
                    int floorRoomNum = roomNum % 100;

                    // 判断房间号
                    if (roomNum < 101) {
                        System.out.println("房间号为一个101以上的正整数。");
                    } else if (floorNum > hotel.getFloorNum() || floorRoomNum  > hotel.getFloorRoomNum()) {
                        System.out.println("您输入的房间号不存在！请重新输入");
                    } else if (((roomNum / 100) >= 1) && ((roomNum % 100) >= 1)) {
                        // 判断全局用户是否为空
                        if (customer == null) {
                            System.out.println("您还没有确定用户，请先注册一个用户。");
                            // 结束循环
                            break;
                        } else {

                            // 调用酒店的酒店管理员的管理系统的退房方法
                            hotel.getHotelManager().getManagement().checkOut(roomNum,customer);
                            // 结束循环
                            break;
                        }
                    } else {
                        System.out.println("您输入的房间号不存在！请重新输入");
                    }
                }

            } else if (choose == 3) {
                // 查房业务
                System.out.println("-------查房业务-------");
                // 调用酒店的酒店管理员的管理系统的查房方法
                hotel.getHotelManager().getManagement().checkRooms();
            } else if (choose == 4) {
                // 注册用户业务
                System.out.println("-------输入用户-------");

                // 输入用户名字（String）、性别（boolean）、id（String）
                // 打印提示信息
                System.out.print("请输入用户姓名：");
                // 获取空格前的一段字符串
                String name = s1.next();

                boolean sex2 = false;
                while (true) {
                    // 打印提示信息
                    System.out.print("请输入用户性别（男or女）：");
                    String sex1 = s1.next();

                    // 根据输入的性别字符串转成相应的boolean类型（true男false女）

                    if ("男".equals(sex1)) {
                        sex2 = true;
                        break;
                    } else if ("女".equals(sex1)) {
                        sex2 = false;
                        break;
                    } else {
                        System.out.println("您输入的性别不符合要求！请重新输入");
                    }
                }

                // 打印提示信息
                System.out.print("请输入用户ID：");
                String id = s1.next();

                // 根据输入的信息创建对象
                customer = new Customer(name,sex2,id,null);

            } else if (choose == 0) {
                // 退出系统
                System.out.println("-------退出系统-------");

                // 输出退出提示
                System.out.println("再见[" + hotel.getHotelManager().getName() + "]，欢迎下次使用。");
                // 退出
                return;
            } else {
                // 输入关键字错误
                // 输出提示信息
                System.out.println("您输入的数字不在业务范围内！");
            }
        }

    }
}
