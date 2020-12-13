package com.makun.javase.reflection.reflectclass;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

// 用于对反射机制的学习，反射一个类的方法
public class MethodReflectTest01 {
    public static void main(String[] args) {
        // 这里通过资源绑定来获取配置文件，然后操作这个类
        // 这里绑定的文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取绑定文件中的对应值
        String reflectClass = resourceBundle.getString("reflectClass");

        // 在外边儿，创建一个字符输出流，先给它赋空值
        FileWriter fileWriter = null;
        try {
            // 通过类名找到这个类
            Class reflectClass2 = Class.forName(reflectClass);
            // 获取这个类所有声明的方法（包括私有的）
            Method[] methods = reflectClass2.getDeclaredMethods();
            System.out.println("这个类中的方法个数：" + methods.length);

            // 创建一个可拼接字符串的字符串类型，用于拼接我要输出到文件的内容
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("类名：");
            stringBuilder.append(reflectClass2.getName());
            stringBuilder.append("\n它当中的方法有：{\n");

            // 遍历这个类中的方法
            for (Method method : methods) {
                // 添加方法的修饰符列表
                int modifyFlag = method.getModifiers();
                String modifies = Modifier.toString(modifyFlag);
                // 将属性添加到我需要打印的字符串中
                stringBuilder.append("\t");
                stringBuilder.append(modifies);
                if(modifyFlag != 0) {
                    stringBuilder.append(" ");
                }

                // 添加方法的返回值类型，这个返回值类型是一个类
                Class methodReturnType = method.getReturnType();
                String methodReturnTypeName = methodReturnType.getName();
                stringBuilder.append(methodReturnTypeName);

                // 添加方法的名字
                stringBuilder.append(method.getName());
                stringBuilder.append("(");

                // 添加形参列表（一个方法的形参列表可能有很多个，也可能没有）
                Class[] parameterTypes = method.getParameterTypes();
                // 如果没有参数就直接下一步了，有参数的话就遍历一下
                if(parameterTypes.length != 0) {
                    // 定义一个记录参数个数的变量
                    int cnt = 0;
                    for(Class parameterType : parameterTypes) {
                        cnt++;
                        String parameterTypeName = parameterType.getName();
                        // 添加到我的字符串中
                        stringBuilder.append(parameterTypeName);
                        stringBuilder.append(" ");
                        // 再随便添加一个参数名
                        stringBuilder.append("arg");
                        stringBuilder.append(cnt);
                        stringBuilder.append(",");
                    }
                    // 形参写完后将最后一个参数后面的,给去掉（也就是组后一个字符）
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }

                stringBuilder.append(") {};\n");
            }

            stringBuilder.append("}");

            // 字符串已就绪，创建字符输出流，将这个字符串输出到指定的文件中
            fileWriter = new FileWriter("src/com/makun/javase/reflection/reflectclass/decompilationOut/method01.txt");
            // 写入字符串
            fileWriter.write(String.valueOf(stringBuilder));
            // 刷新管道
            fileWriter.flush();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
