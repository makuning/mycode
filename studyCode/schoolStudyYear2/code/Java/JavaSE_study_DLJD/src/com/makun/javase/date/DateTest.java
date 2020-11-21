package com.makun.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        // 新建一个日期类（无参是获取系统当前时间）
        Date date1 = new Date();
        System.out.println(date1);

        // 新建一个日期类（参数是毫秒）
        Date date2 = new Date(0);
        System.out.println(date2);

        // 新建一个日期格式类，在java.text包中
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");

        /*
        * 格式除了y M d H m s S 这些字符之外，剩下的格式可以随便写
        * yyyy 年
        * MM 月
        * dd 日
        * HH 时
        * mm 分
        * ss 秒
        * SSS 毫秒
        * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        * */

        //给这个对象的format()方法传入一个时间对象，会按之前指定的格式返回一个字符串；
        String time1 = sdf1.format(date1);
        String time2 = sdf1.format(date2);
        System.out.println(time1 + "\n" + time2);

        // 字符串转换成Date类型
        String time3 = "2020-11-20 17:50:34 123";
        // 按这个String的格式new一个SimpleDateFormat对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss SSS");
        // parse方法返回一个Date对象
        Date date3 = sdf2.parse(time3);
        System.out.println(date3);
        // 再使用format方法格式化它
        time3 = sdf1.format(date3);
        System.out.println(time3);

        // 获取 1970年1月1日 00:00:00 000 到当前系统时间的毫秒数
        // 可以用来统计一个程序耗费的时间
        double double1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 10000000; j++) {
                int int1 = 0;
                int1++;
            }
        }

        double1 = System.currentTimeMillis() - double1;
        System.out.println(double1);    // 这个循环嵌套用了10毫秒 （不稳定）
    }
}
