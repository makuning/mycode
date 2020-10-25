
public class Student {
    public static void main(String[] args){
        Student.from();
        Student s1 = new Student("马昆","19301079");

        s1.study();
    }


    public String sName;
    public String sNo;
    public static String sFrom = "中国";

    public Student(){

    }

    public Student(String sName,String sNo){
        this.sName = sName;
        this.sNo = sNo;
    }

    public static void from(){
        System.out.println("这是来自" + sFrom + "的学生");
    }

    public void study(){
        new Student("李四","222222");

        System.out.println(this.sName + "正在图书馆学习。");
    }
}
