public class Test01{
    public static void main(String[] args){
        Menu m1 = new ChineseCooker();
        Customer c1 = new ChineseCustomer();
        c1.menu = m1;
        c1.menu.cookDish1();
    }
}