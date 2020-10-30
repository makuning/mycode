/*
    二、写一个名为Account的类模拟账户。
    该类的属性和方法如下所示。
    该类包括的属性:账户id,余额balance,年利率annualInterestRate:
    包含的方法:各属性的set和get方法。取款方法wi thdraw(),存款方法deposit ()
    写一个测试程序
    (1)创建一个customer, 名字叫Jane Smith, 他有- -个账号为1000， 余额为2000， 年利率为1.
    (2)对Jane Smith操作:
    存入100元，再取出960元，再取出2000。
    打印Jane Smith的基本信息
    信息如下显示:
    成功存入: 100
    成功取出: 960
    余额不足，取钱失败
    Customer [ Smith, Jane] has a account : id is 1000 annualInterestRate is 1.238 balance is 15151.
*/
public class Test01{
    public static void main(String[] args){
        Account a1 = new Account();
        Customer c1 = new Customer();

        a1.setId("1000");
        a1.setBalance(2000);
        a1.setAnnualInterestRate(1.21);

        c1.setFirstname("Jane");
        c1.setLastname("Smith");
        c1.setAccount(a1);

        c1.getAccount().withdarw(100);
        c1.getAccount().deposit(960);
        c1.getAccount().deposit(2000);
        c1.typeInformation();

        Account lixinyiAccount = new Account("20021026", 5201314, 10);
        Customer lixinyi = new Customer("李", "欣怡", false, "20021026", lixinyiAccount);

        lixinyi.getAccount().withdarw(5555555);
        lixinyi.getAccount().deposit(12345);
        lixinyi.getAccount().deposit(789798);
        lixinyi.typeInformation();

        Account makunAccount = new Account("20010624",2500,10);
        Customer makun = new Customer("马", "昆", true, "20010624", makunAccount);
        makun.getAccount().withdarw(2000);
        makun.getAccount().deposit(4200);
        makun.getAccount().deposit(500);
        makun.typeInformation();
    }
}