/*
    ����(��װ) ��֪һһ����student ��������:
    class Student{
    String name;
    int age;
    String address ;
    String zipCode;
    String mobile ;
    Ҫ��:
    1����student�����Զ���Ϊ˽�У����ṩget/set �����Լ��ʵ��Ĺ��췽����
    2��Ϊstudent�����һ-��getPostAddress������Ҫ�󷵻�student����ĵ�ַ���ʱࡣ
*/
public class Student{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;

    public String getPostAddress(){
        return "��ַΪ��" + this.getAddress() + "\n������ַΪ��" + this.getZipCode();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getZipCode(){
        return this.zipCode;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public String getMobile(){
        return this.mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
}