/*
    2.1.��̬��ϰ��
    ��д����ģ��"����"ι������"�ĳ���:
    r
    ��ʾ1:
    ������: Master
    ������: Pet
    ����������:
    Dog��Cat�� YingWu
    ��ʾ2:
    ����Ӧ����ι���ķ���: feed()
    ����Ӧ���гԵķ���: eat()
    ֻҪ����ι�������ͳԡ�
    Ҫ��:��������ֻ�ṩһ-��ι������feed(),Ҫ��ﵽ����ι���������͵ĳ��
    ��д���Գ���:
    �������˶���
    �������ֳ������
    �������˵�ι������feed()��ι����ͬ�ĳ���۲�ִ�н����
    ͨ���ð���������̬�ڿ����е����á�
    ��Ҫ��ʾ: feed�����Ƿ���Ҫһһ������������ѡʲô����! ! !

*/
public class Master{
    private String name = "����";

    public void feed(Pet pet){
        System.out.println(name + "ι" + pet.getName() + "�Զ�����");
        pet.eat();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Pet{
    public String name = "����";

    public void eat(){
        
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Pet{
    private String name = "��";

    public void eat(){
        System.out.println(name + "ϲ���Թ�ͷ��");
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Pet{
    private String name = "è";

    public void eat(){
        System.out.println(name + "ϲ��������");
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Yingwu extends Pet{
    private String name = "����";

    public void eat(){
        System.out.println(name + "ϲ���Գ��ӡ�");
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}