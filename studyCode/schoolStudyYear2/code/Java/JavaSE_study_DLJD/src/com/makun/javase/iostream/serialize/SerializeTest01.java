package com.makun.javase.iostream.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 用于对序列化和反序列化的学习
// 这个程序用于序列化
public class SerializeTest01 {
    public static void main(String[] args) throws IOException {
        // 新建一个User泛型的List集合
        ArrayList<User> arrayList = new ArrayList<>();
        // 创建几个User对象
        User u1 = new User("马昆",true,19,"1996079","四川眉山",true);
        User u2 = new User("张三",true,11,"02840884","四川",false);
        User u3 = new User("李四",true,12,"2081408","云南",false);
        User u4 = new User("王五",true,13,"20845092805","贵州",true);
        User u5 = new User("瘤子",true,89,"20840928","上海",false);
        User u6 = new User("李三",true,22,"978979","北京",true);
        User u7 = new User("丽丽",false,15,"92748927","南昌",false);
        User u8 = new User("莉莉",false,19,"223434","贵州",true);
        User u9 = new User("李丽",false,18,"111111","新疆",false);

        // 将User对象添加到List集合中
        arrayList.add(u1);
        arrayList.add(u2);
        arrayList.add(u3);
        arrayList.add(u4);
        arrayList.add(u5);
        arrayList.add(u6);
        arrayList.add(u7);
        arrayList.add(u8);
        arrayList.add(u9);

        // 创建一个文件字节输出流
        FileOutputStream fos = new FileOutputStream("src\\com\\makun\\javase\\iostream\\serialize\\serialize");

        // 使用ObjectOutputStream，创建一个对象输出流，输出到传入的文件字节输出流中的文件中
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 使用对象输出流，将ArrayList对象 序列化 输出到文件中
        oos.writeObject(arrayList);

        // 刷新管道
        oos.flush();
        // 关闭管道
        oos.close();
    }
}

