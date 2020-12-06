package com.makun.javase.iostream.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 用于对序列化和反序列化的学习
// 这个程序用于反序列化
public class SerializeTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建一个文件字节输入流，用于读取序列化的文件
        FileInputStream fis = new FileInputStream("src\\com\\makun\\javase\\iostream\\serialize\\serialize");

        // 创建一个对象输入流，用于将文件中的序列化对象 反序列化输入到内存中
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 已经反序列化，将之前的arrayList对象放在了内存中，找到它，需要强转
        ArrayList<User> arrayList = (ArrayList<User>) ois.readObject();

        // 开始读取arrayList中的数据
        for(User user : arrayList) {
            System.out.println(user);
            user.eat();
        }
    }
}
