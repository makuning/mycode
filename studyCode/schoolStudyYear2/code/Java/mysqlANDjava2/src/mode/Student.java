package mode;

public class Student {
    String stu_id,stu_name,stu_sex,stu_birth,stu_dept;
    //set（设置）,get（获取）方法
    public void setStu_id(String stu_id){
        this.stu_id = stu_id;
    }
    public String getStu_id(){
        return this.stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_sex() {
        return stu_sex;
    }

    public void setStu_sex(String stu_sex) {
        this.stu_sex = stu_sex;
    }

    public String getStu_birth() {
        return stu_birth;
    }

    public void setStu_birth(String stu_birth) {
        this.stu_birth = stu_birth;
    }

    public String getStu_dept() {
        return stu_dept;
    }

    public void setStu_dept(String stu_dept) {
        this.stu_dept = stu_dept;
    }

    //构造方法
    public Student(){
        System.out.println("这是不带参数的构造方法");
    }
    public Student(String stu_id,String stu_name,String stu_sex,String stu_birth,String stu_dept){
        System.out.println("这是带参数的构造方法");
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_sex = stu_sex;
        this.stu_birth = stu_birth;
        // this.stu_dept = stu_dept;
    }
}


