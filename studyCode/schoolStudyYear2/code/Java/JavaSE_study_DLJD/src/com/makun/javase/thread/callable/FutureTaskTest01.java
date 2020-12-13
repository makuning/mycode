package com.makun.javase.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// 有返回值的线程，未来任务
/*
* 自我描述：
* 先新建一个实现Callable接口的类，它有一个call方法，和run类似，只是有了返回值
* 在这个call方法中写你需要执行的东西，然后返回你需要的数据
* 在主程序main方法中创建一个未来任务，传入刚刚写的实现Callable接口的类的对象，当然，也可以使用匿名内部类的方式
* 然后再将这个未来任务包装成一个线程Thread，然后开启这个线程
* 就可以使用这个未来任务对象的get方法获取到这个call方法结束后的返回值数据了
* 使用get方法时，在未获取到它的返回值之前，会将当前线程阻塞，直到获取到返回值*/
public class FutureTaskTest01 {
    public static void main(String[] args) {
        // 创建有返回值的线程对象（实现Callable接口）
        HaveReturn haveReturn = new HaveReturn();
        // 创建一个未来任务对象（使用了泛型，只能返回String）
        FutureTask<String> futureTask = new FutureTask<>(haveReturn);

        // 创建这个有返回值的线程
        Thread thread = new Thread(futureTask);

        // 开启线程
        thread.start();

        // 获取这个线程的返回值（抓住异常）
        try {
            String result = futureTask.get();
            // 输出这个返回值
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

// 创建一个实现Callable的类，有返回值的线程
class HaveReturn implements Callable<String> {

    @Override
    public String call() throws Exception {
        // 设置这个线程的名字
        Thread.currentThread().setName("有返回值的线程");
        int i = 0;
        for(; i < 10;i++) {
            System.out.println("这是第[" + i + "]次循环。");
        }
        return "这个有返回值的[" + Thread.currentThread().getName() + "]线程执行了" + i + "次循环。";
    }
}

