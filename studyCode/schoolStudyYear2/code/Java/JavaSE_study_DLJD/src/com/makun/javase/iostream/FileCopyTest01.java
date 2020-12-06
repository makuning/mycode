package com.makun.javase.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 测试一下文件复制（使用FileInputStream和FileOutputStream）
public class FileCopyTest01 {
    public static void main(String[] args) {
        // 先在外边儿创建一个输入流引用，然后再创建一个输出流引用
        FileInputStream fis = null;
        FileOutputStream fos = null;

        // 定义一个字节数组用来复制文件
        byte[] bytes = new byte[10 * 1024];// 表示一次复制10KB
        // 开始一边读一边写，捕捉异常
        try {
            // 给输入流引用和输出流引用赋对象
            fis = new FileInputStream("src\\com\\makun\\javase\\iostream\\information.txt");
            fos = new FileOutputStream("src\\com\\makun\\javase\\iostream\\temp.txt",true);

            // 循环读取，然后输出
            // 定义一个整型来装当次循环读了几个字节
            int content = 0;
            while((content = fis.read(bytes)) != -1) {
                // 输出这个字节到文件中，从0开始，写入几个
                fos.write(bytes,0,content);

                // 每次输出后都要清空管道（刷新）
                fos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
