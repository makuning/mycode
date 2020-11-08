public abstract class Customer{
    private String name;
    private String country;
    public abstract void order(Menu menu);

    public Customer(){
        this.setName("匿名");
        this.setCountry("未知");
    }
    public Customer(String name,String country){
        this.setName(name);
        this.setCountry(country);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}

class ChineseCustomer extends Customer{
    public ChineseCustomer(){
        super();
    }
    public ChineseCustomer(String name,String country){
        super(name,country);
    }

    public void order(Menu menu){
        menu.dish1();
        menu.dish2();
        menu.dish3();
        menu.dish4();
        menu.dish5();
    }
}