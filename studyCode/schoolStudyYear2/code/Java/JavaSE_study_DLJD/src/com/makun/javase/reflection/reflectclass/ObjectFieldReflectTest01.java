package com.makun.javase.reflection.reflectclass;

import java.lang.reflect.Field;
import java.util.ResourceBundle;

// 使用反射机制创建一个对象，然后使用反射机制获取对象的属性以及属性值
/*
* 给一个对象中的属性赋值，那么就需要获取到这个对象对应的类的对应的属性
* 然后使用这个类的这个属性的set方法，传入这个对象和需要传入额值
*
* 想要获取一个对象某个属性的值，与上类似，也需要获取到这个对象对应的类的对应的属性
* 然后使用这个类的这个属性的get方法，传入这个对象
* */
public class ObjectFieldReflectTest01 {
    public static void main(String[] args) {
        // 这里通过资源绑定来获取配置文件，然后操作这个类
        // 这里绑定的文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取绑定文件中的对应值
        String reflectClass = resourceBundle.getString("reflectClass");

        try {
            // 找到这个类
            Class reflectClass2 = Class.forName(reflectClass);
            // 使用无参构造创建这个类的对象
            Object reflectObj = reflectClass2.newInstance();

            // 通过属性名来获取这个 类 的属性
            Field fieldSex = reflectClass2.getDeclaredField("sex");
            // 这个不能访问没有权限的，想要访问没有权限的属性，需要打破封装
            Field fieldName = reflectClass2.getDeclaredField("name");
            // 打破name属性的封装
            fieldName.setAccessible(true);

            // 给reflectObj对象的sex属性赋值
            // 给reflectObj对象的sex属性赋值true
            fieldSex.set(reflectObj,true); // IllegalAccessException（非法存取）
            // 给打破封装的name属性赋值
            fieldName.set(reflectObj,"马昆");

            // 读取reflectObj对象的sex属性的值
            Object sex = fieldSex.get(reflectObj);
            System.out.println("这个对象的sex属性的值是：" + sex);
            // 读取reflectObj对象的name属性的值
            Object name = fieldName.get(reflectObj);
            System.out.println("这个对象的name属性的值是：" + name);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
