package com.makun.javase.reflection.reflectclass;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

// 通过反射机制，反射class文件中的属性，然后通过IO流将属性打印出来
public class FieldReflectTest01 {
    public static void main(String[] args) {
        // 这里通过资源绑定来获取配置文件，然后操作这个类
        // 这里绑定的文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取绑定文件中的对应值
        String reflectClass = resourceBundle.getString("reflectClass");

        // 获取这个我想要反射的类
        try {
            // 使用Class的静态方法，将我配置文件中的值传进去
            Class reflectClass2 = Class.forName(reflectClass);
            // 获取这个类的完整类名
            String classFullName = reflectClass2.getName();
            System.out.println("这个类的完整类名叫做：" + classFullName);
            // 获取这个类的普通类名
            String classSimpleName = reflectClass2.getSimpleName();
            System.out.println("这个类的普通类名叫做：" + classSimpleName);

            // 获取这个类中所有公开的属性
            Field[] fields = reflectClass2.getFields();
            System.out.println("这个类中公开属性的个数为：" + fields.length);
            // 遍历输出他们
            for(Field field : fields) {
                System.out.println("公开的属性：" + field);
            }
            // 换个行
            System.out.println();

            // 获取这个类中所有声明的属性
            Field[] fields2 = reflectClass2.getDeclaredFields();
            System.out.println("这个类中声明的属性的个数为：" + fields2.length);
            // 遍历输出他们
            for(Field field : fields2) {
                System.out.println("声明的属性：" + field);

                // 获取这个属性的修饰符列表
                // 返回的修饰符是-一个数字,每个数字是修饰符的代号！！！
                int fieldFlag = field. getModifiers();
                System.out.println("这个修饰符的”代号“是：" + fieldFlag);
                // 将这个“代号”数字转换成“字符串”，使用Modifier的静态方法toString，传入这个int”代号“
                // 获得的这个字符串，它自己就带空格（如果修饰符有很多个的话）
                String modifierString = Modifier.toString(fieldFlag);
                System.out.println(modifierString);

                // 获取属性的类型，类型是一个类
                Class fieldType = field.getType();
                System.out.println("属性的类型是（完整类名）：" + fieldType.getName());
                System.out.println("属性的类型是（普通类名）：" + fieldType.getSimpleName());

                // 获取属性的名字
                String fieldName = field.getName();
                System.out.println("属性的名字是：" + fieldName);

                // 换个行
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // 重新写个程序来讲这个类的属性信息打印在一个文件上
        // 在外边创建一个输出流
        FileWriter fileWriter = null;
        try {
            // 获取这个类
            Class reflectClass3 = Class.forName(reflectClass);
            // 创建一个可拼接的字符串对象
            StringBuilder fieldString = new StringBuilder();

            // 开始读取这个类中的属性，然后拼接到字符串中
            fieldString.append("类的名字：");
            fieldString.append(reflectClass3.getName());
            fieldString.append("{\n");
            // 获取所有的属性
            Field[] fields = reflectClass3.getDeclaredFields();
            // 遍历添加这些属性
            for(Field field : fields) {
                // 添加属性的修饰符
                int modifyFlag = field.getModifiers();
                fieldString.append("\t");
                if(modifyFlag != 0) {
                    fieldString.append(Modifier.toString(modifyFlag));
                    fieldString.append(" ");
                }

                // 添加属性的类型
                fieldString.append(field.getType());
                fieldString.append(" ");

                // 添加属性的名字
                fieldString.append(field.getName());
                fieldString.append(";\n");
            }
            fieldString.append("}");

            // 给输出流值
            fileWriter = new FileWriter("src/com/makun/javase/reflection/reflectclass/decompilationOut/field01.txt");
            // 输出
            fileWriter.write(String.valueOf(fieldString));
            // 刷新流
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
