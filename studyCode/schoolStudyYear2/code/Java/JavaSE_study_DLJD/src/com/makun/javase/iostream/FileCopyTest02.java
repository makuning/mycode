package com.makun.javase.iostream;

import java.io.*;

// 测试一下文件复制（使用FileReader和FileWriter）
// 这个只能复制不同文本文件（能用记事本打开的都是普通文本文件）
public class FileCopyTest02 {
    public static void main(String[] args) {
        // 创建FileReader和FileWriter的引用
        FileReader fr = null;
        FileWriter fw = null;

        try {
            // 给字符输入流和字符输出流赋值
            fr = new FileReader("src\\com\\makun\\javase\\iostream\\information.txt");
            fw = new FileWriter("src\\com\\makun\\javase\\iostream\\temp.txt",true);

            // 定义一个字符数组，用来代表单次复制的长度
            char[] chars = new char[1024];  // 表示一次复制1024个字符，Java中一个字符是两个字节，所以一次复制时2KB

            // 一边读一边复制
            int content = 0;
            while((content = fr.read(chars)) != -1) {
                // 复制
                fw.write(chars,0,content);
            }

            // 刷新
            fw.flush();

        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
