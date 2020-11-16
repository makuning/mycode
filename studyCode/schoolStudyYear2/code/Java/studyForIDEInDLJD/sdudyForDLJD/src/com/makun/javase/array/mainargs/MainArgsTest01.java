package com.makun.javase.array.mainargs;
/*
*main方法中有一个数组参数，是String[] args ，当然也可以用c++的风格，写作String args[]，但是不建议这样写
* 因为String[] 这表示一个引用类，main方法由JVM调用，调用的时候会给这个数组传值，并且这个值是由用户在控制台输入的
* 在运行class文件的时候传参数，例如：java HelloWorld admin 123456
* 这个代码就会给arg数组对象（当然它只是一个引用，指向一个String数组对象）传两个值，第一个值是admin，第二个值是123456
* 如果用户不给args传值，JVM在调用的时候会给一个长度为0的数组，例如：new String[]{} ，这是静态创建数组的一种方式，方括号里不能加东西
* 反正不手动传值，JVM会传一个长度为零的String数组进去
*
* 这个args可以用作此main方法运行的门槛，例如用户名和密码，在运行class文件时，在后面传入两个参数，一个是用户名，一个是用户密码
* 然后再main方法中进行判断，如果判断失败就直接return
* */
public class MainArgsTest01 {
    public static void main (String[] args) {
        // 输出args的长度
        System.out.println(args.length);
//        // 用两个变量来装用户名和密码
//        // 放在这里如果用户执行这个方法时未输入参数会出现ArrayIndexOutOfBoundsException的错误（索引号超了）
//        String admin = args[0];
//        String password = args[1];

        /*
        * 做一个用户名和密码的判断，提高文件的安全性
        * 这里有个老程序员的经验，在判断的时候，用 “字符串.equals(args[索引号])” 的方式来判断
        * 这样就避免了空指针异常的错误
        * */
        // 先判断用户是否输入了用户名和密码
        if (args.length != 2) {
            System.out.println("请输入用户名和密码~");
            return;
        }

        // 用两个变量来装用户名和密码
        String admin = args[0];
        String password = args[1];

        // 判断用户输入的用户和密码是否正确
        if (!"makun".equals(admin) || !"123456".equals(password)) {
            System.out.println("您输入的用户名不存在或者输入的密码不正确。");
            return;
        }

        // 输入正确进入程序的提示语
        System.out.println("欢迎" + "[" + admin + "]回家，\n您可以继续使用程序...");
    }
}
