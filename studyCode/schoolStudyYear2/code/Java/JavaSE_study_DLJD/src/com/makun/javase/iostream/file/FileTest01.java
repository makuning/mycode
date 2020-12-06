package com.makun.javase.iostream.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) throws Exception {
        //创建-个File对象
        File f1 = new File("src\\com\\makun\\javase\\iostream\\file\\information.txt");

        //判断是否存在!
        System. out . println(f1.exists());

        //如果D:\file不存在,则以文件的形式创建出来
        /*
        if(!f1.exists()) {
            //以文件形式新建
            f1. createNewFile();
        }
        */

        //如果D:\file不存在,则以目录的形式创建出来
        /*
        if(!f1. exists()) {
            //以目录的形式新建。
            f1. mkdir();
        }
        */

        //可以创建多重目录吗?
        // File f2 = new File("D:/a/b/c/d/e/f");
        /*
        if(!f2.exists()) {
            //多重目录的形式新建。
            f2. mkdirs();
        }
        */

        // 获取文件的父路径
        System.out.println(f1.getName() + "的父路径是：" + f1.getParent());
        // 获取文件的绝对路径
        System.out.println(f1.getName() + "的绝对路径是：" + f1.getAbsolutePath());
        //获取文件名
        System.out.println(f1.getName() + "的文件名是：" + f1.getName());
        //判断是否是一个目录
        System.out.println(f1.getName() + "是一个目录吗？\t" + f1.isDirectory());
        //判断是否是一个文件
        System.out.println(f1.getName() + "是一个文件吗？\t" + f1.isFile());

        //获取文件最后一次修改时间
        long haoMiao = f1.lastModified(); //这个毫秒是从1970年到现在的总毫秒数。
        //将总毫秒数转换成日期?????
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(f1.getName() + "最后一次修改时间为：\t" + strTime);

        //获取文件大小
        System.out.println(f1.getName() + "的大小为：\t" + f1.length());


    }
}
