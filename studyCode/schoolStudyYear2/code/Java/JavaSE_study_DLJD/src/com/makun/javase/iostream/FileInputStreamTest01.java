package com.makun.javase.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 这个测试程序用于对 FileInputStream 的学习
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        // 新建一个变量用于输出流的引用，放在外面
        FileInputStream fil = null;

        // 对于输入流进行操作，“new对象时需要输入文件路径，并且需要处理异常”
        try {
            // new输入流对象，绑定文件
            fil = new FileInputStream("src\\com\\makun\\javase\\iostream\\information.txt");

            // 创建一个字节数组，用来读取文件，以减少一个一个字节地读，效率太低
            byte[] content = new byte[10];

            // 使用while循环来读取数据
            while(true) {
                // 用一个变量来装本次循环read了几个字节
                int readCnt = fil.read(content);

                // 如果read返回-1就结束循环
                if(readCnt == -1) {
                    break;
                }

                // 如果能运行到这儿，说明已经读取到数据了，就将本次循环读取到的字节转换成字符串，并打印在控制台上
                System.out.print(new String(content,0,readCnt));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 将关闭流的方法，放在finally语句块中，保证这个流一定会关闭
            if(fil != null) {
                // 如果这个流不为空就关闭，并处理异常
                try {
                    fil.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
