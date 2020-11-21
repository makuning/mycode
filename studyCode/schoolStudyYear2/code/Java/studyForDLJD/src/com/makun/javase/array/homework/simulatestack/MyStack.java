package com.makun.javase.array.homework.simulatestack;
/*
* 第一题:
* 编写程序，使用一维数组，模拟栈数据结构。
* 实际上，栈中只是装方法执行需要的变量的空间
*
* 要求:
* 1、这个栈可以存储java中的任何引用类型的数据。
* 2、在栈中提供push方法模拟压栈。(栈满了，要有提示信息。)
* 3、在栈中提供pop方法模拟弹栈。(栈空了 ，也有有提示信息。)
* 4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
*
* 这是第一个构思，还有第二个构思。
* 失败了。
* */
public class MyStack {
    // 定义一个模拟栈空间的一维数组，有十个空间，可以装任何引用类型的数据的数据
    private Object[] stack = new Object[10];

    // 定义一个布尔型来表示栈空间是否占满了，初始化未占满
    private boolean ifFull = false;

    // 模拟压栈的方法，压栈指的是一个方法执行的时候会在栈空间内给这个方法腾出它需要的空间
    // 参数obj：需要压栈的对象（实际上对象是存储在堆内存中的，方法区存储静态的）
    public void push (Object obj) {
        // 判断栈是否占满
        if (this.ifFull) {
            System.out.println("栈空间已满，你不能再压栈了。");
        } else {
            // 栈没有占满，就顺序压栈
            for (int i = 0 ; i < this.stack.length ; i++) {
                // 找到最近的没有压栈的槽位，进行压栈，输出提示信息，并结束程序
                 if (this.stack[i] != null) {
                     this.stack[i] = obj;
                     // 输出提示信息
                     System.out.println("您在[" + (i+1) + "]号槽位将[" + obj + "]压栈成功！");
                     if (i == 9) {
                         // 如果在10号位压了栈，就代表栈已经满了
                         this.ifFull = true;
                     }
                     return;
                 }
            }
        }
    }

    // 模拟弹栈的方法，弹栈指的是一个方法执行结束的时候会在栈空间内释放这个方法的空间
    // 指定弹栈：因为栈空间的数据结构是先压栈的后弹栈，所以弹栈的都是最上面的，所以进行一下判断
    public void pop (Object obj) {
        // 找到最面上压栈的对象
        for (int i = (this.stack.length - 1) ; i > -1 ; i--) {
            if (this.stack[i] != null) {
                if (this.stack[i] != obj) {
                    // 判断输入的参数是否与栈顶的数据匹配，不匹配则输出提示信息
                    System.out.println("您输入的对象与栈顶的数据不匹配!");
                } else {
                    // 输入的参数正确就弹栈
                    this.stack[i] = null;
                    // 输出提示信息
                    System.out.println("您在[" + (i+1) + "]号槽位将[" + obj + "]弹栈成功！");
                    return;
                }
            }
        }
    }
    // 全部弹栈，方法重载
    public void pop () {
        // 依次将模拟栈空间的stack数组的数据倒序清空（从最后往前清空为null）
        for (int i = (this.stack.length - 1) ; i > -1 ; i--) {

            // 从后面找到这个不为空的槽位
            if (this.stack[i] != null) {

                // 因为知道它之前的槽位都是被占的，这是栈结构的特点，先压栈的后弹栈，所以是从后面往前依次弹栈
                for (int j = i ; j > -1 ; j--) {
                    // 依次清空
                    this.stack[j] = null;
                    // 输出提示信息
                    System.out.println("您在[" + (j+1) + "]号槽位将[" + this.stack[j] + "]弹栈成功！");
                }

                // 不管ifFull是什么值，栈清空了就给它重新赋值为false
                this.ifFull = false;

                // 清空后就结束循环
                break;
            }
        }
    }

    // get、set方法
    public Object[] getStack() {
        return stack;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }

    public boolean getIfFull() {
        return ifFull;
    }

    public void setIfFull(boolean ifFull) {
        this.ifFull = ifFull;
    }
}
