package com.makun.javase.reflection.reflectclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

// 使用反射机制调用一个类的构造方法来构造对象
/*
* 同样也是用newInstance()这个方法
* 之前的例子是用Class对象的newInstance方法来实例化这个类，默认调用这个类的无参构造方法
* 现在我们想用反射机制来调用类的其他构造方法，那么怎么办呢？
* 同样，也是使用newInstance()方法，但是
* 这个newInstance方法不是属于Class对象的，是属于这个类的构造方法的
* 我们需要先获得这个类的构造方法（你需要使用的那个构造方法）
* 然后使用这个构造方法的newInstance来实例化对象，返回一个Object
* */
public class ReflectConstructorInstanceTest01 {
    public static void main(String[] args) {
        // 使用资源绑定，绑定一个配置文件
        // 这个配置文件是 com/makun/javase/reflection/reflectclass/test01.properties
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/reflectclass/test01");
        // 获取这个资源中的某个值
        String reflectClass = resourceBundle.getString("reflectClass");

        try {
            // 先通过配置文件中的类名找到这个类
            Class reflectClass2 = Class.forName(reflectClass);
            // 获取这个类你需要的构造方法
            // 这个是无参构造
            Constructor constructor = reflectClass2.getDeclaredConstructor();
            // 这个是有参构造
            Constructor constructor2 = reflectClass2.getDeclaredConstructor(String.class,String.class,boolean.class,int.class,String.class);

            // 使用这些构造方法来实例化对象
            // 使用无参构造（当然这里直接使用Class对象的newInstance也可以使用无参构造创建对象）
            Object reflectObj = constructor.newInstance();
            // 使用有参数构造，在newInstance方法中传入构造方法需要的参数
            Object reflectObj2 = constructor2.newInstance("编程","马昆",true,19,"19929184917849");

            // 输出一下这些对象，会调用他们的toString方法
            System.out.println(reflectObj);
            System.out.println(reflectObj2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
