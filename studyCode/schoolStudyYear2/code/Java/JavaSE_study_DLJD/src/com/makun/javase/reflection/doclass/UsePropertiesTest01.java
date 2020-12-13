package com.makun.javase.reflection.doclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// 使用配置文件IO流来验证反射机制的灵活性
public class UsePropertiesTest01 {
    public static void main(String[] args) {
        // 创建一个属性集合
        Properties properties = new Properties();

        FileReader fileReader = null;

        try {
            // 创建一个IO流（使用项目的相对路径）
            fileReader = new FileReader("src/com/makun/javase/reflection/doclass/test01.properties");
            // 将读到的文件内容加载到属性数组中
            properties.load(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 获取属性配置文件中的内容
        String userClassName = properties.getProperty("User");
        String stringClassName = properties.getProperty("String");
        String dateClassName = properties.getProperty("Date");

        Object user = null;
        Object string = null;
        Object date = null;

        // 使用配置文件中的内容来创建对象（使用反射机制）
        try {
            // 先使用反射机制获取class
            Class userClass = Class.forName(userClassName);
            Class stringClass = Class.forName(stringClassName);
            Class dateClass = Class.forName(dateClassName);

            // 使用Class对象的实例化方法调用对象的无参构造
            user = userClass.newInstance();
            string = stringClass.newInstance();
            date = dateClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        // 输出一下这些用反射机制使使用无参构造创建的对象（默认调用他们的toString方法）
        System.out.println(user);
        System.out.println(string);
        System.out.println(date);
    }
}