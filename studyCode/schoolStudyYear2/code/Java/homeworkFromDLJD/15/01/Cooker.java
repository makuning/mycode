public abstract class Cooker{
    public String name;
    public String Country;
    public Menu menu;
}

class ChineseCooker extends Cooker implements Menu{
    public String name = "��ʦ����";
    public String Country = "�й�";
    public void cookDish1(){
        System.out.println("����" + Country + "��" + name + "�������й���1");
    };
    public void cookDish2(){
        System.out.println("����" + Country + "��" + name + "�������й���2");
    };
}