package com.makun.javase.reflection.reflectclass;

import java.util.ResourceBundle;

// 通过反射机制来获取一个类继承的父类和实现的接口
/*
* 获取父类和接口的方式与其他案例的获取也是一样的，只是方法不一样而已
* 父类只有一个，但是接口有很多个
* 所以获得的接口是一个数组
* */
public class ReflectSuperAndInterfacesTest01 {
    public static void main(String[] args) {
        // 使用资源绑定，绑定一个配置文件
        // 这个配置文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取这个资源中的某个值
        String reflectClass = resourceBundle.getString("reflectSuperAndInterfacesTest01");

        try {
            // 通过配置文件中的类名获取这个类
            Class reflectClass2 = Class.forName(reflectClass);
            // 获取这个类继承的父类
            Class superclass = reflectClass2.getSuperclass();
            if(superclass != null) {
                System.out.println(reflectClass2.getName() + "继承的父类是：" + superclass);
            }

            // 获取这个类实现的接口
            Class[] itfcs = reflectClass2.getInterfaces();
            if(itfcs.length != 0) {
                int cnt = 0;
                for(Class itfc : itfcs) {
                    cnt++;
                    System.out.println("这个类实现的第[" + cnt + "]个接口是：" + itfc.getName());
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
