package com.makun.javase.reflection.reflectclass;

// 创建一个专门用来学习反射机制的类
public class Me {
    // 我的属性
    public static final String TYPE = "人";
    public static final String HOME = "眉山";
    String hobby;
    private String name;
    public boolean sex;
    private int age;
    private String telephone;

    // 我的功能，方法
    public static void breath() {
        System.out.println("我正在呼吸。");
    }

    public void eat() {
        System.out.println("我在吃饭。");
    }

    public String memory(String thing1,String thing2) {
        return "我记住了两件事，1[" + thing1 + "]，2[" + thing2 + "]";
    }

    public int sum(int num1,int num2) {
        System.out.println("我还会计算，答案是[" + (num1+num2) + "]");
        return num1 + num2;
    }

    // 我的静态代码块
    static {
        System.out.println("我的静态代码块执行了！");
    }

    // 我的父类重写

    @Override
    public String toString() {
        return Me.HOME + "的" + Me.TYPE + "{姓名：[" + this.name + "]，性别：[" + (this.sex ? "男" : "女")
                + "]，年龄[" + this.age + "]，电话号码[" + this.telephone +"]}";
    }


    // 我的构造方法
    public Me(String hobby,String name, boolean sex, int age, String telephone) {
        this.hobby = hobby;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.telephone = telephone;
    }

    public Me() {

    }


    // 我的set，get方法


    public static String getTYPE() {
        return TYPE;
    }

    public static String getHOME() {
        return HOME;
    }

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
