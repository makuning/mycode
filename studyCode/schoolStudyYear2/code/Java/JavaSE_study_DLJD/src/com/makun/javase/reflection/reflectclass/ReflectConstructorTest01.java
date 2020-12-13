package com.makun.javase.reflection.reflectclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

// 反编译一个类的构造方法
/*
* 获取一个类的构造方法和获取一个类的方法简直就是一摸一样
* 只是方法名不一样而已
* */
public class ReflectConstructorTest01 {
    public static void main(String[] args) {
        // 使用资源绑定，绑定一个配置文件
        // 这个配置文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取这个资源中的某个值
        String reflectClass = resourceBundle.getString("reflectClass");

        try {
            // 找到这个配置文件中的类
            Class reflectClass2 = Class.forName(reflectClass);
            // 创建一个字符串用于拼接我想要反编译的内容
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("类名：");
            stringBuilder.append(reflectClass2.getName());
            stringBuilder.append("\n它当中的构造方法有：{\n");

            // 拼接构造方法
            Constructor[] constructors = reflectClass2.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                // 拼接构造法方法的修饰符列表
                String constructorModifies = Modifier.toString(constructor.getModifiers());
                stringBuilder.append("\t");
                stringBuilder.append(constructorModifies);
                stringBuilder.append(" ");
                stringBuilder.append(constructor.getName());
                stringBuilder.append("(");

                Class[] parameterTypes = constructor.getParameterTypes();
                // 如果没有参数就直接跳过，进行下一步
                if(parameterTypes.length != 0) {
                    int cnt = 0;
                    for(Class parameterType : parameterTypes) {
                        cnt++;
                        stringBuilder.append(parameterType.getSimpleName());
                        stringBuilder.append(" ");
                        stringBuilder.append("argument");
                        stringBuilder.append(cnt);
                        stringBuilder.append(",");
                    }
                    // 删除最后的逗号
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }

                stringBuilder.append(") {}\n");
            }

            stringBuilder.append("}");

            // 在控制台打印这个字符串
            System.out.println(stringBuilder);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
