public class Student {
    // 属性：姓名、年龄
    private String name;
    private int age;

    // 构造方法
    public Student () {}
    public Student (String name,int age) {
        this.name = name;
        this.age = age;
    }

    // 重写toString方法
    public String toString() {
        String infor = "Name:" + this.getName() + "\nAge:" + this.getAge();
        return infor;
    }

    // 重写equals()方法
    public boolean equals(Object obj) {
        if (obj == this) {return true;}
        if (obj == null || !(obj instanceof Student)) {return false;}

        Student s = (Student) obj;
        if (this.getName().equals(s.getName()) && this.getAge() == s.getAge()) {
            return true;
        } else {
            return false;
        }
    }
    // 重写finalize()方法
    protected void finalize() throws Throwable {
        System.out.println("这个Student对象正被销毁...");
    }

    // get、set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}