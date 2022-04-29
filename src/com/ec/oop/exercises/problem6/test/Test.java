package com.ec.oop.exercises.problem6.test;

import com.ec.oop.exercises.problem6.model.Student;
import com.ec.oop.exercises.problem6.model.StudentManager;

public class Test {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Student student1 = new Student(1, "Tý", 20, "HN");
        Student student2 = new Student(2, "Sửu", 18, "BN");
        Student student3 = new Student(3, "Dần", 22, "DN");
        Student student4 = new Student(4, "Mẹo", 22, "SG");
        Student student5 = new Student(5, "Thìn", 20, "HN");

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);

        System.out.println(studentManager.findStudentWithAge(22));
        System.out.println(studentManager.numberOfStudentWith(20,"HN"));

    }
}
