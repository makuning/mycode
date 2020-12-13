package com.makun.javase.reflection.doclass;

import java.util.ResourceBundle;

// 用于对资源绑定器的学习
// 这里绑定的资源是一个properties配置文件，并且这个文件必须放在类路径下
// 这个资源绑定器只能绑定properties配置文件，并且这个文件必须在类路径下，并且在代码中找这个文件的时候不能加properties后缀
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // 这里绑定 com.makun.javase.reflection.doclass.test01.properties 配置文件
        // 使用资源绑定的静态方法getBundle就能绑定一个配置文件，返回一个绑定
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/makun/javase/reflection/doclass/test01");
        // containsKey判断这个资源配置文件是否包含User这个key
        boolean hasUser = resourceBundle.containsKey("User");
        System.out.println(hasUser);
        // 如果有User这个键就输出它对应的值
        if(hasUser) {
            System.out.println(resourceBundle.getString("User"));
        }
    }
}
