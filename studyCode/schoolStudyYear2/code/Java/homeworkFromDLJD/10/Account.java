/*
    该类包括的属性:账户id,余额balance,年利率annualInterestRate:
    包含的方法:各属性的set和get方法。取款方法withdraw(),存款方法deposit ()
*/
public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public void withdarw(double money){
        this.balance += money;
        System.out.println("成功存入：" + money + "元。");
    }
    public void deposit(double money){
        if(this.balance < money){
            System.out.println("余额不足，取钱失败！！！");
            return;
        }
        this.balance -= money;
        System.out.println("成功取出：" + money + "元。");
        return;
    }

    public Account(){
        this.id = "000000";
        this.balance = 0D;
        this.annualInterestRate = 0.05D;
    }
    public Account(String id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
}

/*
    创建一个customer, 名字叫Jane Smith, 他有- -个账号为1000， 余额为2000， 年利率为1.
    Customer [ Smith, Jane] has a account : id is 1000 annualInterestRate is 1.238 balance is 15151.
*/

class Customer{
    private String firstname;
    private String lastname;
    private boolean sex;
    private String idCard;
    private Account account;

    public void typeInformation(){
        System.out.println("Customer [ " + this.lastname +", " + this.firstname + "] has a account : id is "
         + this.getAccount().getId() + " annualInterestRate is " + this.getAccount().getAnnualInterestRate()
          + " balance is " + this.getAccount().getBalance() + " .");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }

    public Customer(){
        this.firstname = "unknown";
        this.lastname = "unknown";
        this.sex = false;
        this.idCard = "unknown";
    }
    public Customer(String firstname,String lastname,boolean sex,String idCard,Account account){
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.idCard = idCard;
        this.account = account;
    }

    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public boolean getSex(){
        return this.sex;
    }
    public void setSex(boolean sex){
        this.sex = sex;
    }
    public String getIdCard(){
        return this.idCard;
    }
    public void setIdCard(String idCard){
        this.idCard = idCard;
    }
    public Account getAccount(){
        return this.account;
    }
    public void setAccount(Account account){
        this.account = account;
    }
}