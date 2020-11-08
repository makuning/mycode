public abstract class Cooker{
    public String name;
    public String Country;
    public Menu menu;
}

class ChineseCooker extends Cooker implements Menu{
    public String name = "厨师马昆";
    public String Country = "中国";
    public void cookDish1(){
        System.out.println("来自" + Country + "的" + name + "正在做中国菜1");
    };
    public void cookDish2(){
        System.out.println("来自" + Country + "的" + name + "正在做中国菜2");
    };
}