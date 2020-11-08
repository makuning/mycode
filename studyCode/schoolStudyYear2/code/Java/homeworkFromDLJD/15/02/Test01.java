/*
    结构，思路较为清晰的接口/抽象类案例
    定义了：
        一个抽象类并连接一个接口：厨师Cooker连接接口Menu
        一个抽象类：顾客Customer
        一个接口：Menu
        二个继承厨师的类：中国厨师ChineseCooker，需要实现父类的抽象方法（包括父类的接口Mune）
                        美国厨师AmericanCooker，需要实现父类的抽象方法（包括父类的接口Mune）
                        接口的实现者
        一个继承顾客的类：中国顾客ChineseCustomer，需要实现父类的抽象方法（点餐方法）
            点餐方法：接口的调用者，在点餐方法传入参数Menu接口，这样顾客点餐就和厨师分离了，顾客不用管完成这个菜单的人是谁，厨师也不用知道是谁点餐，
            只需要去实现菜单就好，order方法里传的Mune不同（使用多态），去完成这个菜单的厨师就不同，高扩展，低耦合
        */
public class Test01{
    public static void main(String[] args){
        Cooker cooker1 = new ChineseCooker("厨师马昆","中国");
        Customer customer1 = new ChineseCustomer("顾客马昆","中国");
        Cooker cooker2 = new AmericanCooker("厨师李欣怡","美国");
        customer1.order(cooker1);
        System.out.println("------------------------------------------------------------------------------");
        customer1.order(cooker2);
    }
}