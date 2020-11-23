package dao;

import mode.Student;

import java.util.List;

public class TestStudentDao {
    public static void main(String[] args) {
        StudentDao d = new StudentDao();
        List<Student> students = d.findAll();
        for (Student x: students) {
            // System.out.println(x.getStu_id()+"\t"+x.getStu_name()+"\t"+x.getStu_sex()+"\t"+x.getStu_birth()+"\t"+x.getStu_dept());
            System.out.println(x.getStu_id()+"\t"+x.getStu_name()+"\t"+x.getStu_sex()+"\t"+x.getStu_birth());
        }
    }
}
