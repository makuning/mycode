package com.makun.javase.collection.collection;

import java.util.*;

// 用于对Collection接口，以及对 Collection 接口下的 Set 和 List 集合的学习
public class CollectionTest01 {
    public static void main(String[] args) {

        /*
        * 这部分是Collection接口和迭代器的学习
        * */


        // 定义一个可以存储任何引用类型的Collection 集合(这里用ArrayList集合来作为实例对象)
        Collection c1 = new ArrayList();
        // 定义一个只能存储我自定义的 User 引用类型的Collection 集合
        Collection<User> c2 = new ArrayList<>();

        // 为 c1 添加数据
        c1.add('我');
        c1.add('叫');
        c1.add('马');
        c1.add('某');
        c1.add('人');
        c1.add("我今年");
        c1.add(19);     // 自动装箱
        c1.add("岁了。");

        // new几个User对象
        User u1 = new User("马昆",19);
        User u2 = new User("Makun",18);
        User u3 = new User("马某人",10);
        User u4 = new User("马日比",14);
        User u5 = new User("马飞飞",19);


        // 为 c2 添加数据
        // c2.add("jdijid"); // c2 使用了泛型，只能添加User引用类型
        c2.add(u1);
        c2.add(u2);
        c2.add(u3);
        c2.add(u4);
        c2.add(u5);

        // 打印一下 c1 和 c2 的数据长度
        System.out.println("c1 集合共有" + c1.size() + "条数据。");
        System.out.println("c2 集合共有" + c2.size() + "条数据。");

        // 清除 c2 的数据
        System.out.println("清除了c2的数据。。。");
        c2.clear();
        System.out.println("c2 集合还有" + c2.size() + "条数据。");
        System.out.println("c2 集合是否为空？\t" + c2.isEmpty());

        // 重新加上数据
        System.out.println("重新给c2加上数据。。。");
        c2.add(u1);
        c2.add(u2);
        c2.add(u3);
        c2.add(u4);
        c2.add(u5);
        System.out.println("c2 集合还有" + c2.size() + "条数据。");

        // 查看c1 集合是否包含某个元素
        System.out.println("c1 集合包含 19 吗？\t" + c1.contains(19));

        // 删除c1 集合中的某个元素
        c1.remove('人');
        System.out.println("删除了'人'，c1 现在的数据量为：" + c1.size() + "个。");

        // 将c2 转换为数组
        System.out.println("将c2 转换为数组");
        Object[] o1 =  c2.toArray();
        // 遍历输出这个数组
        System.out.println("遍历输出这个Object数组");
        for(Object obj : o1) {
            System.out.println(obj);
            // 如果Obj是User类的对象的话，就调用干饭方法
            if(obj instanceof User) {
                User user = (User) obj;
                user.eat();
            }
        }

        // 拿到当前迭代器
        Iterator c1It = c1.iterator();
        Iterator<User> c2It = c2.iterator();

        // 不使用迭代器增加元素
        System.out.println("不使用迭代器添加元素");
        c1.add("这是不使用迭代器添加的元素。");
        System.out.println("使用迭代器");

        // 使用迭代器遍历一下c1 集合
        int c1Cnt = 0;
        // 下面的程序会报错：java.util.ConcurrentModificationException
/*        while(c1It.hasNext()) {
            c1Cnt++;
            System.out.println("c1 集合中第[" + c1Cnt + "]个元素为：" + c1It.next());
        }*/

        // 重新获取一下迭代器，这样就OK了
        c1It = c1.iterator();

        while(c1It.hasNext()) {
            c1Cnt++;
            System.out.println("c1 集合中第[" + c1Cnt + "]个元素为：" + c1It.next());
        }

        // 使用迭代器，迭代一下c2 集合
        System.out.println("使用迭代器，迭代一下c2 集合");
        int c2Cnt = 0;
        // 这里就不重新获取了，因为我并没有改变c2的内容
        while(c2It.hasNext()) {
            c2Cnt++;
            System.out.println("c2 集合中第[" + c2Cnt + "]个元素为：" + c2It.next());
        }



        /*
         * 这部分是Collection接口下的List集合的学习
         * */

/*        因为List集合有下标，所以List有自己特有的遍历方式（通过下标遍历）
        // new一个属于List接口的ArrayList集合
        List myList = new ArrayList();

        // 使用List接口的特殊方法来遍历ArrayList集合
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }*/

        // new 一个ArrayList对象，就使用ArrayList的引用来装，初始化长度为14（最好为偶数）
        ArrayList<User> arrayList1 = new ArrayList<>(14);

        // 这里使用的是ArrayList的方法，以及实现Collection接口中的方法
        // 把上面创建的User对象添加进来
        arrayList1.add(u1);
        arrayList1.add(u2);
        arrayList1.add(u3);
        arrayList1.add(u4);
        arrayList1.add(u5);

        System.out.println("u3第一次出现在集合的索引为：" + arrayList1.indexOf(u3));

        System.out.println("遍历输出一下arrayList1集合（使用下标的方式）：");
        for(int i = 0;i < arrayList1.size(); i++) {
            // 使用List集合的get方法，获取指定下标的元素
            User user = arrayList1.get(i);
            // 打印这个元素
            System.out.println("下标为[" + i + "]的元素是：\t" + user);
        }


        // new 一个新的User对象
        User u6 = new User("新建用户",12);
        System.out.println("修改下标为3的元素，" + "原来是：\t" + u4 + "现在是：\t" + u6);
        arrayList1.set(3,u6);

        System.out.println("遍历输出一下arrayList1集合（使用迭代器的方式）");
        // 获取迭代器
        Iterator<User> arrayList1It = arrayList1.iterator();
        // 使用迭代器迭代
        int arrayList1Cnt = 0;
        while(arrayList1It.hasNext()) {
            arrayList1Cnt++;
            User user = arrayList1It.next();
            System.out.println("第[" + arrayList1Cnt + "]的元素是：\t" + user);
        }

        // 将arrayList1集合转换成线程安全的
        // 使用集合工具类中的静态方法，传入ArrayList集合，将它转换为线程安全的
        Collections.synchronizedList(arrayList1);

        System.out.println("遍历输出一下arrayList1集合（使用增强for循环的方式）：");
        // 清零之前的计数器
        arrayList1Cnt = 0;
        for(User user : arrayList1) {
            arrayList1Cnt++;
            // 打印这个元素
            System.out.println("第[" + arrayList1Cnt + "]的元素是：\t" + user);
        }
    }
}


// 定义一个User类
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