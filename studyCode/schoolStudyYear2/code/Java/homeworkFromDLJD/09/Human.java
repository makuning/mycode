
public class Human {
    public static void main(String[] args){
        Husband hus1 = new Husband();
        Wife wi1 = new Wife();

        hus1.name = "����";
        hus1.setIdCard("20010624");
        hus1.setAge(19);

        wi1.name = "������";
        wi1.setIdCard("????????");
        wi1.setAge(18);

        hus1.setHusband(wi1);
        wi1.setHusband(hus1);

        System.out.println("������" + hus1.name);
        System.out.println("�Ա�" + (Husband.sex ? "��" : "Ů"));
        System.out.println("���䣺" + hus1.getAge());
        System.out.println("���֤�ţ�" + hus1.getIdCard());
        System.out.println("���ӣ�" + hus1.wife.name);

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        System.out.println("������" + wi1.name);
        System.out.println("�Ա�" + (Wife.sex ? "��" : "Ů"));
        System.out.println("���䣺" + wi1.getAge());
        System.out.println("���֤�ţ�" + wi1.getIdCard());
        System.out.println("�ɷ�" + wi1.husband.name);
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
            System.out.println("�Բ������䲻��Ϊ����");
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
            System.out.println("�Բ������䲻��Ϊ����");
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