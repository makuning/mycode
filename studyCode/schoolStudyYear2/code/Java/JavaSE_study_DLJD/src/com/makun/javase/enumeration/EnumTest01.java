package com.makun.javase.enumeration;

import java.util.Random;

public class EnumTest01 {
    // 枚举类型测试程序
    public enum Week {
        // 一周有七天

        // 星期日
        SUNDAY,

        // 星期一
        MONDAY,

        // 星期二
        TUESDAY,

        // 星期三
        WEDNESDAY,

        // 星期四
        THURSDAY,

        // 星期五
        FRIDAY,

        // 星期六
        SATURDAY
    }

    // 设计一个静态方法，产生0-6的随机数，然后返回对应的星期
    public static Week createWeek () {
        Random random = new Random();
        int week = random.nextInt(7);

        if (week == 0) {
            return Week.SUNDAY;
        } else if (week == 1) {
            return Week.MONDAY;
        } else if (week == 2) {
            return Week.TUESDAY;
        } else if (week == 3) {
            return Week.WEDNESDAY;
        } else if (week == 4) {
            return Week.THURSDAY;
        } else if (week == 5) {
            return Week.FRIDAY;
        } else {
            return Week.SATURDAY;
        }
    }

    // 程序入口
    public static void main(String[] args) {
        // 调用随机产生星期的方法
        Week week = EnumTest01.createWeek();

        // 获取得到的数据进行相应的星期输出
        switch (week) {
            case SUNDAY:
                System.out.println("星期日");
                break;
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
        }
    }
}
