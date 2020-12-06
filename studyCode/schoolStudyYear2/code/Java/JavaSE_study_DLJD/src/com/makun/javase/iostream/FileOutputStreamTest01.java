package com.makun.javase.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 这个测试程序用于对 FileOutputStream 的学习
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        // 在外边儿新建一个输出流的引用
        FileOutputStream fos = null;

        // new出输出流，并操作(传入一个文件，没有这个文件的话会新建)，抓异常
        try {
            // 赋值输出流对象，后面的参数true，这表示输出时不覆盖原来的文件，在后面添加
            fos = new FileOutputStream("src\\com\\makun\\javase\\iostream\\temp.txt",true);

            // 创建一个字符串然后转成字节数组，添加在这个文件的后面
            fos.write(new String("\n我是一个中国人，我叫马昆，我今年19岁了，我骄傲！！！").getBytes());
            // 创建一个字节数组添加在这个文件的后面
            byte[] content1 = {97,98,99,100,101,102,103,104,105,106,107,108};
            fos.write(content1);

            //写完之后，最后一定要刷新(清空管道)
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 最后关闭这个输出流
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
