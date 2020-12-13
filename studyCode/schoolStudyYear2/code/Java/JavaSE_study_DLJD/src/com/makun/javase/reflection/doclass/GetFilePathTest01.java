package com.makun.javase.reflection.doclass;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

// 使用一个通用的方式获取一个文件，然后得到它在当前系统的的绝对路径
// 1、通过类加载环境获取一个资源，以URL的方式返回，可以得到它的艰苦绝对路径
// 2、通过类加载环境获取一个资源，以流的方式返回，然后就可以读取这个资源
public class GetFilePathTest01 {
    public static void main(String[] args) {
        /* 通过Thread的静态方法获取当前线程。
         * 然后通过当前进行的线程获取类加载器环境
         * 然后通过类加载器环境获取一个资源，这个资源就是这个我们需要的到的文件
         * 然后通过这个资源的getPath方法，获取它的绝对路径
        **/

        // 获取com.makun.javase.reflection.doclass.test01.properties

        // 第一个知识点：
        // 获取当前线程
        Thread thread1 = Thread.currentThread();
        // 使用当前线程找到类加载环境
        ClassLoader classLoader1 = thread1.getContextClassLoader();
        // 使用类加载环境找到我需要的资源，这个资源是一个URL（URL解释：统一资源定位系统）
        // 这个路径名必须在类路径下，也就是从com开始，装这个com的路径就是这个的根目录，从这里开始
        URL url = classLoader1.getResource("com/makun/javase/reflection/doclass/test01.properties");
        // 通过这个资源的资源定位系统就可以获得这个文件的绝对路径
        String path1 = url.getPath();
        // 输出这个路径
        System.out.println(path1);

        // 以上的代码也可以合并的
        String path2 = Thread.currentThread().getContextClassLoader().getResource("com/makun/javase/reflection/doclass/test01.properties").getPath();
        System.out.println(path2);

        // 第二个知识点：
        // 获取当前执行线程
        Thread thread2 = Thread.currentThread();
        // 使用当前线程得到类加载环境
        ClassLoader classLoader2 = thread2.getContextClassLoader();
        // 使用当前线程的类加载环境获取一个资源的输入流
        InputStream inputStream = classLoader2.getResourceAsStream("com/makun/javase/reflection/doclass/test01.properties");
        // 创建一个属性集合，通过流来装这个资源中的内容
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 获取这个资源中的内容
        String customer = properties.getProperty("Customer");
        System.out.println(customer);
    }
}