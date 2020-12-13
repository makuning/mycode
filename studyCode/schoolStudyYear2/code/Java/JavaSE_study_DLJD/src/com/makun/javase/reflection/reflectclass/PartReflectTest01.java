package com.makun.javase.reflection.reflectclass;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ResourceBundle;

// 使用反射机制，综合反编译class文件
// 这里会将这个传入的类反编译输出成一个文件，会写出这个类中声明的属性，声明的方法，并且所有的类名都使用普通类名，不使用完整类名
public class PartReflectTest01 {
    public static void main(String[] args) {
        // 使用资源绑定，绑定一个配置文件
        // 这个配置文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取这个资源中的某个值
        String reflectClass = resourceBundle.getString("reflectClass");

        // 定义一个空的字符输出流
        FileWriter fileWriter = null;
        try {
            // 使用配置文件中的类名来找到这个class文件
            Class reflectClass2 = Class.forName(reflectClass);
            // 定义一个可拼接字符串来装我需要打印的字符串
            StringBuilder stringBuilder = new StringBuilder();

            // 拼接类的修饰符列表
            int classModifyFlag = reflectClass2.getModifiers();
            String classModifiers = Modifier.toString(classModifyFlag);
            stringBuilder.append(classModifiers);
            stringBuilder.append(" class ");

            // 拼接类的普通类名
            stringBuilder.append(reflectClass2.getSimpleName());
            stringBuilder.append(" {\n");

            // 拼接类中所有声明的属性
            Field[] fields = reflectClass2.getDeclaredFields();
            for(Field field : fields) {
                // 拼接属性的修饰符列表
                int fieldModifyFlag = field.getModifiers();
                String fieldModifies = Modifier.toString(fieldModifyFlag);
                stringBuilder.append("\t");
                stringBuilder.append(fieldModifies);
                if(fieldModifyFlag != 0) {
                    stringBuilder.append(" ");
                }

                // 拼接属性的类型
                Class fieldType = field.getType();
                stringBuilder.append(fieldType);
                stringBuilder.append(" ");

                // 拼接属性的名字
                stringBuilder.append(field.getName());
                stringBuilder.append(";\n");
            }

            stringBuilder.append("\n");
            // 拼接类中所有声明的方法
            Method[] methods = reflectClass2.getDeclaredMethods();
            for(Method method : methods) {
                // 拼接这个方法的修饰符列表
                int methodModifyFlag = method.getModifiers();
                String methodModifies = Modifier.toString(methodModifyFlag);
                stringBuilder.append("\t");
                stringBuilder.append(methodModifies);
                if(methodModifyFlag != 0) {
                    stringBuilder.append(" ");
                }

                // 拼接这个方法的返回值
                Class methodReturnType = method.getReturnType();
                stringBuilder.append(methodReturnType.getSimpleName());
                stringBuilder.append(" ");

                // 拼接这个方法的方法名
                stringBuilder.append(method.getName());
                stringBuilder.append("(");

                // 拼接这个方法的形参列表（如果没有形参就直接跳过进入下一步）
                Class[] parameterTypes = method.getParameterTypes();
                if(parameterTypes.length != 0) {
                    // 定义一个计数器，方便创建不同的形参名
                    int cnt = 0;
                    for(Class parameterType : parameterTypes) {
                        cnt++;
                        // 拼接这个形参的普通类型名
                        stringBuilder.append(parameterType.getSimpleName());
                        stringBuilder.append(" ");
                        stringBuilder.append("argument");
                        stringBuilder.append(cnt);
                        stringBuilder.append(",");
                    }
                    // 删掉最后一个逗号
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }

                stringBuilder.append(") {}\n");
            }

            stringBuilder.append("}");
            // 控制台打印一下，没有问题
            System.out.println(stringBuilder);

            // 给空的字符输出流赋值
            fileWriter = new FileWriter("src/com/makun/javase/reflection/reflectclass/decompilationOut/part01.txt");
            // 输出我的字符串
            fileWriter.write(String.valueOf(stringBuilder));
            // 刷新管道
            fileWriter.flush();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
