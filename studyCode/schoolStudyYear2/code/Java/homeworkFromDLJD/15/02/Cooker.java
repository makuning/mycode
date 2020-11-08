public abstract class Cooker implements Menu{
    private String name;
    private String country;

    public Cooker(String name,String country){
        this.setName(name);
        this.setCountry(country);
    }
    public Cooker(){
        this.setName("匿名");
        this.setCountry("未知");
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

class ChineseCooker extends Cooker{
    
    
    public ChineseCooker(String name,String country){
       super(name,country);
    }
    public ChineseCooker(){
        super("马昆","中国");
    }

    public void dish1(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第一个菜");
    };
    public void dish2(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第二个菜");
    };
    public void dish3(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第三个菜");
    };
    public void dish4(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第四个菜");
    };
    public void dish5(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第五个菜");
    };
}

class AmericanCooker extends Cooker{
    
    
    public AmericanCooker(String name,String country){
       super(name,country);
    }
    public AmericanCooker(){
        super("李欣怡","美国");
    }

    public void dish1(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第一个菜");
    };
    public void dish2(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第二个菜");
    };
    public void dish3(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第三个菜");
    };
    public void dish4(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第四个菜");
    };
    public void dish5(){
        System.out.println("来自" + this.getCountry() + "的" + this.getName() + "正在做第五个菜");
    };
}