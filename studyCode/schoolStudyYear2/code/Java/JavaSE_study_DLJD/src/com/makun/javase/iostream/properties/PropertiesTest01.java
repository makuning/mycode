package com.makun.javase.iostream.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// 用于对IO流与Properties的结合的学习
// 如何使用配置文件
public class PropertiesTest01 {
    public static void main(String[] args) throws IOException {
        // 创建一个字符输入流对象
        FileReader fr = new FileReader("src\\com\\makun\\javase\\iostream\\properties\\test.properties");
        // 新建一个Properties集合（属性集合）
        Properties pro = new Properties();
        // 将这个输入流对象使用load方法装到Properties集合中，将文件中的数据加载到Properties集合中
        pro.load(fr);
        // 通过key来获取value
        String name = pro.getProperty("name");
        String sex = pro.getProperty("sex");
        String age = pro.getProperty("age");
        String birth = pro.getProperty("birth");
        String phoneNum = pro.getProperty("phoneNum");
        String address = pro.getProperty("address");

        // 打印这些数据
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
        System.out.println("生日：" + birth);
        System.out.println("地址：" + address);
    }
}
