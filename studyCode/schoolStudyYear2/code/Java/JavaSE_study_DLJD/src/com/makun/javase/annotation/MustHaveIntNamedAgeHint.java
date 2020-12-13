package com.makun.javase.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

// 用来完成我的必须有一个属性的注解的编译时报错功能
public class MustHaveIntNamedAgeHint {
    public static void main(String[] args) throws AnnotationStipulationException {
        // 需要判断是否使用了我自定义注解的那个类的类名
        String reflectClassName = "com.makun.javase.annotation.Student";
        // 我的自定义注解名
        String annotationClassName = "com.makun.javase.annotation.MustHaveIntNamedAge";

        try {
            // 先获取到我使用了我自定义的注解的类
            Class studentClass = Class.forName(reflectClassName);
            // 获取到这个注解
            Class annotationClass = Class.forName(annotationClassName);
            // 看它是否有我自定义的那个注解，（方法的意思是：这个注解是否出席），如果有再进行操作
            if(studentClass.isAnnotationPresent(annotationClass)) {
                // 定义一个标志变量（默认非法）
                boolean isLegal = false;

                // 然后挨个找到这个类中所有的声明属性进行判断，如果符合要求那么就改变标志变量为true
                Field[] fields = studentClass.getDeclaredFields();
                for(Field field : fields) {
                    // 判断这个属性是否是int类型的，是否叫做age，如果是那么就改标志变量并结束循环
                    if("int".equals(field.getType().getSimpleName()) && "age".equals(field.getName())) {
                        // 更改标志变量
                        isLegal = true;
                        // 结束循环
                        break;
                    }
                }

                // 判断标志变量是什么状态，如果是合法的，那么就什么也不做，如果是非法的那么就抛我的自定义异常
                if(!isLegal) {
                    throw new AnnotationStipulationException("你的类中没有int类型的名为age的属性");
                }

                // 如果获取这个类中使用的这个注解是我自定义的那个注解就强转一下
                if(studentClass.getAnnotation(annotationClass) instanceof MustHaveIntNamedAge) {
                    // 获取这个类上的我自定义注解类（强转一下）
                    MustHaveIntNamedAge instanceAnnotation = (MustHaveIntNamedAge) studentClass.getAnnotation(annotationClass);
                    // 在控制台打印一下这个注解的一些属性值
                    System.out.println(instanceAnnotation.value());
                    System.out.println(instanceAnnotation.value2());
                    System.out.println(instanceAnnotation.value3());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
