
public class Student {
    public static void main(String[] args){
        Student.from();
        Student s1 = new Student("����","19301079");

        s1.study();
    }


    public String sName;
    public String sNo;
    public static String sFrom = "�й�";

    public Student(){

    }

    public Student(String sName,String sNo){
        this.sName = sName;
        this.sNo = sNo;
    }

    public static void from(){
        System.out.println("��������" + sFrom + "��ѧ��");
    }

    public void study(){
        new Student("����","222222");

        System.out.println(this.sName + "����ͼ���ѧϰ��");
    }
}
