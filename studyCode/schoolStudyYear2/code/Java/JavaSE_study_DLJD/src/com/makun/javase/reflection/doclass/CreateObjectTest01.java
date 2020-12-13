package com.makun.javase.reflection.doclass;

// 用于对 使用反射机制创建对象的学习
public class CreateObjectTest01 {
    public static void main(String[] args) {
        // 普通方法创建对象
        User user1 = new User();
        User user2 = new User("马昆",true);
        System.out.println(user1);
        System.out.println(user2);

        // 使用反射机制创建对象
        // 抓住异常（空的引用异常）
        try {
            // 先找到这个类的class文件
            Class userClass = Class.forName("com.makun.javase.reflection.doclass.User");
            // 使用这个Class对象的newInstance()方法调用这个class文件的无参构造方法（这个方法已过时了）
            Object user3 = userClass.newInstance();
            System.out.println(user3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}

// 创建一个User类
class User {
    // 属性
    private String name;
    private boolean sex;
    public static final String TYPE = "用户";

    @Override
    public String toString() {
        return "这是一个[" + User.TYPE +"]，姓名[" + this.getName() + "],性别[" + (this.isSex() ? "男" : "女") + "]";
    }

    public User() {
        System.out.println("无参构造被调用。");
    }

    public User(String name,boolean sex) {
        System.out.println("有参构造被调用。");
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}