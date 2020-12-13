package com.makun.javase.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// 定义一个注解，使用这个注解的只能是一个类，并且这个类必须有一个叫age的int类型的属性

// 元注解：表示只能修饰类，接口之类的
@Target(ElementType.TYPE)
// 元注解：表示这个注解能够通过反射机制获取到
@Retention(RetentionPolicy.RUNTIME)
public @interface MustHaveIntNamedAge {
    // 这里我随便写几个参数，这些参数没有用，我只是用来测试一下,都给他们一个默认值

    String value(); // 这个参数在使用这个注解的时候必须要给它值，但是在这里这个值没有用
    // String[] value(); // 没有默认值，表示必须要写
    String value2() default  "我是一个中国人";
    // 使用一个自定义的枚举类型
    Season value3() default Season.SPRING;
}
