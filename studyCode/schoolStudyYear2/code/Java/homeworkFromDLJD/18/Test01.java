public class Test01 {
    public static void main (String[] args) {
        Student stu1 = new Student("马昆",18);
        Student stu2 = new Student("MaKun",18);
        Student stu3 = new Student("马昆",18);
        Student stu4 = null;
        Student stu5 = stu1;

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
        System.out.println(stu3.toString());
        System.out.println(stu5.toString());
        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu3));
        System.out.println(stu1.equals(stu4));
        System.out.println(stu1.equals(stu5));

        for (int i = 0 ; i < 100 ; i++) {
            new Student();
            System.gc();
        }
    }
}