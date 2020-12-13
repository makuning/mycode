package com.makun.javase.reflection.reflectclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

// 使用反射调用一个对象的方法
/*
* 调用对象方法的要素：
* 1、得到这个对象
* 2、找到这个方法的方法名
* 3、找到这个方法的形参列表（因为会有方法重载的情况）
* 4、获得这个方法的返回值，也可以不需要返回值
*
* 使用反射机制调用一个对象的方法：
* */
public class ReflectCallMethodTest01 {
    public static void main(String[] args) {
        // 使用资源绑定，绑定一个配置文件
        // 这个配置文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取这个资源中的某个值
        String reflectClass = resourceBundle.getString("reflectClass");

        try {
            // 找到这个类
            Class reflectClass2 = Class.forName(reflectClass);
            // 使用newInstance方法调用无参构造，构造这个对象
            Object reflectObj = reflectClass2.newInstance();

            // 先获取这个 类 的sum方法，第一个参数是方法的名字，后面两个参数是方法的参数（使用了可变长参数）
            Method sumMethod = reflectClass2.getDeclaredMethod("sum",int.class,int.class);

            // 调用这个对象实例化后的这个方法，这个方法的意思是调用，第一个参数传入的是需要调用的对象，后面的参数是调用这个方法需要传入的参数
            // obj是这个方法的返回值，如果这个方法没有返回值，那么这个Object就为空
            Object obj = sumMethod.invoke(reflectObj,2,54);
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
