
public class Human {
    public static void main(String[] args){
        Husband hus1 = new Husband();
        Wife wi1 = new Wife();

        hus1.name = "马昆";
        hus1.setIdCard("20010624");
        hus1.setAge(19);

        wi1.name = "李欣怡";
        wi1.setIdCard("????????");
        wi1.setAge(18);

        hus1.setHusband(wi1);
        wi1.setHusband(hus1);

        System.out.println("姓名：" + hus1.name);
        System.out.println("性别：" + (Husband.sex ? "男" : "女"));
        System.out.println("年龄：" + hus1.getAge());
        System.out.println("身份证号：" + hus1.getIdCard());
        System.out.println("妻子：" + hus1.wife.name);

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        System.out.println("姓名：" + wi1.name);
        System.out.println("性别：" + (Wife.sex ? "男" : "女"));
        System.out.println("年龄：" + wi1.getAge());
        System.out.println("身份证号：" + wi1.getIdCard());
        System.out.println("丈夫：" + wi1.husband.name);
    }
}


class Wife{
    public String name;
    static boolean sex = false;
    private int age;
    private String idCard;
    public Husband husband;

    public int getAge(){
        return this.age;
    }
    public void setAge(int length){
        if(length < 0){
            System.out.println("对不起，年龄不能为负数");
            return;
        }
        this.age = length;
        return; 
    }

    public String getIdCard(){
        return this.idCard;
    }
    public void setIdCard(String str){
        this.idCard = str;
        return;
    }

    public void setHusband(Husband husband){
        this.husband = husband;
        return;
    }
}

class Husband{
    public String name;
    static boolean sex = true;
    private int age;
    private String idCard;
    public Wife wife;

    public int getAge(){
        return this.age;
    }
    public void setAge(int length){
        if(length < 0){
            System.out.println("对不起，年龄不能为负数");
            return;
        }
        this.age = length;
        return; 
    }

    public String getIdCard(){
        return this.idCard;
    }
    public void setIdCard(String str){
        this.idCard = str;
        return;
    }

    public void setHusband(Wife wife){
        this.wife = wife;
        return;
    }
}