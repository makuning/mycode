/*
    三、(封装) 已知一一个类student 代码如下:
    class Student{
    String name;
    int age;
    String address ;
    String zipCode;
    String mobile ;
    要求:
    1、把student的属性都作为私有，并提供get/set 方法以及适当的构造方法。
    2、为student类添加一-个getPostAddress方法，要求返回student对象的地址和邮编。
*/
public class Student{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;

    public String getPostAddress(){
        return "地址为：" + this.getAddress() + "\n邮政地址为：" + this.getZipCode();
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