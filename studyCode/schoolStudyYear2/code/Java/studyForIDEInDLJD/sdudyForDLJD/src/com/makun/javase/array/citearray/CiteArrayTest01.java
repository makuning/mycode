package com.makun.javase.array.citearray;
/*
* 数组存储对象，只是存储的引用，也就是说它存储的就是一个内存地址，去指向对象
* 并且这个数组存储的对象类型已经在数组声明的时候定了要求
* 例如：Animal[] animals = new Animal[5];
* 这样动态定义Animal数组，它会给这5个引用赋初值，也就是null
* 在之后给这5个引用赋值的时候必须是Animal类
* 这个必须是Animal类指的是，它必须是一个Animal
* 也就是说，它可以是Animal的子类，目前我只知道这么多，不知道能不能放接口之类的
* 下面我就测试一下引用数组，里面放子类，已经使用多态调用子类的方法
* */
public class CiteArrayTest01 {
    public static void main(String[] args) {
        // 动态定义一个Animal对象数组
        Animal[] animals = new Animal[10];
        // 定义三个猫对象
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        // 定义三个狗对象
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        // 定义三个鸟对象
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        // 定义一个动物对象
        Animal animal1 = new Animal();

        // 输出一下引用数组
        // 这里重写了Animal类的toString方法，输出一个引用时，如果这个引用不为null，println会默认调用类的toString方法
        // 然而Java系统给每个数组中的元素赋了初值为null，所以输出的都为null，不会调用toString方法，否则会出现空的引用的异常
        MyMath.outputArray(animals);
        // 把这些对象赋值给之前定义的引用数组
        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = cat3;
        animals[3] = dog1;
        animals[4] = dog2;
        animals[5] = dog3;
        animals[6] = bird1;
        animals[7] = bird2;
        animals[8] = bird3;
        animals[9] = animal1;

        // 分割线
        MyMath.cutOff();

        // 输出一下animals数组
        // 因为这里的数组元素有值了，不为空了，所以输出的时候会调用他们的toString方法
        MyMath.outputArray(animals);

        // 这里写一个循环来调用他们的move方法（多态），这里因为子类重写了父类的move方法，所以会有些不同
        for (int i = 0 ; i < animals.length ; i++) {
            animals[i].move();
        }

        // 分割线
        MyMath.cutOff();

        // 这里写一个for循环来调用属于子类独有的eat方法，如果是父类Animal就调用move方法，会用到instanceof判断关键字
        for (int i = 0 ; i < animals.length ; i++) {
            // 判断当前对象是不是Cat
            if (animals[i] instanceof Cat) {
                // 向下转型，强转为Cat
                Cat a = (Cat) animals[i];
                // 调用子类的eat方法
                a.eat();
                // 判断当前对象是不是Dog
            } else if (animals[i] instanceof Dog) {
                // 向下转型，强转为Dog
                Dog d = (Dog) animals[i];
                // 调用子类的eat方法
                d.eat();
                // 判断当前对象是不是Birds
            } else if (animals[i] instanceof Bird) {
                // 向下转型，强转为Dog
                Bird b = (Bird) animals[i];
                // 调用子类的eat方法
                b.eat();
                // 如果都不是，那么它就是Animal，Animal中没有eat方法，就直接调用move方法
            } else {
                animals[i].move();
            }
        }

        // 结束提示
        System.out.println("Nice ！！！ 完美运行！！！");
    }
}

// 这个类用来装我自定义的代码，方便调用
class MyMath {
    public static void outputArray (Object[] objs) {
        for (int i = 0 ; i < objs.length ; i++) {
            System.out.println(objs[i]);
        }
    }
    public static void cutOff () {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
    }
}

class Animal {
    // 定义了一个动物移动的方法
    public void move () {
        System.out.println("动物在移动...");
    }

    // 重写父类Object的toString方法
    @Override
    public String toString() {
        return "这是一个动物...";
    }
}

class Cat extends Animal {
    // 重写父类动物的move方法
    public void move () {
        System.out.println("猫在走猫步...");
    }

    // 定义了一个吃东西的方法，属于子类自己的方法
    public void eat () {
        System.out.println("猫在吃老鼠...");
    }

    // 重写父类Object的toString方法
    @Override
    public String toString() {
        return "这是一只小猫...";
    }
}

class Dog extends Animal {
    // 重写父类动物的move方法
    public void move () {
        System.out.println("狗在奔跑...");
    }

    // 定义了一个吃东西的方法，属于子类自己的方法
    public void eat () {
        System.out.println("狗在吃骨头...");
    }

    // 重写父类Object的toString方法
    @Override
    public String toString() {
        return "这是一只小狗...";
    }
}

class Bird extends Animal {
    // 重写父类动物的move方法
    public void move () {
        System.out.println("鸟在飞翔...");
    }

    // 定义了一个吃东西的方法，属于子类自己的方法
    public void eat () {
        System.out.println("鸟在吃骨头...");
    }

    // 重写父类Object的toString方法
    @Override
    public String toString() {
        return "这是一只小鸟...";
    }
}
