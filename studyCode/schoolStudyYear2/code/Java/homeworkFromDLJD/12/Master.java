/*
    2.1.多态练习题
    编写程序模拟"主人"喂养宠物"的场景:
    r
    提示1:
    主人类: Master
    宠物类: Pet
    宠物类子类:
    Dog、Cat、 YingWu
    提示2:
    主人应该有喂养的方法: feed()
    宠物应该有吃的方法: eat()
    只要主人喂宠物，宠物就吃。
    要求:主人类中只提供一-个喂养方法feed(),要求达到可以喂养各种类型的宠物。
    编写测试程序:
    创建主人对象
    创建各种宠物对象
    调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。
    通过该案例，理解多态在开发中的作用。
    重要提示: feed方法是否需要一一个参数，参数选什么类型! ! !

*/
public class Master{
    private String name = "主人";

    public void feed(Pet pet){
        System.out.println(name + "喂" + pet.getName() + "吃东西。");
        pet.eat();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Pet{
    public String name = "宠物";

    public void eat(){
        
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Pet{
    private String name = "狗";

    public void eat(){
        System.out.println(name + "喜欢吃骨头。");
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Pet{
    private String name = "猫";

    public void eat(){
        System.out.println(name + "喜欢吃老鼠。");
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Yingwu extends Pet{
    private String name = "鹦鹉";

    public void eat(){
        System.out.println(name + "喜欢吃虫子。");
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}