package com.makun.javase.array.homework.simulatestack;

public class Test01 {
    public static void main(String[] args) {
        MyStack m1 = new MyStack();
        // 模拟创建10个方法
        String func1 = "func1";
        String func2 = "func2";
        String func3 = "func3";
        String func4 = "func4";
        String func5 = "func5";
        String func6 = "func6";
        String func7 = "func7";
        String func8 = "func8";
        String func9 = "func9";
        String func10 = "func10";

        // 输出栈内存数据
        outputStack(m1.getStack());

        // 方法1压栈
        m1.push(func1);
        // 方法2压栈
        m1.push(func2);
        // 方法3压栈
        m1.push(func3);
        // 方法4压栈
        m1.push(func4);
        // 方法5压栈
        m1.push(func5);

        // 输出栈内存数据
        outputStack(m1.getStack());

        // 方法6压栈
        m1.push(func6);
        // 方法7压栈
        m1.push(func7);
        // 方法8压栈
        m1.push(func8);
        // 方法9压栈
        m1.push(func9);
        // 方法10压栈
        m1.push(func10);

        // 输出栈内存数据
        outputStack(m1.getStack());

        // 这时栈内存已满，再压栈
        m1.push(func1);

        // 这时栈内存已满，进行数据错误单个弹栈
        m1.pop(func2);

        // 这时栈已满，进行数据正确单个弹栈
        m1.pop(func10);

        // 输出栈内存数据
        outputStack(m1.getStack());

        // 清空栈内存
        m1.pop();

        // 输出栈内存数据
        outputStack(m1.getStack());

        // 这时已清空栈内存，再进行全部弹栈
        m1.pop();

        // 这时已经清空栈内存，再进行全家内部弹栈(参数错误)
        m1.pop("isjfisdjifidj");

        // 这时已经清空栈内存，再进行全家内部弹栈(参数正确)
        m1.pop(null);

        // 输出栈内存数据
        outputStack(m1.getStack());
    }


    // 定义一个输出栈内存一维引用数组的方法
    public static void outputStack (Object[] obj) {
        System.out.println("************************打印输出栈内存中存储的数据**********************");
        for (int i = 0 ; i < obj.length ; i++) {
            System.out.println(obj[i] + "\t");
        }
    }
}
