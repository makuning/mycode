package com.makun.javase.collection.map;

import java.util.*;

// 用于对map集合的理解
public class MapTest01 {
    public static void main(String[] args) {
        /*
        * Collection中的Set接口中的HashSet和TreeSet都是使用了Map集合的Key部分
        * 所以放在这里学习*/

        // 新建一个HashMap集合，使用Map接口的引用来装
        Map map1 = new HashMap();
        // 新建一个泛型HashMap集合；
        Map<String,String> map2 = new HashMap<>();

        // new 几个User对象
        User u1 = new User("Makun",17);
        User u2 = new User("马昆",12);
        User u3 = new User("马某人",18);
        User u4 = new User("马日比",20);
        User u5 = new User("MK",19);

        // 向map1集合中添加键值对
        map1.put("第一名",u1);
        map1.put("第二名",u2);
        map1.put("第三名",u3);
        map1.put("第四名",u4);
        map1.put("第五名",u5);

        // 向map2集合中添加键值对
        map2.put("姓名","马昆");
        map2.put("性别","男");
        map2.put("年龄","19");
        map2.put("生日","2001-06-24");
        map2.put("住址","四川眉山");

        System.out.println("map1集合中的元素个数是：" + map1.size());
        System.out.println("map2集合中的元素个数是：" + map2.size());

        // 获取所有的value来凑成Collection集合
        Collection map1Values = map1.values();
        Collection map2Values = map2.values();

        // 使用迭代器遍历
        Iterator map1ValuesIt = map1Values.iterator();
        Iterator map2ValuesIt = map2Values.iterator();

        System.out.println("使用迭代器遍历map1的value集合");
        while(map1ValuesIt.hasNext()) {
            System.out.println(map1ValuesIt.next());
        }

        System.out.println("使用迭代器遍历map2的value集合");
        while(map2ValuesIt.hasNext()) {
            System.out.println(map2ValuesIt.next());
        }

        // Set<Map.Entry<K,V>> entrySet();（这种效率高于上面方法的效率，比较适合于大数据量）
        /*
        这个方法是把Map集合直接全部转换成Set集合。
        Set集合中元素的类型是：Map.Entry
        */
        Set<Map.Entry<Integer,String>> map1Set = map1.entrySet();
        // 遍历Set集合，每一次取出一个Node
        Iterator<Map.Entry<Integer,String>> map1SetIt = map1Set.iterator();
        for(Map.Entry<Integer,String> map : map1Set) {
            System.out.println(map);
        }

    }
}


// 自定义一个User类
class User {
    // 姓名
    private String name;
    // 年龄
    private int age;

    // 干饭方法
    public void eat() {
        System.out.println("干饭人，干饭魂，干饭都是人上人，我！[" + this.getName() + "]，又来干饭了！！！");
    }

    // 构造方法
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写一些父类的方法


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "一位[" + this.getAge() + "]的叫做[" + this.getName() + "]的帅哥！！！";
    }

    public User() {
    }

    // set and get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}